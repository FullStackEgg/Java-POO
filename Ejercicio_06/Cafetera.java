/*
 * Programa Nespresso. Desarrolle una clase Cafetera con los atributos
 * capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
 * cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al
 * menos, los siguientes métodos:
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
