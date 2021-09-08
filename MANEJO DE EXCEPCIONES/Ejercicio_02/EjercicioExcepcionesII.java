package ejercicio02;

/**
 * 
 * @author Felipe Herrera
 *
 */
public class EjercicioExcepcionesII {

	public static void main(String[] args) {

		/*
		 * Definir alg�n tipo de dato de tipo array y agregue el
		 * c�digo para generar y capturar una excepci�n ArrayIndexOutOfBoundsException
		 * (�ndice de arreglo fuera de rango).
		 */
		
		// Creamos un Array
		String[] arrayLetras = new String[10];
		
		try {
			// recorremos el tama�o del array + 1 para que nos salte la excepcion
			for (int i = 0; i < (arrayLetras.length+1); i++) {
				arrayLetras[i] = "A";
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error de indice fuera de rango.... = " + e);
		}
	}

}
