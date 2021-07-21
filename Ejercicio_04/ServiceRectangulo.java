package rectanguloApp.servicios;

import java.util.Scanner;

import rectanguloApp.entidades.Rectangulo;

/**
 * 
 * @author Felipe Herrera
 *
 */
public class ServiceRectangulo {

	private static Scanner leer = new Scanner(System.in);
	
	// Metodo para construir un rectangulo
	public static Rectangulo crearRectangulo() {
		System.out.println("Ingresa la base del rectangulo: ");
		int base = leer.nextInt();
		
		System.out.println("Ingresa la altura del rectangulo: ");
		int altura = leer.nextInt();
		
		return new Rectangulo(base, altura);
	}
}
