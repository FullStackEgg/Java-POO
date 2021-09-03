package Servicio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import Entidad.Perro;
import Entidad.Persona;

/**
 * 
 * @author Felipe Herrera
 *
 */
public class PersonaServicio {
	
	private Scanner leer;
	private List<Persona> lista_Personas;

	// Constructor
	public PersonaServicio() {
		this.leer = new Scanner(System.in).useDelimiter("\n");
		this.lista_Personas = new ArrayList<>();
	}

	/**
	 * Pide datos al usuario para crear un Objeto del tipo Persona.
	 * @return personaCreada 
	 */
	public Persona crearPersona() {
		
		Persona personaCreada;
		
		System.out.println("----- [INGRESO DE DATOS PERSONA] -----");
		
		System.out.println("Ingrese Nombre:");
		String nombre = leer.nextLine();
		
		System.out.println("Ingrese Apellido:");
		String apellido = leer.nextLine();
		
		System.out.println("Ingrese Edad:");
		int edad = Integer.parseInt(leer.nextLine());
		
		System.out.println("Ingrese Documento:");
		int documento = Integer.parseInt(leer.nextLine());
		
		personaCreada = new Persona(nombre, apellido, edad, documento);
		
		// Agregamos la persona a la lista
		lista_Personas.add(personaCreada);
		
		return personaCreada;
	}
	
	/*
	 * Recorre la lista e imprime por consola
	 */
	public void mostrarPersonas() {
		
		System.out.println("\n[ PERSONAS AGREGADAS A LA LISTA ]");
		
		for (Persona aux : lista_Personas) {
			System.out.println(aux);
		}
	}
	
	/**
	 * 
	 * @param nombrePersona
	 */
	public void mostrarPersonaPorNombre(String nombrePersona) {
		
		System.out.println("\n[ DATOS DE LA PERSONA ]");
		
		for (Persona persona : lista_Personas) {
			
			if (persona.getNombre().equalsIgnoreCase(nombrePersona)) {
				// Mostramos la informacion completa
				System.out.println(persona.toString());
			}
		}
	}

	/**
	 * Obtiene la lista de perro y el nombre ingresado por el usuario.
	 * Busca en nombre en la lista y si lo encuentra, asigna el perro a la persona.
	 * @param listaObtenida
	 * @param nombrePerro
	 */
	public void adoptarPerro(List<Perro> listaObtenida, String nombrePerro, String nombrePersona) {
		
		List<Perro> listaAdopcion = new ArrayList<>(); // Se usara para asignar el perro a la persona
		
		// Se recorre la lista de personas
		for (Persona persona : lista_Personas) {
			
			if (nombrePersona.equalsIgnoreCase(persona.getNombre())) {
				// Si encontramos el nombre de la persona en la lista, recorremos la lista de perros
				for (Perro perro : listaObtenida) {
					
					if (nombrePerro.equalsIgnoreCase(perro.getNombrePerro())) {
						// Si encontramos el nombre del perro, lo asignamos a la listaAdopcion
						listaAdopcion.add(perro);
						
						persona.setPerros(listaAdopcion); // lo asignamos a la persona
						
						System.out.println(persona.getNombre() + " ha Adoptado a: " + perro.getNombrePerro());
					}
				}
			}
		}
	}
	
}
