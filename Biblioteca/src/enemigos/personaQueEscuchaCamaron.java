package enemigos;

import java.math.*;
import java.util.Random;

public class personaQueEscuchaCamaron {
	//Puntos de vida
	int PV = 4;
	int ataque = 2;
	int velocidad = 1;
	int precision = 5;
	
	public Random ataque() {
		new Random();
		Random golpe = new Random(ataque);
		return golpe;
	}
	public Random precision() {
		new Random();
		Random acierto = new Random(precision);
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
