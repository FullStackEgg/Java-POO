package ejercicio4;

/**
 * 
 * @author Felipe Herrera
 *
 */
public class AdivinarNumeroApp {

	/**
	 * 
	 * @return num entre 1 y 500
	 */
	public static int numeroAleatorio() {
		int num = (int)Math.floor(Math.random()*(500-1)+1);
		return num;
	}
	
	/**
	 * 
	 * @param numIngresado por usuario
	 * @param numAdivinar generado con el metodo numeroAleatorio
	 * @return
	 */
	public static boolean validarNumero(int numIngresado, int numAdivinar) {
		boolean validar;
		
		if (numIngresado < numAdivinar) {
			System.out.println("El numero a adinivar es mayor al valor ingresado..");
			validar = false;
		} else if (numIngresado > numAdivinar) {
			System.out.println("El numero a adinivar es menor al valor ingresado..");
			validar = false;
		} else {
			System.out.println("Numero Adivinado!!! era el : " + numAdivinar);
			validar = true; 
		}
		
		return validar;
	}

	
}
