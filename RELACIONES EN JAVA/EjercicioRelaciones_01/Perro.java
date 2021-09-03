package Entidad;

/**
 * 
 * @author Felipe Herrera
 *
 */
public class Perro {

	private String nombrePerro;
	private String razaPerro;
	private int edadPerro;
	private int tamanioPerro;
	
	public Perro() {
	}

	public Perro(String nombrePerro, String razaPerro, int edadPerro, int tamanioPerro) {
		this.nombrePerro = nombrePerro;
		this.razaPerro = razaPerro;
		this.edadPerro = edadPerro;
		this.tamanioPerro = tamanioPerro;
	}

	public String getNombrePerro() {
		return nombrePerro;
	}

	public void setNombrePerro(String nombrePerro) {
		this.nombrePerro = nombrePerro;
	}

	public String getRazaPerro() {
		return razaPerro;
	}

	public void setRazaPerro(String razaPerro) {
		this.razaPerro = razaPerro;
	}

	public int getEdadPerro() {
		return edadPerro;
	}

	public void setEdadPerro(int edadPerro) {
		this.edadPerro = edadPerro;
	}

	public int getTamanioPerro() {
		return tamanioPerro;
	}

	public void setTamanioPerro(int tamanioPerro) {
		this.tamanioPerro = tamanioPerro;
	}

	@Override
	public String toString() {
		return "\n----------------------------------"
				+ "\nNombre del Perro = " + nombrePerro + " \nRaza del Perro = " + razaPerro + " \nEdad del Perro = "
				+ edadPerro + " \nTamanio del Perro = " + tamanioPerro;
	}
	
	
}
