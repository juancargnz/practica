package practicas;
import java.util.Scanner;

public class Cadena {
	static final int CANTIDAD = 10;
	static String[] cadena = new String[CANTIDAD];

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i < CANTIDAD; i++) {
			System.out.print("Introduzca una frase para la posicion " + i + ": ");
			setValue(cadena, i, teclado.nextLine());
		}
		
		for(int i=0;i<CANTIDAD;i++ ) {
		System.out.println(getValue(cadena,i));
		}
		
		
		
		
		teclado.close();
	}

	static String getValue(String[] cadena, int posicion) {
		return cadena[posicion];

	}

	String getValue(int posicion) {
		return cadena[posicion];

	}

	static void setValue(String[] cadenas, int posicion, String nuevaCadena) {
		cadenas[posicion] = nuevaCadena;
	}

	void setValue(int posicion, String nuevaCadena) {
		cadena[posicion] = nuevaCadena;
	}

}
