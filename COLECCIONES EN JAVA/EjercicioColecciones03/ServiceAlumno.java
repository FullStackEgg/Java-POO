package service;

import java.util.*;
import entity.Alumno;

/**
 * 
 * @author Felipe Herrera
 *
 */
public class ServiceAlumno {

	private Scanner leer;
	private List<Alumno> lista_alumnos;

	// constructor sin parametros e inicializamos scanner y la lista
	public ServiceAlumno() {
		this.leer = new Scanner(System.in).useDelimiter("\n");
		this.lista_alumnos = new ArrayList<>();
	}

	/**
	 * Pide los datos al usuario para crear un objeto de tipo Alumno.
	 * 
	 * @return alumno equivale al objeto creado con los datos ingresados
	 */
	public Alumno crearAlumno() {
		// Entrada de datos
		System.out.println("Ingrese los datos del alumno:");
		System.out.println("Nombre:");
		String name = leer.nextLine();

		System.out.println("\nIngrese las notas:");
		System.out.println("Nota 1:");
		int nota1 = Integer.parseInt(leer.nextLine());

		System.out.println("Nota 2:");
		int nota2 = Integer.parseInt(leer.nextLine());

		System.out.println("Nota 3:");
		int nota3 = Integer.parseInt(leer.nextLine());

		// Damos los valores a la lista Notas
		List<Integer> notas = new ArrayList<>();
		notas.add(nota1);
		notas.add(nota2);
		notas.add(nota3);

		// Creamos el Objeto
		Alumno alumno = new Alumno(name, notas);

		// Agregamos el alumno creado a la lista de alumnos
		agregarAlumno(alumno);

		return alumno;
	}

	/**
	 * Agrega el objeto Pasado por parametro a la lista. .
	 * 
	 * @param alumno
	 */
	public void agregarAlumno(Alumno alumno) {
		lista_alumnos.add(alumno);
	}

	/**
	 * Recibe un objeto Alumno y
	 * Obtiene la lista Notas del objeto para calcular la nota final.
	 */
	public void notaFinal(Alumno alumno) {

		int nota, notaFinal;
		int sumaNotas = 0;

		List<Integer> notasAlumno = alumno.getNotas(); // Traemos la lista del objeto

		// Recorremos la lista
		for (int i = 0; i < notasAlumno.size(); i++) {
			nota = notasAlumno.get(i); // obtenemos c/u de las notas
			sumaNotas += nota; // vamos sumando c/u de las notas
		}

		// Calculamos la nota final
		notaFinal = sumaNotas / 3;

		System.out.println("La nota final de " + alumno.getName() + " es: " + notaFinal);
	}
	
	/**
	 * Pide un nombre ingresado por el usuario, y lo buscara en la lista Alumnos.
	 * En caso de encontrar el alumno, mostrara su nota final.
	 * 
	 */
	public void notaFinalPorNombreAlumno() {
		System.out.println("Ingrese el nombre del alumno para ver su nota final:");
		String nombreIngresado = leer.nextLine();
		
		// Recorremos la lista
		for (int i = 0; i < lista_alumnos.size(); i++) {
			Alumno alumno = lista_alumnos.get(i); // tomamos el objeto
			
			// Comparamos los nombres
			if (alumno.getName().equals(nombreIngresado) ) {
				// llamamos al Metodo para obtener la notaFinal
				notaFinal(alumno);
			} else {
				System.out.println("Alumno no encontrado.");
			}
		}
	}
}
