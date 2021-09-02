package entidades;

import java.util.Scanner;

/**
 * 
 * @author Felipe Herrera
 *
 */
public class Lavadora extends Electrodomestico {

	// Atributo
	private Integer carga;
	private String nombre;

	// Conatructor vacio
	public Lavadora() {
	}

	// constructor con la carga y el resto de atributos heredados
	public Lavadora(Double precio, String color, Character consumoElectrico, Integer peso, Integer carga) {
		super(precio, color, consumoElectrico, peso);
		this.carga = carga;
		this.nombre = "LAVADORA";
	}

	// Get y set
	public Integer getCarga() {
		return carga;
	}

	public void setCarga(Integer carga) {
		this.carga = carga;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * M�todo crearLavadora (): este m�todo llama a crearElectrodomestico() de
	 * la clase padre, lo utilizamos para llenar los atributos heredados del padre y
	 * despu�s llenamos el atributo propio de la lavadora.
	 */
	public void crearLavadora() {
		Scanner leer = new Scanner(System.in).useDelimiter("\n");

		// llamada al metodo de la clase padre
		super.crearElectrodomestico();

		System.out.println("\n- Ingrese la Carga de la Lavadora:");
		Integer cargaIngresada;

		do {
			cargaIngresada = Integer.parseInt(leer.nextLine());

			// Validamos que el valor ingresado sea mayor a cero.
			if (cargaIngresada > 0) {
				setCarga(cargaIngresada);
			} else {
				System.out.println("Error, Carga ingresada no admitida.");
				System.out.println("\n- Ingrese la Carga de la Lavadora:");
			}
		} while (cargaIngresada <= 0);

		System.out.println("---- [ ELECTRODOMESTICO CARGADO DE FORMA EXITOSA! ] ----");
	}

	/**
	 * M�todo precioFinal(): este m�todo ser� heredado y se le sumar� la
	 * siguiente funcionalidad. Si tiene una carga mayor de 30 kg, aumentar� el
	 * precio en $500, si la carga es menor o igual, no se incrementar� el precio.
	 * Este m�todo debe llamar al m�todo padre y a�adir el c�digo necesario.
	 * Recuerda que las condiciones que hemos visto en la clase Electrodom�stico
	 * tambi�n deben afectar al precio.
	 */
	@Override
	public double precioFinal() {
		double precio_final = super.precioFinal();

		if (this.carga >= 30) {
			precio_final += 500;
		}

		return precio_final;
	}

	@Override
	public String toString() {
		return "[ Lavadora ] \nCarga = " + getCarga() + " \nPrecio = " + getPrecio() + " \nColor = " + getColor()
				+ " \nConsumoElectrico = " + getConsumoElectrico() + " \nPeso = " + getPeso();
	}

}
