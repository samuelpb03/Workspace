package main;

import objetos.Categoria;
import objetos.Producto;
import carrito.Carrito;
import java.util.Scanner;
import java.util.ArrayList;

public class MainTienda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int decision = 0;
		Scanner teclado = new Scanner(System.in);
		Categoria electronica = new Categoria(1, "Electronica");
		Categoria alimentacion = new Categoria(2, "Alimentacion");

		ArrayList<Producto> productos = new ArrayList<Producto>();
		Producto producto1 = new Producto(10, "Lenovo Portatil", 1000, electronica, true);
		Producto producto2 = new Producto(11, "Lenovo Portatil", 1000, electronica, true);
		Producto producto3 = new Producto(12, "Lenovo Portatil", 1000, electronica, true);
		Producto producto4 = new Producto(13, "Lenovo Portatil", 1000, electronica, true);
		Producto producto5 = new Producto(14, "Magdalena", 2, alimentacion, true);

		productos.add(producto1);
		productos.add(producto2);
		productos.add(producto3);
		productos.add(producto4);
		productos.add(producto5);

		Carrito carrito1 = new Carrito();
		while (decision != 6) {
			System.out.println(
				"Bienvenido/a a tiendas Casi33, que desea hacer? 1.Mostrar productos 2.Añadir productos al carrito 3.Mostrar productos del carrito 4.Eliminar productos del carrito"
				+ " 5.Precio total del carrito");
		decision = teclado.nextInt();
		teclado.nextLine();
		switch (decision) {
		case 1:
			int subDecision;
			System.out.println("Como desea mostrar los productos? 1.Mostrar todo 2.Seleccionar categoría");
			subDecision = teclado.nextInt();
			teclado.nextLine();
			if (subDecision == 1) {
				for (int i = 0; i < productos.size(); i++) {
					System.out.println(productos.get(i).getId() + " " + productos.get(i).getNombre());
				}
			} else {
				@SuppressWarnings("unused")
				int categoriaIntroducida;
				System.out.println("Introduce el ID de la categoría que quieres mostrar");
				categoriaIntroducida = teclado.nextInt();
				teclado.nextLine();
			}
			break;
		case 2:
			int productoAnyadido;
			Producto productoAnyadir;
			System.out.println("Introduce el ID del producto que desea añadir");
			productoAnyadido = teclado.nextInt();
			teclado.nextLine();
			for (int i = 0; i < productos.size(); i++) {
				if (productoAnyadido == productos.get(i).getId()) {
					productoAnyadir = productos.get(i);
					carrito1.anyadirProductoAlCarrito(productoAnyadir);
				}
			}
			break;
		case 3:
			carrito1.mostrarProductos();
			break;
		case 5:
			carrito1.sumarCarrito();
			}
		}
		
		}

		/**
		 * for (int i = 0; i < productos.size(); i++) {
		 * System.out.println(productos.get(i).getId()); } private int id; private
		 * String nombre; private double precio; private Categoria categoria; private
		 * boolean enStock;
		 **/
	}


