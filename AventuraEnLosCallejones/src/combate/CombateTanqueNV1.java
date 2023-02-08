package combate;

import jugador.Player;

import enemigos.TanqueNV1;

import java.util.Scanner;

import java.util.Random;

public class CombateTanqueNV1 {

	public static void peleaTanque(int decision, Player jugador, TanqueNV1 tanque1) {
		int danyoConmocion;
		int distancia = 1;
		int enCombate = 1;
		boolean enemigoVencido = false;
		// inicializar el jugador
		Player.asignarEstadisticas(jugador);

		// diálogo inicial antes del combate.
		Scanner teclado = new Scanner(System.in);
		System.out.println("BRUTO: Eh, enclenque, aquí no pintas nada!");
		System.out.println("-El enorme tipo trata de darte un derechazo, pero puedes esquivarlo. (intro)");
		teclado.nextLine();
		System.out.println(
				"Lo golpeas con todas tus fuerzas en la mandíbula, con un tremendo derechazo, pero no parece molestarle mucho... (intro)");
		teclado.nextLine();
		System.out.println(
				"BRUTO: Vaya, pegas bien. Muestrame eso otra vez. -Se pone en guardia, y ves como se forma un círculo de reclusos alrededos vuestra (intro)");
		teclado.nextLine();
		System.out.println("RECLUSOS: Pelea! Pelea! Pelea!");
		System.out.println("-Aceptas que no te queda otro remedio, y subes la guardia. (intro)");
		teclado.nextLine();
		// comienza la pelea.
		while (enCombate == 1) {
			if (jugador.getPV() > 0) {
				System.out.println("Parece que espera tu ataque, que haces?");
			System.out.println(
					"1 Pateas sus piernas. 2 Golpeas su estómago. 3 Acortas la distancia para pelear de más cerca.");
			int eleccionPrimerTurno;
			eleccionPrimerTurno = teclado.nextInt();
			switch (eleccionPrimerTurno) {
			case 1:
				if (jugador.getVelocidad() > tanque1.getVelocidad()) {
					System.out.println("Consigues golpearlo. (intro)");
					tanque1.setPV(tanque1.getPV() - jugador.ataque());
					// codigo para probar
					System.out.println(tanque1.getPV());
					teclado.nextLine();
					System.out.println("Va a darte un puñetazo, estas cerca, que haces?");
					System.out.println("1 Tratas de esquivarlo, 2 Subes la guardia");
					int defenderte = teclado.nextInt();
					//esquivarlo aquí no es buena idea
					if (defenderte == 1) {
						Random rando = new Random();
						int teGolpea = rando.nextInt(10);
						if (teGolpea >= 3) {
							jugador.setPV(jugador.getPV() - tanque1.getAtaque());
							System.out.println("Estabas demasiado cerca y te consigue dar un puñetazo muy pesado que te hace retroceder. No ha sido buena idea... (intro)");
							teclado.nextLine();
							System.out.println(jugador.getPV());
							if (jugador.getPV() < 3 && jugador.getPV() > 1) {
								System.out.println("Te ha dado bien, te sientes algo mareado y escupes un diente roto");
							}
							if (jugador.getPV() == 1) {
							System.out.println("Ves tu propia sangre en el suelo. Estás a punto de caer... Pero la adrenalina te mantiene en pie.");
							break;
						}
					}
						else {
							System.out.println("Te da tiempo a esquivarlo, pero enseguida vuelve a subir la guardia.");
							break;
						}
				}
				}
				else {
					System.out.println("Fallas el golpe. (intro)");
					// le da oportunidad a contraatacar
					Random rando = new Random();
					int tanqueContra = rando.nextInt(3);
					if (tanqueContra > 0) {
						int golpeTanque;
						System.out.println("Te golpea. (intro)");
						teclado.nextLine();
						//restamos la vida al jugador tras el ataque
						golpeTanque = tanque1.getAtaque();
						jugador.setPV(jugador.getPV() - golpeTanque);
						// codigo para probar
						System.out.println(jugador.getPV());
						teclado.nextLine();
					}
				}
				break;
			case 2:
				if (jugador.getVelocidad() > tanque1.getVelocidad()) {
					System.out.println("Consigues golpearlo. (intro)");
					tanque1.setPV(tanque1.getPV() - jugador.ataque());
					// codigo para probar
					System.out.println(tanque1.getPV());
					teclado.nextLine();
				} else {
					System.out.println("Fallas el golpe. (intro)");
					// le da oportunidad a contraatacar
					Random rando = new Random();
					int tanqueContra = rando.nextInt(3);
					if (tanqueContra > 0) {
						int golpeTanque;
						System.out.println("Te golpea. (intro)");
						teclado.nextLine();
						//restamos la vida al jugador tras el ataque
						golpeTanque = tanque1.getAtaque();
						jugador.setPV(jugador.getPV() - golpeTanque);
						// codigo para probar
						System.out.println(jugador.getPV());
						teclado.nextLine();
					}
			}
			
				}
				
			}

		}
	}
}
