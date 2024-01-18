package practicas;

import java.util.Random;

public class SimuladorLista {

	public static void main(String[] args) {
		MiArray yo = new MiArray(100);
		Random aleatorio = new Random();

		for (int i = 0; i < 100; i = i + 1) {
			yo.insertarValor(aleatorio.nextInt(1000));
		}

		for (int i = 0; i < 10; i = i + 1) {
			System.out.print(yo.getIntMiArray(i) + " ");
		}

		System.out.println();
		int contadorPar = 0;
		for (int i = 0; i < yo.getNumElem(); i = i + 1) {
			if (yo.getIntMiArray(i) % 2 == 0) {

				System.out.print(yo.getIntMiArray(i) + " ");
				contadorPar++;
			}
		}
		System.out.println();
		MiArray arrayPar = new MiArray(contadorPar);
		for (int i = 0; i < yo.getNumElem(); i++) {
			if (yo.getIntMiArray(i) % 2 == 0) {
				arrayPar.insertarValor(yo.getIntMiArray(i));
			}

		}
		for (int i = 0; i < arrayPar.getNumElem(); i++) {
			System.out.print(arrayPar.getIntMiArray(i) + " ");

		}
		System.out.println();

		int contadorImpar = 0;
		for (int i = 0; i < yo.getNumElem(); i++) {
			if (yo.getIntMiArray(i) % 2 != 0) {
				contadorImpar++;
			}
		}
		MiArray arrayImpar = new MiArray(contadorImpar);
		for (int i = 0; i < yo.getNumElem(); i++) {
			if (yo.getIntMiArray(i) % 2 != 0) {

				arrayImpar.insertarValor(yo.getIntMiArray(i));
			}
		}
		
		for (int i = 0; i < arrayImpar.getNumElem(); i++) {
			System.out.print(arrayImpar.getIntMiArray(i) + " ");
		}
		System.out.println();

		for (int i = 0; i < yo.getNumElem(); i = i + 1) {
			if (yo.getIntMiArray(i) % 2 != 0) {
				System.out.print(yo.getIntMiArray(i) + " ");
			}
		}

	}

} // cierra SimuladorLista
	// almacena enteros postivos

class MiArray {
	// atributos
	private int[] miArray;
	private int numElem;
	private static final int lONGITUD_DEFAULT = 10;

	// constructores
	MiArray(int longitud) {
		numElem = 0;
		miArray = new int[longitud];
		for (int i = 0; i < longitud; i = i + 1) {
			miArray[i] = -1;
		}

	}

	MiArray() {
		numElem = 0;
		miArray = new int[lONGITUD_DEFAULT];
		for (int i = 0; i < miArray.length; i = i + 1) {
			miArray[i] = -1;
		}
	}

	// metodos
	public int getNumElem() {
		return numElem;
	}

	public void setNumElem(int numElem) {
		this.numElem = numElem;
	}

	public int[] getMiArray() {
		return miArray;
	}

	public int getIntMiArray(int posicion) {
		if ((posicion < miArray.length) && (posicion >= 0)) {
			return miArray[posicion];
		} else {
			return -1; // en caso de error al meter la posición
		}
	}

	public void resetear() {
		for (int i = 0; i < miArray.length; i++) {
			miArray[i] = -1;
		}
	}

	public void insertarValor(int valor) {
		if (numElem == miArray.length) {
			System.out.println("Array lleno, no se ha insertado elemento");
		} else {
			miArray[numElem] = valor;
			numElem++;
		}
	}

	public int sacarValorUltimo() {
		int temp;
		if (numElem == 0) {
			return -1;
		} else {
			numElem--;
			temp = miArray[numElem];
			miArray[numElem] = -1;
			return temp;

		}
	}

	public int sacarValorPrimero() {
		int temp;
		if (numElem == 0) {
			return -1;
		} else {
			temp = miArray[0];
			// reducir en 1 numElem y meter los valores en la posicion anterior.
			for (int i = 0; i < numElem - 1; i++) {
				miArray[i] = miArray[i + 1];
			}
			miArray[numElem - 1] = -1;
			numElem--;

			return temp;
		}
	}

}
// cierra MiArray
