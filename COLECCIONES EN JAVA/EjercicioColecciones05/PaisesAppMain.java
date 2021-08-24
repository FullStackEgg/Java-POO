/**
 * Se requiere un programa que lea y guarde países, y para evitar que se ingresen
 * repetidos usaremos un conjunto (set). El programa pedirá un país en un bucle, se
 * guardará el país en el conjunto y después se le preguntará al usuario si quiere
 * guardar otro país o si quiere salir, si decide salir, se mostrará todos los países
 * guardados en el conjunto.
 * Después deberemos mostrar el conjunto ordenado alfabéticamente para esto
 * recordar como se ordena un conjunto.
 * Y por ultimo, al usuario se le pedirá un país y se recorrerá el conjunto con un
 * Iterator, se buscará el país en el conjunto y si está en el conjunto se eliminará el
 * país que ingresó el usuario y se mostrará el conjunto. Si el país no se encuentra
 * en el conjunto se le informará al usuario.
 */

package paisesApp;

import java.util.Scanner;
import servicios.ServicioPais;

/**
 * 
 * @author Felipe Herrera
 *
 */
public class PaisesAppMain {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in).useDelimiter("\n");

		ServicioPais servicio = new ServicioPais();

		String opcion;

		// Creamos los paises Pidiendo datos al usuario
		do {
			servicio.crearPais();

			System.out.println("¿Desea Agregrar otro Pais?");
			System.out.println("Ingrese: si [S] / no [N]");
			opcion = leer.nextLine();

			opcion = opcion.toUpperCase();
		} while (!"N".equals(opcion)); // mientras sea distinto a N

		// Creamos varios paises para probar los metodos
		servicio.fabricaPaises();

		System.out.println("\n-------- Paises Agregados al HashSet ----------");
		servicio.mostrarPaises();

		System.out.println("\n-------- Paises Ordenados alfabeticamente ----------");
		servicio.mostrarOrdenarAlfabeticamente();
		
		System.out.println("\n-------- Ingrese un pais para eliminar del HashSet ----------");
		String paisIngresado = leer.nextLine();
		servicio.eliminarPais(paisIngresado);
		
		// Mostramos de nuevo el conjunto set
		System.out.println();
		servicio.mostrarOrdenarAlfabeticamente();
		
	}

}
