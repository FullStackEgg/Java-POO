package entidades;

import java.util.Scanner;

/**
 * 
 * @author Felipe Herrera
 *
 */
public class Televisor extends Electrodomestico {

	// atributos:
	private Integer resolucionTv; // pulgadas
	private boolean sintonizadorTDT;

	// Constructor vacio
	public Televisor() {
	}

	/**
	 * Un constructor con la resolución, sintonizador TDT y el resto de atributos
	 * heredados.
	 */
	public Televisor(Double precio, String color, Character consumoElectrico, Integer peso, Integer resolucionTv,
			boolean sintonizadorTDT) {
		super(precio, color, consumoElectrico, peso);
		this.resolucionTv = resolucionTv;
		this.sintonizadorTDT = sintonizadorTDT;
	}

	// • Método get y set de los atributos resolución y sintonizador TDT.
	public Integer getResolucionTv() {
		return resolucionTv;
	}

	public void setResolucionTv(Integer resolucionTv) {
		this.resolucionTv = resolucionTv;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}

	public void setSintonizadorTDT(boolean sintonizadorTDT) {
		this.sintonizadorTDT = sintonizadorTDT;
	}

	/**
	 * Método crearTelevisor(): este método llama a crearElectrodomestico() de la
	 * clase padre, lo utilizamos para llenar los atributos heredados del padre y
	 * después llenamos los atributos del televisor.
	 */
	public void crearTelevisor() {

		super.crearElectrodomestico(); // llamada al metodo de la clase padre

		Scanner leer = new Scanner(System.in).useDelimiter("\n");

		// ResolucionTv
		System.out.println("\n- Ingrese la resolucion en pulgadas del Televisor:");
		Integer resolucionIngresada;

		do {
			resolucionIngresada = Integer.parseInt(leer.nextLine());

			if (resolucionIngresada > 0) {
				setResolucionTv(resolucionIngresada);
			} else {
				System.out.println("Error, Resolucion de pantalla ingresada no admitida. Intente de nuevo.");
				System.out.println("\n- Ingrese la resolucion en pulgadas del Televisor:");
			}
		} while (resolucionIngresada <= 0);

		// SintonizadorTDT
		System.out.println("¿El televisor cuenta con sintonizador TDT? \nSi [S] / No [N]");
		String respuesta = "";

		while (!"N".equalsIgnoreCase(respuesta) && !"S".equalsIgnoreCase(respuesta)) {
			respuesta = leer.nextLine();

			if (respuesta.equalsIgnoreCase("S")) {
				setSintonizadorTDT(true);
			} else {
				if (respuesta.equalsIgnoreCase("N")) {
					setSintonizadorTDT(false);
				} else {
					System.out.println("Error, Respuesta ingresada no admitida. Intente de nuevo.");
					System.out.println("¿El televisor cuenta con sintonizador TDT? \nSi [S] / No [N]");
				}
			}
		}

		System.out.println("---- [ ELECTRODOMESTICO CARGADO DE FORMA EXITOSA! ] ----");
	}

	/**
	 * Método precioFinal(): este método será heredado y se le sumará la siguiente
	 * funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
	 * incrementará el precio un 30% y si tiene un sintonizador TDT incorporado,
	 * aumentará $500. Recuerda que las condiciones que hemos visto en la clase
	 * Electrodomestico también deben afectar al precio.
	 */
	@Override
	public double precioFinal() {
		double precio_final = super.precioFinal();
		
		double incrementoPorPulgadas = (this.precio * 30) /100; // Obtenemos el valor a aumentar del 30% del precio
		
		if (this.resolucionTv > 40) {
			precio_final += incrementoPorPulgadas;
			
			if (sintonizadorTDT == true) {
				precio_final += 500;
			}
		}
		
		return precio_final;
	}

	@Override
	public String toString() {
		return "[ Televisor ] \nResolucionTv = " + getResolucionTv() + " \nsintonizadorTDT = " + isSintonizadorTDT()
				+ " \nPrecio = " + getPrecio() + " \nColor = " + getColor() + " \nConsumo Electrico = "
				+ getConsumoElectrico() + " \nPeso = " + getPeso();
	}

}
