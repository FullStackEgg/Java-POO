package personaAPP;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 * 
 * @author Felipe Herrera
 *
 */
public class ServicioPersona {

	private Scanner leer = new Scanner(System.in);

	/*
	 * Este método rellena el objeto mediante un Scanner y le pregunta al usuario el
	 * nombre y la fecha de nacimiento de la persona a crear,
	 */
	public Persona crearPersona() {
		// Pedimos los datos al usuario para crear el Obj Persona
		System.out.println("\nIngrese nombre: ");
		String nombre = leer.nextLine();

		System.out.println("Ingrese apellido: ");
		String apellido = leer.nextLine();

		System.out.println("\nIngrese la fecha de nacimiento.");
		System.out.println("Año: ");
		int anio = Integer.parseInt(leer.nextLine());

		System.out.println("Mes: ");
		int mes = Integer.parseInt(leer.nextLine());

		System.out.println("Dia: ");
		int dia = Integer.parseInt(leer.nextLine());

		// Se crea la fecha para pasarla al Objeto Persona
		LocalDate fechaNaciemiento = LocalDate.of(anio, mes, dia);

		// Creamos el objeto directamente en el return
		// es igual a decir Persona p = new Persona(nombre, apellido, fechaNaciemiento);
		return new Persona(nombre, apellido, fechaNaciemiento);
	}

	/*
	 * Este método muestra la persona creada con la llamada al metodo toString del
	 * Obj Persona. Podriamos llamar los valores por un Get pero si el toString ya
	 * esta construido, esta es una forma mas rapida de obtener los valores
	 */
	public void mostrarPersona(Persona persona) {
		System.out.println("\n========================");
		System.out.println(persona.toString());
		System.out.println("========================");
	}

	/*
	 * A partir de la fecha de nacimiento ingresada calculara la edad de la persona.
	 * Tener en cuenta que para conocer la edad de la persona también se debe
	 * conocer la fecha actual.
	 */
	public int calcularEdad(Persona persona) {
		// traemos la fecha de nacimiento del objeto
		LocalDate fechaNacimiento = persona.getFechaNacimiento();

		// Obtenemos la fecha actual
		LocalDate fechaActual = LocalDate.now();

		// Calculamos la edad de la persona con el tiempo transcurido entre fechas
		int calcularEdad = (int) ChronoUnit.YEARS.between(fechaNacimiento, fechaActual);
		
		return calcularEdad;
	}

	/*
	 * Recibe como parámetro otra edad y retorna true en caso
	 * de que el receptor tenga menor edad que la persona que se recibe como
	 * parámetro, o false en caso contrario.
	 */
	public boolean menorQue(Persona persona, int edad) {
		boolean esMenor = false; // variable de retorno
		
		int edadPersona = calcularEdad(persona); //Traemos la edad de la persona
		
		// validamos si es menor que la que ingreso el usuario
		if (edadPersona < edad) {
			esMenor = true;
		} else {
			esMenor = false;
		}
		
		return esMenor;
	}
}
