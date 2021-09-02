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
	private String nombre;


	// Constructor vacio
	public Televisor() {
	}

	/**
	 * Un constructor con la resolucionn, sintonizador TDT y el resto de atributos
	 * heredados.
	 */
	public Televisor(Double precio, String color, Character consumoElectrico, Integer peso, Integer resolucionTv, boolean sintonizadorTDT) {
		super(precio, color, consumoElectrico, peso);
		this.resolucionTv = resolucionTv;
		this.sintonizadorTDT = sintonizadorTDT;
		this.nombre = "TELEVISOR";

	}

	// metodos get y set de los atributos resolucion y sintonizador TDT.
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
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo crearTelevisor(): este metodo llama a crearElectrodomestico() de la
	 * clase padre, lo utilizamos para llenar los atributos heredados del padre y
	 * despues llenamos los atributos del televisor.
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
		System.out.println("�El televisor cuenta con sintonizador TDT? \nSi [S] / No [N]");
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
	 * Metodo precioFinal(): este metodo sera heredado y se le sumara la siguiente
	 * funcionalidad. Si el televisor tiene una resolucion mayor de 40 pulgadas, se
	 * incrementara el precio un 30% y si tiene un sintonizador TDT incorporado,
	 * aumentara $500. Recuerda que las condiciones que hemos visto en la clase
	 * Electrodomestico tambien deben afectar al precio.
	 */
	@Override
	public double precioFinal() {
		double precio_final = super.precioFinal();

		double incrementoPorPulgadas = (this.precio * 30) / 100; // Obtenemos el valor a aumentar del 30% del
																	// precio

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
