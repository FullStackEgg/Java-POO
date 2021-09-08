/**
 * 4. Crear una clase Rect�ngulo que modele rect�ngulos por medio de un atributo
 * privado base y un atributo privado altura. La clase incluir� un m�todo para crear el
 * rect�ngulo con los datos del Rect�ngulo dados por el usuario. Tambi�n incluir� un
 * m�todo para calcular la superficie del rect�ngulo y un m�todo para calcular el
 * per�metro del rect�ngulo. Por �ltimo, tendremos un m�todo que dibujar� el
 * rect�ngulo mediante asteriscos usando la base y la altura. Se deber�n adem�s definir
 * los m�todos getters, setters y constructores correspondientes.
 * Superficie = base * altura 
 * Per�metro = (base + altura) * 2.
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
	 * Constructor con parametros para crear el rect�ngulo con los datos dados por
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
	 * m�todo para calcular la superficie del rect�ngulo
	 */
	public int calcularSuperficie() {
		int superficie = base * altura;
		return superficie;
	}

	/*
	 * m�todo para calcular el per�metro del rect�ngulo.
	 */
	public int calcularPerimetro() {
		int perimetro = (base + altura) * 2;
		return perimetro;
	}

	/**
	 * m�todo que dibujar� el rect�ngulo mediante 
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
