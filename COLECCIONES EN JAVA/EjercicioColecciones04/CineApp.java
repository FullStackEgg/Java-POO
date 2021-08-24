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

        //En el main deberemos tener un bucle que crea un objeto Pelicula pidiéndole al
        //usuario todos sus datos y guardándolos en el objeto Pelicula.
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
