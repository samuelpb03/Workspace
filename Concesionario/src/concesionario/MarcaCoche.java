package concesionario;

public class MarcaCoche {
	private String [] nombreModelos;
	private boolean tieneMotos;
	private int antiguedad;
	private String nombre;
	public String[] getNombreModelos() {
		return nombreModelos;
	}
	public void setNombreModelos(String[] nombreModelos) {
		this.nombreModelos = nombreModelos;
	}
	public boolean isTieneMotos() {
		return tieneMotos;
	}
	public void setTieneMotos(boolean tieneMotos) {
		this.tieneMotos = tieneMotos;
	}
	public int getAntiguedad() {
		return antiguedad;
	}
	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	public MarcaCoche(String[] nombreModelos, boolean tieneMotos, int antiguedad, String nombre) {
		this.nombreModelos = nombreModelos;
		this.tieneMotos = tieneMotos;
		this.antiguedad = antiguedad;
		this.nombre = nombre;
	}
	public MarcaCoche() {
	}
	public static void descripcionMarca(MarcaCoche marca) {
		int numeroModelos = 0;
		for (int i = 0; i < marca.nombreModelos.length; i++) {
			numeroModelos = (i + 1);
		}
		System.out.println("Este fabricante tiene " + numeroModelos + " modelos a la venta.");
		if (marca.tieneMotos == true) {
			System.out.println("Además de coches, también vende motos.");
		}
		if (marca.antiguedad >= 100) {
			System.out.println("La marca " + marca.nombre + " es muy longeva, teniendo más de 100 años.");
		}
		if (marca.antiguedad < 100 && marca.antiguedad> 50) {
			System.out.println(marca.nombre +  " una marca que tiene más de " + marca.antiguedad + " años.");
		}
		if (marca.antiguedad < 50) {
			System.out.println(marca.nombre + " es relativamenre reciente, contando con " + marca.antiguedad);
		}
		
	}
	public static void mostrarModelos(MarcaCoche marca) {
		System.out.println("De que modelo quieres mostrar los datos?");
		for (int i = 0; i < marca.nombreModelos.length; i++) {
			System.out.println((i + 1) + " " + marca.nombreModelos[i]);
		}
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
