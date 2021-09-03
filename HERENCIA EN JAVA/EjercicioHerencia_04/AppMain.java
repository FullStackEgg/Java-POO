package appMain;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

import Entidades.Circulo;
import Entidades.Rectangulo;

public class AppMain {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		NumberFormat fn = new DecimalFormat("0,00");
		int num;

		do {

			System.out.println("Ingrese:\n [1] para crear CIRCULO \n [2] para crear RECTANGULO: ");
			num = leer.nextInt();

			if (num == 1) {

				System.out.println("----[ CREANDO CIRCULO ]----");
				Circulo c1 = new Circulo();

				System.out.println("Ingrese el radio del circulo");
				c1.setRadio(leer.nextDouble());

				System.out.println("Ingrese el diametro del circulo");
				c1.setDiametro(leer.nextDouble());

				System.out.println("[ Area del circulo ] = " + fn.format(c1.calcularArea()));
				System.out.println("[ Perimetro del circulo ] = " + fn.format(c1.calcularPerimetro()));

			} else if (num == 2) {
				
				System.out.println("----[ CREANDO RECTANGULO ]----");
				Rectangulo r1 = new Rectangulo();

				System.out.println("Ingrese la altura del rectangulo");
				r1.setAltura(leer.nextDouble());

				System.out.println("Ingrese base del rectangulo");
				r1.setBase(leer.nextDouble());

				System.out.println("[ Area del rectangulo ] = " + fn.format(r1.calcularArea()));
				System.out.println("[ Perimetro del rectangulo ] = " + fn.format(r1.calcularPerimetro()));
				
			} else {
				
				System.out.println("[ERROR] opcion incorrecta! - Intente de nuevo");
			}

		} while (num != 1 && num != 2);

	}

}
