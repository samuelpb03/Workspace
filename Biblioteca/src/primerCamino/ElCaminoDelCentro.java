package primerCamino;

import enemigos.personaQueEscuchaCamaron;

import jugador.Player;

import java.util.Scanner;

public class ElCaminoDelCentro {
	int pasos;
	static int decision;
	String nombre;
	static Scanner teclado = new Scanner(System.in);
	
	static Player player = new Player();
	static personaQueEscuchaCamaron navajero = new personaQueEscuchaCamaron();
	
	public static void CaminoDelCentro () {
		System.out.println("Vaya, has salido de la librería. Te sitúas en un camino que va recto desde la puerta");
		System.out.println("Escuchas a camarón, parece que viene de unos auriculares");
		System.out.println("Persona que escucha a Camarón: (jerga de persona que escucha a camarón) Eh, dame el reloj y las zapatillas ya!");
		System.out.println("No puedes arriesgarte a darselo, tendrás que vencerlo");
		System.out.println("Que haces? 1 Esquivas. 2 Atacas.");
		decision = teclado.nextInt();
		teclado.nextLine();
		
		switch (decision) {
		case 1:
			int impacto = navajero.precision();
			if (impacto > 4) {
				System.out.println("Oh no! Te ha alcanzado con su navaja");
				int ataque = navajero.ataque();
				int vidaRestante = player.getPV() - ataque;
				player.setPV(vidaRestante);
				System.out.println("Te queda " + player.getPV() + " vida restante");
			}
			break;
		}
	}
}
