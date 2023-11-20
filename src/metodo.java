import java.util.Scanner;

public class metodo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valor;
		int max;
		int min;
		Scanner teclado;
		teclado = new Scanner(System.in);

		do {
			System.out.println("introduce el valor maximo");
			max = teclado.nextInt();
			System.out.println("introduce el valor minimo");
			min = teclado.nextInt();
		} while (!metodo.comprobarMaxMin(max, min));
		do {
			System.out.println("introduce el numero");
			valor = teclado.nextInt();
		} while (!metodo.comprobarValor(max, min, valor));
		
		System.out.println("es cierre del valor  " + valor + "esta entre " + min + " y" + max + " ?");
		System.out.println(metodo.comprobarValor(max, min, valor));
	
	 
	}
	
	static boolean comprobarValor(int max, int min, int valor) {
		if (valor > max) {
			return false;
		} else if (valor < min) {
			return false;
		} else {
			return true;
		}
	}
	
 static boolean comprobarMaxMin(int max,int min) {
	 if (max>min) {
		 return true;
	 }else {
		 return false;
	 }
}

}
