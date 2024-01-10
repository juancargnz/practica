package animales;

public class usoAnimales {

	public static void main(String[]args) {
		
		mamifero perro=new mamifero("perro",15,true);
		insecto hormiga= new insecto("hormiga",1,false,true,"oso hormiguero");
		System.out.println("El animal: "+hormiga.getNombre()+ " tiene alas?:"+ hormiga.isAlas());
		System.out.println( hormiga.getNombre()+ " tiene de enemigo a: "+hormiga.getEnemigo().getNombre());
		
	}
	
	
	
	
	
}
