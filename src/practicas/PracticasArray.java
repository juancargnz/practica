package practicas;

import java.util.Scanner;
import java.util.Random;

public class PracticasArray {
	public static void main(String[] args) {
		// tamaño
		int tam;
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce el tamaño del array");
		tam = teclado.nextInt();
		int[] cesur;
		cesur = new int[tam];
		System.out.println("Introduce el rango de valores,introduce el min:");
		int min;
		int max;
		Random aleatorio = new Random();
		min = teclado.nextInt();
		System.out.println("Introduce el rango de valores,introduce el max");
		max = teclado.nextInt();
		for (int i = 0; i < cesur.length; i++) {
			cesur[i] = aleatorio.nextInt(min, max);
		}
		System.out.println("Rango");
		for (int i = 0; i < cesur.length; i++) {
			System.out.print(cesur[i] + " ");
		}
		int contadorpares = 0;
		int contadorimpares = 0;
		for (int i = 0; i < cesur.length; i++) {
			if (cesur[i] % 2 == 0) {
				contadorpares = contadorpares + 1;
			} else {
				contadorimpares++;
			}
		}
		int[] arraypar;
		arraypar = new int[contadorpares];
		int[] arrayimpar;
		arrayimpar = new int[contadorimpares];
		int j = 0;
		int k = 0;
		for (int i = 0; i < cesur.length; i++) {
			if (cesur[i] % 2 == 0) {
				arraypar[j] = cesur[i];
				j++;
			} else {
				arrayimpar[k] = cesur[i];
				k++;
			}
		}

	}
	

}
