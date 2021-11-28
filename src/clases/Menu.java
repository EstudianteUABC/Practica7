package clases;

public class Menu {
	public static void ejecutar( Robot robots[] ) {
		
		String respuestaUsuario = "";
		int opcion;
		
		//Instrucciones de uso
		System.out.println( "Seleccione los robots a usar en el orden correcto "
						  + "\npara preparar el platillo de forma exitosa.");
		
		do {
			//si el usuario ya se acabo sus intentos, vuelve a empezar.
			if( respuestaUsuario.length() == 8 ) {
				respuestaUsuario = "";
				System.out.println( "--------------------------------------------------" );
				System.out.println( "\nSe te acabaron los intentos, vuelve a empezar!!!" );
				System.out.println( "--------------------------------------------------" );
			}
			
			 opcion = seleccionarRobot();
			
			//sale del programa si el usuario selecciono "Salir"
			if( opcion == 4 )
				continue;
			
			//selecciona el robot adecuado, le resta uno para reajustar el rango
			//de 0 a 2, en lugar de 1 a 3
			String tarea = seleccionarTarea( robots[opcion - 1]);
			
			if( !tarea.equals( "" ) ) {
				respuestaUsuario += opcion;
				respuestaUsuario += tarea;
			}
			
			
		}while( !respuestaCorrecta( respuestaUsuario ) && opcion != 4 );
		
		terminoJuego();
		mostraResumen( robots );
	}
	
	
	//muestra un menu para seleccioanar el robot
	public static int seleccionarRobot() {
		int opcion;
		
		do {
			System.out.println( "\n1) OpusMangnum." );
			System.out.println( "2) Robot con cuchillos." );
			System.out.println( "3) Robot con manos calientes." );
			System.out.println( "4) Salir" );
			
			opcion = Entrada.entero( "Seleccione una opcion: " );			
		}while( opcion < 1 || opcion > 4 );
		
		return opcion;
	}
	
	//muestra un menu para seleccionar las tarea a realizar
	public static String seleccionarTarea( Robot robot ) {
		int opcion;
		
		do {
			System.out.println( "\n1) Cortar carne." );
			System.out.println( "2) Picar verdura." );
			System.out.println( "3) Cocinar guiso." );
			System.out.println( "4) Servir platillo." );
			
			opcion = Entrada.entero( "Seleccione una opcion: " );			
		}while( opcion < 1 || opcion > 4 );
		
		if( robot.disponible == true ) {
			
			switch( opcion ) {
				case 1:
					if(robot.cortarCarne() ) {
						return "1";
					}
					break;
					
				
				case 2:
					if( robot.picarVerdura() ) {
						return "2";
					}
					break;
					
				case 3:
					if( robot.cocinar() ) {
						return "3";
					}
					break;
					
				case 4:
					if( robot.servir() ) {
						return "4";
					}
					break;
			}
		}
		
		else {
			System.out.println( "El robot ya fue usado una vez, ya no se puede volver a usar" );
			return "";
		}
		
		return "";
	}
	
	//lista de respuestas validas
	public static boolean respuestaCorrecta( String respUsuario ) {
		if( respUsuario.equals( "11223314" ) ) {
			return true;
		}
		
		else if( respUsuario.equals( "12213314" ) ) {
			return true;
		}
			
		else 
			return false;
	}
	
	public static void terminoJuego() {
		System.out.println( "\nEl platillo fue preparado con exito!!!." );
	}
	
	public static void mostraResumen( Robot robots[] ) {
		for( int i = 0; i < robots.length; i++ ) {
			System.out.println( "-----------------------------" );
			robots[i].mostrarDatos();
			System.out.println( "-----------------------------" );
		}
	}
}
