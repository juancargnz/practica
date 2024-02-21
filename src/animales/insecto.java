package animales;

public class insecto extends Animal  {

	boolean alas;
	boolean antenas;
	Enemigo enemigo;
	
	public insecto(String nombre,int tpvida,boolean alas, boolean antenas,String enemigo) {
		super(nombre,tpvida);
		this.enemigo=new Enemigo(enemigo);
		this.alas = alas;
		this.antenas = antenas;
	}
	
	
	

	public insecto(String nombre, int tpvida, boolean alas, boolean antenas, Enemigo enemigo) {
		super(nombre, tpvida);
		this.alas = alas;
		this.antenas = antenas;
		this.enemigo = enemigo;
	}




	public Enemigo getEnemigo() {
		return enemigo;
	}




	public void setEnemigo(Enemigo enemigo) {
		this.enemigo = enemigo;
	}




	public boolean isAlas() {
		return alas;
	}

	public void setAlas(boolean alas) {
		this.alas = alas;
	}

	public boolean isAntenas() {
		return antenas;
	}

	public void setAntenas(boolean antenas) {
		this.antenas = antenas;
	}
	
	
	 class Enemigo{
		private String nombre;

		public Enemigo(String nombre) {
			super();
			this.nombre = nombre;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

	
		
		
		
		
	}
	
	
	
}
