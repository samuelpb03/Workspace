package objetos;

public class Vehiculo {
	private String color;
	private int precio;
	
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
	public Vehiculo(String color, int precio) {
		this.color = color;
		this.precio = precio;
	}
	public void Sonido() {
		System.out.println("*Sonido de vehiculo*");
	}
	
}
