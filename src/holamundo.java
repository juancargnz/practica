
public class holamundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena = "hola mundo";
		for (int i = 0; i < cadena.length(); i++) {
			
			if (i % 2 == 0) {
				cadena.toUpperCase();
				System.out.println(cadena.toUpperCase().charAt(i));
			}else {
				cadena=cadena.toLowerCase();
				System.out.println(cadena.charAt(i));
			}
			}
		}
	}

