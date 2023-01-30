package jugador;

import java.util.Random;

public class Player {
	private int PV = 7;
	private int velocidad = 3;
	private int ataque = 1;
	private int precision = 6;
	private int nivel = 1;
	private int progreso = 1;
	
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

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getProgreso() {
		return progreso;
	}

	public void setProgreso(int progreso) {
		this.progreso = progreso;
	}
	public int ataque() {
		Random rand = new Random();
		int golpe = rand.nextInt(ataque + 1) + 1;
		return golpe;
	}
	public int precision() {
		Random rand = new Random();
		int acierto = rand.nextInt(precision + 1);
		return acierto;
	}
}
