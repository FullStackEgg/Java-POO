package app.servicios;

import java.util.Scanner;

import app.entidades.Circunferencia;

/**
 * 
 * @author Felipe Herrera
 *
 */
public class ServicioCircunferencia {

	private Scanner leer = new Scanner(System.in).useDelimiter("\n");
	
	/**
	 * Usuario ingrea el Radio
	 * @return objeto Radio
	 */
	public Circunferencia crearCircunferencia() {
		
		System.out.println("Ingresa el Radio de la Circunferencia:");
		double radio = Double.parseDouble(leer.next());
		
		return new Circunferencia(radio);
	}
	
	/**
	 * 
	 * @param radio
	 * @return area
	 */
	public double calcularArea(double radio) {
		double area = Math.PI * radio;
		
		return area;
	}
	
	/**
	 * 
	 * @param radio
	 * @return perimetro
	 */
	public double calcularPerimetro(double radio) {
		double perimetro = 2 * Math.PI * radio;
		return perimetro;
	}
}

