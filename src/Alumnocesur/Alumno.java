package Alumnocesur;

class Alumno extends Persona {
	
	private String curso;

	public Alumno(String nombre, int edad,String curso) {
		super(nombre, edad);
		this.curso = curso;
	}


	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public String toString() {
		return "[Alumno:" + super.getNombre() + " edad" + super.getEdad() + " curso" + curso + "]";
	}

}