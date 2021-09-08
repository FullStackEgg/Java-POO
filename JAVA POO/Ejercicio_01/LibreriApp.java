/**
 * 01. Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
 * Autor, Número de páginas, y un constructor con todos los atributos pasados por
 * parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
 * datos al usuario y luego informar mediante otro método el número de ISBN, el título,
 * el autor del libro y el numero de páginas.
 */
package libreriApp;

import libreriApp.entidades.Libro;
import libreriApp.servicios.ServicioLibro;

/**
 * 
 * @author Felipe Herrera
 *
 */
public class LibreriApp {

	public static void main(String[] args) {

		// Instanciamos obj servicio de libro
		ServicioLibro sl = new ServicioLibro();
		
		// Instanciamos un obj libro a partir del servicio
		Libro libro_01 = sl.cargarLibro();
		
		// Mostramos los datos del libro
		System.out.println(libro_01.toString());
	}

}
