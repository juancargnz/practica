package Alumnocesur;

public class CentroEstudio {
//Atributo
	private String nombre;
	private Clase[] clase;
	private final int MAX_ADMIN;
	private final int MAX_CLASES;
	private Administrativo[] administrativos;

	public CentroEstudio(String nombre,  int mAX_CLASES, int mAX_ADMIN) {
		super();
		this.nombre = nombre;
		MAX_ADMIN = mAX_ADMIN;
		MAX_CLASES = mAX_CLASES;
	}

	public CentroEstudio(String nombre) {
		super();
		this.nombre = nombre;
		MAX_ADMIN=10;
		MAX_CLASES=10;
	}

	private Profesor[] profesor;


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Profesor[] getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor[] profesor) {
		this.profesor = profesor;
	}

	public Administrativo[] getAdministrativos() {
		return administrativos;
	}

	public void setAdministrativos(Administrativo[] administrativos) {
		this.administrativos = administrativos;
	}

	public Clase[] getClase() {
		return clase;
	}

	public void setClase(Clase[] clase) {
		this.clase = clase;
	}

	public int getMAX_ADMIN() {
		return MAX_ADMIN;
	}

	public int getMAX_CLASES() {
		return MAX_CLASES;
	}

}
