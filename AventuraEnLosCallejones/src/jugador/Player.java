package jugador;

import java.util.Random;

public class Player {
	private int PV = 5;
	private int velocidad = 3;
	private int ataque = 4;
	//Hay que hacer un constructor para seleccionar el arma que se utiliza.
	//Habrá que sumar un valor que tenga que ver con la fuerza.
	private int ataqueNavaja = 2;
	private int ataqueCuchillo = 3;
	private int ataqueMachete = 5;
	private int ataqueHacha = 6;
	//Con la espada tendrá que sumarse un valor de precisión.
	private int ataqueEspada = 7;
	//esta variable tiene que ir de 7 a 9, no por debajo de 7.
	//habrá valor de precision y de distancia.
	private int ataquePistola9MM = 9;
	
	private int precision = 6;
	private int nivel = 1;
	private int progreso = 1;
	private int asesinatos = 0;

	public static void asignarEstadisticas(Player jugador) {
		switch (jugador.nivel) {
		case 1:
			break;
		case 2:
			jugador.PV = 6;
			jugador.ataque = 5;
			jugador.velocidad = 3;  
			break;
		case 7:
			jugador.PV = 5;
			jugador.ataque = 5;
			jugador.precision = 10;
			
		}
	}

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
		int golpe = rand.nextInt(ataque);
		return golpe;
	}

	public int precision() {
		Random rand = new Random();
		int acierto = rand.nextInt(precision) + 1;
		return acierto;
	}

	public int getAsesinatos() {
		return asesinatos;
	}

	public void setAsesinatos(int asesinatos) {
		this.asesinatos = asesinatos;
	}
	
}
