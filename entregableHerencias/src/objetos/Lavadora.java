package objetos;

public class Lavadora extends Electrodomestico{
	private int carga = 5;

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}
	

	public Lavadora() {
	}

	public Lavadora(double precio, String color, char consumoEnergetico, int peso, int carga) {
		super(precio, color, peso, consumoEnergetico);
		this.carga = carga;
	}

	public Lavadora(double precio, int peso) {
		super(precio, peso);
		// TODO Auto-generated constructor stub
	}
	
	public void precioFinal(Lavadora lavadora) {
		if (lavadora.carga > 30) {
			lavadora.setPrecio(lavadora.getPrecio() + 50);
			super.precioFinal(lavadora);
		}
		if (lavadora.carga < 30) {
			super.precioFinal(lavadora);
		}
	}
	
}
