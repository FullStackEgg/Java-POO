/*
 * Crear una clase llamada Alumno que mantenga información sobre las notas de
 * distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una
 * lista de tipo Integer con sus 3 notas. En el main deberemos tener un bucle
 * que crea un objeto Alumno. Se pide toda la información al usuario y ese
 * Alumno se guarda en una lista de tipo Alumno y se le pregunta al usuario si
 * quiere crear otro Alumno o no. Despues de ese bluce tendremos el siguiente
 * método en la clase Alumno: Metodo notaFinal(): El usuario ingresa el nombre
 * del alumno que quiere calcular su nota final y se lo busca en la lista de
 * Alumnos. Si está en la lista, se llama al método. Dentro del método se usará
 * la lista notas para calcular el promedio final de alumno. Siendo este
 * promedio final, devuelto por el método y mostrado en el main.
 */

package alumnoApp;

import java.util.Scanner;
import service.ServiceAlumno;

/**
 * 
 * @author Felipe Herrera
 *
 */
public class AlumnoMainApp {

	public static void main(String[] args) {

		ServiceAlumno s = new ServiceAlumno();
		Scanner leer = new Scanner(System.in).useDelimiter("\n");
		String option;
		
		// Bucle para crear alumno
		do {
			// Llamada al metodo crear alumno
			s.crearAlumno();
			
			System.out.println("\n¿Desea agregar otro alumno?");
			System.out.println("Si:[S] / No: [N]");
			option = leer.nextLine();
			option = option.toUpperCase();
			
			System.out.println("\n");
			
		} while (!"N".equals(option)); // Mientras que option sea distinto a "N"
		
		s.notaFinalPorNombreAlumno();
		
	}
}
