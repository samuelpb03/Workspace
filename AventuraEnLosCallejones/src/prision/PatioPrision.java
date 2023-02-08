package prision;

import combate.CombateTanqueNV1;

import jugador.Player;

import enemigos.TanqueNV1;

import java.util.Scanner;

public class PatioPrision {

	public static void patio() {
		
		Scanner teclado = new Scanner(System.in);
		
		Player jugador = new Player();
		
		jugador.setNivel(2);
		
		Player.asignarEstadisticas(jugador);
		
		TanqueNV1 tanque1 = new TanqueNV1();
		//hay que hacer toda la escena en la que entras en prision
		System.out.println("Una vez en el partio... (intro)");
		teclado.nextLine();
		CombateTanqueNV1.peleaTanque(jugador, tanque1);
	}
}
