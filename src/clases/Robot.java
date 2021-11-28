package clases;

import java.util.Random;

public abstract class Robot implements Tareas {
	
	protected String nombre;
	protected String ID;
	protected int bateria;
	protected String ultAccion;
	protected boolean disponible;
	
	protected static int contID = 0; //lleva la cuenta de los robots creados
	protected static Random rand = new Random();
	
	
	public Robot( String nombre ) {
		this.nombre = nombre;
		this.ID = nombre + ( ++contID );
		this.bateria = rand.nextInt( 100 ); 
		this.disponible = true;
	}
	
	public abstract void mostrarDatos();
	public abstract boolean cortarCarne();
	public abstract boolean picarVerdura();
	public abstract boolean cocinar();
	public abstract boolean servir();
}
