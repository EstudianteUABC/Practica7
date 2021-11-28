package clases;

public class MagnumOpus extends Robot implements Tareas{
	public MagnumOpus( String nombre ) {
		super( nombre );
	}
	
	public boolean cortarCarne() {
		System.out.println( "Magnum Opus( " + nombre + " ) corto la carne." );
		ultAccion = "Cortar carne.";
		disponible = true;
		return true;
	}
	
	public boolean picarVerdura() {
		System.out.println( "Magnum Opus( " + nombre + " ) pico verdura." );
		ultAccion = "Picar verdura.";
		disponible = true;
		return true;
	}
	
	public boolean cocinar() {
		System.out.println( "Magnum Opus( " + nombre + " ) calento la comida." );
		ultAccion = "Calentar la comida.";
		disponible = true;
		return true;
	}
	
	public boolean servir() {
		System.out.println( "Magnum Opus( " + nombre + " ) sirvio la comida." );
		ultAccion = "Servir la comida.";
		disponible = true;
		return true;
	}
	
	//metodo abstracto
	public void mostrarDatos() {
		System.out.println("Nombre: " + nombre );
		System.out.println("ID: " + ID );
		System.out.println("Bateria: " + bateria );
		System.out.println("Ultima tarea: " + ultAccion );
	}
}
