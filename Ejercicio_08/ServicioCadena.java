package cadenApp.servicio;

import java.util.Scanner;

import cadenApp.entidades.Cadena;

/**
 * 
 * @author Felipe Herrera
 *
 */
public class ServicioCadena {

	private Scanner leer = new Scanner(System.in).useDelimiter("\n");

	// Crea la cadena ingresada por el usuario
	// y obtiene su longitud.
	public void crearCadena(Cadena c) {
		System.out.println("Ingresa una frase: ");
		String frase = leer.next();

		int longitudFrase = frase.length();

		c.setFrase(frase);
		c.setLongitudFrase(longitudFrase);
	}

	/*
	 * Deberá contabilizar la cantidad de vocales que tiene
	 * la frase ingresada.
	 */
	public void mostrarVocales(Cadena c) {
		// obtenemos la cadena del objeto
		String frase = c.getFrase();

		// Variables contador para c/u de las vocales
		int a = 0, e = 0, i = 0, o = 0, u = 0;

		// Recorremos la frase para contar las vocales
		for (int j = 0; j < frase.length(); j++) {
			// con charAt obtenemos el caracter actual del recorrido
			// y dentro del switch evualamos coincidencias con las vocales e incrementa el
			// contador correspondiente
			switch (frase.charAt(j)) {
			case 'a':
				a++;
				break;
			case 'e':
				e++;
				break;
			case 'i':
				i++;
				break;
			case 'o':
				o++;
				break;
			case 'u':
				u++;
				break;

			default:
				System.out.println("La frase no contiene niguna vocal.");	
				break;
			}
		}

		System.out.println();
		System.out.println("La frase tiene: " + a + " vocales A");
		System.out.println("La frase tiene: " + e + " vocales E");
		System.out.println("La frase tiene: " + i + " vocales I");
		System.out.println("La frase tiene: " + o + " vocales O");
		System.out.println("La frase tiene: " + u + " vocales U");
	}

	/*
	 * Deberá invertir la frase ingresada y mostrar la frase
	 * invertida por pantalla.
	 */
	public String invertirFrase(Cadena c) {
		String cadenaInvertida = "";

		// Recorremos la frase desde el fin hasta el inicio de la cadena
		//  y almacenamos caracter por caracter a la cadena invertida
		for (int i = c.getFrase().length() - 1; i >= 0; i--)
			cadenaInvertida = cadenaInvertida + c.getFrase().charAt(i);
		return cadenaInvertida;
	}

	/*
	 * Deberá recibir por parámetro un carácter
	 * ingresado por el usuario y contabilizar cuántas veces se repite el carácter
	 * en la frase.
	 */
	public void vecesRepetido(Cadena c, char letra) {
		int contador = 0;
		
		// Recorremosla frase en busca de la letra
		for (int i = 0; i < c.getFrase().length(); i++) {
			// validamos coincidencias
			if (c.getFrase().charAt(i)== letra) {
				contador++; 
			}
		}
		
		System.out.println("El caracter '" + letra + "' se repite " + contador + " veces.");
	}

	/*
	 * Deberá comparar la longitud de la frase que compone la clase 
	 * con otra nueva frase ingresada por el usuario.
	 */
	public void compararLongitud(Cadena c, String nuevaFrase) {
		// comparamos las longitudes
		if (c.getLongitudFrase() == nuevaFrase.length() ) {
			System.out.println("Las dos frases tienen la misma longitud.");
		} else {
			System.out.println("La longitud de las frases es distinta.");
		}
	}

	/*
	 * Deberá unir la frase contenida en la clase
	 * Cadena con una nueva frase ingresada por el usuario y mostrar la frase
	 * resultante.
	 */
	public void unirFrases(Cadena c, String nuevaFrase) {
		String fraseConcatenada = c.getFrase().concat(nuevaFrase); // unimos las frases
		System.out.println("\nLa frase resultante es: [" + fraseConcatenada + "].");
	}

	/*
	 * Deberá reemplazar todas las letras “a” que
	 * se encuentren en la frase, por algún otro carácter seleccionado por el
	 * usuario y mostrar la frase resultante.
	 */
	public void reemplazar(Cadena c, String nuevaLetra) {
		String nuevaFrase = c.getFrase().replace("a", nuevaLetra); // reemplazamos el cracter a por el nuevo
		System.out.println("La frase resultante con caracteres reemplazados es: [" + nuevaFrase + "].");
	}

	/*
	 * Método contiene(String letra), deberá comprobar si la frase contiene una
	 * letra que ingresa el usuario y devuelve verdadero si la contiene y falso si
	 * no.
	 */
	public void contiene(Cadena c, String letra) {
		// Validamos si contiene el caracter ingresado por el usuario
		if (c.getFrase().contains(letra) == true) {
			System.out.println("La frase contiene el caracter: [" + letra + "].");
			System.out.println("Frase: [" + c.getFrase() + "].");
		} else {
			System.out.println("La frase no contiene el cracater ingresado.");
		}
	}
}
