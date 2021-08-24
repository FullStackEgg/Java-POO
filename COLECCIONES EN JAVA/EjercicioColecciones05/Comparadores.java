package comparadores;

import java.util.Comparator;
import entidades.Pais;

/**
 * 
 * @author Felipe Herrera
 *
 */
public class Comparadores {

	/**
	 * Ordenara Comparar los nombres del pais para darles un orden
	 */
	public static Comparator<Pais> ordenarPaisAlfabeticamente = new Comparator<Pais>() {

		@Override
		public int compare(Pais o1, Pais o2) {
			return o1.getNombrePais().compareTo(o2.getNombrePais());
		}
		
	};

}
