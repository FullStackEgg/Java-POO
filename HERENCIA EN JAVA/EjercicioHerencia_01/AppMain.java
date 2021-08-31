/*
 *Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
 *La clase Animal tendrá como atributos el nombre, alimento, edad y raza del
 *Animal.
 *Crear un método en la clase Animal a través del cual cada clase hija deberá
 *mostrar luego un mensaje por pantalla informando de que se alimenta.
 */

package appMain;

import entidades.Animal;
import entidades.Caballo;
import entidades.Gato;
import entidades.Perro;

/**
 * @author Felipe Herrera
 */
public class AppMain {

    public static void main(String[] args) {

        // Intanciamos Objetos de tipo Perro
        Animal perro_1 = new Perro("Spunky", "Menudos de pollo", 1, "Callejero");
        perro_1.alimentarse();

        Animal perro_2 = new Perro("torito", "Croquetas", 5, "Caniche");
        perro_2.alimentarse();

        // Instanciamos objetos de tipo Gato
        Animal gato_1 = new Gato("Pelusa", "Alimento para gatos", 3, "Atigrado");
        gato_1.alimentarse();

        Animal gato_2 = new Gato("Odin", "Galletas", 12, "Siames");
        gato_2.alimentarse();

        // Instanciamops objetos de tipo caballo
        Animal caballo_1 = new Caballo("Galope", "Heno", 20, "Shire");
        caballo_1.alimentarse();

        Animal caballo_2 = new Caballo("Sombra", "Heno", 25, "Appalossa");
        caballo_2.alimentarse();

    }
}
