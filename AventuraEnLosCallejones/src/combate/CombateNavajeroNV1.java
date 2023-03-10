package combate;

import java.util.Random;

import enemigos.CuchilleroNV1;

import jugador.Player;
import primerCamino.ElCaminoDeLaDerecha;
import primerCamino.ElCaminoDeLaIzquierda;

import java.util.Scanner;

public class CombateNavajeroNV1 {

	public static void peleaNavajero(int decision, Player jugador, CuchilleroNV1 navajero) {
		int dañoSangrado = 0;
		int distancia = 0;
		int desarme = 0;
		boolean enemigoVencido = false;
		

		Scanner piensaRapido = new Scanner(System.in);

		Player.asignarEstadisticas(jugador);

		do {
			if (jugador.getPV() <= 0) {
				System.out.println("Caes ante tu enemigo por tus graves heridas, esperando la muerte.(intro)");
				piensaRapido.nextLine();
				decision = 4;
				ElCaminoDeLaIzquierda.caminoDelHospital(jugador);
			} else {
				if (dañoSangrado > 0) {
					jugador.setPV(jugador.getPV() - dañoSangrado);
					if (jugador.getPV() > 0) {
						System.out.println("Sientes como sangras abundantemente, no aguantarás mucho...");
					}
					else {
						System.out.println("el sangrado es demasiado abundante, te mareas y el suelo se acerca bruscamente a ti. Caes malherido. (intro)");
						piensaRapido.nextLine();
						jugador.setPV(0); 
						decision = 4;
						break;
					}
					
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
				if (jugador.getPV() > 0) {
					switch (decision) {
				case 1:

					int impacto = navajero.precision();
					if (impacto > 2) {
						if (desarme == 0) {
							System.out.println("Oh no! Te ha alcanzado con su navaja(intro)");
							piensaRapido.nextLine();
							Random rand = new Random();
							int sangrado = rand.nextInt(5);
							distancia = 1;
							decision = 2;
							//vueltaInicio = 2;
							if (sangrado > 2) {
								System.out.println("Te resientes del corte, parece que sangra mucho(intro).");
								piensaRapido.nextLine();
								dañoSangrado = 2;
							}

						}
						if (desarme == 1) {
							System.out.println("Ha conectado un puñetazo (intro)");
							piensaRapido.nextLine();
							distancia = 1;
							decision = 2;
							//break;
						}
						int ataqueNavajero = navajero.ataque();
						int vidaRestanteJugador = jugador.getPV() - ataqueNavajero;
						jugador.setPV(vidaRestanteJugador);
						if (jugador.getPV() <= 0) {
							System.out.println("El mundo se torna borroso y sucumbes ante tus heridas. (intro)");
							piensaRapido.nextLine();
							if (jugador.getProgreso() == 1) {
								decision = 4;
								break;
							}
						}
						distancia = 1;
					} else {
						if (impacto <= 1) {
							System.out.println("Has conseguido esquivar su ataque y agarrar su brazo.(intro)");
							piensaRapido.nextLine();
							distancia = 1;
							//vueltaInicio = 0;
						}
						if (impacto == 2) {
							if (desarme == 0) {
								System.out.println(
										"La navaja ha rozado tu ropa, aunque has tenido que retroceder bastante. (intro)");
								piensaRapido.nextLine();
								decision = 1;
								//vueltaInicio = 0;
								break;
							}
							if (desarme == 1) {
								System.out.println(
										"Te apartas un buen trecho hacía atras para esquivar un descontrolado gancho. (intro)");
								piensaRapido.nextLine();
								decision = 1;
								//vueltaInicio = 0;
								break;
							}
						}
						if (distancia == 1) {
							decision = 2;
						}
					}

					if (jugador.getPV() == 0) {
						System.out.println("El mundo se torna borroso y sucumbes ante tus heridas. (intro)");
						piensaRapido.nextLine();
						if (jugador.getProgreso() == 1) {
							ElCaminoDeLaIzquierda.caminoDelHospital(jugador);
							decision = 4;
							break;
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
								if (navajero.getPV() == 4) {
									System.out.println(
											"El enemigo no parece muy dolorido tras el golpe, te da el tiempo justo para esquivar su contraataque (intro)");
									piensaRapido.nextLine();
								}
								if (navajero.getPV() == 3) {
									System.out.println(
											"El enemigo parece dolorido tras el golpe, pero se aleja rapido y en guardia (intro)");
									piensaRapido.nextLine();
								}
								if (navajero.getPV() == 2) {
									System.out.println(
											"Consigues darle dos buenos golpes en el costillar, haciendo que se retuerza mientras se aleja. Dirías que lo has herido (intro)");
									piensaRapido.nextLine();
								}
								if (navajero.getPV() == 1) {
									System.out.println(
											"Bloqueas sus ataques y empiezas a machacar sus costillas, le cuesta soltarse, ");
									System.out.print("y cuando lo hace, apenas se mantiene en pie. (intro)");
									piensaRapido.nextLine();
								}
								if (navajero.getPV() <= 0) {
									System.out.println(
											"Lo consigues sujetar y le propinas dos buenos golpes en las costillas. Se retuerce y cae al suelo, vencido (intro)");
									piensaRapido.nextLine();
									decision = 4;
									enemigoVencido = true;
									break;
								}
								decision = 1;
							}
							if (contraAtaqueCritico == 1) {
								if (jugador.getVelocidad() == navajero.getVelocidad()) {
									Random rando = new Random();
									int sometido = rando.nextInt(10);
									if (sometido >= 5) {
										navajero.setPV(0);
										System.out.println("Lo has conseguido inmovilizar y lo has desarmado. (intro)");
										piensaRapido.nextLine();
										enemigoVencido = true;
										decision = 4;
										break;
									} else {
										navajero.setPV(navajero.getPV() - 1);
										navajero.setVelocidad(navajero.getVelocidad() - 1);
										System.out.println(
												"Se ha escapado del agarre, aunque con esfuerzo. Se le ve algo fatigado, y has podido dale al menos un golpe. (intro)");
										piensaRapido.nextLine();
										decision = 1;
									}
								}
								if (jugador.getVelocidad() > navajero.getVelocidad()) {
									Random rando = new Random();
									int sometido = rando.nextInt(10);
									if (sometido >= 6) {
										navajero.setPV(0);
										if (desarme == 0) {
											System.out.println(
											"Lo has conseguido inmovilizar y lo has desarmado. (intro)");
											piensaRapido.nextLine();
											decision = 4;
											enemigoVencido = true;
											break;
										}
										if (desarme == 1) {
											System.out.println(
													"Lo sometes bruscamente ahora que no tiene arma, dejandolo fuera de combate. (intro)");
											piensaRapido.nextLine();
											enemigoVencido = true;
											decision = 4;
											break;
										}

									} else {
										if (desarme == 0) {
											navajero.setVelocidad(navajero.getVelocidad() - 1);
											navajero.setAtaque(navajero.getAtaque() - 2);
											navajero.setPV(navajero.getPV() - 1);
											System.out.println(
													"Intenta atacar otra vez, pero falla y se queda de espaldas. Tratas de estrangularlo, aunque acaba zafandose (intro)");
											piensaRapido.nextLine();
											System.out.println(
													"Aún así le has hecho daño y la navaja está en el suelo, fuera de su alcance (intro)");
											piensaRapido.nextLine();

											decision = 1;

										}
										if (desarme == 1) {
											System.out.println(
													"No consigues inmovilizarlo, parece que tiene mucha fuerza y de un codazo en el costado tienes que soltarlo (intro)");
											jugador.setPV(jugador.getPV() - 1);
											if (jugador.getPV() == 0) {
												System.out.println(
														"Pensabas que podías seguir, pero tras el codazo, te falta la respiración. Esquivas torpemente un navajazo, (intro)");
												piensaRapido.nextLine();
												System.out
														.println("Caes al suelo y tu vista se oscurece rápidamente...");
												decision = 4;
												break;

											}
										}
										desarme = 1;
									}
								}
							}

						}
					}
					if (distancia == 2) {
						int ataqueJugador;
						Scanner piñazo = new Scanner(System.in);
						System.out.println(
								"Como quieres atacarle? 1 Derechazo, 2 Gancho de izquierda, 3 Lo tratas de derribar");
						ataqueJugador = piñazo.nextInt();
						switch (ataqueJugador) {
						case 1:
							if (jugador.getVelocidad() >= navajero.getVelocidad()) {
								Random rando = new Random();
								// comprobamos si el golpe conecta
								int contacto = rando.nextInt(11);
								if (contacto > 5) {
									int dañoDeDerechazo = jugador.ataque();
									if (dañoDeDerechazo <= 1) {
										System.out.println(
												"Consigues golpearle, pero no es un impacto limpio. Aún así se resiente del golpe.(intro)");
										piensaRapido.nextLine();
									}
									if (dañoDeDerechazo == 2) {
										System.out.println(
												"Conectas un buen derechazo, en la mandíbula, hasta te duele el nudillo.(intro)");
										piensaRapido.nextLine();
									}
									if (dañoDeDerechazo >= 3) {
										System.out.println(
												"Desatas toda tu furia en su mandíbula, haciendo que retroceda y piedra el equilíbrio.");
										System.out.print(
												" avanzas para terminar la faena, pero, tambaleandose, se cubre. Que haces? 1 Lo pateas, 2 Lo mueles a palos hasta cansarte.");
										int machacarAlAtacante = piensaRapido.nextInt();
										switch (machacarAlAtacante) {
										case 1:
											System.out.println(
													"Le propinas una patada, aunque no puedes darle mas alto que la cadera. (intro)");
											piensaRapido.nextLine();
											System.out.println("Aun así, es suficiente para tumbarlo.");
											navajero.setPV(0);
											decision = 4;
											enemigoVencido = true;
											break;
										case 2:
											int contactoDerechazo = rando.nextInt(11);
											if (contactoDerechazo >= 3 && contactoDerechazo < 6) {
												System.out.println(
														"Aunque se cubra y se encoja, nada para tus golpes. Golpeas y golpeas hasta que te llenas los puños con su sangre. (intro)");
												piensaRapido.nextLine();
												System.out.println(
														"Seguramente no deberías haber hecho eso, así que huyes de la escena.");
												navajero.setPV(0);
												enemigoVencido = true;
												break;
											}
											if (contactoDerechazo > 6) {
												System.out.println(
														"Empiezas a golpearlo, sin medir tu fueza. Te ensañas con él hasta matarlo con tus manos. (intro)");
												piensaRapido.nextLine();
												System.out.println("Ahora solo te queda escapar... (intro)");
												piensaRapido.nextLine();
												navajero.setPV(0);
												jugador.setAsesinatos(1);
												enemigoVencido = true;
												break;
											}
										}
										
									}navajero.setPV(navajero.getPV() - dañoDeDerechazo);
									if (navajero.getPV() <= 0) {
										decision = 4;
										break;
									
									}
								}
								if (contacto == 5) {
									if (desarme == 0) {
										System.out.println(
												"No consigues acertarle, pero te da tiempo a apartarte de su hoja (intro)");
										piensaRapido.nextLine();
									}
									if (desarme == 1) {
										System.out.println(
												"Parece que sabe pelear, pues bloquea tu ataque. Por suerte puedes retroceder a tiempo. (intro)");
										piensaRapido.nextLine();
									}

								}
								if (contacto <= 4) {
									System.out.println("Fallas el golpe y el enemigo logra acertarte, ");
									int corte = navajero.ataque();
									jugador.setPV(jugador.getPV() - corte);
									if (corte == 1) {
										if (desarme == 0) {
											System.out.println("pero no consigue hacerte un corte profundo. (intro)");
											piensaRapido.nextLine();
										}
										if (desarme == 1) {
											System.out.println("pero aguantas bien la patada (intro)");
											piensaRapido.nextLine();
										}

									}
									if (corte == 2) {
										if (desarme == 0) {
											System.out.println("dejandote un corte bastante feo. (intro)");
											piensaRapido.nextLine();
										}
										if (desarme == 1) {
											System.out.println("dejandote momentaneamente sin respiracion. (intro)");
											piensaRapido.nextLine();
										}
									}
									if (corte >= 3) {
										if (desarme == 0) {
											System.out.println("creando un corte muy profundo. (intro)");
											piensaRapido.nextLine();
										}
										if (desarme == 1) {
											System.out.println("demoliendote la mandibula de un gancho. (intro)");
											piensaRapido.nextLine();
										}
									}
									if (jugador.getPV() == 2) {
										if (desarme == 0) {
											System.out.println(
													"La fatiga y los cortes empiezan a pasarte factura... (intro)");
											piensaRapido.nextLine();
										}
										if (desarme == 1) {
											System.out.println(
													"La fatiga y los golpes empiezan a pasarte factura... (intro)");
											piensaRapido.nextLine();
										}
									}
									if (jugador.getPV() == 1) {
										System.out.println(
												"Sientes un dolor muy agudo y le agradeces a la adrenalina el poder mantenerte en pie (intro)");
										piensaRapido.nextLine();
									}

									if (jugador.getPV() <= 0) {
										System.out.println(
												"Todo se torna borroso, intentas mantenerte de pie pero el dolor es demasiado. (intro)");
										piensaRapido.nextLine();
										decision = 4;
									}

								}
								break;

							}
						case 2:
							if (jugador.getVelocidad() >= navajero.getVelocidad()) {
								Random rando = new Random();
								// comprobamos si el golpe conecta
								int contacto = rando.nextInt(11);
								if (contacto > 5) {
									int dañoDeGanchoI = jugador.ataque();
									if (dañoDeGanchoI <= 1) {
										System.out.println(
												"Consigues colpearle, pero no es un impacto limpio. Aún así se resiente del golpe.(intro)");
										piensaRapido.nextLine();
										navajero.setPV(navajero.getPV() - dañoDeGanchoI);
									}
									if (dañoDeGanchoI == 2) {
										System.out.println(
												"Conectas un buen gancho, en la mandíbula, hasta te duele el nudillo. (intro)");
										piensaRapido.nextLine();
										navajero.setPV(navajero.getPV() - dañoDeGanchoI);
									}
									if (dañoDeGanchoI == 3) {
										System.out.println(
												"Desatas toda tu furia en el puñetazo, haciendo que retroceda y piedra el equilíbrio.");
										System.out.print(
												" avanzas para terminar la faena, pero, tambaleandose, se cubre. Que haces? 1 Lo pateas, 2 Lo mueles a palos hasta cansarte.");
										int machacarAlAtacante = piensaRapido.nextInt();
										switch (machacarAlAtacante) {
										case 1:
											System.out.println(
													"Le propinas una patada, aunque no puedes darle mas alto que la cadera. (intro)");
											piensaRapido.nextLine();
											System.out.println("Aun así, es suficiente para tumbarlo.");
											navajero.setPV(0);
											enemigoVencido = true;
											decision = 4;
											break;
										case 2:
											int contactoIzquierdazo = rando.nextInt(11);
											if (contactoIzquierdazo >= 3 && contactoIzquierdazo < 6) {
												System.out.println(
														"Aunque se cubra y se encoja, nada para tus golpes. Golpeas y golpeas hasta que te llenas los puños con su sangre. (intro)");
												piensaRapido.nextLine();
												System.out.println(
														"Seguramente no deberías haber hecho eso, así que huyes de la escena.");
												navajero.setPV(0);
												enemigoVencido = true;
												break;
											}
											if (contactoIzquierdazo > 6) {
												System.out.println(
														"Empiezas a golpearlo, sin medir tu fueza. Te ensañas con él hasta matarlo con tus manos. (intro)");
												piensaRapido.nextLine();
												System.out.println("Ahora solo te queda escapar... (intro)");
												piensaRapido.nextLine();
												navajero.setPV(0);
												jugador.setAsesinatos(1);
												enemigoVencido = true;
												break;
											}
										}
									}
									if (dañoDeGanchoI >= 4) {
										System.out.println(
												"Con todas tus fuerzas, le propinas un colosal gancho en la mandíbula, dislocandosela.");
										piensaRapido.nextLine();
										navajero.setPV(navajero.getPV() - dañoDeGanchoI);
										enemigoVencido = true;
										break;
									}
								}
								if (contacto == 5) {
									if (desarme == 0) {
										System.out.println(
												"No consigues acertarle, pero te da tiempo a apartarte de su hoja (intro)");
										piensaRapido.nextLine();
									}
									if (desarme == 1) {
										System.out.println(
												"Parece que sabe pelear, pues bloquea tu ataque. Por suerte puedes retroceder a tiempo. (intro)");
										piensaRapido.nextLine();
									}

								}
								if (contacto <= 4) {
									System.out.println("Fallas el golpe y el enemigo logra acertarte, ");
									int corte = navajero.ataque();
									jugador.setPV(jugador.getPV() - corte);
									if (corte == 1) {
										if (desarme == 0) {
											System.out.println("pero no consigue hacerte un corte profundo. (intro)");
											piensaRapido.nextLine();
										}
										if (desarme == 1) {
											System.out.println("pero aguantas bien la patada (intro)");
											piensaRapido.nextLine();
										}

									}
									if (corte == 2) {
										if (desarme == 0) {
											System.out.println("dejandote un corte bastante feo. (intro)");
											piensaRapido.nextLine();
										}
										if (desarme == 1) {
											System.out.println("dejandote momentaneamente sin respiracion. (intro)");
											piensaRapido.nextLine();
										}
									}
									if (corte >= 3) {
										if (desarme == 0) {
											System.out.println("creando un corte muy profundo. (intro)");
											piensaRapido.nextLine();
										}
										if (desarme == 1) {
											System.out.println("demoliendote la mandibula de un gancho. (intro)");
											piensaRapido.nextLine();
										}
									}
									if (jugador.getPV() == 2) {
										if (desarme == 0) {
											System.out.println(
													"La fatiga y los cortes empiezan a pasarte factura... (intro)");
											piensaRapido.nextLine();
										}
										if (desarme == 1) {
											System.out.println(
													"La fatiga y los golpes empiezan a pasarte factura...(intro)");
											piensaRapido.nextLine();
										}
									}
									if (jugador.getPV() == 1) {
										System.out.println(
												"Sientes un dolor muy agudo y le agradeces a la adrenalina el poder mantenerte en pie (intro)");
										piensaRapido.nextLine();
									}

									if (jugador.getPV() <= 0) {
										System.out.println(
												"Todo se torna borroso, intentas mantenerte de pie pero el dolor es demasiado. (intro)");
										piensaRapido.nextLine();
										decision = 4;
									}

								}
							}
							break;
						case 3:
							Random rando = new Random();
							//int contacto = rando.nextInt(11);
							int contacto = 10;
							if (contacto > 7) {
								System.out.print(
										" consigues derribarlo y se queda indefenso. Que haces? 1 Te aseguras de que no continúe, 2 Aprovechas para darle una paliza.");
								int machacarAlAtacante = piensaRapido.nextInt();
								switch (machacarAlAtacante) {
								case 1:
									System.out.println(
											"Tratas de golpearlo, pero se repliega y es difícil dar un buen golpe. Desistes y lo dejas tirado, no va a perseguirte después de eso. (intro)");
									piensaRapido.nextLine();
									navajero.setPV(0);
									decision = 4;
									enemigoVencido = true;
									break;
								case 2:
									if (contacto > 7 && contacto < 9) {
										System.out.println(
												"Aunque se cubra, lo golpeas con todas tus fuerzas y descontroladamente. Lo hieres peligrosamente y le cuesta respirar. te pide que pares como puede. (intro)");
										piensaRapido.nextLine();
										System.out.println(
												"Estaba derrotado, no era necesario nada de eso. Huyes de la escena.");
										navajero.setPV(0);
										decision = 4;
										enemigoVencido = true;
										break;
									}
									if (contacto > 9) {
										System.out.println(
												"Empiezas a golpearlo, sin medir tu fueza. Te ensañas con él hasta matarlo con tus manos. (intro)");
										piensaRapido.nextLine();
										System.out.println("Ahora solo te queda escapar... (intro)");
										piensaRapido.nextLine();
										navajero.setPV(0);
										jugador.setAsesinatos(1);
										decision = 4;
										enemigoVencido = true;
										break;
									} else {
										System.out.println(
												"Se escapa de la situación, aunque has podido asestarle algunos golpes.");
										navajero.setPV(navajero.getPV() - 1);
										if (navajero.getPV() <= 0) {
											decision = 4;
											break;
										}
									}
								}
							} else {
								System.out.print("No consigues derribarlo, ");
								int falloDerribo = navajero.ataque();
								jugador.setPV(jugador.getPV() - falloDerribo);
								if (jugador.getPV() < 3 && jugador.getPV() >= 1) {
									if (desarme == 0) {
										System.out.print("y te asesta una buena puñalada.");
										System.out.println();
									}
									if (desarme == 1) {
										System.out.println(" y consigue darte un rodillazo en el estómago.");
										System.out.println();
									}
								}
								if (jugador.getPV() >= 3) {
									if (desarme == 0) {
										System.out.println(" y te ha cortado en el brazo forcejeando. (intro)");
										piensaRapido.nextLine();
									}
									if (desarme == 1) {
										System.out.println(" y aunque no ha conseguido acertar un buen golpe, te has llevado varios puñetazos (intro)");
										piensaRapido.nextLine();
									}
									System.out.println();
								}
							}
							;
							break;
						}
					}
				}
				}
				
			}
			
			//probando la lectura del programa. Ahora es código funcional. 
			if (navajero.getPV() <= 0) {
				if (enemigoVencido == false) {
				System.out.println("Tras el golpe, se nota aturdido, así que conectas un tremendo golpe al estómago y otro a la barbilla. Cae derrotado al suelo.");
				jugador.setProgreso(2);
				ElCaminoDeLaDerecha.caminoDerecha(jugador);
				
				break;
				}
				
				
			}
		} while (decision != 4);
	}

}
