/**
* Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo
* de String) y su longitud. En el main se creará el objeto y se le pedirá al
* usuario que ingrese una frase que puede ser una palabra o varias palabras
* separadas por un espacio en blanco y a través de los métodos set, se guardará
* la frase y la longitud de manera automática según la longitud de la frase
* ingresada. Deberá además implementar los siguientes métodos:
*/
package cadenApp.entidades;

/**
 * 
 * @author Felipe Herrera
 *
 */
public class Cadena {

	private String frase;
	private int longitudFrase;
	
	// Constructor por defecto
	public Cadena() {
	}

	// Constructor con parametros
	public Cadena(String frase, int longitudFrase) {
		this.frase = frase;
		this.longitudFrase = longitudFrase;
	}

	// Getters y Setters
	public String getFrase() {
		return frase;
	}

	public void setFrase(String frase) {
		this.frase = frase;
	}

	public int getLongitudFrase() {
		return longitudFrase;
	}

	public void setLongitudFrase(int longitudFrase) {
		this.longitudFrase = longitudFrase;
	}
	
}
