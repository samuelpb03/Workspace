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
	private Libro[] libro = new Libro[10];
	private static int contadorPalabrotas;

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

	public Libro[] getLibro() {
		return libro;
	}

	public void setLibro(Libro[] libro) {
		this.libro = libro;
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

	public static void consultarLibros(Libro libro[]) {
		for (int i = 0; i < libro.length; i++) {
			System.out.println(libro[i].getTitulo());
			System.out.println();
		}
	}

	public static boolean sacarLibros(Libro libro[], String ISBNLibro) {
		boolean disponible = false;
		int existe = 0;
		for (int i = 0; i < libro.length; i++) {
			if (libro[i].getISBN().equals(ISBNLibro)) {
				if (libro[i].estado == true) {
					System.out.println("Has reservado el libro");
					existe++;
					libro[i].setEstado(false);
				} else {
					System.out.println("Este libro no está disponible (llora si quieres)");
					existe++;
				}
			}
		}
		if (existe < 1) {
			System.out.println("Pero si no existe!");
			existe++;
			if (contadorPalabrotas < 1) {
				System.out.println("Ahora estoy cabreado y voy a decir palabrotas. Tonto, culo, pedo, pis.");
				contadorPalabrotas++;

			}
		}

		return disponible;

	}
	public static void devolverLibros(Libro libro[], String ISBNLibro) {
		int existe = 0;
		for (int i = 0; i < libro.length; i++) {
			if (libro[i].getISBN().equals(ISBNLibro)) {
				if (libro[i].estado == false) {
					System.out.println("Has devuelto el libro");
					existe++;
					libro[i].setEstado(true);
				} else {
					System.out.println("Este tomo no es de la biblioteca (que vienes a donar libros? Lo que hay que ver...)");
					existe++;
				}
			}
		}
		if (existe < 1) {
			System.out.println("Vamos a ver, no tenemos este libro siquiera. Que esperas conseguir? Un regalo? Anda tira a casa.");
			existe++;
			if (contadorPalabrotas < 1) {
				System.out.println("Hay cada uno por ahí... en mis tiempos no habían bibliotecas, nadie tenía libros porque la gente era analfabeta.");
				contadorPalabrotas++;

			}
		}

	}

}
