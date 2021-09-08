/*
 * Realizar un programa en Java donde se creen dos arreglos: el primero será un
 * arreglo A de 50 números reales, y el segundo B, un arreglo de 20 números,
 * también reales. El programa deberá inicializar el arreglo A con números
 * aleatorios y mostrarlo por pantalla. Luego, el arreglo A se debe ordenar de
 * menor a mayor y copiar los primeros 10 números ordenados al arreglo B de 20
 * elementos, y rellenar los 10 últimos elementos con el valor 0.5. Mostrar los
 * dos arreglos resultantes: el ordenado de 50 elementos y el combinado de 20.
 */
package arreglosapp;

import java.util.Arrays;

/**
 * 
 * @author Felipe Herrera
 *
 */
public class ArreglosMain {

	public static void main(String[] args) {

		double array_A[] = new double[50];
		double array_B[] = new double[20];

		// Llenamos el arreglo A con valores aleatorios
		// usamos Math.round para redondear al valor mas cercano
		for (int i = 0; i < array_A.length; i++) {
			array_A[i] = Math.round(Math.random() * 1000);
		}

		// Ordenamos el arreglo A con el metodo sort
		Arrays.sort(array_A);

		/*
		 * Hacemos una copia de los valores del arreglo A al B. Nota: el 20 es porque
		 * nuestro arreglo B debe ser de 20 indices. por lo que estaremos copiando los
		 * 20 primeros valores, pero posteriormente dejaremos solo los 10 primeros, y
		 * los restantes de veran modificados o sobreescritos...
		 */
		array_B = Arrays.copyOf(array_A, 20);

		/*
		 * Aqui llenamos o sobrescribimos dese el indice 10 en adelante hasta el 20
		 * con el valor 0.5. Y los 10 primeros indices conservaran la copia del arreglo A
		 */
		Arrays.fill(array_B, 10, 20, 0.5); // esto es = Arrays.fill( arreglo_a_llenar, pos_desde, pos_hasta, valor )

		
		// Mostramos el arreglo A
		System.out.println("===============================");
		System.out.println("[ ARREGLO A ]");
		System.out.println("===============================");

		for (int i = 0; i < array_A.length; i++) {
			System.out.print(" [" + array_A[i] + "]");
		}

		System.out.println();

		// Mostramos el arreglo B
		System.out.println("===============================");
		System.out.println("[ ARREGLO B ]");
		System.out.println("===============================");

		for (int i = 0; i < array_B.length; i++) {
			System.out.print(" [" + array_B[i] + "]");
		}
	}

}
