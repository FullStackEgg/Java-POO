package entidades;

/**
 * 
 * @author Felipe Herrera
 *
 */
public class Jugador {

	private int idJugador;
	private String nombre;
	private boolean mojado;

	public Jugador() {
	}

	public int getIdJugador() {
		return idJugador;
	}

	public void setIdJugador(int idJugador) {
		this.idJugador = idJugador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isMojado() {
		return mojado;
	}

	public void setMojado(boolean mojado) {
		this.mojado = mojado;
	}

	public Jugador(int idJugador) {
		if (idJugador <= 0 || idJugador > 6) {
			this.idJugador = 6;
		} else {
			this.idJugador = idJugador;
		}

		this.nombre = "Jugador " + this.idJugador;
		this.mojado = false;
	}

	/**
	 * disparo(Revolver r): el método, recibe el revolver de agua y llama a los
	 * métodos de mojar() y siguienteChorro() de Revolver. El jugador se apunta,
	 * aprieta el gatillo y si el revolver tira el agua, el jugador se moja. El
	 * atributo mojado pasa a false y el método devuelve true, sino false.
	 */
	public boolean disparo(RevolverDeAgua arma) {

		if (arma.mojar() == true) {
			// el jugador se moja
			this.mojado = true;
		} else {
			this.mojado = false;
			arma.siguienteChorro();
		}

		return mojado;
	}

}
