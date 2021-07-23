/*
* Crear 4 objetos de tipo Persona con distintos valores, a continuación,
* llamaremos todos los métodos para cada objeto, deberá comprobar si la persona
* está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal e
* indicar para cada objeto si la persona es mayor de edad. Por último,
* guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
* distintas variables, para después en el main, calcular un porcentaje de esas
* 4 personas cuantas están por debajo de su peso, cuantas en su peso ideal y
* cuantos, por encima, y también calcularemos un porcentaje de cuantos son
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
