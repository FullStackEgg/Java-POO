/**
 * 3. Crear una clase llamada Operacion que tenga como atributos privados numero1 y
 * numero2.
 * 
 * a) Método constructor con todos los atributos pasados por parámetro.
 * b) Metodo constructor sin los atributos pasados por parámetro.
 * c) Métodos get y set.
 */
package operacionApp.entidades;

public class Operacion {
	
	private int numero1;
	private int numero2;

	// Constructor vacio
	public Operacion() {
	}

	// Constructor con Parametros
	public Operacion(int numero1, int numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}

	// Getter y Setters
	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public int getNumero2() {
		return numero2;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}
	
}
