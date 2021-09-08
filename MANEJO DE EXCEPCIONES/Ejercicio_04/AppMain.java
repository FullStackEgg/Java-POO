/*
 * Escribir un programa en Java que juegue con el usuario a adivinar un número.
 * La computadora debe generar un número aleatorio entre 1 y 500, y el usuario
 * tiene que intentar adivinarlo. Para ello, cada vez que el usuario introduce
 * un valor, la computadora debe decirle al usuario si el número que tiene que
 * adivinar es mayor o menor que el que ha introducido el usuario. Cuando
 * consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de
 * veces que el usuario ha intentado adivinar el número. Si el usuario introduce
 * algo que no es un número, se debe controlar esa excepción e indicarlo por
 * pantalla. En este último caso también se debe contar el carácter fallido como
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
		
		boolean validar = false; // condicional del bucle do/while
		int intentos = 1; 
		int numIngresado;
		int numAdivinar = AdivinarNumeroApp.numeroAleatorio(); // Generamos el numero aleatorio
		
		System.out.println("Intente Adivinar el numero aleatorio:");
		
		do {
			
			try {
				System.out.println("ingrese un numero:");
				numIngresado = Integer.parseInt(sc.nextLine());
				
				if (numIngresado < numAdivinar) {
					System.out.println("El numero a adinivar es mayor al valor ingresado..");
					intentos++;
				} else if (numIngresado > numAdivinar) {
					System.out.println("El numero a adinivar es menor al valor ingresado..");
					intentos++;
				} else {
					System.out.println("Numero Adivinado!!! era el : " + numAdivinar);
					System.out.println("Total de intentos: " + intentos);
					validar = true; // Salimos del bucle
				}
				
			} catch (NumberFormatException e) {
				System.out.println("Error en el ingreso de datos... " + e);
				
			}
			
		} while (validar == false);

	}

}
