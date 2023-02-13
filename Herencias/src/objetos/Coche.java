package objetos;

public class Coche extends Vehiculo {
	private int puertas;
	private int combustible;
	private int trenMotriz;
	public int getPuertas() {
		return puertas;
	}
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	public int getCombustible() {
		return combustible;
	}
	public void setCombustible(int combustible) {
		this.combustible = combustible;
	}
	public int getTrenMotriz() {
		return trenMotriz;
	}
	public void setTrenMotriz(int trenMotriz) {
		this.trenMotriz = trenMotriz;
	}
	public Coche(int puertas, int combustible, int trenMotriz, String color, int precio) {
		super(color, precio);
		this.puertas = puertas;
		this.combustible = combustible;
		this.trenMotriz = trenMotriz;
	}
	public Coche() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void Sonido() {
		System.out.println("*Sonido de coche*");
	}
	
}
