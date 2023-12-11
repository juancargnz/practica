package Alumnocesur;

public class Alumnocesur {

	public static void main(String[] args) {
		Alumno fran;
		Alumno santi;
		Alumno juanca;
		Alumno alvaro;
		Alumno jain;
		Alumno adrian;
		Alumno ale;
		Alumno simry;
		Alumno joserra;
		Alumno dario;
		Alumno juanan;

		juanca = new Alumno("juanca", 24, "DAM");
		fran = new Alumno("fran", 18, "DAM");
		santi = new Alumno("santi", 24, "DAM");
		alvaro = new Alumno("alvaro", 18, "DAM");
		jain = new Alumno("jain", 24, "DAM");
		adrian = new Alumno("adrian", 27, "DAM");
		ale = new Alumno("ale", 25, "DAM");
		simry = new Alumno("simry", 24, "DAM");
		joserra = new Alumno("josera", 39, "DAM");
		dario = new Alumno("dario", 17, "DAM");
		juanan = new Alumno("juanan", 26, "DAW");

		Clase premiumPlus = new Clase("Premiumplus");
		System.out.println(premiumPlus);

		premiumPlus.add(juanca);
		premiumPlus.add(fran);
		premiumPlus.add(santi);
		premiumPlus.add(alvaro);
		premiumPlus.add(jain);
		premiumPlus.add(adrian);
		premiumPlus.add(ale);
		premiumPlus.add(simry);
		premiumPlus.add(joserra);
		premiumPlus.add(dario);
		premiumPlus.add(juanan);

		for (int i = 0; i < premiumPlus.getNumAlumnos(); i++) {
			if (premiumPlus.getAlumnos()[i].getNombre() == "dario") {
				premiumPlus.getAlumnos()[i].setEdad(18);
				System.out.println(premiumPlus.getAlumnos()[i]);
			}
		}
		for (int i = 0; i < premiumPlus.getNumAlumnos(); i++) {
			if (premiumPlus.getAlumnos()[i].getNombre() == "DAM") {
				premiumPlus.getAlumnos()[i].setEdad(18);
			}
			if (premiumPlus.getAlumnos()[i].getNombre() == "DAW") {
				premiumPlus.getAlumnos()[i].setEdad(18);

			}
			System.out.println(premiumPlus.getAlumnos()[i]);
		}
	}
}
