/*
 * Declarar una clase llamada Circunferencia que tenga como atributo privado el radio
 * de tipo real. A continuación, se deben crear los siguientes métodos:
 * a) Método constructor que inicialice el radio pasado como parámetro.
 * b) Métodos get y set para el atributo radio de la clase Circunferencia.
 * c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
 * del objeto.
 * d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
 * e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */

package app;

import app.entidades.Circunferencia;
import app.servicios.ServicioCircunferencia;

/**
 * 
 * @author Felipe Herrera
 *
 */
public class ClaseMain {

	public static void main(String[] args) {
		
	
		ServicioCircunferencia servicio = new ServicioCircunferencia();
		
		Circunferencia circunferencia01 = servicio.crearCircunferencia();
		
		System.out.println("Area de la Circunferencia:" + servicio.calcularArea(circunferencia01.getRadio()));
		
		System.out.println("Perimetro de la Circunferencia: " + servicio.calcularPerimetro(circunferencia01.getRadio()));
		
	}
}
