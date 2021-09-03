package Servicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Entidad.Perro;

/**
 * 
 * @author Felipe Herrera
 *
 */
public class PerroServicio {

	private Scanner leer;
	private List<Perro> lista_perros;

	public PerroServicio() {
		this.leer = new Scanner(System.in).useDelimiter("\n");
		this.lista_perros = new ArrayList<>();
	}

	/**
	 * Pide los datos al usuario para crear un perro.
	 * @return perroCreado
	 */
	public Perro crearPerro() {

		Perro perroCreado;

		System.out.println("----- [INGRESO DE DATOS PERRO] -----");

		System.out.println("Ingrese Nombre:");
		String nombrePerro = leer.nextLine();

		System.out.println("Ingrese Raza:");
		String razaPerro = leer.nextLine();

		System.out.println("Ingrese Edad:");
		int edadPerro = Integer.parseInt(leer.nextLine());

		System.out.println("Ingrese el tamaño:");
		int tamanioPerro = Integer.parseInt(leer.nextLine());
		
		// Creamos el Objeto
		perroCreado = new Perro(nombrePerro, razaPerro, edadPerro, tamanioPerro);
		
		lista_perros.add(perroCreado); // agregamos el perro a la lista
		
		return null;
	}
	
	/*
	 * Recorre la lista e imprime los objetos
	 */
	public void mostrarPerros() {
		
		System.out.println("\n[ PERROS EN LA LISTA ]");
		
		for (Perro aux : lista_perros) {
			System.out.println(aux);
		}
	}
	
	/*
	 * Retorna la lista de perros
	 */
	public List<Perro> obtenerListaPerros() {
		return lista_perros;
	}
}
