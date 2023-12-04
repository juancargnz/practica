
public class valor {
	public static void main(String[] args) {
		String[] cadenaInicial= new String[10];
		for(int i=0; i<3; i++) {
			cadenaInicial[i]="hola";
		}
	listafijacadena cadena1;
	cadena1=new listafijacadena(3,cadenaInicial);
	System.out.println("num elementos:"+cadena1.getNumeroelementos());
	for(int i=0;i<cadena1.getNumeroelementos();i++) {
			System.out.println(cadena1.getArray()[i]);
	}
	}
}

class listafijacadena {
	private int numeroelementos;
	private String[] array=new String[MAXNUM];
	private static final int MAXNUM=10;
	
	
	
	public listafijacadena(int numeroelementos, String[] array) {
		this.numeroelementos = numeroelementos;
		this.array = array;
	}
	public int getNumeroelementos() {
		return numeroelementos;
	}
	public void setNumeroelementos(int numeroelementos) {
		this.numeroelementos = numeroelementos;
	}
	public String[] getArray() {
		return array;
	}
	public void setArray(String[] array) {
		this.array = array;
	}
	public static int getMaxnum() {
		return MAXNUM;
	}













}