package main;

import java.util.Scanner;

import libros.Libro;

public class MainBiblioteca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion = 0;
		String libroAPedir;
		String libroADevolver;
		String guillermo;
		int contadorImbecil = 0;
		int contadorHistorieta = 0;
		
		Scanner teclado = new Scanner (System.in);
		Libro arrayLibros [] = new Libro[10];
		
		arrayLibros[0] = new Libro(1, "123A", "El tripode humano", "Abraham Lincoln", 1000, 'C', false);
		arrayLibros[1] = new Libro(1, "456A", "El ascenso de Unna Vogordo", "Una wela", 900, 'A', true);
		arrayLibros[2] = new Libro(1, "789A", "Mis pelotas", "Permatrago", 800, 'C', false);
		arrayLibros[3] = new Libro(1, "123B", "Una dos tres, mis huevos del revés", "Antonio Banderas", 10, 'C', true);
		arrayLibros[4] = new Libro(1, "456B", "La que te cuento", "T.Odo Minabo", 10000, 'C', false);
		arrayLibros[5] = new Libro(1, "789B", "5 Dias en Rumania (dia 1)", "Eusebio Lador", 10, 'T', true);
		arrayLibros[6] = new Libro(1, "123C", "5 Dias en Rumania -Dia 1 parte 2 (final)", "Eusebio Lador", 3, 'T', true);
		arrayLibros[7] = new Libro(1, "456C", "Guia para conducir borracho", "P.Pelotas", 100, 'H', true);
		arrayLibros[8] = new Libro(1, "789C", "Guia para jugar al LOL", "G.Racias(T.Hanks)", 2, 'C', false);
		arrayLibros[9] = new Libro(1, "123D", "Como esconder un cadaver III", "Ana Boweles", 17, 'S', true);
		System.out.println("ADVERTENCIA! El humor de este programa podría ofender la sensibilidad de los usuarios.");
		System.out.println("No se busca ofender a ningún publico, solo divertir. Se recomienda discreción");
		System.out.println("Te llamas Guillermo Sanchis? Sí o No.");
		guillermo = teclado.nextLine();
		while (opcion != 6) {
			if (guillermo.equals("si") | guillermo.equals("Si") | guillermo.equals("Sí") | guillermo.equals("sí") | guillermo.equals("Afirmativo")) {
				if (contadorImbecil < 1) {
					System.out.println("Imbécil.");
					contadorImbecil++;
				}
				else {
					System.out.println("Idiota.");
					contadorImbecil--;
				}
				
			}
			if (guillermo.equals("no") | guillermo.equals("No") | guillermo.equals("nO") | guillermo.equals("Negativo") | guillermo.equals("ni de coña") | guillermo.equals("Ni de coña")) {
				System.out.println("No solo no eres Guille, sino que tu cerebro funciona.");
			}
			else {
				System.out.println("A saber lo que has escrito, ni leerlo puedo. En mis tiempos los programas mas avanzados eran calculadoras, y usábamos tarjetas de vacío. De vacío!!");
				System.out.println("Imagina como se quedarían los padres de la informática si vieran donde hemos llegado. Hay IAs que razonan mejor que mis amigos, menudo espectáculo.");
				contadorHistorieta++;
			}
			
			
			System.out.println("Bienvenido a La Segunda mas Gorda, que desea hacer?");
			System.out.println("1 Cual es la primera?");
			System.out.println("2 Consultar libros");
			System.out.println("3 Solicitar prestamo?");
			System.out.println("4 Devolucion");
			System.out.println("5 Recomiendame un libro");
			System.out.println("6 Solo estoy mirando");
			System.out.println("7 ???");
			
			opcion = teclado.nextInt();
			teclado.nextLine();
			
		switch (opcion) {
		case 1:
			System.out.println("Esta.");
			opcion = 0;
			break;
		case 2: 
			Libro.consultarLibros(arrayLibros);
			opcion = 0;
			break;
		case 3:
			System.out.println("Introduce el ISBN del libro que quieres tomar prestado");
			libroAPedir = teclado.nextLine();
			Libro.sacarLibros(arrayLibros, libroAPedir);
			break;
		case 4:
			System.out.println("Introduce el ISBN del libro que quieres devolver");
			libroADevolver = teclado.nextLine();
			Libro.devolverLibros(arrayLibros, libroADevolver);
			break;
		case 5:
			break;
		case 6:
			System.out.println("Pues a mirar al Zara coño");
			break;
		case 7:
			break;
		}
		}
		teclado.close();
		
		
	}

}
