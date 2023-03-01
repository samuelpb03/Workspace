package objetos;

public class Vehiculo {
	private String color;
	private int precio;
	private int potencia;
	private int peso;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public Vehiculo() {	
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public Vehiculo(String color, int precio, int potencia, int peso) {
		this.color = color;
		this.precio = precio;
		this.potencia = potencia;
		this.peso = peso;
	}
	public void Sonido() {
		System.out.println("*Sonido de vehiculo*");
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
}
