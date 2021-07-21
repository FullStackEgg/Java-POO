/**
 * 4. Crear una clase Rectángulo que modele rectángulos por medio de un atributo
 * privado base y un atributo privado altura. La clase incluirá un método para crear el
 * rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
 * método para calcular la superficie del rectángulo y un método para calcular el
 * perímetro del rectángulo. Por último, tendremos un método que dibujará el
 * rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
 * los métodos getters, setters y constructores correspondientes.
 * Superficie = base * altura 
 * Perímetro = (base + altura) * 2.
 */
package rectanguloApp.entidades;

/**
 * 
 * @author Felipe Herrera
 *
 */
public class Rectangulo {

	private int base;
	private int altura;

	// Constructor vacio
	public Rectangulo() {
		super();
	}

	/*
	 * Constructor con parametros para crear el rectángulo con los datos dados por
	 * el usuario.
	 */
	public Rectangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	/*
	 * método para calcular la superficie del rectángulo
	 */
	public int calcularSuperficie() {
		int superficie = base * altura;
		return superficie;
	}

	/*
	 * método para calcular el perímetro del rectángulo.
	 */
	public int calcularPerimetro() {
		int perimetro = (base + altura) * 2;
		return perimetro;
	}

	/**
	 * método que dibujará el rectángulo mediante 
	 * asteriscos usando la base y la altura
	 */
	public void dibujarRectangulo() {
		// i recorre la altura
		for (int i = 1; i <= altura; i++) {
			// j recorre la base
			for (int j = 1; j <= base; j++) {
				
				if ((i > 1 && i < altura) && (j > 1 && j < base)) {
					System.out.print("  ");
				} else {
					System.out.print("* ");
				}
			}
			System.out.println("");
		}
	}
}
