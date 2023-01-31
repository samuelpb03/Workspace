package concesionario;

public class ModeloCoche {
	private String nombre;
	private int cilindrada;
	private boolean esRapido;
	private int precio;
	private int trenMotriz;
	private int potencia;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public boolean isEsRapido() {
		return esRapido;
	}

	public void setEsRapido(boolean esRapido) {
		this.esRapido = esRapido;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getTrenMotriz() {
		return trenMotriz;
	}

	public void setTrenMotriz(int trenMotriz) {
		this.trenMotriz = trenMotriz;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public ModeloCoche(String nombre, int cilindrada, boolean esRapido, int precio, int trenMotriz, int potencia) {
		this.nombre = nombre;
		this.cilindrada = cilindrada;
		this.esRapido = esRapido;
		this.precio = precio;
		this.trenMotriz = trenMotriz;
		this.potencia = potencia;
	}

	public ModeloCoche() {

	}

	public static void descripcionModelo(ModeloCoche modelo) {
		System.out.println("Este modelo tiene " + modelo.cilindrada + " CC.");
		modelo.esRapido = false;
		if (modelo.potencia > 230) {
			if (modelo.trenMotriz == 2 | modelo.trenMotriz == 3) {
				modelo.esRapido = true;
			} else {
				if (modelo.potencia > 250) {
					modelo.esRapido = true;
				}
			}
		}
		if (modelo.esRapido == true) {
			System.out.println("Es un coche de rendimiento, ");
			if (modelo.precio >= 65000) {
				System.out.println("de muy alta gama, te sentirás como un magnate a bordo de un yate.");
			}
			if (modelo.precio == 48000 | modelo.precio < 65000) {
				System.out.println("de alta gama, tendrás una experiencia increíble");
			}
			if (modelo.precio < 48000) {
				System.out.println(" pero no tendrás que dejarte el precio de una casa.");
				System.out.println("Con el " + modelo.nombre + " estarás más que satisfecho.");
			}
		}
		else {
			if (modelo.precio > 50.000) {
				System.out.println("Es un vehiculo con todos los lujos. No estarás decepcionado con el " + modelo.nombre);
			}
		}
	}
}
