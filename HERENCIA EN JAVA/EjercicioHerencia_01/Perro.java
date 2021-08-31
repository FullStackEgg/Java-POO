package entidades;

/**
 * @author Felipe Herrera
 */
public class Perro extends Animal {

    // Constructor con super()
    public Perro(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    // Metodo Heredado y sobreescrito
    @Override
    public void alimentarse() {
        System.out.println("El perro [" + this.nombre + "] se alimenta de: " + this.alimento);
    }


}
