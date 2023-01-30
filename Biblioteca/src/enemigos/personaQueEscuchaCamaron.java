package enemigos;

import java.math.*;
import java.util.Random;

public class personaQueEscuchaCamaron {
	//Puntos de vida
	private int PV = 7;
	private int ataque = 3;
	private int velocidad = 1;
	private int precision = 5;
	
	public int getPV() {
		return PV;
	}
	public void setPV(int pV) {
		PV = pV;
	}
	public int getAtaque() {
		return ataque;
	}
	public void setAtaque(int ataque) {
		this.ataque = ataque;
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
	public int ataque() {
		Random rand = new Random();
		int golpe = rand.nextInt(ataque + 2);
		return golpe;
	}
	public int precision() {
		Random rand = new Random();
		int acierto = rand.nextInt(precision + 1);
		return acierto;
	}
	public personaQueEscuchaCamaron() {
		
	}
	public personaQueEscuchaCamaron(int PV, int ataque, int velocidad, int precision) {
		this.velocidad = velocidad;
		this.ataque = ataque;
		this.precision = precision;
		this.PV = PV;
	}
	
	
}
