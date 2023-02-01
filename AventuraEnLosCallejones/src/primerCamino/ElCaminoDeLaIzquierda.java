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
					"(Doctor) Buenos dias, llevas unas horas inconsciente. Tenías una puñalada bastante seria y varios cortes.");
			System.out.println("(Doctor) De donde vienes?");
			System.out.println("1 Contarle que has tenido un accidente con tu moto, 2 Decirle la verdad");
			int accidenteFalso = teclado.nextInt();
			switch (accidenteFalso) {
			case 1:
				System.out.println("(Doctor) E imagino que justo despues de apuñalaron y te robaron casualmente...");
				System.out.println("-Recuerdas que no llevabas casco y te han atracado, así que ni siquiera puedes identificarte. Era imposible que colara.");
				System.out.println("-A la mañana siguiente, tras identificarte debidamete. Llegas a casa. Por suerte no te han robado las llaves (intro)");
				jugador.setPV(5);
				teclado.nextLine();
				System.out.println("Tus heridas duelen casi insoportablemente. (intro)");
				teclado.nextLine();
				Casa.enCasa(jugador);
				break;
			case 2:
				System.out.println("(Doctor) Vaya, pues has tenido suerte, aunque tus heridas sangraban mucho, tu vida no peligraba. Pero podrías haberte desangrado (intro).");
				System.out.println("(Doctor) La calle donde te encontramos es muy peligrosa, deberías intentar evitar esa zona.");
				System.out.println("TÚ: Verá doctor, el problema es que vivo por esa zona.(intro)");
				teclado.nextLine();
				System.out.println("(Doctor) -Bajando un poco la voz- No debería hacer esto, pero si vives en esas calles, no puedes ir por ahí confiando en tus puños. (intro).");
				teclado.nextLine();
				System.out.println("(Doctor) Evita salir a altas horas de la noche, pero en el caso de que lo hagas, deberías llevarte un cuchillo o una navaja. (intro)");
				teclado.nextLine();
				System.out.println("(TÚ) No puedo llevar una arma blanca por la calle, es ilegal. (intro)");
				teclado.nextLine();
				System.out.println("(Doctor) Lo sé, pero las cosas por aquí están muy mal. Podrías haber muerto... considera llevar algo para defenderte. (intro)");
				teclado.nextLine();
				System.out.println("-Tras hablar un rato más con el doctor sobre lo inseguras que son las calles, marchas a casa.");
				Casa.enCasa(jugador);
				break;
			}
		} //código para el jugador victorioso 
		else {
			System.out.println(
					"-Entras y pides ayuda. Los doctores te atienden enseguida, pues es muy tarde y ven los cortes en tu ropa- (intro)");
			teclado.nextLine();
			System.out.println("DOCTOR: Entra en la sala numero 2.");
			if (jugador.getPV() == 2 || jugador.getPV() == 1) {
				System.out.println(
						"Entras y te tumbas como puedes, tras pasar el efecto de la adrenalina, empiezas a marearte por tus heridas.");
				System.out.println(
						"Entre el cansancio, el frio y tus heridas, pierdes el conicimiento. Lo último que oyes es al doctor entrando aprsuradamente. (intro)");
				teclado.nextLine();
				System.out.println(
						"(Doctor) Buenos dias, llevas unas horas inconsciente. Tenías una puñalada bastante seria y varios cortes.");
				System.out.println("(Doctor) De donde vienes?");
				System.out.println("1 Contarle que has tenido un accidente con tu moto, 2 Decirle la verdad");
				int accidenteFalso = teclado.nextInt();
				switch (accidenteFalso) {
				case 1:
					System.out.println("(Doctor) E imagino que justo despues de apuñalaron y te robaron casualmente...");
					System.out.println("-Recuerdas que no llevabas casco y te han atracado, así que ni siquiera puedes identificarte. Era imposible que colara.");
					System.out.println("-A la mañana siguiente, tras identificarte debidamete. Llegas a casa. Por suerte no te han robado las llaves (intro)");
					jugador.setPV(5);
					teclado.nextLine();
					System.out.println("Tus heridas duelen casi insoportablemente. (intro)");
					teclado.nextLine();
					Casa.enCasa(jugador);
					break;
				case 2:
					System.out.println("(Doctor) Vaya, pues has tenido suerte, aunque tus heridas sangraban mucho, tu vida no peligraba. Pero podrías haberte desangrado (intro).");
					System.out.println("(Doctor) La calle donde te encontramos es muy peligrosa, deberías intentar evitar esa zona.");
					System.out.println("TÚ: Verá doctor, el problema es que vivo por esa zona.(intro)");
					teclado.nextLine();
					System.out.println("(Doctor) -Bajando un poco la voz- No debería hacer esto, pero si vives en esas calles, no puedes ir por ahí confiando en tus puños. (intro).");
					teclado.nextLine();
					System.out.println("(Doctor) Evita salir a altas horas de la noche, pero en el caso de que lo hagas, deberías llevarte un cuchillo o una navaja. (intro)");
					teclado.nextLine();
					System.out.println("(TÚ) No puedo llevar una arma blanca por la calle, es ilegal. (intro)");
					teclado.nextLine();
					System.out.println("(Doctor) Lo sé, pero las cosas por aquí están muy mal. Podrías haber muerto... considera llevar algo para defenderte. (intro)");
					teclado.nextLine();
					System.out.println("-Tras hablar un rato más con el doctor sobre lo inseguras que son las calles, marchas a casa.");
					Casa.enCasa(jugador);
					break;
				
				}
			}
			if (jugador.getPV() == 3 && jugador.getPV() <= 5) {
				System.out.println("Vas a la sala dos, como te ha indicado el doctor.");
				if (jugador.getPV() == 5) {
					System.out.println("Al quitarte la chaqueta y las camisetas, no tienes heridas.");

					if (jugador.getAsesinatos() == 0) {
						System.out.println("(Doctor)Parece que estás bien, que te ha pasado? (intro)");
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
									"En cualquier caso, no estás herido. Quiza deberías denunciar el suceso cuando llegues a casa");
							break;
						case 2:
							Random rando = new Random();
							int mentira = rando.nextInt(4);
							if (mentira > 1) {
								System.out.println(
										"-Le mientes sin titubear, el doctor no parece acabar de creerte pero no pregunta más-");
								break;
							}
							if (mentira <= 1) {
								System.out.println(
										"-Mientes como puedes al doctor, pero no suenas muy convencido- (intro)");
								teclado.nextLine();
								System.out.println(
										"(Doctor) Hmm yo diría que los cortes de tu ropa venían de un cuchillo o un navaja.(intro)");
								teclado.nextLine();
								System.out.println(
										"(Doctor) No tienes porque mentir, te han atacado y te has defendido, eso es todo.(intro)");
								teclado.nextLine();
								System.out.println(
										"-Te avergüenzas y te preguntas por qué mentiste en un primer momento-.(intro)");
								teclado.nextLine();
								break;
							}

						}
						System.out.println("Te envían a casa.");
						Casa.enCasa(jugador);
					}
				} else {
					System.out.println("Te tumbas, y el dolor es muy intenso.(intro)");
					teclado.nextLine();
					System.out.println("DOCTOR: Vaya, como te has herido así?");
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
								"Quiza deberías denunciar el suceso cuando llegues a casa");
						break;
					case 2:
						Random rando = new Random();
						int mentira = rando.nextInt(4);
						if (mentira > 1) {
							System.out.println(
									"-Le mientes sin titubear, el doctor no parece acabar de creerte pero no pregunta más-");
							break;
						}
						if (mentira <= 1) {
							System.out
									.println("-Mientes como puedes al doctor, pero no suenas muy convencido- (intro)");
							teclado.nextLine();
							System.out.println(
									"(Doctor) Hmm yo diría que los cortes venían de un cuchillo o un navaja.(intro)");
							teclado.nextLine();
							System.out.println(
									"(Doctor) No tienes porque mentir, te han atacado y te has defendido, eso es todo.(intro)");
							teclado.nextLine();
							System.out.println(
									"-Te avergüenzas y te preguntas por qué mentiste en un primer momento-.(intro)");
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
