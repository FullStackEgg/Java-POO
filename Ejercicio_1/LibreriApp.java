/**
 * 01. Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, T�tulo,
 * Autor, N�mero de p�ginas, y un constructor con todos los atributos pasados por
 * par�metro y un constructor vac�o. Crear un m�todo para cargar un libro pidiendo los
 * datos al usuario y luego informar mediante otro m�todo el n�mero de ISBN, el t�tulo,
 * el autor del libro y el numero de p�ginas.
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
