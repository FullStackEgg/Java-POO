package service;

import java.util.*;
import entity.Perro;

/**
 * 
 * @author Felipe Herrera
 *
 */
public class PerroServicio {

	private Scanner leer;
	private List<Perro> perros;

	// Constructor sin parametros donde inicializamos el Scanner y la lista
	public PerroServicio() {
		this.leer = new Scanner(System.in);
		this.perros = new ArrayList<>();
	}

	public Perro crearPerro() {
		// Entrada de datos
		System.out.println("Ingrese la Raza de perro:");
		String raza = leer.nextLine();

		return new Perro(raza);
	}

	/*
	 * Agrega los obj a la Lista
	 */
	public void agregarPerro(Perro p) {
		perros.add(p);
	}

	/*
	 * Recorre la lista en un bucle for each e imprime los datos del toString de la
	 * clase Perro
	 */
	public void mostrarPerro() {

		System.out.println("\nLas razas de perro en la lista son:");

		for (Perro aux : perros) {
			System.out.println(aux.toString());
		}

		System.out.println("Cantidad de razas: " + perros.size());
	}

	/**
	 * Permitira crear varios obj de tipo perro, segun la cantidad especificada por
	 * el usuario.
	 * 
	 * Cantidad equivale al numero de perros a crear y los agrega a la lista.
	 */
	public void fabricaPerros() {

		System.out.println("\nIngrese la cantidad de Razas que desea agregar a la lista:");
		int cantidad = Integer.parseInt(leer.nextLine());

		while (cantidad > 0) {
			for (int i = 0; i < cantidad; i++) {
				Perro perroCreado = crearPerro(); // Creamos el obj Perro
				agregarPerro(perroCreado); // agregamos a la lista
			}

			System.out.println("\n¿Desea continuar?");
			System.out.println("Ingrese [1] para agregar otro perro.");
			System.out.println("Ingrese [0] para salir.");
			cantidad = Integer.parseInt(leer.nextLine()); // si ingresa 0 salimos del while
		}

		mostrarPerro(); // Mostramos la lista de perros
	}

	/**
	 * 
	 * @param index equivale a la posicion del obj en la lista. El cual se vera
	 *              modificado con los nuevos valores.
	 */
	public void actualizarPerro(int index) {

		// validamos si el index es menor o igual al tamanio de la lista
		if (index <= perros.size() - 1) {
			System.out.println("");
			System.out.println("\n====[ Actualizar Datos ]====");

			Perro p = crearPerro(); // se llama al metodo para crear nueva mascota

			perros.set(index, p); // Se modifica el Obj del index asignado por el usuario
		} else {
			System.out.println("Error al actualizar, indice fuera de rango.");
		}
	}

	/**
	 * 
	 * @param index equivale a la posicion del obj en la lista. El cual sera
	 *              eliminado
	 */
	public void eliminarPerro(int index) {

		// validamos si el index es menor o igual al tamanio de la lista
		if (index <= perros.size() - 1) {
			perros.remove(index); // eliminamos el registro
		} else {
			System.out.println("Error al eliminar, indice fuera de rango.");
		}
	}

	/**
	 * Eliminar con uso de Iterator.
	 * 
	 * @param razaEliminar es el valor ingresado por el usuario para eliminar de la
	 *                     lista perros
	 */
	public void eliminarPorRaza() {

		System.out.println("\nIngrese la raza de perro a eliminar:");
		String raza = leer.nextLine();

		// Recorremos la lista
		for (int i = 0; i < perros.size(); i++) {
			
			Perro p = perros.get(i); // tomamos el valor del indice actual de la lista
			
			// Comparamos los valores
			if (p.getRaza().equals(raza)) {
				perros.remove(p); // Eliminamos la raza
			}
		}
	}
	
	/**
	 * Pide que se ingrese la raza existente a modificar, y la reemplazara por la nueva ingresada
	 */
	public void actualizarPorRaza() {

		System.out.println("\nIngrese la raza de perro a modificar:");
		String razaModificar = leer.nextLine();
		
		System.out.println("\nIngrese la nueva raza:");
		String razaNueva = leer.nextLine();

		// Se recorre la lista
		for (int i = 0; i < perros.size(); i++) {
			
			Perro p = perros.get(i); // tomamos el valor del indice actual de la lista
			
			// Comparamos los valores
			if (p.getRaza().equals(razaModificar)) {
				p.setRaza(razaNueva); // modificamos la raza
			}
		}
	}

}
