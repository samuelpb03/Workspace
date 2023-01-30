package jugador;

public class Player {
	private int PV = 5;
	private int velocidad = 3;
	private int ataque = 1;
	private int precision;
	
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

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public Player(int PV, int velocidad, int ataque, int precision) {
		this.ataque = ataque;
		this.velocidad = velocidad;
		this.PV = PV;
		this.precision = precision;
		
	}

	public Player() {
		// TODO Auto-generated constructor stub
	}

	public int getPrecision() {
		return precision;
	}

	public void setPrecision(int precision) {
		this.precision = precision;
	}
}
