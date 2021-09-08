package ahorcadoApp;

import ahorcadoApp.servicios.ServicioAhorcado;

/**
 * @author Felipe Herrera
 */
public class MainApp {

    public static void main(String[] args) {

        ServicioAhorcado s = new ServicioAhorcado();

        s.juego();
    }
}
