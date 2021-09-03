package Entidad;

import java.util.List;

/**
 * 
 * @author Felipe Herrera
 *
 */
public class Persona {

	private String nombre;
	private String apellido;
	private int edad;
	private int documento;
	private List<Perro> perros;
	
	// Constructor vacio
	public Persona() {
	}

	public Persona(String nombre, String apellido, int edad, int documento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.documento = documento;
	}

	// Setters y Getters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getDocumento() {
		return documento;
	}

	public void setDocumento(int documento) {
		this.documento = documento;
	}

	public List<Perro> getPerros() {
		return perros;
	}

	public void setPerros(List<Perro> perros) {
		this.perros = perros;
	}

	@Override
	public String toString() {
		return "-------------------------------------"
				+ " \nnombre = " + nombre + " \napellido = " + apellido + " \nedad = " + edad
				+ " \ndocumento = " + documento + " \nperros = " + perros;
	}

}
