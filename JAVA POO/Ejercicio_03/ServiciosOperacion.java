/**
 * d) M�todo para crearOperacion(): que le pide al usuario los dos n�meros y los
 * guarda en los atributos del objeto.
 * e) M�todo sumar(): calcular la suma de los n�meros y devolver el resultado al main.
 * f) M�todo restar(): calcular la resta de los n�meros y devolver el resultado al main
 * g) M�todo multiplicar(): primero valida que no se haga una multiplicaci�n por cero,
 * si fuera a multiplicar por cero, el m�todo devuelve 0 y se le informa al usuario el
 * error. Si no, se hace la multiplicaci�n y se devuelve el resultado al main
 * h) M�todo dividir(): primero valida que no se haga una divisi�n por cero, si fuera a
 * pasar una divisi�n por cero, el m�todo devuelve 0 y se le informa al usuario el
 * error se le informa al usuario. Si no, se hace la divisi�n y se devuelve el resultado al main.
 */
package operacionApp.entidades.servicios;

import java.util.Scanner;

import operacionApp.entidades.Operacion;

public class ServiciosOperacion {

	private Scanner leer = new Scanner(System.in);
	
	/**
	 * Crea el objeto a partir de los datos 
	 * ingresados por el usuario
	 */
	public Operacion crearOperacion() {
		System.out.println("Ingrese el primer numero:");
		int num1 = leer.nextInt();
		
		System.out.println("Ingrese el segundo numero:");
		int num2 = leer.nextInt();
		
		return new Operacion(num1, num2);
	}
	

	public int sumar(int num1, int num2) {
		int suma = num1 + num2;
		return suma;
	}
	
	
	public int restar(int num1, int num2) {
		int resta = num1 - num2;
		return resta;
	}
	
	 
	public int multiplicar(int num1, int num2) {
		int multiplicacion = 0;
		
		if (num1 != 0 && num2 != 0) {
			multiplicacion = num1 * num2;
		} else {
			System.out.println("No se puede multiplicar entre 0.");
		}
		
		return multiplicacion;
	}
	
	
	public double dividir(int num1, int num2) {
		double division = 0;
		
		if (num1 != 0 && num2 != 0) {
			division = num1 / num2;
		} else {
			System.out.println("No se puede dividir entre 0.");
		}
		
		return division;
	}
}
