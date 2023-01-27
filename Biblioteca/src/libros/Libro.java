/**
 * 
 */
package libros;

/**
 * @author DAM1
 *
 */
public class Libro {
	private int id;
	private String ISBN;
	private String titulo;
	private String autor;
	private int numPaginas;
	private char tematica;
	private boolean estado;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
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
	public char getTematica() {
		return tematica;
	}
	public void setTematica(char tematica) {
		this.tematica = tematica;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public Libro() {
		
	}
	public Libro(int id, String ISBN, String titulo, String autor, int numPaginas, char tematica, boolean estado) {
		super();
		this.id = id;
		this.ISBN = ISBN;
		this.titulo = titulo;
		this.autor = autor;
		this.numPaginas = numPaginas;
		this.tematica = tematica;
		this.estado = estado;
	}
	
	
}
