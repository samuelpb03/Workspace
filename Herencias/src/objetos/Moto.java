package objetos;

public class Moto extends Vehiculo{
	private int cilindrada;
	private char carnet;
	public int getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	public char getCarnet() {
		return carnet;
	}
	public void setCarnet(char carnet) {
		this.carnet = carnet;
	}
	public Moto(String color, int precio, int cilindrada, char carnet, int potencia, int peso) {
		super(color, precio, potencia, peso);
		this.carnet = carnet;
		this.cilindrada = cilindrada;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void Sonido() {
		System.out.println("*Sonido de moto*");
	}
	
}
