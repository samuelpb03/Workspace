package objetos;

public class Coche extends Vehiculo {
	private int puertas;
	private int combustible;
	private int trenMotriz;

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public int getCombustible() {
		return combustible;
	}

	public void setCombustible(int combustible) {
		this.combustible = combustible;
	}

	public int getTrenMotriz() {
		return trenMotriz;
	}

	public void setTrenMotriz(int trenMotriz) {
		this.trenMotriz = trenMotriz;
	}

	public Coche(int puertas, int combustible, int trenMotriz, String color, int precio, int potencia, int peso) {
		super(color, precio, potencia, peso);
		this.puertas = puertas;
		this.combustible = combustible;
		this.trenMotriz = trenMotriz;
	}

	public Coche() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Sonido() {
		System.out.println("*Sonido de coche*");
	}

	public void Valorar(Coche coche) {
		int valoracionCoche = 1;
		double pesoPotencia;
		if (coche.getCombustible() == 1) {
			valoracionCoche++;
			pesoPotencia = ((Vehiculo) coche).getPotencia() / ((Vehiculo)coche).getPeso();
			if ((coche.getPotencia() / coche.getPeso()) > 0.29) {
				valoracionCoche = valoracionCoche + 4;
			}
			if ((coche.getPotencia() / coche.getPeso()) > 0.19 && (coche.getPotencia() / coche.getPeso()) < 0.29) {
				valoracionCoche = valoracionCoche + 3;
			}
			if ((coche.getPotencia() / coche.getPeso()) > 0.1 && (coche.getPotencia() / coche.getPeso()) < 0.19) {
				valoracionCoche = valoracionCoche + 2;
			}
			if (coche.getTrenMotriz() == 1 && coche.getPotencia() > 300) {
				valoracionCoche--;
			}
			if (coche.getTrenMotriz() == 2) {
				if (coche.getPotencia() < 650 && coche.getPotencia() > 200) {
					valoracionCoche = valoracionCoche + 2;
				}
				if (coche.getPotencia() > 650) {
					valoracionCoche++;
				}
			}
			if (coche.getTrenMotriz() == 3) {
				if (coche.getPotencia() > 500) {
					valoracionCoche = valoracionCoche + 2;
				}
				else {
					valoracionCoche++;
				}
			}
		}
		if (coche.getCombustible() == 2) {
			valoracionCoche = valoracionCoche + 2;
		}
		System.out.println("Este coche tiene una valoracion de " + valoracionCoche);
	}

}
