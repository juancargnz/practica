package practicas;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class EjemploFicheros2 {
public static void main(String[] args) throws IOException{
	//pedir una frase por pantalla e introducelo en el fichero.
	//Prueba fichero.txt
	//luego mostrar por pantalla el contenido del fichero.
	 String frase;
		Scanner teclado=new Scanner(System.in);
		frase=teclado.nextLine();
	 int[] array=new int[frase.length()];
	 FileOutputStream salida=null;
	 FileInputStream entrada=null;
	System.out.println("frase por pantalla");

	for(int i=0;i<frase.length();i++){
		array[i]=(int) frase.charAt(i);
	}
	
	try {
		salida=new FileOutputStream("etcs.txt");
		for(int i=0;i<array.length;i++) {
			salida.write(array[i]);	
		}
	}catch(IOException e) {
		System.out.println(e.getMessage());
	}finally {
		if(salida!=null) {
			salida.close();
		}
	}
	try {
		entrada=new FileInputStream("etcs.txt");
		int frasee;
		frasee=entrada.read();
		while(frasee!=-1) {
		System.out.print((char)frasee+ " ");
		frasee =entrada.read();
		}
	} catch (Exception e) {
		System.out.println(e.getMessage());
		// TODO Auto-generated catch block
		
	}finally {
		if(entrada!=null) {
			entrada.close();
		}
	}
	
	
}	
}
