package animales;
import java.util.Random;
public class usoAnimales {

	public static void main(String[]args) {
	//CREA ARRAY DE 10 ANIMALES QUE SE LLAME ANIMALES
		Random aleatorio=new Random();
		int[]enteros;
		enteros=new int[10];
		for(int i=0;i<enteros.length;i++) {
			enteros[i]=aleatorio.nextInt(30);
			
		}
			int numero=aleatorio.nextInt(10);
			
			boolean encontrado=false;
			for(int i=0;i<enteros.length;i++) {
				if (enteros[i]==numero);{
				encontrado=true;	
				}
				
			
			System.out.println("encontrado"+ numero +encontrado);
			
		
		
	}
}
}
