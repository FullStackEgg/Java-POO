package ruletagameapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entidades.Juego;
import entidades.Jugador;
import entidades.RevolverDeAgua;

/**
 * 
 * @author Felipe Herrera
 *
 */
public class GameMain {

	public static void main(String[] args) {
		
		int cantidad;
		Scanner sc = new Scanner(System.in);
		Jugador nuevoJugador;
		List<Jugador> listaJugadores = new ArrayList<>();
		
		
		System.out.println("Ingrese la cantidad de jugadores que van a participar en esta ronda:");
		cantidad = sc.nextInt();
		
		// Creamos los jugadores
		for (int i = 0; i < cantidad; i++) {
			System.out.println("Ingrese el id del jugador:" + (i+1));
			int idJugador = sc.nextInt();
			
			nuevoJugador = new Jugador(idJugador);
			listaJugadores.add(nuevoJugador);
		}
		
		// se crea el arma
		RevolverDeAgua nuevaArma = new RevolverDeAgua(); 
		
		nuevaArma.llenarRevolver(); // Se carga el arma
		
		// Iniciamos el juego
		Juego nuevoJuego = new Juego();
		
		nuevoJuego.llenarJuego(listaJugadores, nuevaArma);
		
		nuevoJuego.ronda();
	}

}
