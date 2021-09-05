package entidades;

/**
 * 
 * @author Felipe Herrera
 *
 */
public class RevolverDeAgua {

	// Estas dos posiciones, se generar�n aleatoriamente.
	private Integer posActual; // (posici�n del tambor que se dispara, puede que est� el agua o no)
	private Integer posAgua; // (la posici�n del tambor donde se encuentra el agua).

	public RevolverDeAgua() {
	}

	public RevolverDeAgua(Integer posActual, Integer posAgua) {
		this.posActual = posActual;
		this.posAgua = posAgua;
	}

	public Integer getPosActual() {
		return posActual;
	}

	public void setPosActual(Integer posActual) {
		this.posActual = posActual;
	}

	public Integer getPosAgua() {
		return posAgua;
	}

	public void setPosAgua(Integer posAgua) {
		this.posAgua = posAgua;
	}

	/**
	 * llenarRevolver(): le pone los valores de posici�n actual y de posici�n del
	 * agua. Los valores seran aleatorios, Usando la clase Math.random..
	 */
	public void llenarRevolver() {
		// Generamos un valor aleatorio entre 1 a 6
		this.posActual = (int) (Math.random() * 6) + 1;
		this.posAgua = (int) (Math.random() * 6) + 1;
	}

	/**
	 * mojar(): devuelve true si la posici�n del agua coincide con la posici�n
	 * actual
	 */
	public boolean mojar() {
		boolean bandera = false;

		if (this.posAgua == this.posActual) { // Validamos si las posiciones coinciden
			bandera = true;
			// se "dispara" el arma
		}

		return bandera;
	}

	/**
	 * siguienteChorro(): cambia a la siguiente posici�n del tambor
	 */
	public void siguienteChorro() {
		this.posActual++;
	}

	@Override
	public String toString() {
		return "[ Revolver De Agua ] \nPosicion Actual = " + posActual + " \nPosicion del Agua = " + posAgua;
	}

}
