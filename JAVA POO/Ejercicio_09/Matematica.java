/*
 * Realizar una clase llamada Matemática que tenga como atributos dos números reales
 * con los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener
 * un constructor vacío, parametrizado y get y set.
 */
package matematicApp.entidades;

/**
 * 
 * @author Felipe Herrera
 *
 */
public class Matematica {

	private double num1;
	private double num2;

	public Matematica() {
	}

	public Matematica(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

	/**
	 * Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
	 * valor
	 */
	public void devolverMayor() {
		// redondeamos los valores
		this.num1 = Math.round(num1);
		this.num2 = Math.round(num2);
		
		// validamos cual es mayor
		if (this.num1 > this.num2) {
			System.out.println("El numero mayor es el num1 = [" + num1 + "].");
		} else if (this.num2 > this.num1) {
			System.out.println("El numero mayor es el num2 = [" + num2 + "].");
		} else {
			System.out.println("Los numeros son iguales: \nNum1 = [" + num1 + "] Num2 = [" + num2 + "].");
		}
	}

	/**
	 * Método calcularPotencia() para calcular la potencia del mayor valor de la
	 * clase elevado al menor número. Previamente se deben redondear ambos valores.
	 */
	public void calcularPotencia() {
		double potencia = 0;

		// redondeamos los valores
		this.num1 = Math.round(num1);
		this.num2 = Math.round(num2);

		// validamos cual es mayor
		if (this.num1 > this.num2) {
			// potencia del num1 si es mayor
			potencia = Math.pow(num1, num2);
			System.out.println("La potencia del numero mayor es: [" + potencia + "].");
		} 
		else if (this.num2 > this.num1) {
			// potencia del num2 si es mayor
			potencia = Math.pow(num2, num1);
			System.out.println("La potencia del numero mayor es: [" + potencia + "].");
		} 
		else {
			System.out.println("[Error] No se pudo calcular la potencia. Los numeros son iguales");
		}
	}

	/**
	 * Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos
	 * valores. Antes de calcular la raíz cuadrada se debe obtener el valor absoluto
	 * del número.
	 */
	public void calcularRaiz() {
		double raiz = 0;

		// obtenemos el valor absoluto de los #
		this.num1 = Math.abs(num1);
		this.num2 = Math.abs(num2);

		// validamos cual es menor para calcular raiz
		if (this.num1 < this.num2) {
			// raiz del num1 si es menor
			raiz = Math.sqrt(num1);
			System.out.println("La raiz cuadrada de [" + num1 + "] es [" + raiz + "]");
		} 
		else if (this.num2 < this.num1) {
			// raiz del num2 si es menor
			raiz = Math.sqrt(num2);
			System.out.println("La raiz cuadrada de [" + num1 + "] es [" + raiz + "]");
		} 
		else {
			System.out.println("[Error] No se pudo calcular la raiz. Los numeros son iguales");
		}
	}
}
