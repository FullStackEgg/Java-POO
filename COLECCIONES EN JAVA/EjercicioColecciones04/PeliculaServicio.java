package servicios;

import entidades.Pelicula;
import utilidades.Comparadores;

import java.util.*;

/**
 * @author Felipe Herrera
 */
public class PeliculaServicio {

    private Scanner leer;
    private List<Pelicula> lista_peliculas;

    // Constructor sin parametros, donde inicializamos la lista y el scanner
    public PeliculaServicio() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.lista_peliculas = new ArrayList<>();
    }

    /**
     * Pide valores al usuario para crear un Objeto del tipo Pelicula
     * @return peliculaCreada equivale al objeto Pelicula creado con los datos ingresados
     */
    public Pelicula CrearPelicula() {
        System.out.println("Ingrese el titulo de la Pelicula:");
        String titulo = leer.nextLine();

        System.out.println("Ingrese el nombre del director:");
        String director = leer.nextLine();

        System.out.println("Ingrese la duracion de la pelicula:");
        Integer duracion = Integer.parseInt(leer.nextLine());

        // Creamos el Objeto pelicula
        Pelicula peliculaCreada = new Pelicula(titulo, director, duracion);

        // Agregamos el objeto a la lista peliculas
        lista_peliculas.add(peliculaCreada);

        return peliculaCreada;
    }

    // Muestra todas las peliculas sin darle algun orden.
    public void mostrarPeliculas() {
        // Recorremos la lista
        for (int i = 0; i < lista_peliculas.size(); i++) {
            System.out.println(lista_peliculas.get(i));
        }
    }

    /**
     * [ Metodo que mostrara las peliculas con una duracion mayor a 1 hora. ]
     * Recorre los elementos de la lista, y accede a su valor con el metodo [get] de la lista; tomando por parametro el
     * valor de [i] de la iteracion del bucle.
     * Acto seguido accede al metodo [getDuracion_pelicula] del objeto de la lista, pala verificar si la duracion
     * es mayor a 1.
     * Si cumple la condicion muestra el elemento de la lista por consola.
     */
    public void mostrarPorDuracionMayor() {
        // Recorremos la lista
        for (int i = 0; i < lista_peliculas.size(); i++) {

            //Validamos que la duracion de la pelicula sea mayor a 1 hora
            if (lista_peliculas.get(i).getDuracion_pelicula() > 1) {
                // Mostramos la pelicula por pantalla si se cumple la condicion
                System.out.println(lista_peliculas.get(i));
            }
        }
    }

    /**
     * Ordena la lista por la duracion de mayor a menor haciendo uso del Comparator
     * y retorna la lista ordenada
     */
    public void mostrarOrdenarPeliculaMayorMenor() {
        // Sobreescribimos la coleccion con el orden de duracion mayor a menor
        Collections.sort(lista_peliculas, Comparadores.ordenarPeliculaMayorMenor);

        // Mostramos la lista ordenada
        for (Pelicula pelicula : lista_peliculas) {
            System.out.println(pelicula);
        }
    }

    /**
     * Ordena la lista por la duracion de menor a mayor haciendo uso del Comparator
     * y retorna la lista ordenada
     */
    public void mostrarOrdenarPeliculaMenorMayor() {
        // Sobreescribimos la coleccion con el orden de duracion mayor a menor
        Collections.sort(lista_peliculas, Comparadores.ordenarPeliculaMenorMayor);

        // Mostramos la lista ordenada
        for (Pelicula pelicula : lista_peliculas) {
            System.out.println(pelicula);
        }
    }

    /**
     * Ordena la lista por titulo ordenado alfabeticamente haciendo uso del Comparator
     * y retorna la lista ordenada
     */
    public void mostrarOrdenarPeliculaPorTitulo() {
        // Sobreescribimos la coleccion con el orden de duracion mayor a menor
        Collections.sort(lista_peliculas, Comparadores.ordenarTituloAlfabeticamente);

        // Mostramos la lista ordenada
        for (Pelicula pelicula : lista_peliculas) {
            System.out.println(pelicula);
        }
    }

    /**
     * Ordena la lista por director ordenado alfabeticamente haciendo uso del Comparator
     * y retorna la lista ordenada
     */
    public void mostrarOrdenarPeliculaPorDirector() {
        // Sobreescribimos la coleccion con el orden de duracion mayor a menor
        Collections.sort(lista_peliculas, Comparadores.ordenarDirectorAlfabeticamente);

        // Mostramos la lista ordenada
        for (Pelicula pelicula : lista_peliculas) {
            System.out.println(pelicula);
        }
    }
}
