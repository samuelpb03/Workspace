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
		System.out.println("------------Cap�tulo 1: Alrededor de la libreria--------------");
		System.out.println("Pulsa intro para continuar.");
		teclado.nextLine();
		System.out.println();
		System.out.println();
		System.out.println("Es un atardecer cualquiera en un fr�o d�a de invierno. No hay pajaros cantando, ni flores, y est� empezando a llover(Intro)");
		teclado.nextLine();
		System.out.println("Te diriges a casa, donde te espera la cena. Todav�a es de d�a, as� que aunque vives en un barrio ");
		System.out.println("algo l�gubre y peligroso, todo parece estar bien. (Intro)");
		teclado.nextLine();
		System.out.println("T�:Fueron los precios de las casas lo que me atrajo aqu�, la verdad es que estaba mejor en Arcilla- (Intro)");
		teclado.nextLine();
		System.out.println("�LVAREZ: El mercado inmoviliario siempre ha sido un saco de mierda. Antes con la especulaci�n, ");
		System.out.println("y ahora con estos ricachones que han venido de fuera. Lo �nico que va a quedar aqu� son esa panda de (Intro) ");
		teclado.nextLine();
		System.out.println("ladrones y asaltadores que merodea �ltimamente de noche.");
		System.out.println("T�: Tan exagerado y radical como siempre �lvarez, el d�a que dejes de soltar sandeces... (Intro)");
		teclado.nextLine();
		System.out.println("�LVAREZ: Ser� el d�a que empieces a echarme de menos cabr�n.");
		System.out.println("T�: No lo dudo. Pero alg�n d�a tendr�s que salir de tu estupidez. (Intro)");
		teclado.nextLine();
		System.out.println("�LVAREZ: JAJAJAJA Bueno si, alg�n dia. Alg�no que este sobrio.");
		System.out.println("-Te hallas en casa de tu mejor am�go, Jorge �lvarez. Ante t�, un hombre de razonable barriga se rie ");
		System.out.println(" bochornosamente, dejando salir un aliento que podr�a usarse como combustible. Hay dos jarras de cerveza. (Intro)");
		teclado.nextLine();
		System.out.println("-Quieres mirar alrededor?- 1 Si, 2 Prefiero brindar, 3 Brindemos y bebamos para celebrar!");
		decisionSutil1 = teclado.nextInt();
		
		if (decisionSutil1 == 1) {
			System.out.println("Miras la sala. Es un comedor relativamente decente, aunque se nota que el nivel econ�mico no es muy alto. (Intro)");
			System.out.println("No destaca nada en concreto, como mucho una vitrina con porcelana antigua, aunque no parece especialmente valiosa.");
			System.out.println("Quieres brindar? 1 Si, 2 Mejor me voy ya.");
			decisionSutil2 = teclado.nextInt();
			teclado.nextLine();
		}
		if (decisionSutil2 == 2) {
			System.out.println("T�: Eh t�o, me voy ya a casa vale? Ya sabes como de chungas son las calles por aqu�");
			System.out.println("ALVAREZ: Pues vaya aguafiestas que eres, aunque tienes toda la raz�n del mundo. Mejor ve ahora, (Intro)");
			teclado.nextLine();
			System.out.println(" sobretodo por que la calle de la librer�a se llena de cada personaje a estas horas...");
			System.out.println("T�: Espero que no sea parfa tanto hombre. -Abres la puerta y cojes tu chaqueta- (Intro)");
			teclado.nextLine();
			System.out.println("Lo que si que hace es un frio para cagarse joder");
			System.out.println("�LVAREZ: Menudo mu�equito est�s hecho si te quejas por el frio, anda tira.");
			System.out.println("T�: me cago en la p*** lo que tengo que aguantar. Va cuidate.");
			System.out.println("�LVAREZ: Hasta luego. -cierra la puerta-");
		}
			if (decisionSutil2 == 1) {
				System.out.println("T�: Eh �lvarez, por los viejos tiempos!");
				System.out.println("�LVAREZ: Y por los actuales que a�n somos jovenes.");
				System.out.println("-las jarras suenan al golpearse. Bebes comedidamente sin llegar a acabartela, pues tienes que ir a casa. (Intro)");
			}
			if (decisionSutil2 == 2) {
				System.out.println("T�: Eh t�o, me voy ya a casa vale? Ya sabes como de chungas son las calles por aqu�");
				System.out.println("ALVAREZ: Pues vaya aguafiestas que eres, aunque tienes toda la raz�n del mundo. Mejor ve ahora, (Intro)");
				teclado.nextLine();
				System.out.println(" sobretodo por que la calle de la librer�a se llena de cada personaje a estas horas...");
				System.out.println("T�: Espero que no sea parfa tanto hombre. -Abres la puerta y cojes tu chaqueta- (Intro)");
				teclado.nextLine();
				System.out.println("Lo que si que hace es un frio para cagarse joder");
				System.out.println("�LVAREZ: Menudo mu�equito est�s hecho si te quejas por el frio, anda tira.");
				System.out.println("T�: me cago en la p*** lo que tengo que aguantar. Va cuidate.");
				System.out.println("�LVAREZ: Hasta luego. -cierra la puerta-");
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



