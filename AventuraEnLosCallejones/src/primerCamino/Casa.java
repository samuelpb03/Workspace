package primerCamino;

import jugador.Player;

public class Casa {
	
	public static void enCasa(Player jugador) {
		System.out.println("Consigues llegar a casa, donde est�s a salvo. (intro)");
		if (jugador.getProgreso() == 2) {
			System.out.println("Miras el m�vil. Es la una de la ma�ana.");
		}
		
	}
}
