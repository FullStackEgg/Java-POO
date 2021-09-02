package appmain;

import java.util.ArrayList;
import java.util.List;

import entidades.Electrodomestico;
import entidades.Lavadora;
import entidades.Televisor;

/**
 * @author Felipe Herrera
 */
public class AppMain {

	public static void main(String[] args) {

//		Lavadora lavadora_01 = new Lavadora();
//		lavadora_01.crearLavadora();
//
//		System.out.println(lavadora_01.toString());
//		System.out.println("El precio final de la lavadora es: " + lavadora_01.precioFinal());
//
//		Televisor televisor_01 = new Televisor();
//		televisor_01.crearTelevisor();
//
//		System.out.println(televisor_01.toString());
//		System.out.println("El precio final del Televisor es: " + televisor_01.precioFinal());

		// Ejercicio 3
		/**
		 * crear un ArrayList de Electrodomésticos para guardar 4 electrodomésticos,
		 */

		List<Electrodomestico> listaElectrodomesticos = new ArrayList<>();

		listaElectrodomesticos.add(new Lavadora(25_000.0, "Blanco", 'A', 40, 50));
		listaElectrodomesticos.add(new Lavadora(25_000.0, "Gris", 'E', 30, 30));
		listaElectrodomesticos.add(new Televisor(35_000.0, "Negro", 'D', 20, 45, false));
		listaElectrodomesticos.add(new Televisor(50_000.0, "Blanco", 'A', 20, 90, true));

		double suma = 0, sumaLava = 0, sumaTele = 0;

		for (Electrodomestico aux : listaElectrodomesticos) {
			//Mostramos el precio final
			String formatPrecio = String.format("$%, .2f", aux.precioFinal()); 
			System.out.println("\n" + aux.toString() + "\nEL precio final es: " + formatPrecio);
			
			if (aux.getNombre().equals("LAVADORA")) {
				sumaLava += aux.precioFinal();
			} else if (aux.getNombre().equals("TELEVISOR")) {
					sumaTele += aux.precioFinal();
			}
			
			suma = suma + aux.precioFinal();
		}
		
		// Formateo los valores para que sean mas legibles al usuario
		String var1 = String.format("$%, .2f", suma);
		String var2 = String.format("$%, .2f", sumaLava);
		String var3 = String.format("$%, .2f", sumaTele);
		
		
		System.out.println("\nLa suma total de los Electrodomesticos es: " + var1);
		System.out.println("La suma del precio de las lavadoras es: " + var2);
		System.out.println("La suma del precio de los televisores es: " + var3);

	}
}
