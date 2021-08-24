/**
 * Se requiere un programa que lea y guarde pa�ses, y para evitar que se ingresen
 * repetidos usaremos un conjunto (set). El programa pedir� un pa�s en un bucle, se
 * guardar� el pa�s en el conjunto y despu�s se le preguntar� al usuario si quiere
 * guardar otro pa�s o si quiere salir, si decide salir, se mostrar� todos los pa�ses
 * guardados en el conjunto.
 * Despu�s deberemos mostrar el conjunto ordenado alfab�ticamente para esto
 * recordar como se ordena un conjunto.
 * Y por ultimo, al usuario se le pedir� un pa�s y se recorrer� el conjunto con un
 * Iterator, se buscar� el pa�s en el conjunto y si est� en el conjunto se eliminar� el
 * pa�s que ingres� el usuario y se mostrar� el conjunto. Si el pa�s no se encuentra
 * en el conjunto se le informar� al usuario.
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

			System.out.println("�Desea Agregrar otro Pais?");
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
