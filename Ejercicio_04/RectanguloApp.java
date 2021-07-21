/**
 * 4. Crear una clase Rectángulo que modele rectángulos por medio de un atributo
 * privado base y un atributo privado altura. La clase incluirá un método para crear el
 * rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
 * método para calcular la superficie del rectángulo y un método para calcular el
 * perímetro del rectángulo. Por último, tendremos un método que dibujará el
 * rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
 * los métodos getters, setters y constructores correspondientes.
 * Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package rectanguloApp;

import rectanguloApp.entidades.Rectangulo;
import rectanguloApp.servicios.ServiceRectangulo;

/**
 * 
 * @author Felipe Herrera
 *
 */
public class RectanguloApp {

	
	public static void main(String[] args) {

		//Creamos el rectangulo a partir del metodo
		Rectangulo r1 = ServiceRectangulo.crearRectangulo();
		
		System.out.println("Superficie del rectangulo: " + r1.calcularSuperficie());
		System.out.println("Perimetro del rectangulo: " + r1.calcularPerimetro());
		
		System.out.println();
		
		// llamada al metodo que dibujara el rectangulo
		r1.dibujarRectangulo();
	}

}
