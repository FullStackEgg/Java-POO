package cancionApp;

import java.util.Scanner;

/**
 * 
 * @author Felipe Herrera
 *
 */
public class ServicioCancion {

	private Scanner leer = new Scanner(System.in).useDelimiter("\n");
	
	public Cancion crearCancion() {
		String autor;
		String titulo;
		
		System.out.println("Ingrese el titulo de la cancion:");
		titulo = leer.next();
		
		System.out.println("Ingrese el nombre del autor:");
		autor = leer.next();
		
		return new Cancion(titulo, autor);
	}
	
}
