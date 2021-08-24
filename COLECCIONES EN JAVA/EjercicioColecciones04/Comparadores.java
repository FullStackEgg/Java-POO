package utilidades;

import entidades.Pelicula;
import java.util.Comparator;

/**
 * @author Felipe Herrera
 */
public class Comparadores {

    /**
     * Compara los elementos para ordenarlos de menor a mayor duracion.
     */
    public static Comparator<Pelicula> ordenarPeliculaMenorMayor = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            // Accedemos a los atributos de los dos objetos y comparamos
            return o1.getDuracion_pelicula().compareTo(o2.getDuracion_pelicula());
        }
    };

    /**
     * compara los elementos para ordenarlos de mayor a menor duracion.
     */
    public static Comparator<Pelicula> ordenarPeliculaMayorMenor = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            // Accedemos a los atributos de los dos objetos y comparamos
            return o2.getDuracion_pelicula().compareTo(o1.getDuracion_pelicula());
        }
    };

    /**
     * Ordenara alfabeticamente por titulo de la pelicula
     */
    public static Comparator<Pelicula> ordenarTituloAlfabeticamente = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            // accedemos a los atributos de los objetos y comparamos
            return o1.getTitulo_pelicula().compareTo(o2.getTitulo_pelicula());
        }
    };

    /**
     * Ordenara alfabeticamente por director de la pelicula
     */
    public static Comparator<Pelicula> ordenarDirectorAlfabeticamente = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            // accedemos a los atributos de los objetos y comparamos
            return o1.getDirector_pelicula().compareTo(o2.getDirector_pelicula());
        }
    };
}
