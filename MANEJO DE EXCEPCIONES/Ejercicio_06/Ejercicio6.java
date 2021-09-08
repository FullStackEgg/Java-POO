package ejercicio6;

/**
 * 
 * @author Felipe Herrera
 *
 */
public class Ejercicio6 {

	public static void main(String[] args) {

		/*
		 * 6. Dado el m�todo metodoB de la clase B, indique: 
		 * 
		 * class B { 
		 * 	void metodoB() { 
		 * 		sentencia_b1 
		 * 		try { 
		 * 			sentencia_b2 
		 * 		} catch (MioException e) { 
		 * 			sentencia_b3 
		 * 		} finally 
		 * 		sentencia_b4 
		 * 	  } 
		 *  }
		 */
		
		 // a) �Qu� sentencias y en qu� orden se ejecutan si se produce la excepci�n MioException? 
		 /*
		  * R/: Se ejecutaria la sentencia b1, b2 que lanza la excepcion, b3 del catch
		  *  y la sentencia b4 del finally que se ejecuta siempre.
		  */
		
		 // b) �Qu� sentencias y en qu� orden se ejecutan si no se produce la excepci�n MioException? 
		 /*
		  *R/: Se ejecutaria la sentencia b1, b2, y b4. La sentencia b3 no se ejecuta nunca si no se lanza la excepcion. 
		  */
	}

}
