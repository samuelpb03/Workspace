package primerCamino;

import enemigos.CuchilleroNV1;

import jugador.Player;

import java.util.Scanner;

import combate.CombateNavajeroNV1;

public class ElCaminoDelCentro {

	public static void main(String[] args) {
		int pasos;
		int decision = 0;
		int decisionSutil1;
		int decisionSutil2 = 0;
		//int decisionSutil3 = 0;
		Scanner teclado = new Scanner(System.in);

		Player player = new Player();

		CuchilleroNV1 navajero = new CuchilleroNV1();
		System.out.println("------------Capítulo 1: Camino a casa--------------");
		System.out.println("Pulsa intro para continuar.");
		teclado.nextLine();
		System.out.println();
		System.out.println();
		System.out.println(
				"Es una noche cualquiera en un frío día de invierno. No hay pajaros cantando, ni flores, y está empezando a llover(Intro)");
		teclado.nextLine();
		System.out.println("Estás en casa de tu amigo Álvarez, que se ha mudado cerca de tí. De hecho, ambos os habeis mudado a esta ciudad recientemente. (intro)");
		teclado.nextLine();
		System.out.println(
				
				"Hace algo de frío en casa de tu amigo, y se escucha la llucha chocar contra la ventana. Tu nuevo barrio parece");
		System.out.println("algo lúgubre y peligroso, pero todo debería estar bien. (Intro)");
		teclado.nextLine();
		System.out.println("-Tienes una conversación mundana con tu amigo.(intro)");
		teclado.nextLine();
		System.out.println(
				"TÚ:Fueron los precios de las casas lo que me atrajo aquí, la verdad es que estaba mejor en Arcilla- (Intro)");
		teclado.nextLine();
		System.out.println(
				"ÁLVAREZ: El mercado inmoviliario siempre ha sido un saco de mierda. Antes con la especulación, ");
		System.out.println(
				"y ahora con estos ricachones que han venido de fuera. Lo único que va a quedar aquí son esa panda de (Intro) ");
		teclado.nextLine();
		System.out.println("ladrones y asaltadores que merodea últimamente de noche.");
		System.out.println(
				"TÚ: Tan exagerado y radical como siempre Álvarez, el día que dejes de soltar sandeces... (Intro)");
		teclado.nextLine();
		System.out.println("ÁLVAREZ: Será el día que empieces a echarme de menos cabrón.");
		System.out.println("TÚ: No lo dudo. Pero algún día tendrás que salir de tu estupidez. (Intro)");
		teclado.nextLine();
		System.out.println("ÁLVAREZ: JAJAJAJA Bueno si, algún dia. Algúno que este sobrio.");
		System.out.println(
				"-tu amigo (un hombre de razonable barriga) se rie ");
		System.out.println(
				" bochornosamente, dejando salir un aliento que podría usarse como combustible. Hay dos jarras de cerveza. (Intro)");
		teclado.nextLine();
		System.out.println("-Quieres mirar alrededor?- 1 Si, 2 Prefiero brindar, 3 Brindemos y bebamos para celebrar!");
		decisionSutil1 = teclado.nextInt();

		if (decisionSutil1 == 1) {
			Scanner subteclado = new Scanner(System.in);
			System.out.println(
					
					"Miras la sala. Es un comedor relativamente decente, aunque se nota que el nivel económico no es muy alto. (Intro)");
				subteclado.nextLine();
			System.out.println(
					"No destaca nada en concreto, como mucho una vitrina con porcelana antigua, aunque no parece especialmente valiosa.");
			System.out.println("Quieres brindar? 1 Si, 2 Mejor me voy ya.");
			decisionSutil2 = teclado.nextInt();
			teclado.nextLine();
		}
		if (decisionSutil1 == 2 | decisionSutil2 == 1) {
			Scanner subteclado = new Scanner(System.in);
			System.out.println("TÚ: Eh Álvarez, por los viejos tiempos!");
			System.out.println("ÁLVAREZ: Y por los actuales que aún somos jovenes.");
			System.out.println(
					"-las jarras suenan al golpearse. Bebes comedidamente sin llegar a acabartela, pues tienes que ir a casa. (Intro)");
			subteclado.nextLine();
			System.out.println("TÚ: Bueno, me piro ya. Suerte con todo compañero.");
			System.out.println("ÁLVAREZ: Vaya, ya ni te emborrachas conmigo, menudo aburrido.");
			System.out.println("TÚ: Otro día, prometido.");
			System.out.println("ÁLVAREZ: Bueno venga, cuidado en el camino.");
			System.out.println("- Marchas hacia casa. Hace muchísimo frio y hay una ligera lluvia, (intro)");
			subteclado.nextLine();
			System.out.println("por alguna razón, te sientes observado. Empiezas a escuchar pasos, (intro)");
			subteclado.nextLine();
			System.out.println("pero antes de que te gires escuchas una voz.");
			
		}
		if (decisionSutil1 == 3) {
			Scanner subteclado = new Scanner(System.in);
			System.out.println("TÚ: Bebamos amigo mio, por los viejos tiempos joder!");
			System.out.println("ÁLVAREZ: Y por los actuales!.");
			System.out.println(
					"-las jarras suenan al golpearse. Bebes hasta que te la terminas, como si no tuvieras que llegar a casa. (Intro)");
			subteclado.nextLine();
			System.out.println("TÚ: Bueno, me piro ya. Suerte con todo compañero.");
			System.out.println("ÁLVAREZ: Claro hombre, ya nos veremos en algún bar -se rie a carcajadas. Está más ebrio que tú-.");
			System.out.println("TÚ: Pronto, prometido.");
			System.out.println("ÁLVAREZ: Bueno venga, cuidado en el camino.");
			System.out.println("- Marchas hacia casa. Hace muchísimo frio y hay una ligera lluvia, (intro)");
			subteclado.nextLine();
			System.out.println("por alguna razón, te sientes observado. Empiezas a escuchar pasos, (intro)");
			subteclado.nextLine();
			System.out.println("pero antes de que te gires escuchas una voz.");
			
		}
		if (decisionSutil2 == 2) {
			Scanner subteclado = new Scanner(System.in);
			System.out.println("TÚ: Eh tío, me voy ya a casa vale? Ya sabes como de chungas son las calles por aquí");
			System.out.println(
					"ALVAREZ: Pues vaya aguafiestas que eres, aunque tienes toda la razón del mundo. Mejor ve ahora, (Intro)");
			subteclado.nextLine();
			System.out
					.println(" sobretodo por que la calle de la librería se llena de cada personaje a estas horas...");
			System.out
					.println("TÚ: Espero que no sea parfa tanto hombre. -Abres la puerta y cojes tu chaqueta- (Intro)");
			subteclado.nextLine();
			System.out.println("Lo que si que hace es un frio para cagarse joder");
			System.out.println("ÁLVAREZ: Menudo muñequito estás hecho si te quejas por el frio, anda tira.");
			System.out.println("TÚ: me cago en la p*** lo que tengo que aguantar. Va cuidate.");
			System.out.println("ÁLVAREZ: Hasta luego. -cierra la puerta-");
			System.out.println("- Marchas hacia casa. Hace muchísimo frio y hay una ligera lluvia, (intro)");
			subteclado.nextLine();
			System.out.println("por alguna razón, te sientes observado. Empiezas a escuchar pasos, (intro)");
			subteclado.nextLine();
			System.out.println("pero antes de que te gires escuchas una voz.");
		}
		Scanner subteclado = new Scanner(System.in);
		System.out.println("ASALTADOR: Eh, dame todo lo que tengas, ya!(Intro)");
		subteclado.nextLine();
		System.out.println("-Te giras y ves que te apunta con una navaja. No hay gente en los alrededores. Que haces?");
		subteclado.nextLine();
		System.out.println("1 Tratas de huir.");
		System.out.println("2 Intentas defenderte.");
		System.out.println("3 Se lo das.");
		int decisionEnPeligro = teclado.nextInt();
		switch (decisionEnPeligro) {
		case 1:
			System.out.println(
					"-Intentas escapar pero es más rápido que tu, y sientes como te apuñala por la espalda. (intro)");
			teclado.nextLine();
			System.out.println(
					" El dolor hace que caigas y acto seguido empiezas a perder el conocimiento. Te roba la cartera y el teléfono (intro)");
			teclado.nextLine();
			player.setPV(0);
			break;
		
		case 2:
		//te mete en la pelea directamente
		CombateNavajeroNV1.peleaNavajero(decision, player, navajero);
		break;
		case 3:
			//vas a casa, en esa clase ya comprobaré si te han robado o has ido después de ganar.
			System.out.println("Haces lo que te pide, así que te quedas sin móvil y sin cartera. (intro)");
			teclado.nextLine();
			System.out.println("ASALTADOR: Así me gusta, obedeciendo y sin rechistar. (intro)");
			teclado.nextLine();
			System.out.println("Y como me entere que me denuncias, te saco las tripas y te ahogo con ellas bobolón. (intro)");
			teclado.nextLine();
			System.out.println("Ves como se marcha con tus cosas. Asustado y humillado, agachas la cabeza y vas hasta casa. (intro)");
			teclado.nextLine();
			Casa.enCasa(player);
		break;
		}
		if (player.getPV() > 0 && decisionEnPeligro != 3) {
			player.setProgreso(2);
			ElCaminoDeLaDerecha.caminoDerecha(player);
		} else {
			if (player.getPV() <= 0) {
				ElCaminoDeLaIzquierda.caminoDelHospital(player);
			}
			
		}

	}
}

