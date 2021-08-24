package entidades;

/**
 * @author Felipe Herrera
 */
public class Pelicula {

    private String titulo_pelicula;
    private String director_pelicula;
    private Integer duracion_pelicula;

    public Pelicula() {
    }

    public Pelicula(String titulo_pelicula, String director_pelicula, Integer duracion_pelicula) {
        this.titulo_pelicula = titulo_pelicula;
        this.director_pelicula = director_pelicula;
        this.duracion_pelicula = duracion_pelicula;
    }

    public String getTitulo_pelicula() {
        return titulo_pelicula;
    }

    public void setTitulo_pelicula(String titulo_pelicula) {
        this.titulo_pelicula = titulo_pelicula;
    }

    public String getDirector_pelicula() {
        return director_pelicula;
    }

    public void setDirector_pelicula(String director_pelicula) {
        this.director_pelicula = director_pelicula;
    }

    public Integer getDuracion_pelicula() {
        return duracion_pelicula;
    }

    public void setDuracion_pelicula(Integer duracion_pelicula) {
        this.duracion_pelicula = duracion_pelicula;
    }

    @Override
    public String toString() {
        return "======================================================= " +
                "\nTitulo= " + titulo_pelicula +
                "\nDirector= " + director_pelicula +
                "\nDuracion= " + duracion_pelicula + " hora/s.";
    }
}
