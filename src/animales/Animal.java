package animales;

import java.io.Serializable;

public class Animal implements Serializable {
	//atributos
	private String nombre;
	private int tpvida;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTpvida() {
		return tpvida;
	}

	public void setTpvida(int tpvida) {
		this.tpvida = tpvida;
	}

	public Animal(String nombre, int tpvida) {
		this.nombre = nombre;
		if ((tpvida > 0) && (tpvida < 150)) {
			this.tpvida = tpvida;
		} else {
			this.tpvida = 0;
		}

	}
}
