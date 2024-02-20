package practicas;

import java.util.Scanner;

public class Clasesparticulares {
	public static void main(String[] args) {
		// numero de palabras a introducir
		System.out.println("introduce el numero de palabras a guardar");

		Scanner teclado = new Scanner(System.in);
		int guardado;
		guardado = teclado.nextInt();
		teclado.nextLine();

		// crea un array de String long=numero introducido
		String[] array;
		array = new String[guardado];
		for (int juanca = 0; juanca < array.length; juanca++) {
			array[juanca] = "hola";
			System.out.println(array[juanca]);
		}
		// pide por pantalla tantas palabras como elementos haya en el array y guardalos
		// en cada posición.
		System.out.println("ingresa tantas palabras como elementos: " + guardado);
		for (int juanca = 0; juanca < array.length; juanca++) {
			array[juanca] = teclado.nextLine();
		}
		for (int juanca = 0; juanca < array.length; juanca++) {
			System.out.println(array[juanca]);
		}

		for (int juanca = array.length - 1; juanca >= 0; juanca--) {
			System.out.println(array[juanca]);

	}
	}
}
