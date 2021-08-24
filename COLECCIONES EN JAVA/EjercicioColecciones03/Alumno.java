package entity;

import java.util.*;

/**
 * 
 * @author Felipe Herrera
 *
 */
public class Alumno {

	private String name;
	private List<Integer> notas;
	
	public Alumno() {
		this.notas = new ArrayList<Integer>();
	}

	public Alumno(String name, List<Integer> notas) {
		this.name = name;
		this.notas = notas;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Integer> getNotas() {
		return notas;
	}

	public void setNotas(List<Integer> notas) {
		this.notas = notas;
	}

	@Override
	public String toString() {
		return "[ Alumno ] \nNombre = " + name + " \nNotas = " + notas;
	}

	
}
