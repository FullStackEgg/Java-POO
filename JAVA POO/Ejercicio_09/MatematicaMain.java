/*
 * En el main se creará el objeto y se usará el Math.random para generar 
 * los dos números y se guardaran en el objeto con su respectivos set.
 */
package matematicApp;

import matematicApp.entidades.Matematica;

/**
 * 
 * @author Felipe Herrera
 *
 */
public class MatematicaMain {

	public static void main(String[] args) {

		Matematica mat1 = new Matematica();
		
		// variables para definir el rango de Math.random
		int num_min = 5;
		int num_max = 20;
		
		// Seteamos los valores usando el metodo random de la clase Math
		mat1.setNum1(Math.random()*(num_min-num_max)+num_max);
		mat1.setNum2(Math.random()*(num_min-num_max)+num_max);
		
		System.out.println("Valor asignado a num1: [" + mat1.getNum1() + "]");
		System.out.println("Valor asignado a num2: [" + mat1.getNum2() + "]");
		
		mat1.devolverMayor();
		mat1.calcularPotencia();
		mat1.calcularRaiz();
	}

}
