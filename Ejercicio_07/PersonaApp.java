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
		Persona p1 = new Persona();
		Persona p2 = new Persona();
		Persona p3 = new Persona();
		Persona p4 = new Persona();
		
		s.crearPersona(p1);
		s.crearPersona(p2);
		s.crearPersona(p3);
		s.crearPersona(p4);
		
		// validamos la edad de las 4 personas
		s.esMayorDeEdad(p1);
		s.esMayorDeEdad(p2);
		s.esMayorDeEdad(p3);
		s.esMayorDeEdad(p4);
		
		// Calculamos el IMC de las 4 personas
		s.calcularIMC(p1);
		s.calcularIMC(p2);
		s.calcularIMC(p3);
		s.calcularIMC(p4);
		
	}

}
