package entidades;

/**
 * @author Felipe Herrera
 */
public class Gato extends Animal {

    // Constructor con super()
    public Gato(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void alimentarse() {
        System.out.println("El gato [" + this.nombre + "] se alimenta de: " + this.alimento);
    }
}
