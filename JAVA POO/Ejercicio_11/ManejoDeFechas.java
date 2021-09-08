/*
 * Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con
 * la clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la
 * clase Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le
 * pedirán al usuario para poner el constructor del objeto Date. Una vez creada la fecha
 * de tipo Date, deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la
 * fecha actual, que se puede conseguir instanciando un objeto Date con constructor vacío.
 */
package manejofechaApp;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 * 
 * @author Felipe Herrera
 *
 */
public class ManejoDeFechas {

	public static void main(String[] args) {

		// Nota actualmente se considera la Clase Date como una clase "obsoleta", 
		// por ende he usado la Clase LocalDate del paquete java.time

		int anio;
		int mes;
		int dia;
		Scanner leer = new Scanner(System.in);

		// Pedimos los datos al usuario
		System.out.println("Ingrese Su fecha de Nacimiento: ");

		System.out.println("Año: ");
		anio = leer.nextInt();

		System.out.println("Mes: ");
		mes = leer.nextInt();

		System.out.println("Dia: ");
		dia = leer.nextInt();

		leer.close();

		// Creamos la fecha con los datos ingresados
		LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);

		// Obtenemos la fecha actual
		LocalDate fechaActual = LocalDate.now();

		// Mostramos las fechas
		System.out.println("La fecha ingresada es: [ " + fechaNacimiento + " ]");
		System.out.println("La fecha actual es: [ " + fechaActual + " ]");

		/*
		 * Calculamos el periodo de tiempo entre las fechas con el uso de la clase
		 * ChronoUnit de la siguiente manera: ChronoUnit.YEARS.between(fechaNacimiento,
		 * fechaActual);
		 */
		System.out.println("Hay [ " + ChronoUnit.YEARS.between(fechaNacimiento, fechaActual)
				+ " ] años de diferencia, entre la fecha ingresada y la fecha actual.");

	}

}
