package carrito;

import java.util.ArrayList;

import objetos.Producto;


public class Carrito {
	private ArrayList <Producto> productosCarrito = new ArrayList<Producto>();

	public Carrito(ArrayList<Producto> productosCarrito) {
		this.productosCarrito = productosCarrito;
	}

	public Carrito() {
		// TODO Auto-generated constructor stub
	}

	public ArrayList <Producto> getProductos() {
		return productosCarrito;
	}

	public void setProductos(ArrayList <Producto> productos) {
		this.productosCarrito = productos;
	}
	public void anyadirProductoAlCarrito(Producto producto) {
		productosCarrito.add(producto);
	}
	public void eliminarProductoDelCarrito(Producto producto) {
		productosCarrito.remove(producto);
	}
	public void mostrarProductos() {
		for (int i = 0; i < productosCarrito.size(); i++) {
			System.out.println(productosCarrito.get(i).getNombre());
		}
	}
	public void sumarCarrito() {
		double sumaTotal = 0;
		for (int i = 0; i < productosCarrito.size(); i++) {
			sumaTotal = productosCarrito.get(i).getPrecio() + sumaTotal;
			
	}
		System.out.println("El precio total del carrito es " + sumaTotal);
		
	}
}
