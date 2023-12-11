package practicas;

public class holamundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena = "hola mundo";
		for (int i = 0; i < cadena.length(); i++) {

			if (i % 2 == 0) {
				imprime(cadena.toUpperCase(),i);
			} else {
				imprime(cadena , i);
			}
		}
	}

	public static void imprime(String cadena, int indice) {
		System.out.println(cadena.charAt(indice));
	}
}
