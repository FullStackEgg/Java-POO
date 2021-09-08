/*
Contendra los siguientes metodos:
  Metodo crearJuego()
  Método longitud()
  Método buscar(letra)
  Método encontradas(letra)
  Método intentos()
  Método juego()
 */
package ahorcadoApp.servicios;

import ahorcadoApp.entidades.Ahorcado;

import java.util.Scanner;

/**
 * @author Felipe Herrera
 */
public class ServicioAhorcado {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /**
     * Le pide la palabra al usuario y cantidad de jugadas máxima.
     * Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.
     * Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la
     * palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas,
     * el valor que ingresó el usuario y encontradas en 0.
     */
    public Ahorcado crearJuego() {
        // Se piden datos al usuario
        System.out.println("> Ingrese la palabra: ");
        String palabra = leer.nextLine();

        System.out.println("> Ingrese la cantidad de jugadas que tendra la partida:");
        int jugadas_maximas = Integer.parseInt(leer.nextLine());

        // Creamos el array
        int long_array = palabra.length(); // obtenemos la longitud de la palabra y sera asignada al array
        String[] array_palabra = new String[long_array];

        for (int i = 0; i < array_palabra.length; i++) {
            // Almacenamos la palabra en el array
            array_palabra[i] = String.valueOf(palabra.charAt(i));
        }

        int letras_encontradas = 0;

        /* Creamos el objeto en el return por medio del constructor parametrizado */
        return new Ahorcado(array_palabra, letras_encontradas, jugadas_maximas);
    }

    /**
     * Muestra la longitud de la palabra que se debe encontrar.
     */
    public int longitud(Ahorcado ahorcado) {
        return ahorcado.getArray_palabra().length;
    }

    /**
     * Este método recibe una letra dada por el usuario y valida si la
     * letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
     */
    public boolean buscarLetra(Ahorcado ahorcado, String letra) {
        // Traemos el arreglo que contiene la palabra
        String[] array_palabra = ahorcado.getArray_palabra();
        boolean letra_encontrada = false;

        // Recorremos el arreglo en busca de la letra ingresada por el usuario
        for (int i = 0; i < array_palabra.length; i++) {
            if (array_palabra[i].equalsIgnoreCase(letra)) {
                letra_encontrada = true;
                break;
            }
        }
        if (letra_encontrada) {
            System.out.println("\n[Letra encontrada en la palabra!]");
        } else {
            System.out.println("\n[La letra ingresada no ha sido encontrada.]");
        }
        return letra_encontrada;
    }

    /**
     * Método que recibe una letra ingresada por el usuario y muestra
     * cuantas letras han sido encontradas y cuantas faltan.
     * Este método además retorna true si la letra estaba y false si la letra no estaba,
     * ya que, cada vez que se busque una letra que no esté, se le restará uno a sus intentos o jugadas.
     */
    int count_encontradas = 0; // almacenara el # de letras encontradas
    
    public boolean encontradas(Ahorcado ahorcado, String letra) {
        int count_faltantes;
        int intentos = ahorcado.getJugadas_maximas(); // # de intentos
        boolean bandera;

        // validamos si la letra ingresada hace parte de la palabra
        if (buscarLetra(ahorcado, letra)) {
            // si retorna true
            count_encontradas++; // incrementamos en 1 las letras encontradas
            bandera = true;
        } else {
            intentos--;
            ahorcado.setJugadas_maximas(intentos);
            bandera = false;
        }
        
        count_faltantes = longitud(ahorcado) - count_encontradas;

        System.out.println("===================================================================");
        System.out.println("- Numero de letras encontradas: [" + count_encontradas + "]");
        System.out.println("- Numero de letras faltantes: [" + count_faltantes + "]");
        System.out.println("- Intentos restantes: [" + intentos + "]");
        System.out.println("===================================================================");
        
        return bandera;
    }

    /**
     * Para mostrar cuantas oportunidades le queda al jugador.
     */
    public int intentos(Ahorcado ahorcado) {
        return ahorcado.getJugadas_maximas();
    }

    /**
     * el metodo juego se encargara de llamar todos los métodos
     * previamente creados e informará cuando el usuario descubra toda la palabra o
     * se quede sin intentos. Este método se llamará en el main.
     */
    public void juego() {
        // Creamos el juego
        Ahorcado partida1 = crearJuego();
        int contadorTrue = 0;

        while (intentos(partida1) > 0) {
            // le pedimos datos al usuario
            System.out.println("\n> Ingrese la letra a buscar: ");
            String letra = leer.nextLine();

            // llamada al metodo encontradas para validar si se econtro o no la letra
            if (encontradas(partida1, letra) == true) {
            	contadorTrue++;
            	
            	if (contadorTrue > intentos(partida1)-1) {
            		System.out.println("[SE ENCONTRARON TODAS LAS LETRAS!!]");
            		break;
            	}
            }
            
        }
        
        if (intentos(partida1) <= 0) {
        	System.out.println("[JUEGO PERDIDO]");
        }
        	


    }
}
