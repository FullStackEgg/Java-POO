/**
 * Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
 * atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual.
 * 
 */
package cuentApp.entidades;

/**
 * 
 * @author Felipe Herrera
 *
 */
public class Cuenta {

	private int numeroCuenta;
	private int dni;
	private int saldoActual;
	
	// Constructor por defecto
	public Cuenta() {
	}

	// constructor con DNI, saldo, número de cuenta e interés.
	public Cuenta(int numeroCuenta, int dni, int saldoActual) {
		this.numeroCuenta = numeroCuenta;
		this.dni = dni;
		this.saldoActual = saldoActual;
	}

	// métodos getters y setters
	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getSaldoActual() {
		return saldoActual;
	}

	public void setSaldoActual(int saldoActual) {
		this.saldoActual = saldoActual;
	}
	
	/*
	 * Método ingresar(double ingreso): el método recibe una cantidad de dinero a
	 * ingresar y se la sumara a saldo actual.
	 */
//	public void ingresarDinero(double ingreso) {
//		// sumamos el ingreso al saldo de la cuenta
//		this.saldoActual += ingreso;
//	}
	
//	/*
//	 * Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
//	 * se la restará al saldo actual.
//	 */
//	public void retirarDinero(double retiro) {
//		//Validacion
//		if (retiro >= this.saldoActual) {
//			this.saldoActual -= retiro;
//			System.out.println("Ha retirado: $" + retiro + " de su cuenta, saldo actual: $" + getSaldoActual());
//		} else {
//			System.out.println("[ERROR] Imposible realizar el retiro, fondos insuficientes. Saldo actual: $" + getSaldoActual());
//		}
//	}
//	
//	/*
//	 * Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
//	 * que el usuario no saque más del 20%.
//	 */
//	public void extraccionRapida() {
//		int saldo = getSaldoActual(); // Traemos el saldo en la cuenta
//		double extraccion = saldo * 0.2; // calculamos el 20% para la extraccion
//		
//		if (extraccion < saldo && saldo > 0) {
//			saldo -= extraccion; // restamos el 20% al saldo actual
//			setSaldoActual(saldo); // seteamos el nuevo saldo
//			// Mostramos en pantalla el resultado
//			System.out.println("Ha sacado el 20% de su sueldo: $" + extraccion + ", Saldo actual: $" + getSaldoActual());
//		} else {
//			System.out.println("[ERROR] No se pudo realizar la extraccion de dinero.");
//		}
//	}
//	
	// permitirá consultar el saldo disponible en la cuenta.
	public void consultarSaldo() {
		System.out.println("[ SALDO ACTUAL DE LA CUENTA ]");
		System.out.println("Su saldo es: $" + getSaldoActual());
	}
	
	// permitirá mostrar todos los datos de la cuenta
	public void consultarDatos() {
		System.out.println("[ DATOS DE LA CUENTA ]");
		System.out.println("Su numero de cuenta es: " + getNumeroCuenta());
		System.out.println("Su DNI es: " + getDni());
		System.out.println("El total en el saldo de su cuenta es: $" + getSaldoActual());
	}
}
