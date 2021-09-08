package cadenApp;

import java.util.Scanner;
import cadenApp.entidades.Cadena;
import cadenApp.servicio.ServicioCadena;

/**
 * 
 * @author Felipe Herrera
 *
 */
public class CadenApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner(System.in).useDelimiter("\n");
		
		// intanciamos las clases Servicio y Cadena
		ServicioCadena servicio = new ServicioCadena();
		
		Cadena cadena01 = servicio.crearCadena();
		
		// PRUEBA METODOS
		servicio.mostrarVocales(cadena01);
		
		System.out.println("\nFrase invertidad: [" + servicio.invertirFrase(cadena01)+ "]");
		
		System.out.println("\nIngrese el caracter que desea buscar en la frase: ");
		char letra = leer.next().charAt(0);  //se obtiene el primer carácter del String introducido por teclado
		
		servicio.vecesRepetido(cadena01, letra);
		
		System.out.println("\nIngrese una nueva frase para comparar la longitud:");
		String nuevaFrase = leer.next();
		
		servicio.compararLongitud(cadena01, nuevaFrase);

		System.out.println("\nIngrese la frase que desea concatenar: ");
		nuevaFrase = leer.next();
		
		servicio.unirFrases(cadena01, nuevaFrase);
		
		System.out.println("\nIngrese el nuevo caracter con el que desea reemplazar las [a] en la frase: ");
		String nuevaLetra = leer.next();
		
		servicio.reemplazar(cadena01, nuevaLetra);
		
		System.out.println("\nIngrese el caracter a buscar en la frase:");
		String caracter = leer.next();
		
		// el emtodo contiene, retorna true o false por lo que devolveremos un msj en base al valor del return
		if (servicio.contiene(cadena01, caracter)) {
			System.out.println("La frase [" + cadena01.getFrase() + "] contiene el caracter [" + caracter + "]");
		} else {
			System.out.println("La frase [" + cadena01.getFrase() + "]  No contiene el caracter ingresado.");
		}
			
		
		leer.close();
	}

}
