package nespressoApp;

/**
 * 
 * @author Felipe Herrera
 *
 */
public class NespressoApp {

	public static void main(String[] args) {

		// intancia del servicio para acceder a los metodos
		ServicioCafetera servicio = new ServicioCafetera();
		
		// creamos la cafetera
		Cafetera c1 = servicio.crearCafetera();
		
		// prueba del funcionamiento de los metodos
		servicio.llenarCafetera(c1);
		
		servicio.servirTaza(c1);
		
		servicio.agregarCafe(c1);
		
		servicio.vaciarCafetera(c1);
	}

}
