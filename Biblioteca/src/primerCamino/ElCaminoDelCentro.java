package primerCamino;

import enemigos.personaQueEscuchaCamaron;

import jugador.Player;

import java.util.Scanner;

public class ElCaminoDelCentro {
	int pasos;
	int decision;
	String nombre;
	Scanner teclado = new Scanner(System.in);
	
	Player player = new Player();
	personaQueEscuchaCamaron navajero = new personaQueEscuchaCamaron();
	
	public ElCaminoDelCentro () {
		System.out.println("Vaya, has salido de la librer�a. Te sit�as en un camino que va recto desde la puerta");
		System.out.println("Escuchas a camar�n, parece que viene de unos auriculares");
		System.out.println("Persona que escucha a Camar�n: (jerga de persona que escucha a camar�n) Eh, dame el reloj y las zapatillas ya!");
		System.out.println("No puedes arriesgarte a darselo, tendr�s que vencerlo");
		System.out.println("Que haces? 1 Esquivas. 2 Atacas.");
		decision = teclado.nextInt();
		
	}
}
