package topGun;

public class Avion {
	// Atributos
	private int idAvion;
	private String modAvion;
	private int capAvion;
	private Piloto piloto;

	// Constructor
	public Avion(int idAvion, String modAvion, int capAvion, Piloto piloto) {
		this.idAvion = idAvion;
		this.modAvion = modAvion;
		this.capAvion = capAvion;
		this.piloto = piloto;
	}

	// Getters y Setters
	public void mostrarAvion() {
		System.out.println("idAvion: " + idAvion);
		System.out.println("modAvion: " + modAvion);
		System.out.println("capAvion: " + capAvion);
		System.out.println("piloto:" + piloto);
	}

	public int getIdAvion() {
		return idAvion;
	}

	public void setIdAvion(int idAvion) {
		this.idAvion = idAvion;
	}

	public String getModAvion() {
		return modAvion;
	}

	public void setModAvion(String modAvion) {
		this.modAvion = modAvion;
	}

	public int getCapAvion() {
		return capAvion;
	}

	public void setCapAvion(int capAvion) {
		this.capAvion = capAvion;
	}

	public Piloto getPiloto() {
		return piloto;
	}

	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}

}