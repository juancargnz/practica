package animales;

public class mamifero extends animal {
	private boolean vellocorporal;

	public mamifero(String nombre, int tpvida, boolean vellocorporal) {
		super(nombre, tpvida);
		this.vellocorporal = vellocorporal;
	}

	public boolean isVellocorporal() {
		return vellocorporal;
	}

	public void setVellocorporal(boolean vellocorporal) {
		this.vellocorporal = vellocorporal;
	}
	
	
	
	
}
