package practicas;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Nuevofichero {
	public static void main(String[] args) throws IOException {
		DataOutputStream salida = null;
		try {
			salida = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("fichero.txt")));
			salida.writeChar('a');
			salida.writeBoolean(true);
			salida.writeUTF("Frase en UTF");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			if (salida != null)
				;
			salida.close();
		}

		DataInputStream entrada = null;
		try {
			entrada = new DataInputStream(new BufferedInputStream(new FileInputStream("fichero.txt"))

			);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());

		} finally {
			if (entrada != null)
				;
			salida.close();
		}

	}
}
