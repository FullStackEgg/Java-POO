package cuentApp.servicios;

import java.util.Scanner;
import cuentApp.entidades.Cuenta;

/**
 * 
 * @author Felipe Herrera
 *
 */
public class ServiciosCuenta {

	private Scanner leer = new Scanner(System.in);
	
	Cuenta nuevaCuenta = new Cuenta();

	/**
	 *  Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
	 * @return objeto tipo Cuenta
	 */
	public Cuenta crearCuenta() {
		System.out.println("Ingresa número de cuenta: ");
		int numCuenta = leer.nextInt();

		System.out.println("Ingresa DNI: ");
		int dni = leer.nextInt();

		System.out.println("Ingresa el saldo actual: ");
		int saldo = leer.nextInt();
		
		nuevaCuenta.setNumeroCuenta(numCuenta);
		nuevaCuenta.setDni(dni);
		nuevaCuenta.setSaldoActual(saldo);

		return nuevaCuenta;
	}
	
	/**
	 * Método ingresar(double ingreso): el método recibe una cantidad de dinero a
	 * ingresar y se la sumara a saldo actual.
	 */
	public void ingresarDinero(double ingreso) {
		int saldo = nuevaCuenta.getSaldoActual(); // obtenemos el saldo de la cuenta
		saldo += ingreso; 
		nuevaCuenta.setSaldoActual(saldo); // asignamos el nuevo saldo
	}
	
	/**
	 * El método recibe una cantidad de dinero a retirar y
	 * se la restará al saldo actual.
	 */
	public void retirarDinero(double retiro) {
		int saldo = nuevaCuenta.getSaldoActual(); // obtenemos el saldo de la cuenta
		
		if (retiro <= saldo) { //Validacion que el retiro no supere el saldo disponible
			saldo -= retiro; 
			nuevaCuenta.setSaldoActual(saldo); // seteamos el nuevo saldo
			System.out.println("Ha retirado: $" + retiro + " de su cuenta, saldo actual: $" + nuevaCuenta.getSaldoActual());
		} else {
			System.out.println("[ERROR] Imposible realizar el retiro, fondos insuficientes. Saldo actual: $" + nuevaCuenta.getSaldoActual());
		}
	}
	
	/**
	 * Permitirá sacar solo un 20% del saldo. 
	 */
	public void extraccionRapida() {
		int saldo = nuevaCuenta.getSaldoActual(); // obtenemos el saldo de la cuenta
		double extraccion = saldo * 0.2; // calculamos el 20% para la extraccion
		
		if (extraccion < saldo && saldo > 0) {
			saldo -= extraccion; // restamos el 20% al saldo actual
			nuevaCuenta.setSaldoActual(saldo); // seteamos el nuevo saldo
			// Mostramos en pantalla el resultado
			System.out.println("Ha sacado el 20% de su sueldo: $" + extraccion + ", Saldo actual: $" + nuevaCuenta.getSaldoActual());
		} else {
			System.out.println("[ERROR] No se pudo realizar la extraccion de dinero.");
		}
	}
	
}
