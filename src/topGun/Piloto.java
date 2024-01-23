package topGun;

public class Piloto {

	// Atributos
	private int idPiloto;
	private String nomPiloto;
	private int horasVueloPiloto;
	private String rangoPiloto;

	// Constructor
	public Piloto(int nuevoPiloto, String nomPiloto, int horasVueloPiloto, String rangoPiloto) {
		super();
		idPiloto=nuevoPiloto;
		this.nomPiloto=nomPiloto;
		this.horasVueloPiloto=horasVueloPiloto;
		this.rangoPiloto=rangoPiloto;
	}

	// getters y setters
	public void mostrarPiloto() {
		System.out.println("idPiloto: " + idPiloto);
		System.out.println("nomPiloto: " + nomPiloto);
		System.out.println("horasVueloPiloto: " + horasVueloPiloto);
		System.out.println("rangoPiloto: " + rangoPiloto);

	}
	public int getIdPiloto(){
		return idPiloto;
	}
	public void setIdPiloto(int idPiloto){
		this.idPiloto=idPiloto;
	}
	
	public String getNomPiloto() {
		return nomPiloto;
	}
	public void  setNomPiloto(String nomPiloto ) {
		this.nomPiloto=nomPiloto;
	}
	
	public int getHorasVueloPiloto(){
		return horasVueloPiloto;
	}
	public void setHorasVueloPiloto(int horasVueloPiloto) {
		this.horasVueloPiloto=horasVueloPiloto;
	}
	
	public String getRangoPiloto() {
		return rangoPiloto;
	}
	public void setRangoPiloto(String rangoPiloto) {
		this.rangoPiloto=rangoPiloto;
	}
	
	
	
	
	
	

}