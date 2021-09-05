/**
 * Crea una clase en Java donde declares una variable de tipo array de Strings que
 * contenga los doce meses del año, en minúsculas. A continuación declara una variable
 * mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo
 * mesSecreto = mes[9].
 */
package mesesapp;

import java.util.Scanner;

/**
 * 
 * @author Felipe Herrera
 *
 */
public class MesSecreto {

	public static void main(String[] args) {

		// Creamos el vector de los meses
		String[] meses = new String[] {
				"enero", "febrero", "marzo", "abril", "mayo", "junio",
				"julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"
		};

		String mesSecreto = meses[4]; // mes a adivinar
		
		Boolean acertado = false; // condicion del while
		
		Scanner sc = new Scanner(System.in).useDelimiter("\n");
		
		System.out.println("> Adivine el mes secreto. Introduzca el nombre del mes en minusculas: ");
		String mesIngresado;
		
		do {
			// Tomamos el valor ingresado por el usuario
			mesIngresado = sc.nextLine();
			
			// Validamos si el usuario adivino el mes
			if (mesIngresado.equals(mesSecreto)) {
				
				acertado = true;
				System.out.println("\n¡¡HA ACERTADO!!");
				
			} else {
				
				System.out.println("\nNo ha acertado. Intente adivinarlo introduciendo otro mes: ");
			}
			
		} while (acertado != true);
		
	}
}