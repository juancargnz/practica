package practicas;

import animales.Animal;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Ejemplosficheros2 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Animal perro = new Animal("perro", 13);
		Animal gato = new Animal("gato", 34);
		Animal pajaro = new Animal("pajaro", 23);
		Animal pez = new Animal("pez", 45);
		ObjectOutputStream salida = null;

		try {
			salida = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("ficheroObjeto.txt")));
			salida.writeObject(perro);
			salida.writeObject(gato);
			salida.writeObject(pajaro);
			salida.writeObject(pez);

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			if (salida != null)
				salida.close();

		}
		ObjectInputStream entrada = null;
		Animal generico = null;
		int contador = 0;
		try {
			entrada = new ObjectInputStream(new BufferedInputStream(new FileInputStream("ficheroObjeto.txt")));
			// leer y almacenar todos los animales que hay en un fichero.
			generico = (Animal) entrada.readObject();
			while (generico != null) {
				contador++;
				generico = (Animal) entrada.readObject();
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (EOFException e) {

		} finally {
			if (salida != null)
				salida.close();

		}
		System.out.println(contador);
		Animal[] animales = new Animal[contador];
		try {
			entrada = new ObjectInputStream(new BufferedInputStream(new FileInputStream("ficheroObjeto.txt")));
			// leer y almacenar todos los animales que hay en un fichero.
			for (int i = 0; i < animales.length; i++) {

				animales[i] = (Animal) entrada.readObject();
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			if (salida != null)
				salida.close();

		}
		for (int i = 0; i < animales.length; i++) {
			System.out.println(animales[i].getNombre());
		}
	}
}
