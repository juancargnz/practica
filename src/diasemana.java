
public class diasemana {
	public static void main(String[] args) {
		System.out.println();
		int diasemana = 1;

		while (diasemana <= 7) {
			if (diasemana==1) {
				System.out.print("[" + "L"+" ");
			} else if (diasemana==2) {
				System.out.print("M"+" ");
			}
			if (diasemana==3) {
				System.out.print("M"+" ");
			} else if(diasemana==4) {
				System.out.print("J"+" ");
			}
			if(diasemana==5) {
				System.out.print("V"+" ");
			} else if(diasemana==6) {
				System.out.print("S"+" ");
			}
			if (diasemana==7) {
				System.out.print("D"+"]");
			}	
			diasemana = diasemana + 1;
		
		}		
	}

}
