package practicas;
import java.util.Scanner;
public class main {
	 public static void main(String[] args) {
	        Scanner teclado = new Scanner(System.in);

	        System.out.println("Ingrese la cantidad de palabras:");
	        int guardado2 = teclado.nextInt();

	        String[] array2 = new String[guardado2];

	        for (int juanca2 = 0; juanca2 < array2.length; juanca2++) {
	            System.out.println("Ingrese la palabra " + (juanca2 + 1) + ":");
	            array2[juanca2] = teclado.next();
	        }

	        // Mostrar las palabras ingresadas
	        System.out.println("Palabras ingresadas:");
	        for (int juanca2 = 0; juanca2 < array2.length; juanca2++) {
	            System.out.println(array2[juanca2]);
	        }
	    }
}
