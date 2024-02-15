package practicas;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EjemploFicheros {
	
	public static void main (String[] args) throws IOException {
		//leer de un fichero caracter a caracter
		//y lo muestro por pantalla
		FileInputStream entrada=null;
		FileOutputStream salida=null;
		
		
		try {
			entrada=new FileInputStream("etcs.txt");
			int asci;
			asci=entrada.read();
			while(asci!=-1) {
			System.out.print((char)asci+ " ");
			asci =entrada.read();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// TODO Auto-generated catch block
			
		}finally {
			if(entrada!=null) {
				entrada.close();
			}
		}
		try {
			salida=new FileOutputStream("etcs.txt");
			salida.write(72);
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}finally {
			if(salida!=null) {
				salida.close();
			}
		}
		
	}
	

}
