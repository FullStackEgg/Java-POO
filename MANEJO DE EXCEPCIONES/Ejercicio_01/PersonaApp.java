/*
* Crear 4 objetos de tipo Persona con distintos valores, a continuaci�n,
* llamaremos todos los m�todos para cada objeto, deber� comprobar si la persona
* est� en su peso ideal, tiene sobrepeso o est� por debajo de su peso ideal e
* indicar para cada objeto si la persona es mayor de edad. Por �ltimo,
* guardaremos los resultados de los m�todos calcularIMC y esMayorDeEdad en
* distintas variables, para despu�s en el main, calcular un porcentaje de esas
* 4 personas cuantas est�n por debajo de su peso, cuantas en su peso ideal y
* cuantos, por encima, y tambi�n calcularemos un porcentaje de cuantos son
* mayores de edad y cuantos menores.
*/
package personaApp;

import personaApp.entidades.Persona;
import personaApp.servicios.ServiciosPersona;

/**
 * 
 * @author Felipe Herrera
 *
 */
public class PersonaApp {

	public static void main(String[] args) {

		// intanciamos la clase para hace uso de los metodos
		ServiciosPersona s = new ServiciosPersona();

		// creamos los 4 Objetos de tipo persona
//		Persona p1 = new Persona();

//		s.crearPersona(p1);

		// validamos la edad de las 4 personas
//		s.esMayorDeEdad(p1);

		// Calculamos el IMC de las 4 personas
//		s.calcularIMC(p1);

		// ===============================================================================================
		// Ejercicio 1 Excepciones
		
		/*
		 * Inicializar un objeto de la clase Persona ejercicio 7 de la gu�a POO, a null
		 * y tratar de invocar el m�todo esMayorDeEdad() a trav�s de ese objeto. Luego,
		 * englobe el c�digo con una cl�usula try-catch para probar la nueva excepci�n
		 * que debe ser controlada.
		 */
		Persona pNull = null;

		try {
			s.esMayorDeEdad(pNull);
		} catch (NullPointerException e) {
			System.out.println("Error: " + e);
		}
		
	}

}
