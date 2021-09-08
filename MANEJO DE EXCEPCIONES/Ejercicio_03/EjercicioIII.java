/**
 * Defina una clase llamada DivisionNumero. En el método main utilice un Scanner
 * para leer dos números en forma de cadena. A continuación, utilice el método
 * parseInt() de la clase Integer, para convertir las cadenas al tipo int y guardarlas en
 * dos variables de tipo int. Por ultimo realizar una división con los dos numeros y
 * mostrar el resultado.
 * Todas estas operaciones puede tirar excepciones a manejar, el ingreso por
 * teclado puede causar una excepción de tipo InputMismatchException, el método
 * Integer.parseInt() si la cadena no puede convertirse a entero, arroja una
 * NumberFormatException y además, al dividir un número por cero surge una
 * ArithmeticException. Manipule todas las posibles excepciones utilizando bloques
 * try/catch para las distintas excepciones
 */
package ejrcicioIII;

import java.util.Scanner;

import ejrcicioIII.entity.DivisionNumero;

/**
 * 
 * @author Felipe Herrera
 *
 */
public class EjercicioIII {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in).useDelimiter("\n");
		int num1, num2;
		
		try {
			System.out.println("Ingrese dos numeros para dividir:");
			System.out.print("\nNum1 = ");
			num1 = Integer.parseInt(sc.nextLine());

			System.out.print("\nNum2 = ");
			num2 = Integer.parseInt(sc.nextLine());

			try {
				// Llamada al metodo
				System.out.println(DivisionNumero.division(num1, num2));
			} catch (ArithmeticException e) {
				System.out.println("Error en la llamada del metodo division... " + e);
			}

		} catch (NumberFormatException e) {
			System.out.println("Error en el ingreso de datos... " + e);
		}
		
	}
}
