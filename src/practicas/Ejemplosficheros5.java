package practicas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ejemplosficheros5 {
	public static void main(String[] args) throws IOException {
		BufferedReader entrada = null;
		PrintWriter salida = null;
		BufferedWriter salida2 = null;
		FileReader entradaFichero = null;
		try {
			entrada = new BufferedReader(new FileReader("etcs.txt"));
			salida = new PrintWriter(new FileWriter("copiafichero.txt"));
			salida2 = new BufferedWriter(new FileWriter("copiafichero2.txt"));
			String linea;
			int numLinea = 3;
			while (numLinea > 0) {
				linea = entrada.readLine();
				numLinea--;
				salida.println(linea);
				salida2.write(linea);
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			if (entrada != null) {
				entrada.close();
			}

			if (salida != null) {
				salida.close();
			}
			if (salida2 != null) {
				salida2.close();
			}
		}
	}
}
