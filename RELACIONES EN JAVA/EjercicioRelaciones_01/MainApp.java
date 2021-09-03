/**
 * 1. Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a
 * contar de dos clases. Perro, que tendrá como atributos: nombre, raza, edad y
 * tamaño; y la clase Persona con atributos: nombre, apellido, edad, documento y
 * Perro. Ahora deberemos en el main crear dos Personas y dos Perros. Después,
 * vamos a tener que pensar la lógica necesaria para asignarle a cada Persona un
 * Perro y por ultimo, mostrar desde la clase Persona, la información del Perro
 * y de la Persona.
 */
package App;

import java.util.Scanner;
import Servicio.PerroServicio;
import Servicio.PersonaServicio;

/**
 * 
 * @author Felipe Herrera
 *
 */
public class MainApp {

	public static void main(String[] args) {

		// Intansciamos los servicios
		PersonaServicio servicio_persona = new PersonaServicio();
		PerroServicio servicio_perro = new PerroServicio();

		Scanner leer = new Scanner(System.in).useDelimiter("\n");
		String opcion;

		// creamos los objetos
		do {

			servicio_persona.crearPersona();

			System.out.println("¿Desea agregar otra persona?");
			System.out.println("Si [S] / No [N]");
			opcion = leer.nextLine();

		} while (!"N".equalsIgnoreCase(opcion));

		do {

			servicio_perro.crearPerro();

			System.out.println("¿Desea agregar otro perro?");
			System.out.println("Si [S] / No [N]");
			opcion = leer.nextLine();

		} while (!"N".equalsIgnoreCase(opcion));
		
		// ===========================================================================
		
		servicio_persona.mostrarPersonas(); // Mostramos las personas en la lista
		
		System.out.println("\n----[ SERVICIO DE ADOPCION CANINA ]----");
		
		System.out.println("Ingrese el nombe de la persona que adoptara un perro: ");
		String nombrePersona = leer.nextLine();
		
		servicio_perro.mostrarPerros(); // Mostramos los perros en la lista
		
		System.out.println("\nIngrese el nombre del perro que sera adoptado: ");
		String nombrePerro = leer.nextLine();
		
		//LLamada al metodo para adoptar
		servicio_persona.adoptarPerro(servicio_perro.obtenerListaPerros(), nombrePerro, nombrePersona);
		
		// Mostramos los datos de la persona
		servicio_persona.mostrarPersonaPorNombre(nombrePersona);
	}

	
}
