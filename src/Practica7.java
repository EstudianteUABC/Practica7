import clases.*;

public class Practica7 {
	
	//se crean los 3 robos a usar
	public static Robot robots [] = new Robot[] {
			new MagnumOpus( "Cheff" ), 
			new RobotCuchillos( "Cortador" ), 
			new RobotManosCalientes( "Calentador" ) };

	public static void main(String[] args) {
		Menu.ejecutar( robots );
	}

}
