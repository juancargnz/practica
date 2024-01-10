package Alumnocesur;

import practicas.Creator;
import java.util.Random;

public class Alumnocesur {

	public static void main(String[] args) {
		String nombreClaseTemp;
		CentroEstudio cesurEste=new CentroEstudio("Cesur el palo",5,4);
		Clase claseTemp;
		Random aleatorio=new Random();	
		
	for(int i=0;i<5;i++) {
		nombreClaseTemp=Creator.newName();
		
		claseTemp= new Clase(nombreClaseTemp);
		
		claseTemp.setProfesor(new Profesor(
			Creator.newName(),
			Creator.newAge(),
			nombreClaseTemp));
		
		for(int i=0;x<15;x++) {
			claseTemp.addAlumno(new Alumno(Creator.newName(),Creator.newAge(),nombreClaseTemp));
		 }
		cesurEste.getClases()[i]=claseTemp;
	}
	for(int i=0;i<4;i++) {
		administrativoTemp=new Administrativo(Creator.newName(),)
	}
	

	}
}

	


