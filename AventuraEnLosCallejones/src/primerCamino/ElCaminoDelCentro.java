package primerCamino;

import enemigos.CuchilleroNV1;

import enemigos.TanqueNV1;

import jugador.Player;

import java.util.Scanner;

import combate.CombateNavajeroNV1;
import combate.CombateTanqueNV1;

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
		
		System.out.println("------------Cap�tulo 1: Camino a casa--------------");
		System.out.println("Pulsa intro para continuar.");
		teclado.nextLine();
		System.out.println();
		System.out.println();
		System.out.println(
				"Es una noche cualquiera en un fr�o d�a de invierno. No hay pajaros cantando, ni flores, y est� empezando a llover(Intro)");
		teclado.nextLine();
		System.out.println("Est�s en casa de tu amigo �lvarez, que se ha mudado cerca de t�. De hecho, ambos os habeis mudado a esta ciudad recientemente. (intro)");
		teclado.nextLine();
		System.out.println(
				
				"Hace algo de fr�o en casa de tu amigo, y se escucha la llucha chocar contra la ventana. Tu nuevo barrio parece");
		System.out.println("algo l�gubre y peligroso, pero todo deber�a estar bien. (Intro)");
		teclado.nextLine();
		System.out.println("-Tienes una conversaci�n mundana con tu amigo.(Intro)");
		teclado.nextLine();
		System.out.println(
				"T�:Fueron los precios de las casas lo que me atrajo aqu�, la verdad es que estaba mejor en Arcilla- (Intro)");
		teclado.nextLine();
		System.out.println(
				"�LVAREZ: El mercado inmoviliario siempre ha sido un saco de mierda. Antes con la especulaci�n, ");
		System.out.println(
				"y ahora con estos ricachones que han venido de fuera. Lo �nico que va a quedar aqu� son esa panda de (Intro) ");
		teclado.nextLine();
		System.out.println("ladrones y asaltadores que merodea �ltimamente de noche.");
		System.out.println(
				"T�: Tan exagerado y radical como siempre �lvarez, el d�a que dejes de soltar sandeces... (Intro)");
		teclado.nextLine();
		System.out.println("�LVAREZ: Ser� el d�a que empieces a echarme de menos cabr�n.");
		System.out.println("T�: No lo dudo. Pero alg�n d�a tendr�s que salir de tu estupidez. (Intro)");
		teclado.nextLine();
		System.out.println("�LVAREZ: JAJAJAJA Bueno si, alg�n dia. Alg�no que este sobrio.");
		System.out.println(
				"-tu amigo (un hombre de razonable barriga) se rie ");
		System.out.println(
				" bochornosamente, dejando salir un aliento que podr�a usarse como combustible. Hay dos jarras de cerveza. (Intro)");
		teclado.nextLine();
		System.out.println("-Quieres mirar alrededor?- 1 Si, 2 Prefiero brindar, 3 Brindemos y bebamos para celebrar!");
		decisionSutil1 = teclado.nextInt();

		if (decisionSutil1 == 1) {
			Scanner subteclado = new Scanner(System.in);
			System.out.println(
					
					"Miras la sala. Es un comedor relativamente decente, aunque se nota que el nivel econ�mico no es muy alto. (Intro)");
				subteclado.nextLine();
			System.out.println(
					"No destaca nada en concreto, como mucho una vitrina con porcelana antigua, aunque no parece especialmente valiosa.");
			System.out.println("Quieres brindar? 1 Si, 2 Mejor me voy ya.");
			decisionSutil2 = teclado.nextInt();
			teclado.nextLine();
		}
		if (decisionSutil1 == 2 | decisionSutil2 == 1) {
			Scanner subteclado = new Scanner(System.in);
			System.out.println("T�: Eh �lvarez, por los viejos tiempos!");
			System.out.println("�LVAREZ: Y por los actuales que a�n somos jovenes.");
			System.out.println(
					"-las jarras suenan al golpearse. Bebes comedidamente sin llegar a acabartela, pues tienes que ir a casa. (Intro)");
			subteclado.nextLine();
			System.out.println("T�: Bueno, me piro ya. Suerte con todo compa�ero.");
			System.out.println("�LVAREZ: Vaya, ya ni te emborrachas conmigo, menudo aburrido.");
			System.out.println("T�: Otro d�a, prometido.");
			System.out.println("�LVAREZ: Bueno venga, cuidado en el camino.");
			System.out.println("- Marchas hacia casa. Hace much�simo frio y hay una ligera lluvia, (intro)");
			subteclado.nextLine();
			System.out.println("por alguna raz�n, te sientes observado. Empiezas a escuchar pasos, (intro)");
			subteclado.nextLine();
			System.out.println("pero antes de que te gires escuchas una voz.");
			
		}
		if (decisionSutil1 == 3) {
			Scanner subteclado = new Scanner(System.in);
			System.out.println("T�: Bebamos amigo mio, por los viejos tiempos joder!");
			System.out.println("�LVAREZ: Y por los actuales!.");
			System.out.println(
					"-las jarras suenan al golpearse. Bebes hasta que te la terminas, como si no tuvieras que llegar a casa. (Intro)");
			subteclado.nextLine();
			System.out.println("T�: Bueno, me piro ya. Suerte con todo compa�ero.");
			System.out.println("�LVAREZ: Claro hombre, ya nos veremos en alg�n bar -se rie a carcajadas. Est� m�s ebrio que t�-.");
			System.out.println("T�: Pronto, prometido.");
			System.out.println("�LVAREZ: Bueno venga, cuidado en el camino.");
			System.out.println("- Marchas hacia casa. Hace much�simo frio y hay una ligera lluvia, (intro)");
			subteclado.nextLine();
			System.out.println("por alguna raz�n, te sientes observado. Empiezas a escuchar pasos, (intro)");
			subteclado.nextLine();
			System.out.println("pero antes de que te gires escuchas una voz.");
			
		}
		if (decisionSutil2 == 2) {
			Scanner subteclado = new Scanner(System.in);
			System.out.println("T�: Eh t�o, me voy ya a casa vale? Ya sabes como de chungas son las calles por aqu�");
			System.out.println(
					"ALVAREZ: Pues vaya aguafiestas que eres, aunque tienes toda la raz�n del mundo. Mejor ve ahora, (Intro)");
			subteclado.nextLine();
			System.out
					.println(" sobretodo por que la calle de la librer�a se llena de cada personaje a estas horas...");
			System.out
					.println("T�: Espero que no sea parfa tanto hombre. -Abres la puerta y cojes tu chaqueta- (Intro)");
			subteclado.nextLine();
			System.out.println("Lo que si que hace es un frio para cagarse joder");
			System.out.println("�LVAREZ: Menudo mu�equito est�s hecho si te quejas por el frio, anda tira.");
			System.out.println("T�: me cago en la p*** lo que tengo que aguantar. Va cuidate.");
			System.out.println("�LVAREZ: Hasta luego. -cierra la puerta-");
			System.out.println("- Marchas hacia casa. Hace much�simo frio y hay una ligera lluvia, (intro)");
			subteclado.nextLine();
			System.out.println("por alguna raz�n, te sientes observado. Empiezas a escuchar pasos, (intro)");
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
					"-Intentas escapar pero es m�s r�pido que tu, y sientes como te apu�ala por la espalda. (intro)");
			teclado.nextLine();
			System.out.println(
					" El dolor hace que caigas y acto seguido empiezas a perder el conocimiento. Te roba la cartera y el tel�fono (intro)");
			teclado.nextLine();
			player.setPV(0);
			break;
		
		case 2:
		//te mete en la pelea directamente
		CombateNavajeroNV1.peleaNavajero(decision, player, navajero);
		break;
		case 3:
			//vas a casa, en esa clase ya comprobar� si te han robado o has ido despu�s de ganar.
			System.out.println("Haces lo que te pide, as� que te quedas sin m�vil y sin cartera. (intro)");
			teclado.nextLine();
			System.out.println("ASALTADOR: As� me gusta, obedeciendo y sin rechistar. (intro)");
			teclado.nextLine();
			System.out.println("Y como me entere que me denuncias, te saco las tripas y te ahogo con ellas bobol�n. (intro)");
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

