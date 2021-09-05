/*
 * Crear una clase Ahorcado (como el juego), la cual deberá contener
 * como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y
 * la cantidad jugadas máximas que puede realizar el usuario. Definir los siguientes
 * métodos con los parámetros que sean necesarios:
 */
package ahorcadoApp.entidades;

/**
 * @author Felipe Herrera
 */
public class Ahorcado {

    private String[] array_palabra;
    private int letras_encontradas;
    private int jugadas_maximas;

    // Constructor vacio
    public Ahorcado() {
    }

    // Constructor con parametros
    public Ahorcado(String[] array_palabra, int letras_encontradas, int jugadas_maximas) {
        this.array_palabra = array_palabra;
        this.letras_encontradas = letras_encontradas;
        this.jugadas_maximas = jugadas_maximas;
    }

    // Getters y Setters
    public String[] getArray_palabra() {
        return array_palabra;
    }

    public void setArray_palabra(String[] array_palabra) {
        this.array_palabra = array_palabra;
    }

    public int getLetras_encontradas() {
        return letras_encontradas;
    }

    public void setLetras_encontradas(int letras_encontradas) {
        this.letras_encontradas = letras_encontradas;
    }

    public int getJugadas_maximas() {
        return jugadas_maximas;
    }

    public void setJugadas_maximas(int jugadas_maximas) {
        this.jugadas_maximas = jugadas_maximas;
    }
}

