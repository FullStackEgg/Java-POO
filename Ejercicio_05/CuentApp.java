package cuentApp;

import cuentApp.entidades.Cuenta;
import cuentApp.servicios.ServiciosCuenta;

/**
 * 
 * @author Felipe Herrera
 *
 */
public class CuentApp {

	public static void main(String[] args) {

		ServiciosCuenta servicio = new ServiciosCuenta();
		
		// Creamos la cuenta
		Cuenta cuenta_01 = servicio.crearCuenta();
		
		cuenta_01.consultarDatos();
		cuenta_01.consultarSaldo();
		
		servicio.ingresarDinero(5000);
		servicio.retirarDinero(3000);
		servicio.extraccionRapida();
	}

}
