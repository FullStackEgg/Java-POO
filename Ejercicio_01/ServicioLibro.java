package libreriApp.servicios;

import java.util.Scanner;
import libreriApp.entidades.Libro;

/**
 * 
 * @author Felipe Herrera
 *
 */
public class ServicioLibro {

	private Scanner sc = new Scanner(System.in).useDelimiter("\n");
	
	/**
	 * El usuario carga los datos del libro
	 * y el metodo retorna los datos ingresados
	 * para cargar el libro.
	 * @return
	 */
	public Libro cargarLibro() {
		
		System.out.println("Ingresar ISBN del libro:");
		String isbn = sc.nextLine();
		
		System.out.println("Ingresar TITULO del libro:");
		String titulo = sc.nextLine();
		
		System.out.println("Ingresar AUTOR del libro:");
		String autor = sc.nextLine();
		
		System.out.println("Ingresar Numero de paginas del libro:");
		int numPag = Integer.parseInt(sc.nextLine());
		
		return new Libro(isbn, titulo, autor, numPag);
	}
}
