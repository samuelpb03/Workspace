package primerCamino;

import jugador.Player;

import java.util.Scanner;

import java.util.Random;

public class ElCaminoDeLaIzquierda {
	int denunciado;
	static Scanner teclado = new Scanner(System.in);
	{

	}

	public static void caminoDelHospital(Player jugador) {
		//codigo para el jugador derrotado
		if (jugador.getProgreso() == 1) {
			System.out.println(
					"(Doctor) Buenos dias, llevas unas horas inconsciente. Ten�as una pu�alada bastante seria y varios cortes.");
			System.out.println("(Doctor) De donde vienes?");
			System.out.println("1 Contarle que has tenido un accidente con tu moto, 2 Decirle la verdad");
			int accidenteFalso = teclado.nextInt();
			switch (accidenteFalso) {
			case 1:
				System.out.println("(Doctor) E imagino que justo despues de apu�alaron y te robaron casualmente...");
				System.out.println("-Recuerdas que no llevabas casco y te han atracado, as� que ni siquiera puedes identificarte. Era imposible que colara.");
				System.out.println("-A la ma�ana siguiente, tras identificarte debidamete. Llegas a casa. Por suerte no te han robado las llaves (intro)");
				jugador.setPV(5);
				teclado.nextLine();
				System.out.println("Tus heridas duelen casi insoportablemente. (intro)");
				teclado.nextLine();
				Casa.enCasa(jugador);
				break;
			case 2:
				System.out.println("(Doctor) Vaya, pues has tenido suerte, aunque tus heridas sangraban mucho, tu vida no peligraba. Pero podr�as haberte desangrado (intro).");
				System.out.println("(Doctor) La calle donde te encontramos es muy peligrosa, deber�as intentar evitar esa zona.");
				System.out.println("T�: Ver� doctor, el problema es que vivo por esa zona.(intro)");
				teclado.nextLine();
				System.out.println("(Doctor) -Bajando un poco la voz- No deber�a hacer esto, pero si vives en esas calles, no puedes ir por ah� confiando en tus pu�os. (intro).");
				teclado.nextLine();
				System.out.println("(Doctor) Evita salir a altas horas de la noche, pero en el caso de que lo hagas, deber�as llevarte un cuchillo o una navaja. (intro)");
				teclado.nextLine();
				System.out.println("(T�) No puedo llevar una arma blanca por la calle, es ilegal. (intro)");
				teclado.nextLine();
				System.out.println("(Doctor) Lo s�, pero las cosas por aqu� est�n muy mal. Podr�as haber muerto... considera llevar algo para defenderte. (intro)");
				teclado.nextLine();
				System.out.println("-Tras hablar un rato m�s con el doctor sobre lo inseguras que son las calles, marchas a casa.");
				Casa.enCasa(jugador);
				break;
			}
		} //c�digo para el jugador victorioso 
		else {
			System.out.println(
					"-Entras y pides ayuda. Los doctores te atienden enseguida, pues es muy tarde y ven los cortes en tu ropa- (intro)");
			teclado.nextLine();
			System.out.println("DOCTOR: Entra en la sala numero 2.");
			if (jugador.getPV() == 2 || jugador.getPV() == 1) {
				System.out.println(
						"Entras y te tumbas como puedes, tras pasar el efecto de la adrenalina, empiezas a marearte por tus heridas.");
				System.out.println(
						"Entre el cansancio, el frio y tus heridas, pierdes el conicimiento. Lo �ltimo que oyes es al doctor entrando aprsuradamente. (intro)");
				teclado.nextLine();
				System.out.println(
						"(Doctor) Buenos dias, llevas unas horas inconsciente. Ten�as una pu�alada bastante seria y varios cortes.");
				System.out.println("(Doctor) De donde vienes?");
				System.out.println("1 Contarle que has tenido un accidente con tu moto, 2 Decirle la verdad");
				int accidenteFalso = teclado.nextInt();
				switch (accidenteFalso) {
				case 1:
					System.out.println("(Doctor) E imagino que justo despues de apu�alaron y te robaron casualmente...");
					System.out.println("-Recuerdas que no llevabas casco y te han atracado, as� que ni siquiera puedes identificarte. Era imposible que colara.");
					System.out.println("-A la ma�ana siguiente, tras identificarte debidamete. Llegas a casa. Por suerte no te han robado las llaves (intro)");
					jugador.setPV(5);
					teclado.nextLine();
					System.out.println("Tus heridas duelen casi insoportablemente. (intro)");
					teclado.nextLine();
					Casa.enCasa(jugador);
					break;
				case 2:
					System.out.println("(Doctor) Vaya, pues has tenido suerte, aunque tus heridas sangraban mucho, tu vida no peligraba. Pero podr�as haberte desangrado (intro).");
					System.out.println("(Doctor) La calle donde te encontramos es muy peligrosa, deber�as intentar evitar esa zona.");
					System.out.println("T�: Ver� doctor, el problema es que vivo por esa zona.(intro)");
					teclado.nextLine();
					System.out.println("(Doctor) -Bajando un poco la voz- No deber�a hacer esto, pero si vives en esas calles, no puedes ir por ah� confiando en tus pu�os. (intro).");
					teclado.nextLine();
					System.out.println("(Doctor) Evita salir a altas horas de la noche, pero en el caso de que lo hagas, deber�as llevarte un cuchillo o una navaja. (intro)");
					teclado.nextLine();
					System.out.println("(T�) No puedo llevar una arma blanca por la calle, es ilegal. (intro)");
					teclado.nextLine();
					System.out.println("(Doctor) Lo s�, pero las cosas por aqu� est�n muy mal. Podr�as haber muerto... considera llevar algo para defenderte. (intro)");
					teclado.nextLine();
					System.out.println("-Tras hablar un rato m�s con el doctor sobre lo inseguras que son las calles, marchas a casa.");
					Casa.enCasa(jugador);
					break;
				
				}
			}
			if (jugador.getPV() == 3 && jugador.getPV() <= 5) {
				System.out.println("Vas a la sala dos, como te ha indicado el doctor.");
				if (jugador.getPV() == 5) {
					System.out.println("Al quitarte la chaqueta y las camisetas, no tienes heridas.");

					if (jugador.getAsesinatos() == 0) {
						System.out.println("(Doctor)Parece que est�s bien, que te ha pasado? (intro)");
						teclado.nextLine();
						System.out
								.println("1 Contarle que te han atacado, 2 Mentir diciendo que ha sido un accidente.");
						int respuesta = teclado.nextInt();
						teclado.nextLine();
						switch (respuesta) {
						case 1:
							System.out.println("-Le cuentas que te asaltaron de camino a casa-");
							System.out.println(
									"(Doctor) Hmmm... ya veo. Has sabido defenderte muy bien o has tenido suerte. (intro)");
							teclado.nextLine();
							System.out.println(
									"En cualquier caso, no est�s herido. Quiza deber�as denunciar el suceso cuando llegues a casa");
							break;
						case 2:
							Random rando = new Random();
							int mentira = rando.nextInt(4);
							if (mentira > 1) {
								System.out.println(
										"-Le mientes sin titubear, el doctor no parece acabar de creerte pero no pregunta m�s-");
								break;
							}
							if (mentira <= 1) {
								System.out.println(
										"-Mientes como puedes al doctor, pero no suenas muy convencido- (intro)");
								teclado.nextLine();
								System.out.println(
										"(Doctor) Hmm yo dir�a que los cortes de tu ropa ven�an de un cuchillo o un navaja.(intro)");
								teclado.nextLine();
								System.out.println(
										"(Doctor) No tienes porque mentir, te han atacado y te has defendido, eso es todo.(intro)");
								teclado.nextLine();
								System.out.println(
										"-Te averg�enzas y te preguntas por qu� mentiste en un primer momento-.(intro)");
								teclado.nextLine();
								break;
							}

						}
						System.out.println("Te env�an a casa.");
						Casa.enCasa(jugador);
					}
				} else {
					System.out.println("Te tumbas, y el dolor es muy intenso.(intro)");
					teclado.nextLine();
					System.out.println("DOCTOR: Vaya, como te has herido as�?");
					System.out.println("1 Contarle que te han atacado, 2 Mentir diciendo que ha sido un accidente.");
					int respuesta = teclado.nextInt();
					teclado.nextLine();
					switch (respuesta) {
					case 1:
						System.out.println("-Le cuentas que te asaltaron de camino a casa-");
						System.out.println(
								"(Doctor) Hmmm... ya veo. Has sabido defenderte bien o has tenido suerte. (intro)");
						teclado.nextLine();
						System.out.println(
								"Quiza deber�as denunciar el suceso cuando llegues a casa");
						break;
					case 2:
						Random rando = new Random();
						int mentira = rando.nextInt(4);
						if (mentira > 1) {
							System.out.println(
									"-Le mientes sin titubear, el doctor no parece acabar de creerte pero no pregunta m�s-");
							break;
						}
						if (mentira <= 1) {
							System.out
									.println("-Mientes como puedes al doctor, pero no suenas muy convencido- (intro)");
							teclado.nextLine();
							System.out.println(
									"(Doctor) Hmm yo dir�a que los cortes ven�an de un cuchillo o un navaja.(intro)");
							teclado.nextLine();
							System.out.println(
									"(Doctor) No tienes porque mentir, te han atacado y te has defendido, eso es todo.(intro)");
							teclado.nextLine();
							System.out.println(
									"-Te averg�enzas y te preguntas por qu� mentiste en un primer momento-.(intro)");
							teclado.nextLine();
							break;
						}
					}
					System.out.println("-Te envian a casa tras reposar unas horas. Ha sido mas un susto que nada");
					Casa.enCasa(jugador);
				}
			}
		}
	}

}
