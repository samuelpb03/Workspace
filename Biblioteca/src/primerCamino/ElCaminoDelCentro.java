package primerCamino;

import enemigos.personaQueEscuchaCamaron;

import jugador.Player;

import java.util.Scanner;

import combate.CombateNavajero;

public class ElCaminoDelCentro {
	
	public static void main(String[] args) {
	int pasos;
	int decision = 0;
	int decisionSutil1;
	int decisionSutil2 = 0;
	int decisionSutil3 = 0;
	Scanner teclado = new Scanner(System.in);
	
		Player player = new Player();
		
		personaQueEscuchaCamaron navajero = new personaQueEscuchaCamaron();
		System.out.println("------------Capítulo 1: Alrededor de la libreria--------------");
		System.out.println("Pulsa intro para continuar.");
		teclado.nextLine();
		System.out.println();
		System.out.println();
		System.out.println("Es un atardecer cualquiera en un frío día de invierno. No hay pajaros cantando, ni flores, y está empezando a llover(Intro)");
		teclado.nextLine();
		System.out.println("Te diriges a casa, donde te espera la cena. Todavía es de día, así que aunque vives en un barrio ");
		System.out.println("algo lúgubre y peligroso, todo parece estar bien. (Intro)");
		teclado.nextLine();
		System.out.println("TÚ:Fueron los precios de las casas lo que me atrajo aquí, la verdad es que estaba mejor en Arcilla- (Intro)");
		teclado.nextLine();
		System.out.println("ÁLVAREZ: El mercado inmoviliario siempre ha sido un saco de mierda. Antes con la especulación, ");
		System.out.println("y ahora con estos ricachones que han venido de fuera. Lo único que va a quedar aquí son esa panda de (Intro) ");
		teclado.nextLine();
		System.out.println("ladrones y asaltadores que merodea últimamente de noche.");
		System.out.println("TÚ: Tan exagerado y radical como siempre Álvarez, el día que dejes de soltar sandeces... (Intro)");
		teclado.nextLine();
		System.out.println("ÁLVAREZ: Será el día que empieces a echarme de menos cabrón.");
		System.out.println("TÚ: No lo dudo. Pero algún día tendrás que salir de tu estupidez. (Intro)");
		teclado.nextLine();
		System.out.println("ÁLVAREZ: JAJAJAJA Bueno si, algún dia. Algúno que este sobrio.");
		System.out.println("-Te hallas en casa de tu mejor amígo, Jorge Álvarez. Ante tí, un hombre de razonable barriga se rie ");
		System.out.println(" bochornosamente, dejando salir un aliento que podría usarse como combustible. Hay dos jarras de cerveza. (Intro)");
		teclado.nextLine();
		System.out.println("-Quieres mirar alrededor?- 1 Si, 2 Prefiero brindar, 3 Brindemos y bebamos para celebrar!");
		decisionSutil1 = teclado.nextInt();
		
		if (decisionSutil1 == 1) {
			System.out.println("Miras la sala. Es un comedor relativamente decente, aunque se nota que el nivel económico no es muy alto. (Intro)");
			System.out.println("No destaca nada en concreto, como mucho una vitrina con porcelana antigua, aunque no parece especialmente valiosa.");
			System.out.println("Quieres brindar? 1 Si, 2 Mejor me voy ya.");
			decisionSutil2 = teclado.nextInt();
			teclado.nextLine();
		}
		if (decisionSutil2 == 2) {
			System.out.println("TÚ: Eh tío, me voy ya a casa vale? Ya sabes como de chungas son las calles por aquí");
			System.out.println("ALVAREZ: Pues vaya aguafiestas que eres, aunque tienes toda la razón del mundo. Mejor ve ahora, (Intro)");
			teclado.nextLine();
			System.out.println(" sobretodo por que la calle de la librería se llena de cada personaje a estas horas...");
			System.out.println("TÚ: Espero que no sea parfa tanto hombre. -Abres la puerta y cojes tu chaqueta- (Intro)");
			teclado.nextLine();
			System.out.println("Lo que si que hace es un frio para cagarse joder");
			System.out.println("ÁLVAREZ: Menudo muñequito estás hecho si te quejas por el frio, anda tira.");
			System.out.println("TÚ: me cago en la p*** lo que tengo que aguantar. Va cuidate.");
			System.out.println("ÁLVAREZ: Hasta luego. -cierra la puerta-");
		}
			if (decisionSutil2 == 1) {
				System.out.println("TÚ: Eh Álvarez, por los viejos tiempos!");
				System.out.println("ÁLVAREZ: Y por los actuales que aún somos jovenes.");
				System.out.println("-las jarras suenan al golpearse. Bebes comedidamente sin llegar a acabartela, pues tienes que ir a casa. (Intro)");
			}
			if (decisionSutil2 == 2) {
				System.out.println("TÚ: Eh tío, me voy ya a casa vale? Ya sabes como de chungas son las calles por aquí");
				System.out.println("ALVAREZ: Pues vaya aguafiestas que eres, aunque tienes toda la razón del mundo. Mejor ve ahora, (Intro)");
				teclado.nextLine();
				System.out.println(" sobretodo por que la calle de la librería se llena de cada personaje a estas horas...");
				System.out.println("TÚ: Espero que no sea parfa tanto hombre. -Abres la puerta y cojes tu chaqueta- (Intro)");
				teclado.nextLine();
				System.out.println("Lo que si que hace es un frio para cagarse joder");
				System.out.println("ÁLVAREZ: Menudo muñequito estás hecho si te quejas por el frio, anda tira.");
				System.out.println("TÚ: me cago en la p*** lo que tengo que aguantar. Va cuidate.");
				System.out.println("ÁLVAREZ: Hasta luego. -cierra la puerta-");
			}
		
		
		CombateNavajero.peleaNavajero(decision, player, navajero);
		
		player.setAtaque(player.getAtaque() + 1);
		
		
		if (player.getPV() > 0) {
			player.setProgreso(2);
			ElCaminoDeLaDerecha.caminoDerecha();
		}
		else {
			ElCaminoDeLaIzquierda.caminoDelHospital();
		}
		
		
	}
}



