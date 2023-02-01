package primerCamino;

import jugador.Player;

import java.util.Scanner;

public class Casa {
	
	static Scanner teclado = new Scanner(System.in);
	
	public static void enCasa(Player jugador) {
		int accion;
		System.out.println("Consigues entrar a casa, donde est�s a salvo. (intro)");
		if (jugador.getProgreso() == 2) {
			System.out.println("Miras el m�vil. Es la una de la ma�ana.(intro)");
			teclado.nextLine();
			System.out.println("Cual es tu siguiente acci�n?(intro)");
			teclado.nextLine();
			System.out.println("1 Tienes mucha hambre y vas a hacerte la comida");
			System.out.println("2 Pides la comida de un restaurante de comida rapida y te tumbas en el sof� a descansar");
			System.out.println("3 Vas a dormir a tu habitaci�n, estas cansado y dolorido. Ya pedir�s la comida despu�s.");
			accion = teclado.nextInt();
		}
		else {
			System.out.println("Buscas tu m�vil antiguo en los cajones, y lo encuentras. Deber�as usarlo para denunciar el robo, aunque te amenazara. (intro)");
			teclado.nextLine();
			System.out.println("Quieres hacerlo? 1 Si, 2 No");
			int denunciaArriesgada = teclado.nextInt();
			switch (denunciaArriesgada) {
			case 1:
				System.out.println("-Conectas el m�vil a cargar. Es un cacharro viejo y le costar� un rato encenderse. (intro)");
				teclado.nextLine();
				break;
			case 2:
				System.out.println("Cedes ante el miedo por las represalias, ya ir�s a por un m�vil nuevo. (intro)");
				break;
			}
		}
		
	}
}
