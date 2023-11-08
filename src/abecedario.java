
public class abecedario {

	public static void main(String[] args) {
		int contador=97;
		
		while (contador<97+27-1) {
			System.out.print((char)contador + " ");
			
			
			contador=contador+1;
			
		}
		System.out.println();
		contador=97;
		do {
			System.out.print((char)contador + " ");
			contador=contador+1;
		}while(contador<97+27-1);

	}

}
