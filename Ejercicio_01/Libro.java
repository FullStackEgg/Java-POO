package libreriApp.entidades;

/**
 * 
 * @author Felipe Herrera
 *
 */
public class Libro {

	private String isbn;
	private String titulo;
	private String autor;
	private int numPaginas;
	
	public Libro() {
	}

	/**
	 * @param isbn
	 * @param titulo
	 * @param autor
	 * @param numPaginas
	 */
	public Libro(String isbn, String titulo, String autor, int numPaginas) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.numPaginas = numPaginas;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	@Override
	public String toString() {
		return "[ Libro ] \nISBN = " + isbn + " \nTitulo = " + titulo + " \nAutor = " + autor + " \nNumero de Paginas = "
				+ numPaginas;
	}

}
