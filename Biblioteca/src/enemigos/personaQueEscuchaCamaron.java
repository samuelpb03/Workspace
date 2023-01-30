package enemigos;

import java.math.*;
import java.util.Random;

public class personaQueEscuchaCamaron {
	//Puntos de vida
	private int PV = 4;
	private int ataque = 2;
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
		new Random();
		Random impacto = new Random(ataque);
		return ataque;
	}
	public int precision() {
		new Random();
		Random acierto = new Random(precision);
		return precision;
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
