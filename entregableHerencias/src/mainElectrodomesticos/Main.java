package mainElectrodomesticos;

import objetos.Electrodomestico;
import objetos.Lavadora;
import objetos.Television;

import java.util.ArrayList;
import java.util.Collection;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double precioLavadoras = 0;
		double precioTelevisores = 0;
		double precioTotal = 0;
		ArrayList<Electrodomestico> electro = new ArrayList<Electrodomestico>(); 
		
		
		
		Electrodomestico [] e = new Electrodomestico[5];
		Electrodomestico el = new Electrodomestico();
		electro.lastIndexOf(el);
		System.out.println(electro.size());
		e[0] = new Lavadora(100, "Gris", 'f', 50, 31);
		e[1] = new Television(100, "negro" ,10 ,'a' , 41, true);
		e[2] = new Lavadora(100, "Rojo", 'b', 80, 20);
		e[3] = new Television(100, "azul" ,20 ,'c' , 39, false);
		e[4] = new Lavadora(100, "verde", 'h', 80, 20);
		Lavadora lavadora1 = (Lavadora)e[0];
		Television tele1 = (Television)e[1];
		Lavadora lavadora2 = (Lavadora)e[2];
		Television tele2 = (Television)e[3];
		Lavadora lavadora3 = (Lavadora)e[4];
		
		electro.add(el);
		
		lavadora1.precioFinal(lavadora1);
		lavadora2.precioFinal(lavadora2);
		lavadora3.precioFinal(lavadora3);
		tele1.precioFinal(tele1);
		tele2.precioFinal(tele2);
		
		for (int i = 0; i < e.length; i++) {
			
			
			if (e[i] instanceof Lavadora) {
				precioLavadoras = precioLavadoras + e[i].getPrecio();
			}
			if (e[i] instanceof Television) {
				precioTelevisores = precioTelevisores + e[i].getPrecio();
			}
			precioTotal = precioTotal + e[i].getPrecio();
		}
		
		System.out.println("El precio de las lavadoras es " + precioLavadoras);
		System.out.println("El precio de las lavadoras es " + precioTelevisores);
		System.out.println("El precio total es " + precioTotal);
	}

}
