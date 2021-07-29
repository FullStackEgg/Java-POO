package personaAPP;

/**
 * 
 * @author Felipe Herrera
 *
 */
public class PersonaMain {

	public static void main(String[] args) {

		// instanciamos el servicio
		ServicioPersona s = new ServicioPersona();

		// instanciamos los objetos Persona
		Persona p1 = new Persona();
		Persona p2 = new Persona();

		// Creamos las personas con la llamada al metodo
		s.crearPersona(p1);
		s.crearPersona(p2);

		// mostramos los datos de las personas
		s.mostrarPersona(p1);
		s.mostrarPersona(p2);

		// llamada al metodo para calcular la edad
		System.out.println("\n" + p1.getNombre() + " tiene " + s.calcularEdad(p1) + " años.");
		System.out.println("\n" + p2.getNombre() + " tiene " + s.calcularEdad(p2) + " años.");

		System.out.println();

		/*
		 * llamada al metodo menorQue y validamos dentro de un if ya que retorna true o
		 * false en este caso comparamos la edad de las dos personas y sabremos cual de
		 * los dos es menor que el otro/a
		 */
		if (s.menorQue(p1, s.calcularEdad(p2)) == true) {
			System.out.println(p1.getNombre() + " es menor que " + p2.getNombre());
		} else {
			System.out.println(p2.getNombre() + " es menor que " + p1.getNombre());
		}
	}

}
