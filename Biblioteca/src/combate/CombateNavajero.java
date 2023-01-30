package combate;

import java.util.Random;

import enemigos.personaQueEscuchaCamaron;

import jugador.Player;

import primerCamino.ElCaminoDeLaIzquierda;

import java.util.Scanner;

public class CombateNavajero {

	public static void peleaNavajero(int decision, Player jugador, personaQueEscuchaCamaron navajero) {
		int dañoSangrado = 0;
		int distancia = 0;
		int vueltaInicio = 1;
		int desarme = 0;

		Scanner piensaRapido = new Scanner(System.in);
		do {
			if(jugador.getPV() <= 0) {
				System.out.println("Caes ante tu enemigo por tus graves heridas, esperando la muerte.");
			}
			System.out.println(
					"Parece que se prepara para atacar, piensa rápido, lo atacas o tratas de esquivarlo? 1 Esquivar, 2 Atacar");
			decision = piensaRapido.nextInt();
			if (decision == 2) {
				distancia = 2;
			}
			if (decision == 1) {
				distancia = 1;
			}

			// while (decision != 4) {
			switch (decision) {
			case 1:

				int impacto = navajero.precision();
				if (impacto > 2) {
					if (desarme == 0) {
						System.out.println("Oh no! Te ha alcanzado con su navaja");
						Random rand = new Random();
						int sangrado = rand.nextInt(5);
						distancia = 1;
						decision = 2;
						vueltaInicio = 2;
						if (sangrado > 3) {
							System.out.println("Te resientes del corte, parece que sangra mucho.");
							dañoSangrado = 1;
						}

					}
					if (desarme == 1) {
						System.out.println("Ha conectado un puñetazo");
						distancia = 1;
					}
					int ataqueNavajero = navajero.ataque();
					int vidaRestanteJugador = jugador.getPV() - ataqueNavajero;
					jugador.setPV(vidaRestanteJugador);
					distancia = 1;
				} else {
					if (impacto == 1) {
						System.out.println("Has conseguido esquivar su ataque y agarrar su brazo.");
						distancia = 1;
						vueltaInicio = 0;
					}
					if (impacto == 2) {
						if (desarme == 0) {
						System.out.println("La navaja ha rozado tu ropa, aunque has tenido que retroceder bastante.");
						decision = 1;
						vueltaInicio = 0;
						}
						if (desarme == 1) {
							System.out.println("Te apartas un buen trecho hacía atras para esquivar un descontrolado gancho.");
							decision = 1;
							vueltaInicio = 0;
						}
					}
					if (distancia == 1) {
						decision = 2;
					}
				}
				
				if (jugador.getPV() == 0) {
					System.out.println("El mundo se torna borroso y sucumbes ante tus heridas.");
					if (jugador.getProgreso() == 1) {
						ElCaminoDeLaIzquierda.caminoDelHospital();
						decision = 4;
					}
				}
				if (distancia == 1) {
					decision = 2;
				}
				if (distancia == 2) {
					decision = 1;
				}
				
			case 2:
				if (distancia == 1) {
					System.out.println("Tienes una oportunidad, ");
					if (distancia == 1) {
						System.out.print(
								"su costado esta expuesto, es un blanco fácil, aunque tambien podrías someterlo. Que eliges?");
						System.out.println("1 Someterlo, 2 Darle en las costillas");
						Scanner contra = new Scanner(System.in);
						int contraAtaqueCritico = contra.nextInt();
						if (contraAtaqueCritico == 2) {
							int ataqueJugador = jugador.ataque();
							int vidaRestanteNavajero = navajero.getPV() - (ataqueJugador);
							navajero.setPV(vidaRestanteNavajero);
							if (navajero.getPV() == 3) {
								System.out.println("El enemigo parece dolorido tras el golpe, pero se aleja rapido y en guardia");
							}
							if (navajero.getPV() == 2) {
								System.out.println("Consigues darle dos buenos golpes en el costillar, haciendo que se retuerza mientras se aleja. Dirías que lo has herido");
							}
							if (navajero.getPV() == 1) {
								System.out.println("Bloqueas sus ataques y empiezas a machacar sus costillas, le cuesta soltarse, ");
								System.out.print("y cuando lo hace, apenas se mantiene en pie.");
							}
							if (navajero.getPV() <= 0) {
								decision = 4;
							}
							decision = 1;
						}
						if (contraAtaqueCritico == 1) {
							if (jugador.getVelocidad() == navajero.getVelocidad()) {
								Random rando = new Random();
								int sometido = rando.nextInt(10);
								if (sometido >= 5) {
									navajero.setPV(0);
									System.out.println("Lo has conseguido inmovilizar y lo has desarmado.");
								} else {
									navajero.setPV(navajero.getPV() - 1);
									navajero.setVelocidad(navajero.getVelocidad() - 1);
									System.out.println(
											"Se ha escapado del agarre, aunque con esfuerzo. Se le ve algo fatigado.");
									decision = 1;
								}
							}
							if (jugador.getVelocidad() > navajero.getVelocidad()) {
								Random rando = new Random();
								int sometido = rando.nextInt(10);
								if (sometido >= 6) {
									navajero.setPV(0);
									if (desarme == 0) {
										System.out.println("Lo has conseguido inmovilizar y lo has desarmado.");
										decision = 4;
									}
									if (desarme == 1) {
										System.out.println("Lo sometes bruscamente ahora que no tiene arma, dejandolo fuera de combate.");
										decision = 4;
									}
									
									
								} else {
									navajero.setVelocidad(navajero.getVelocidad() - 1);
									navajero.setAtaque(navajero.getAtaque() - 2);
									System.out.println(
											"Se ha zafado, pero has podido tirarle la navaja de la mano y patearla lejos.");
									decision = 1;
									desarme = 1;
								}
							}
						}

					}
				}
				if (distancia == 2) {
					int ataqueJugador;
					Scanner piñazo = new Scanner(System.in);
					System.out.println("Como quieres atacarle? 1 Derechazo, 2 Gancho de izquierda, 3 Lo tratas de derribar");
					ataqueJugador = piñazo.nextInt();
					switch (ataqueJugador) {
					case 1:
						if (jugador.getVelocidad() >= navajero.getVelocidad()) {
							Random rando = new Random();
							//comprobamos si el golpe conecta
							int contacto = rando.nextInt(11);
							if (contacto >= 5) {
								int dañoDeDerechazo = jugador.ataque();
								if (dañoDeDerechazo <= 1) {
									System.out.println("Consigues colpearle, pero no es un impacto limpio. Aún así se resiente del golpe.");
								}
								if (dañoDeDerechazo == 2) {
									System.out.println("Conectas un buen derechazo, en la mandíbula, hasta te duele el nudillo.");
								}
								if (dañoDeDerechazo >= 3) {
									System.out.println("Desatas toda tu furia en su mandíbula, haciendo que retroceda y piedra el equilíbrio.");
									System.out.print(" avanzas para terminar la faena, pero, tambaleandose, se cubre. Que haces? 1 Lo pateas, 2 Lo mueles a palos hasta cansarte.");
								}
								navajero.setPV(navajero.getPV() - dañoDeDerechazo);
								if(navajero.getPV() <= 0) {
									decision = 4;
								}
							}
							if (contacto == 5) {
								if (desarme == 0) {
								System.out.println("No consigues acertarle, pero te da tiempo a apartarte de su hoja");
								}
								if (desarme == 1) {
								System.out.println("Parece que sabe pelearl, pues bloquea tu ataque. Por suerte puedes retroceder a tiempo.");
								}
								
							}
							if (contacto <= 4) {
								System.out.println("Fallas el golpe y el enemigo logra acertarte, ");
								int corte = navajero.ataque();
								if (corte == 1) {
									if (desarme == 0) {
										System.out.println("pero no consigue hacerte un corte profundo.");
									}
									if (desarme == 1) {
										System.out.println("pero aguantas bien la patada");
									}
									
								}
								if (corte == 2) {
									if (desarme == 0) {
									System.out.println("dejandote un corte bastante feo.");
									}
									if (desarme == 1) {
									System.out.println("dejandote momentaneamente sin respiracion.");
									}
								}
								if (corte >= 3) {
									if (desarme == 0) {
									System.out.println("creando un corte muy profundo.");
									}
									if (desarme == 1) {
									System.out.println("demoliendote la mandibula de un gancho.");
									}
								}
								if (jugador.getPV() == 2) {
									if (desarme == 0) {
										System.out.println("La fatiga y los cortes empiezan a pasarte factura...");
									}
									if (desarme == 1) {
										System.out.println("La fatiga y los golpes empiezan a pasarte factura...");
									}
								}
								if (jugador.getPV() == 1) {
									System.out.println("Sientes un dolor muy agudo y le agradeces a la adrenalina el poder mantenerte en pie");
								}
								jugador.setPV(jugador.getPV() - corte);
								if (jugador.getPV() <= 0) {
									System.out.println("Todo se torna borroso, intentas mantenerte de pie pero el dolor es demasiado.");
									decision = 4;
								}
								
							}
						break;
						}
						
					}
					
				}
			}
		}while(decision!=4);
		
}

}
