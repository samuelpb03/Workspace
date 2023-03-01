package main;

import objetos.Coche;
import objetos.Moto;
import objetos.Vehiculo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int precio;
		String color;
		int peso;
		int potencia;
		int puertas;
		int combustible;
		int trenMotriz;
		Scanner teclado = new Scanner(System.in);
		// TODO Auto-generated method stub
		Vehiculo [] vehiculo1 = new Vehiculo[5];
		vehiculo1 [0] = new Coche(2, 2, 2, "Rojo", 20000, 100, 1400);
		vehiculo1 [1] = new Coche(4, 1, 4, "Verde", 30000, 125, 1560);
		vehiculo1 [2] = new Coche(2, 2, 4, "Blanco", 40000, 300, 1560);
		vehiculo1 [3] = new Coche(5, 1, 2, "Azul", 18000, 100, 1490);
		vehiculo1 [4] = new Moto("Rojo", 3000, 1000, 'A', 70, 200);
		System.out.println(vehiculo1[0].getColor());
		
		for (int i = 0; i < vehiculo1.length; i++) {
			if ( vehiculo1[i] instanceof Coche) {
				Coche coche1 = (Coche) vehiculo1[i];
				System.out.println("El vehiculo " + (i+1) + " es un coche con " + coche1.getPuertas());
				
			}
			if (vehiculo1[i] instanceof Moto) {
				Moto moto1 = (Moto) vehiculo1[i];
				System.out.println("El vehiculo " + (i+1) + " es una moto de " + moto1.getCilindrada() + " CC");
			}
			vehiculo1[i].Sonido();
		}
		System.out.println("Introduce el color del coche");
		color = teclado.nextLine();
		System.out.println("Introduce el precio del coche");
		precio = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Introduce el peso del coche");
		peso = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Introduce la potencia del coche");
		potencia =teclado.nextInt();
		teclado.nextLine();
		System.out.println("Introduce las puertas del coche");
		puertas = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Introduce el combustible del coche: 1 Diesel, 2 Gasolina");
		combustible = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Introduce el tren motriz del coche: 1 Delantera, 2 Trasera, 3 Total");
		trenMotriz = teclado.nextInt();
		teclado.nextLine();
		teclado.close();
		
		Vehiculo cocheUsuario = new Coche(puertas, combustible, trenMotriz, color, precio, potencia, peso);
		Coche cocheU = (Coche) cocheUsuario;
		cocheU.Valorar(cocheU);
		//int puertas, int combustible, int trenMotriz, String color, int precio, int potencia, int peso
	}

}
