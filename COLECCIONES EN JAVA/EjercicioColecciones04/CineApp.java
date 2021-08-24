/**
* Un cine necesita implementar un sistema en el que se puedan cargar peliculas.
* Para esto, tendremos una clase Pelicula con el titulo, director y duración de la
* película (en horas). Implemente las clases y métodos necesarios para esta
* situación, teniendo en cuenta lo que se pide a continuación:
*
* En el main deberemos tener un bucle que crea un objeto Pelicula pidiéndole al
* usuario todos sus datos y guardándolos en el objeto Pelicula.
* Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario
* si quiere crear otra Pelicula o no.
* Después de ese bucle realizaremos las siguientes acciones:
* - Mostrar en pantalla todas las películas.
* - Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
* - Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla.
* - Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en pantalla.
* - Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
* - Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
* Nota: recordar el uso del Comparator para ordenar colecciones con objetos.
*/

package cineApp;

import entidades.Pelicula;
import servicios.PeliculaServicio;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Felipe Herrera
 */
public class CineApp {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        PeliculaServicio servicio = new PeliculaServicio();
        ArrayList<Pelicula> listaPeliculas = new ArrayList<Pelicula>();
        String opcion;

       // Bucle para crear varias peliculas
        do {
            servicio.CrearPelicula();

            System.out.println("¿Desea Agregrar otra pelicula?");
            System.out.println("Ingrese: si [S] / no [N]");
            opcion = leer.nextLine();

            opcion = opcion.toUpperCase();
        } while (!"N".equals(opcion)); // mientras sea distinto a N

        System.out.println("\n------ Mostramos Todas las Peliculas ------");
        servicio.mostrarPeliculas();

        System.out.println("\n------ Mostramos las Peliculas con duracion mayor a 1 hora ------");
        servicio.mostrarPorDuracionMayor();

        System.out.println("\n------ Mostramos las Peliculas Ordenas de mayor a menor duracion ------");
        servicio.mostrarOrdenarPeliculaMayorMenor();

        System.out.println("\n------ Mostramos las Peliculas Ordenas de menor a mayor duracion ------");
        servicio.mostrarOrdenarPeliculaMenorMayor();

        System.out.println("\n------ Mostramos las Peliculas por titulo Ordenado Alfabeticamente ------");
        servicio.mostrarOrdenarPeliculaPorTitulo();

        System.out.println("\n------ Mostramos las Peliculas por director Ordenado Alfabeticamente ------");
        servicio.mostrarOrdenarPeliculaPorDirector();
    }
}
