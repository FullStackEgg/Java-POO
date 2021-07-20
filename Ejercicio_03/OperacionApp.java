/**
 * Ejecucion de los metodos
 */
package operacionApp;

import operacionApp.entidades.Operacion;
import operacionApp.entidades.servicios.ServiciosOperacion;

/**
 * 
 * @author Felipe Herrera
 *
 */
public class OperacionApp {

	public static void main(String[] args) {

		ServiciosOperacion servicio = new ServiciosOperacion();

		// Llamada al metodo que pedira los valores al usuario
		Operacion nuevaOperacion = servicio.crearOperacion();

		// Llamada al Metodo Sumar
		System.out.println("El resultado de la suma es: "
				+ servicio.sumar(nuevaOperacion.getNumero1(), nuevaOperacion.getNumero2()));

		// Llamada al Metodo Restar
		System.out.println("El resultado de la resta es: "
				+ servicio.restar(nuevaOperacion.getNumero1(), nuevaOperacion.getNumero2()));

		// Llamada al Metodo Multiplicar
		System.out.println("El resultado de la multiplicación es: "
				+ servicio.multiplicar(nuevaOperacion.getNumero1(), nuevaOperacion.getNumero2()));

		// Llamada al Metodo Dividir
		System.out.println("El resultado de la division es: "
				+ servicio.dividir(nuevaOperacion.getNumero1(), nuevaOperacion.getNumero2()));
	}

}
