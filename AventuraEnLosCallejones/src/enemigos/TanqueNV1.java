package enemigos;

public class TanqueNV1 {
	private int PV = 10;
	private int velocidad = 1;
	private int precision = 6;
	private int dureza = 1;
	public int getPV() {
		return PV;
	}
	public void setPV(int pV) {
		PV = pV;
	}
	public int getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	public int getPrecision() {
		return precision;
	}
	public void setPrecision(int precision) {
		this.precision = precision;
	}
	public int getDureza() {
		return dureza;
	}
	public void setDureza(int dureza) {
		this.dureza = dureza;
	}
	public TanqueNV1(int pV, int velocidad, int precision, int dureza) {
		super();
		PV = pV;
		this.velocidad = velocidad;
		this.precision = precision;
		this.dureza = dureza;
	}
	public TanqueNV1() {
		
	}
}
