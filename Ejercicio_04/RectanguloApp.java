/**
 * 4. Crear una clase Rect�ngulo que modele rect�ngulos por medio de un atributo
 * privado base y un atributo privado altura. La clase incluir� un m�todo para crear el
 * rect�ngulo con los datos del Rect�ngulo dados por el usuario. Tambi�n incluir� un
 * m�todo para calcular la superficie del rect�ngulo y un m�todo para calcular el
 * per�metro del rect�ngulo. Por �ltimo, tendremos un m�todo que dibujar� el
 * rect�ngulo mediante asteriscos usando la base y la altura. Se deber�n adem�s definir
 * los m�todos getters, setters y constructores correspondientes.
 * Superficie = base * altura / Per�metro = (base + altura) * 2.
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
