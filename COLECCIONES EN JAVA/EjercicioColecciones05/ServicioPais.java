package servicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import comparadores.Comparadores;
import entidades.Pais;

/**
 * 
 * @author Felipe Herrera
 *
 */
public class ServicioPais {

	private Scanner leer;
	private HashSet<Pais> paises;

	// Constructor sin parametros para inicializar el conjunto HashSet y el scanner
	public ServicioPais() {
		this.leer = new Scanner(System.in).useDelimiter("\n");
		this.paises = new HashSet<Pais>();
	}

	/**
	 * Pedira el nombre del pais al usuario, creara el objeto y lo agregara al
	 * conjunto HashSet.
	 */
	public Pais crearPais() {
		System.out.println("Ingrese el nombre del Pais:");
		String nombrePais = leer.nextLine();

		// Creamos el Objeto
		Pais paisCreado = new Pais(nombrePais);

		// Agregamos el Pais al conjunto
		paises.add(paisCreado);

		return paisCreado;
	}

	/**
	 * Recorrera el conjunto HashSet en un bucle for each.
	 * <p>
	 * Y muestra los elementos que contiene el conjunto HashSet.
	 */
	public void mostrarPaises() {
		System.out.println("Los Paises actuales del conjunto HashSet son:");

		// bucle for each que recorre el hashSet
		for (Pais aux : paises) {
			// Mostramos los paises del hashset
			System.out.println(aux.toString());
		}
	}

	// Metodo de Prueba que creara varios paises sin pedir datos por consola
	public void fabricaPaises() {

		// Creamos los paises
		Pais colombia = new Pais("Colombia");
		Pais argentina = new Pais("Argentina");
		Pais mexico = new Pais("Mexico");
		Pais brazil = new Pais("Brazil");
		Pais chile = new Pais("Chile");
		Pais peru = new Pais("Peru");

		// se agrega el obj al conjunto
		paises.add(colombia);
		paises.add(argentina);
		paises.add(mexico);
		paises.add(brazil);
		paises.add(chile);
		paises.add(peru);
	}

	/**
	 * Toma el conjunto y lo convierte a Lista para poder ordenarlo
	 * con un Comparator y al final muestra la Lista ordenada.
	 */
	public void mostrarOrdenarAlfabeticamente() {
		// Convertimos el HashSet a una Lista
		List<Pais> lista_paises = new ArrayList(paises);

		// Sobreescribimos la coleccion con el orden Alfabetico
		Collections.sort(lista_paises, Comparadores.ordenarPaisAlfabeticamente);

		// Mostramos la lista ordenada
		for (Pais aux : lista_paises) {
			System.out.println(aux);
		}
	}
	
	/**
	 * Toma un valor ingresado y lo busca en el hashSet, si se encuentra sera eliminado.
	 * Si no esta en el conjunto se retorna un mensaje.
	 * 
	 * @param paisIngresado equivale al valor ingresado por el usuario
	 */
	public void eliminarPais(String paisIngresado) {
		// Hacemos uso del iterator para recorrer el conjunto
		Iterator<Pais> it = paises.iterator();
		
		while (it.hasNext()) {
			// Validamos si el pais ingresado hace parte del hashSet
			if (it.next().getNombrePais().equals(paisIngresado)) {
				it.remove();
				System.out.println("Pais Eliminado");
			} 
		}
	}
	

}
