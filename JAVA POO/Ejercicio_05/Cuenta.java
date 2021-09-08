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
