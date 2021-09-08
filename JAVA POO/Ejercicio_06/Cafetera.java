/*
 * Programa Nespresso. Desarrolle una clase Cafetera con los atributos
 * capacidadMaxima (la cantidad m�xima de caf� que puede contener la cafetera) y
 * cantidadActual (la cantidad actual de caf� que hay en la cafetera). Implemente, al
 * menos, los siguientes m�todos:
 */
package nespressoApp;

/**
 * 
 * @author Felipe Herrera
 *
 */
public class Cafetera {

	private int cantidadMaxima;
	private int cantidadActual;

	// constructor vacio
	public Cafetera() {
	}

	// Constructor con parametros
	public Cafetera(int cantidadMaxima, int cantidadActual) {
		this.cantidadMaxima = cantidadMaxima;
		this.cantidadActual = cantidadActual;
	}

	// Getters y Setters
	public int getCantidadMaxima() {
		return cantidadMaxima;
	}

	public void setCantidadMaxima(int capacidadMaxima) {
		this.cantidadMaxima = capacidadMaxima;
	}

	public int getCantidadActual() {
		return cantidadActual;
	}

	public void setCantidadActual(int capacidadActual) {
		this.cantidadActual = capacidadActual;
	}

}
