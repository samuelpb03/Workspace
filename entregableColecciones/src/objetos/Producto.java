package objetos;

import java.util.ArrayList;

public class Producto {
	private int id;
	private String nombre;
	private double precio;
	private Categoria categoria;
	private boolean enStock;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public boolean isEnStock() {
		return enStock;
	}
	public void setEnStock(boolean enStock) {
		this.enStock = enStock;
	}
	public Producto(int id, String nombre, double precio, Categoria categoria, boolean enStock) {
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.categoria = categoria;
		this.enStock = enStock;
	}
	
}
