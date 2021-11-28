package clases;

public class RobotManosCalientes extends Robot implements Tareas{
	
	public RobotManosCalientes( String nombre ) {
		super( nombre );
	}
	
	public boolean cortarCarne() {
		System.out.println( "Robot manos calientes( " + nombre + " ) NO pudo cortar la carne." );
		ultAccion = "Cortar carne.";
		disponible = true;
		return false;
	}
	
	public boolean picarVerdura() {
		System.out.println( "Robot manos calientes( " + nombre + " ) NO pudo picar verdura." );
		ultAccion = "Picar verdura.";
		disponible = true;
		return false;
	}
	
	public boolean cocinar() {
		System.out.println( "Robot manos calientes( " + nombre + " ) calento la comida." );
		ultAccion = "Calentar la comida.";
		disponible = false;
		return true;
	}
	
	public boolean servir() {
		System.out.println( "Robot manos calientes( " + nombre + " ) NO pudo servir la comida." );
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
