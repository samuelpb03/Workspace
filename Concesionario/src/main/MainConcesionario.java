package main;

import concesionario.MarcaCoche;

import concesionario.ModeloCoche;

import java.util.Scanner;

public class MainConcesionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Código por si hubiera que pasar las marcas introduciendolas como usuario
		 * 
		 */
		// String nombreMarca = "Ford";
		// int antiguedadMarca = 120;
		// String [] nombreModelos = new String[3];
		// boolean motos = true;
		String[] nombreModelos1 = { "Fiesta", "Mustang" };
		String[] nombreModelos5 = { "Quattroporte", "GranTurismo" };

		Scanner teclado = new Scanner(System.in);
		int decision = 0;

		MarcaCoche ford = new MarcaCoche(nombreModelos1, false, 120, "Ford");
		MarcaCoche maseratti = new MarcaCoche(nombreModelos5, false, 70, "Maseratti");
		ModeloCoche fiesta = new ModeloCoche("Fiesta", 1000, false, 15000, 1, 100);
		ModeloCoche mustang = new ModeloCoche("Mustang", 5000, false, 50000, 2, 450);
		ModeloCoche quattroporte = new ModeloCoche("Quattroporte", 4300, false, 100000, 2, 430);
		ModeloCoche granTurismo = new ModeloCoche("GranTurismo", 5200, false, 120000, 2, 460);
		
		System.out.println("Bienvenido a concesionarios Colossus, que desea hacer? (Presione intro)");
		teclado.nextLine();
		do {
			System.out.println("1 Informacion de la marca");
			System.out.println("2 Informacion de un modelo");
			System.out.println("3 Salir");
			;
			decision = teclado.nextInt();
			teclado.nextLine();
			switch (decision) {
			case 1:
				int subDecision;
				System.out.println("De que marca quieres la informacion? (Presione intro)");
				teclado.nextLine();
				System.out.println("1 " + ford.getNombre());
				System.out.println("2 " + maseratti.getNombre());
				subDecision = teclado.nextInt();
				switch (subDecision) {
				case 1:
					MarcaCoche.descripcionMarca(ford);
					break;
				case 2:
					MarcaCoche.descripcionMarca(maseratti);
					break;
				default:
					System.out.println("Adios.");
					decision = 3;
					break;
				}
				break;
			case 2:
				int subDecision2;
				System.out.println("De que modelo quieres la informacion? (Presione intro)");
				System.out.println("1 " + fiesta.getNombre());
				System.out.println("2 " + mustang.getNombre());
				System.out.println("3 " + quattroporte.getNombre());
				System.out.println("4 " + granTurismo.getNombre());
				subDecision2 = teclado.nextInt();
				teclado.nextLine();
				switch (subDecision2) {
				case 1:
					ModeloCoche.descripcionModelo(fiesta);
					break;
				case 2:
					ModeloCoche.descripcionModelo(mustang);
					break;
				case 3:
					ModeloCoche.descripcionModelo(quattroporte);
					break;
				case 4:
					ModeloCoche.descripcionModelo(granTurismo);
					break;
				}

			}
		} while (decision != 3);

	}

}
