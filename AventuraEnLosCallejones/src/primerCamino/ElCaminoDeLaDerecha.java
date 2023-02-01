package primerCamino;

import java.util.Scanner;

import jugador.Player;

import primerCamino.ElCaminoDelCentro;

public class ElCaminoDeLaDerecha {
	static Scanner teclado = new Scanner(System.in);
	public static void caminoDerecha(Player jugador) {
		
		//La linea de abajo es para comprobar si funciona.
		//System.out.println(jugador.getPV());
		if (jugador.getPV() == (jugador.getPV() / 2) + 2) {
			System.out.println("Tras el combate, no ves ninguna herida seria, todo parece en orden.");
		}
		if (jugador.getPV() >= (jugador.getPV() / 2) + 3) {
			System.out.println("Parece que apenas pudo tocarte tu adversario, te sorprende tu habilidad de combate.");
		}
		if (jugador.getPV() == 2) {
			System.out.println(
					"La pelea ha sido árdua y aún puedes mantenerte en pie. Agradeces tener esa suerte (intro)");
			teclado.nextLine();
		}
		if (jugador.getPV() == 1) {
			System.out
					.println("No ha faltado mucho para que no lo contaras, tus heridas sangran y te sientes horrible.");
		}
		System.out.println("Has conseguido vencer, así que te tomas la libertad de llevarte la navaja como premio.");
		System.out.println(
				"Ahora te sientes más seguro, pero te vendría bien un lugar donde reposar y curar tus heridas");

		System.out.println("-Has obtenido Mariposa- 1 Vale 2 Detalles");
		int decisionMariposa = teclado.nextInt();
		if (decisionMariposa == 2) {
			System.out.println(
					"Miras la navaja. Tiene el mango de hierro y parece algo vieja, pero el filo no está muy gastado.");
			System.out.println("Servirá por ahora.");
		}
		System.out.println("Tu casa está al final de esta misma calle, allí podrías descansar y recuperarte. (intro)");
		teclado.nextLine();
		System.out.println(
				"No recuerdas si tienes vendajes, así que alomejor deberías ir al hospital, que está una calle a la izquierda. (intro)");
		teclado.nextLine();
		if (jugador.getAsesinatos() == 0) {
			System.out.println(
					"Se escuchan sirenas de policía, parece que no tendrás que llamar, alguien se adelantó. (intro)");
			teclado.nextLine();
			System.out.println("Gracias a la presencia policial, te sientes mas seguro.");
		}
		System.out.println("Donde te diriges? (intro)");
		teclado.nextLine();
		int direccion;
		teclado.nextLine();
		System.out.println("1 A casa.");
		System.out.println("2 Al hospital.");
		direccion = teclado.nextInt();
		switch (direccion) {
		case 1:
			Casa.enCasa(jugador);
			break;
		case 2:
			ElCaminoDeLaIzquierda.caminoDelHospital(jugador);
			break;
		}

	}
}
