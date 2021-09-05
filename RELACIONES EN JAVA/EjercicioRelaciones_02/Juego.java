package entidades;

import java.util.ArrayList;
import java.util.List;

public class Juego {

	private RevolverDeAgua arma;
	private List<Jugador> listaJugadores = new ArrayList<>();

	public Juego() {
	}

	public RevolverDeAgua getArma() {
		return arma;
	}

	public void setArma(RevolverDeAgua arma) {
		this.arma = arma;
	}

	public List<Jugador> getListaJugadores() {
		return listaJugadores;
	}

	public void setListaJugadores(List<Jugador> listaJugadores) {
		this.listaJugadores = listaJugadores;
	}

	/**
	 * llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los
	 * jugadores y el revolver para guardarlos en los atributos del juego.
	 */
	public void llenarJuego(List<Jugador> listaJugadores, RevolverDeAgua arma) {
		this.listaJugadores = listaJugadores;
		this.arma = arma;
	}

	/**
	 * ronda(): cada ronda consiste en un jugador que se apunta con el revolver de
	 * agua y aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y
	 * se termina el juego, sino se moja, se pasa al siguiente jugador hasta que uno
	 * se moje. Si o si alguien se tiene que mojar. Al final del juego, se debe
	 * mostrar que jugador se mojó. Pensar la lógica necesaria para realizar esto,
	 * usando los atributos de la clase Juego
	 */
	public void ronda() {

		String nombreJugadorMojado = "";
		
		// recorrer la lista de jugadores
		for (Jugador jugadorRonda : listaJugadores) {
			
			System.out.println("\n[Turno del jugador " + jugadorRonda.getIdJugador() + "]");
			
			// jugdor se "Apunta" y dispara
			if (jugadorRonda.disparo(arma) == true) {
				// Finaliza el juego y muestra el jugador que se mojo
				nombreJugadorMojado = jugadorRonda.getNombre();
				System.out.println("\n========================================");
				System.out.println(">>>> Baam!!! Se disparo el arma!!!!!");
				System.out.println("========================================");
				break;
			} else {
				System.out.println("\nEl jugador: " + jugadorRonda.getIdJugador() + " Se ha salvado!!");
				System.out.println("Siguiente...");
			}
			
		}
		
		System.out.println("\nEl perdedor del juego ha sido el: [" + nombreJugadorMojado + "]");
	}
}
