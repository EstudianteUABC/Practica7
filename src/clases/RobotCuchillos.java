package clases;

public class RobotCuchillos extends Robot implements Tareas{
	public RobotCuchillos( String nombre ) {
		super( nombre );
	}
	
	public boolean cortarCarne() {
		System.out.println( "Robot con cuchilos( " + nombre + " ) corto la carne." );
		ultAccion = "Cortar carne.";
		disponible = false;
		return true;
	}
	
	public boolean picarVerdura() {
		System.out.println( "Robot con cuchilos( " + nombre + " ) pico verdura." );
		ultAccion = "Picar verdura.";
		disponible = false;
		return true;
	}
	
	public boolean cocinar() {
		System.out.println( "Robot con cuchilos( " + nombre + " ) NO pudo calentar la comida." );
		ultAccion = "Calentar la comida.";
		disponible = true;
		return false;
	}
	
	public boolean servir() {
		System.out.println( "Robot con cuchilos( " + nombre + " ) NO pudo servir la comida." );
		ultAccion = "Servir la comida.";
		disponible = true;
		return false;
	}
	
	//metodo abstracto
	public void mostrarDatos() {
		System.out.println("Nombre: " + nombre );
		System.out.println("ID: " + ID );
		System.out.println("Bateria: " + bateria );
		System.out.println("Ultima tarea: " + ultAccion );
	}
}