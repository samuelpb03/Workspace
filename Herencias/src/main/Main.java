package main;

import objetos.Coche;
import objetos.Moto;
import objetos.Vehiculo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehiculo [] vehiculo1 = new Vehiculo[5];
		vehiculo1 [0] = new Coche(2, 2, 2, "Rojo", 20000);
		vehiculo1 [1] = new Coche(4, 1, 4, "Verde", 30000);
		vehiculo1 [2] = new Coche(2, 2, 4, "Blanco", 40000);
		vehiculo1 [3] = new Coche(5, 1, 2, "Azul", 18000);
		vehiculo1 [4] = new Moto("Rojo", 3000, 1000, 'A');
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
	}

}
