package practicas;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejemplofichero4 {

	public static void main(String[] args) throws IOException {

		FileReader entrada = null;
		/*
		 * 
		 * try { entrada=new FileReader("etcs.txt"); char caracter; caracter=(char)
		 * entrada.read();
		 * 
		 * while(caracter!=(char)-1){ System.out.print(caracter); caracter=(char)
		 * entrada.read(); }
		 * 
		 * } catch (FileNotFoundException e) { // TODO Auto-generated catch block
		 * System.out.println(e.getMessage()); }finally { if(entrada!= null){
		 * entrada.close(); } }
		 */
		// cuantas lineas por pantalla y sacar el numero de lineas que queremos.

		entrada = null;
		int contador;
		int lineas;
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce el numero de lineas a mostrar");
		lineas = teclado.nextInt();
		try {

			entrada = new FileReader("etcs.txt");
			char caracter;
			caracter = (char) entrada.read();

			while ((caracter != (char) -1) && (lineas > 0)) {
				if (caracter == '\n') {
					lineas--;
				}
				System.out.print(caracter);
				caracter = (char) entrada.read();

			}

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			if (entrada != null) {
				entrada.close();
			}
		}
	}
}
