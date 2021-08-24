package entidades;

/**
 * 
 * @author Felipe Herrera
 *
 */
public class Pais {
	
	private String nombrePais;

	// Constructor vacio
	public Pais() {
	}

	// Constructor con parametros
	public Pais(String nombrePais) {
		this.nombrePais = nombrePais;
	}

	public String getNombrePais() {
		return nombrePais;
	}

	public void setNombrePais(String nombrePais) {
		this.nombrePais = nombrePais;
	}
	
	@Override
	public String toString() {
		return "[ Pais ] \nNombre = " + nombrePais;
	}
	
	

}
