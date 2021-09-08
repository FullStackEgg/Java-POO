/**
 * D�gito Verificador. Crear una clase NIF que se usar� para mantener DNIs con su
 * correspondiente letra (NIF). Los atributos ser�n el n�mero de DNI (entero largo) y la
 * letra (String o char) que le corresponde.
 */

package ejercicioextra_04;

import java.util.Scanner;

public class Nif {

	int num_dni;
	char letra_nif;
	char[] arrayNif;
	
	public Nif() {
		this.arrayNif = new char[] {
			'T','R','W','A','G',
			'M','Y','F','P','D',
			'X','B','N','J','Z',
			'S','Q','V','H','L',
			'C','K','E'
		};
	}

	public int getNum_dni() {
		return num_dni;
	}

	public void setNum_dni(int num_dni) {
		this.num_dni = num_dni;
	}

	public char[] getArrayNif() {
		return arrayNif;
	}

	public void setArrayNif(char[] letra_nif) {
		this.arrayNif = letra_nif;
	}

	/**
	 * M�todo crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra
	 * que le corresponder�. Una vez calculado, le asigna la letra que le
	 * corresponde seg�n el resultado del calculo.
	 */
	public void crearNif() {
		Scanner sc = new Scanner(System.in).useDelimiter("\n");
		
		System.out.println("> Ingrese el numero de DNI: ");
		this.num_dni = Integer.parseInt(sc.nextLine());
		
		 // Para calcular la letra se toma el resto de dividir el n�mero de DNI por 23
		 // (el resultado debe ser un n�mero entre 0 y 22).
		double calcularLetra = num_dni % 23;
		 
		// buscar en un array (vector) de caracteres la posici�n que corresponda al resultado de la
		// divisi�n para obtener la letra correspondiente
		for (int i = 0; i < arrayNif.length; i++) {
			
			if (calcularLetra == i) {
				this.letra_nif = arrayNif[i]; // Asignamos la letra correspondiente
			}
		}
	}

	/**
	 * M�todo mostrar(): que nos permita mostrar el NIF (ocho d�gitos, un guion y la
	 * letra en may�scula; por ejemplo: 00395469-F).
	 */
	public void mostrar() {
		System.out.println("NIF: " + num_dni + "-" + letra_nif);
	}
}
