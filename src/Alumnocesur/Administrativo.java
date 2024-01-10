package Alumnocesur;

public class Administrativo extends Persona{

	//Atributos
boolean idiomas;
	//Constructor
public Administrativo(String nombre, int edad, boolean idiomas) {
	super(nombre,edad);
	this.idiomas = idiomas;
}
	public Administrativo(String nombre) {
		super(nombre,0);
		this.idiomas = false;
	}
	//Getter y setters

public boolean getIdiomas() {
	return idiomas;
}
public void setIdiomas(boolean idiomas) {
	this.idiomas = idiomas;
}

}
