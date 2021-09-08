package ejercicio5;

/**
 * 
 * @author Felipe Herrera
 *
 */
public class AppMain {

	public static void main(String[] args) {

		/*
		 * 5. Dado el método metodoA de la clase A, indique: a) ¿Qué sentencias y en qué
		 * orden se ejecutan si se produce la excepción MioException? b) ¿Qué sentencias
		 * y en qué orden se ejecutan si no se produce la excepción MioException?
		 */

		int a = 15; // sentencia a1
		int b = 0; // sentencia a2

		try {
			System.out.println("Division : " + (a / b)); // sentencia a3
			System.out.println("suma: " + (a + b)); // sentencia a4
		} catch (ArithmeticException e) {
			System.out.println("Se produjo una excepcion: " + e); // sentencia a6
		}

		System.out.println("Salimos del try"); // sentencia a5

		// A:Si se produce la excepcion :
		// las sentencias que se ejecutarian son: a1, a2 se ejecutan con normalidad.
		// entramos al bloque try y se ejecuta la sentencia a3 si esta lanza la
		// excepcion. la sentencia a4 no se ejecuta, y la ejecucion del codigo continua con el
		// bloque catch, ejecutando asi la sentencia 6, y al salir del catch se ejecuta la sentencia 5

		// B: No se produce la excepcion:
		// Las sentencias que se ejecutan son: a1, a2, a3, a4. Como no se produce la
		// excepcion el bloque catch se "ignora".
		// Y saltamos directamente a la ejecucion de la sentencia a5.
	}
}
