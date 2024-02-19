package practicas;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class EjemploFichero {

	public static void main(String[] args) throws IOException {
		// trabajar con caracteres.
		// lectura de un fichero.
		// escritura de un fichero.
		// escritura de un fichero al final del mismo.

		// flujo de lectura
		FileReader entrada = null;
		char caracter;

		try {
			entrada = new FileReader("etcs.txt");
			caracter = (char) entrada.read();
			while (caracter != (char) -1) {
				System.out.print(caracter);
				caracter = (char) entrada.read();
			}
			System.out.println();

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			if (entrada != null) {
				entrada.close();
			}
		} // fin try catch

		String frase = "esto es una prueba de escritura en fichero";
		char[] fraseArray = new char[frase.length()];
		for (int i = 0; i < frase.length(); i++) {
			fraseArray[i] = frase.charAt(i);
		}

		FileOutputStream salida = null;
		try {
			salida = new FileOutputStream("etcs.txt",true);
			for (int i = 0; i < fraseArray.length; i++) {
				salida.write(fraseArray[i]);
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			if (salida != null) {
				salida.close();
			}
		}

		// pedir por pantalla frase(listo)y almacenarla en un string,(listo)// pasas el
		// string a un array de caracteres (listo) y almacenas el array de caracteres en
		// el mismo fichero//

		String frases;
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce una frase");
		frases = teclado.nextLine();
		char[] frasesArray = new char[frases.length()];
		for (int i = 0; i < frasesArray.length; i++) {
			frasesArray[i] = frases.charAt(i);
		}
		
		FileOutputStream salida1 = null;
		try {
			
			salida1 = new FileOutputStream("etcs.txt",true);
			
			do {
				salida1.write('\n');
				for (int i = 0; i < frasesArray.length; i++) {
					salida1.write(frasesArray[i]);
				}
				salida1.write('\n');
			} while (frases.equals("Q"));
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			if (salida1 != null) {
				salida1.close();
			}
		}
		

	}
}