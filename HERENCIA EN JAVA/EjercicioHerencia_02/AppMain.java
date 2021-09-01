package AppMain;

import entidades.Lavadora;
import entidades.Televisor;

/**
 * @author Felipe Herrera
 */
public class AppMain {

	public static void main(String[] args) {

//		Lavadora lavadora_01 = new Lavadora();
//		
//		lavadora_01.crearLavadora();
//		
//		System.out.println(lavadora_01.toString());
//		
//		System.out.println("El precio final de la lavadora es: " + lavadora_01.precioFinal());
		
		Televisor televisor_01 = new Televisor();
		
		televisor_01.crearTelevisor();
		
		System.out.println(televisor_01.toString());
		
		System.out.println("El precio final del Televisor es: " + televisor_01.precioFinal());
	}
}
