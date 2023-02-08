package enemigos;

import java.util.Random;

public class TanqueNV1 {
	private int PV = 10;
	private int velocidad = 1;
	private int precision = 6;
	private int dureza = 1;
	private int ataque = 2;

	public int getPV() {
		return PV;
	}

	public void setPV(int pV) {
		PV = pV;
	}

	public int getVelocidad() {
		// pruebo a darle una posibilidad de velocidad crítica al tanque (es muy lento)
		Random criticoVelocidad = new Random();
		int critico = criticoVelocidad.nextInt(5);
		if (critico == 4) {
			return velocidad + 3;
		} else {
			return velocidad;
		}
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

	public TanqueNV1(int pV, int velocidad, int precision, int dureza, int ataque) {
		super();
		PV = pV;
		this.velocidad = velocidad;
		this.precision = precision;
		this.dureza = dureza;
		this.ataque = ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getAtaque() {
		return ataque;
	}

	public TanqueNV1() {

	}
}
