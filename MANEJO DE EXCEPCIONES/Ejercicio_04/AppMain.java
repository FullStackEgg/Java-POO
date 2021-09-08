/*
 * Escribir un programa en Java que juegue con el usuario a adivinar un n�mero.
 * La computadora debe generar un n�mero aleatorio entre 1 y 500, y el usuario
 * tiene que intentar adivinarlo. Para ello, cada vez que el usuario introduce
 * un valor, la computadora debe decirle al usuario si el n�mero que tiene que
 * adivinar es mayor o menor que el que ha introducido el usuario. Cuando
 * consiga adivinarlo, debe indic�rselo e imprimir en pantalla el n�mero de
 * veces que el usuario ha intentado adivinar el n�mero. Si el usuario introduce
 * algo que no es un n�mero, se debe controlar esa excepci�n e indicarlo por
 * pantalla. En este �ltimo caso tambi�n se debe contar el car�cter fallido como
 * un intento.
 */
package ejercicio4;

import java.util.Scanner;

/**
 * 
 * @author Felipe Herrera
 *
 */
public class AppMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useDelimiter("\n");

		boolean bandera = false; // condicion del bucle
		int intentos = 0;
		int numIngresado;
		int numAdivinar = AdivinarNumeroApp.numeroAleatorio(); // Generamos el numero aleatorio entre 1 y 500

		System.out.println("Intente Adivinar el numero aleatorio:");

		do {
			intentos++;
			
			try {
				System.out.println("ingrese un numero:");
				numIngresado = Integer.parseInt(sc.nextLine());

				if (AdivinarNumeroApp.validarNumero(numIngresado, numAdivinar)) {
					// si es true cortamos bucle
					bandera = true;
				}

			} catch (NumberFormatException e) {
				System.out.println("Error en el ingreso de datos... " + e);
			}

		} while (bandera == false);

		System.out.println("Total de intentos: " + intentos);
	}

}
