package objetos;

public class Electrodomestico {

	private double precio = 100;
	private String color = "blanco";
	private int peso = 5;
	private char consumoEnergetico = 'F';
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}
	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}
	public Electrodomestico(double precio, int peso) {
		this.precio = precio;
		this.peso = peso;
	}
	public Electrodomestico(double precio, String color, int peso, char consumoEnergetico) {
		this.precio = precio;
		this.color = color;
		this.peso = peso;
		this.consumoEnergetico = consumoEnergetico;
	}
	public Electrodomestico() {
	}
	public void comprobarConsumo(Electrodomestico electrodomestico) {
		switch (electrodomestico.consumoEnergetico) {
		case 'a':
			break;
		case 'b':
			break;
		case 'c':
			break;
		case 'd':
			break;
		case 'e':
			break;
		case 'f':
			break;
		default:
			electrodomestico.consumoEnergetico = 'f';
			break;
		}
	}
	public void comprobarColor(Electrodomestico electrodomestico) {
		switch (electrodomestico.color) {
		case "Blanco":
			break;
		case "blanco":
			break;
		case "Negro":
			break;
		case "negro":
			break;
		case "Rojo":
			break;
		case "rojo":
			break;
		case "Azul":
			break;
		case "azul":
			break;
		case "Gris":
			break;
		case "gris":
			break;
		default:
			electrodomestico.color = "Blanco";
		}
	}
	public void precioFinal(Electrodomestico electrodomestico) {
		switch (electrodomestico.consumoEnergetico) {
		case 'a':
			electrodomestico.precio = electrodomestico.precio + 100;
			break;
		case 'b':
			electrodomestico.precio = electrodomestico.precio + 80;
			break;
		case 'c':
			electrodomestico.precio = electrodomestico.precio + 60;
			break;
		case 'd':
			electrodomestico.precio = electrodomestico.precio + 50;
			break;
		case 'e':
			electrodomestico.precio = electrodomestico.precio + 30;
			break;
		case 'f':
			electrodomestico.precio = electrodomestico.precio + 10;
			break;
		}
		if (electrodomestico.peso <= 19) {
			electrodomestico.precio = electrodomestico.precio + 10;
		}
		if (electrodomestico.peso <= 49 && electrodomestico.peso > 19) {
			electrodomestico.precio = electrodomestico.precio + 50;
		}
		if (electrodomestico.peso <= 79 && electrodomestico.peso > 49) {
			electrodomestico.precio = electrodomestico.precio + 80;
		}
		if (electrodomestico.peso > 79) {
			electrodomestico.precio = electrodomestico.precio + 100;
		}
	}
	
	
}
