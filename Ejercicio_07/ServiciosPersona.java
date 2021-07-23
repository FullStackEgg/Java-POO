/*
 * Contiene los metodos de uso para la clase Persona
 */
package personaApp.servicios;

import java.text.DecimalFormat;
import java.util.Scanner;
import personaApp.entidades.Persona;

/**
 * 
 * @author Felipe Herrera
 *
 */
public class ServiciosPersona {

	private Scanner leer = new Scanner(System.in);
	DecimalFormat formateador = new DecimalFormat("##.#");

	/**
	 * Metodo crearPersona(): el método crear persona, le pide los valores de los
	 * atributos al usuario y después se le asignan a sus respectivos atributos para
	 * llenar el objeto Persona. Además, comprueba que el sexo introducido sea
	 * correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje
	 */
	public void crearPersona(Persona p) {
		System.out.println("=================================");
		System.out.println("Ingresa tu nombre: ");
		String nombre = leer.nextLine();
		p.setNombre(nombre);
		
		System.out.println("Ingresa tu edad: ");
		int edad = Integer.parseInt(leer.nextLine());
		p.setEdad(edad);

		//mientras que el sexo este vacio
		do {
			System.out.println("Ingresa  tu sexo: [H] para Hombre, [M] para Mujer, [O] para otro. ");
			String sexo = leer.nextLine();
			sexo = sexo.toUpperCase();
			
			// Validamos si el sexo es distinto de H - M - O,
			if (sexo.equals("H") || sexo.equals("M") || sexo.equals("O")) {
				p.setSexo(sexo);
			} else {
				System.out.println("[ Sexo incorrecto ]");
				p.setSexo("");
			}
		} while (p.getSexo().equals(""));
		
		System.out.println("Ingresa tu peso: ");
		int peso = Integer.parseInt(leer.nextLine());
		p.setPeso(peso);

		System.out.println("Ingresa tu altura en formato: [1.70]");
		double altura = Double.parseDouble(leer.nextLine());
		p.setAltura(altura);
		
		System.out.println();
		System.out.println("=================================");
		System.out.println(" [ Persona Creada correctamente! ]");
	}

	/**
	 * Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
	 * kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que
	 * 20, la función devuelve un -1. Si la fórmula da por resultado un número entre
	 * 20 y 25 (incluidos), significa que el peso está por debajo de su peso ideal y
	 * la función devuelve un 0. Finalmente, si el resultado de la fórmula es un
	 * valor mayor que 25 significa que la persona tiene sobrepeso, y la función
	 * devuelve un 1. Se recomienda hacer uso de constantes para devolver estos
	 * valores.
	 * @param Object Persona p
	 * @return int	
	 */
	public int calcularIMC(Persona p) {
		int res;
		double altura = p.getAltura(); // obtenemos el peso del objeto (p)
		int peso = p.getPeso(); // obtenemos la altura del objeto (p)
		
		// calculamos el indice de masa corporal
		double imc = peso / (altura * altura);

		// Validamos el resultado de imc
		if (imc < 20) {
			res = -1;
			System.out.println(p.getNombre() + " Su indice de masa corporal es: " + formateador.format(imc) + " Peso inferior al normal.");
		} else {
			if (imc >= 20 && imc <= 25) {
				res = 0;
				System.out.println(p.getNombre() + " Su indice de masa corporal es: " + formateador.format(imc) + " Esta en el peso ideal.");
			} else {
				res = 1;
				System.out.println(p.getNombre() + " Su indice de masa corporal es: " + formateador.format(imc) +  " Tiene sobrpeso.");
			}
		}
		return res;
	}

	/**
	 * Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
	 * devuelve un booleano.
	 * @param Object Persona p
	 * @return boolean	
	 */
	public boolean esMayorDeEdad(Persona p) {
		boolean esMayor;
		int edad = p.getEdad(); // Obtenemos la edad del objeto p
		
		// Validamos si la edad es mayor a 18
		if (edad >= 18) {
			esMayor = true;
			System.out.println(p.getNombre() + " es mayor de edad!.");
		} else {
			esMayor = false;
			System.out.println(p.getNombre() + " es menor de edad!.");
		}
		return esMayor;
	}
}
