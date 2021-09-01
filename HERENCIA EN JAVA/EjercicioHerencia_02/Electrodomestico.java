// Crear una superclase llamada ElectrodomÃ©stico con los siguientes atributos:
// precio, color, consumo energÃ©tico (letras entre A y F) y peso.
package entidades;

import java.util.Scanner;

/**
 * @author Felipe Herrera
 */
public class Electrodomestico {

    // atributos
    protected Double precio;
    protected String color;
    protected Character consumoElectrico; // letras entre A y F
    protected Integer peso;

    // Constructor vacio
    public Electrodomestico() {
    }

    // constructor con todos los atributos pasados por parÃ¡metro.
    public Electrodomestico(Double precio, String color, Character consumoElectrico, Integer peso) {
        this.precio = precio;
        this.color = color;
        this.consumoElectrico = consumoElectrico;
        this.peso = peso;
    }

    // MÃ©todos getters y setters de todos los atributos
    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Character getConsumoElectrico() {
        return consumoElectrico;
    }

    public void setConsumoElectrico(Character consumoElectrico) {
        this.consumoElectrico = consumoElectrico;
    }

    public Integer getPeso() {
    	return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    /**
     * Metodo comprobarConsumoEnergetico(char letra): comprueba que la letra es
     * correcta, sino es correcta usara la letra F por defecto. Este metodo se debe
     * invocar al crear el objeto y no sera visible.
     */
    private void comprobarConsumoEnergetico(Character letra) {

        if (letra.toString().matches("[a-f A-F]")) { // Verificamos la letra ingresada este en el rangao de A - F
            this.consumoElectrico = letra; // Asigna el valor de la letra si se ecnuentra en el rango
        } else {
            this.consumoElectrico = 'F'; // asigna F por defecto, si letra no esta en el rango.
        }
    }

    /**
     * Metodo comprobarColor(String color): comprueba que el color es correcto, y si
     * no lo es, usa el color blanco por defecto. Los colores disponibles para los
     * electrodomesticos son blanco, negro, rojo, azul y gris. No importa si el
     * nombre esta en mayusculas o en minusculas. Este metodo se invocara al crear
     * el objeto y no sera visible.
     */
    private void comprobarColor(String color) {

        color = color.toUpperCase(); // Pasamos primero el valor a mayusculas

        // Verificamos que el color corresponda a las opciones  disponibles
        if (color.matches("BLANCO|NEGRO|ROJO|AZUL|GRIS")) {
            this.color = color;
        } else {
            this.color = "BLANCO"; // si el color ingresado no esta en las opciones, se asigna BLANCO por defecto
        }
    }

    /**
     * Metodo crearElectrodomestico(): le pide la información al usuario y llena el
     * electrodoméstico, también llama los métodos para comprobar el color y el
     * consumo. Al precio se le da un valor base de $1000.
     */
    protected void crearElectrodomestico() {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        boolean bandera = false;
        boolean banderaPrecio = false;
        boolean banderaPeso = false;

        do {
            System.out.println("\n---- [ CARGA DE ELECTRODOMESTICOS ] ----");

            // INGRESO DEL PRECIO
            System.out.println("\n- Ingrese el precio del Electrodomestico = ");
            Double precioIngresado;

            do {
                precioIngresado = Double.parseDouble(leer.nextLine());

                if (precioIngresado > 0) {
                    setPrecio(precioIngresado);
                    banderaPrecio = true;
                } else {
                    System.out.println("Error, precio ingresado no admitido");
                    System.out.println("\n- Ingrese el precio del Electrodomestico = ");
                }
            } while (precioIngresado <= 0);

            // INGRESO DEL PESO
            System.out.println("\n- Ingrese el peso del Electrodomestico: ");
            Integer pesoIngresado;

            do {
                pesoIngresado = Integer.parseInt(leer.nextLine());

                if (pesoIngresado > 0) {
                    setPeso(pesoIngresado);
                    banderaPeso = true;
                } else {
                    System.out.println("Error, peso ingresado no admitido");
                    System.out.println("\n- Ingrese el peso del Electrodomestico: ");
                }
            } while (pesoIngresado <= 0);

            // INGRESO DEL CONSUMO ELECTRICO
            System.out.println("\n- Ingrese la letra asignada al consumo electrico del Electrodomestico: ");
            Character letraIngresada = leer.nextLine().charAt(0);

            comprobarConsumoEnergetico(letraIngresada);

            // INGRESO DEL COLOR
            System.out.println("\n- Ingrese el color del Electrodomestico:");
            String colorIngresado = leer.nextLine();

            comprobarColor(colorIngresado);

            // validacion para cortar el bucle
            if (banderaPeso == true && banderaPrecio == true) {
                bandera = true;
            } else {
                System.out.println("---- [ ERROR AL CARGAR EL ELECTRODOMESTICO ] ----");
            }
        } while (bandera == false);
    }


    /**
     * Método precioFinal(): según el consumo energético y su tamaño, aumentará el
     * valor del precio.
     */
    protected double precioFinal() {

        double precio_final, aumentoPeso, aumentoConsumoElectrico;

        // Aumento en el precio segun consumo Electrico
        if (this.consumoElectrico.equals('A')) {
            // Si el consumo es de tipo A aumenta en $1000
            aumentoConsumoElectrico = 1000;
        } else {
            if (this.consumoElectrico.equals('B')) {
                // Si el consumo es de tipo B aumenta en $800
                aumentoConsumoElectrico = 800;
            } else {
                if (this.consumoElectrico.equals('C')) {
                    // Si el consumo es de tipo C aumenta en $600
                    aumentoConsumoElectrico = 600;
                } else {
                    if (this.consumoElectrico.equals('D')) {
                        // Si el consumo es de tipo D aumenta en $500
                        aumentoConsumoElectrico = 500;
                    } else {
                        if (this.consumoElectrico.equals('E')) {
                            // Si el consumo es de tipo E aumenta en $300
                            aumentoConsumoElectrico = 300;
                        } else {
                            // si el consumo es de tipo F aumenta en $100
                            aumentoConsumoElectrico = 100;
                        }
                    }
                }
            }
        }

        // Aumento segun peso del elemctrodomestico
        if (this.peso >= 80) {
            // Mayor que 80 kg $1000
            aumentoPeso = 1000;
        } else {
            if (this.peso >= 50 && this.peso <= 79) {
                //Entre 50 y 79 kg $800
                aumentoPeso = 800;
            } else {
                if (this.peso >= 20 && this.peso <= 49) {
                    //Entre 20 y 49 kg $500
                    aumentoPeso = 500;
                } else {
                    // Entre 1 y 19 kg $100
                    aumentoPeso = 100;
                }
            }
        }

        // Se asigna el
        precio_final = this.precio + aumentoConsumoElectrico + aumentoPeso;

        return precio_final;
    }
}
