package objetos;

public class Television extends Electrodomestico{
	private int resolucion = 20;
	private boolean smartTv = false;
	public int getResolucion() {
		return resolucion;
	}
	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}
	public boolean isSmartTv() {
		return smartTv;
	}
	public void setSmartTv(boolean smartTv) {
		this.smartTv = smartTv;
	}
	public Television(double precio, int peso) {
		super(precio, peso);
	}
	public Television() {

	}
	public Television(double precio, String color, int peso, char consumoEnergetico, int resolucion, boolean smartTv) {
		super(precio, color, peso, consumoEnergetico);
		this.resolucion = resolucion;
		this.smartTv = smartTv;
	}
	
	public void precioFinal(Television television) {
		if (television.resolucion > 40) {
			television.setPrecio(television.getPrecio() * 1.3);
			if (television.isSmartTv() == true) {
				television.setPrecio(television.getPrecio() + 50);
			}
		}
		if (television.resolucion < 40) {
			if (television.isSmartTv() == true) {
				television.setPrecio(television.getPrecio() + 50);
			}
		}
		super.precioFinal(television);
	}
}
