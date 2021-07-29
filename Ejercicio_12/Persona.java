/*
 * Implemente la clase Persona. Una persona tiene un nombre y una fecha de
 * nacimiento (Tipo Date), constructor vacío, constructor parametrizado, get y
 * set.
 */
package personaAPP;

import java.time.LocalDate;

/**
 * 
 * @author Felipe Herrera
 *
 */
public class Persona {

	private String nombre;
	private String apellido;
	private LocalDate fechaNacimiento;
	
	// Constructor vacio
	public Persona() {
		fechaNacimiento = LocalDate.now(); // Para que no se cree la fecha en null
	}

	// Constructor con parametros
	public Persona(String nombre, String apellido, LocalDate fechaNacimiento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
	}

	// Getters & Setters
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

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "[ Persona ] \nNombre = " + nombre + " \nApellido = " + apellido + " \nFecha De Nacimiento = "
				+ fechaNacimiento;
	}
	
}
