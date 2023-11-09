
public class diasemana {
	public static void main(String[] args) {
		
		int diasemana = 1;
		int semana=0;
		int mes=1;
		while (mes<13) {
			while (semana < 4) {
				while (diasemana <= 7) {
					if (diasemana == 1) {
						System.out.print("[" + "L" + " ");
					} else if (diasemana == 2) {
						System.out.print("M" + " ");
					}
					if (diasemana == 3) {
						System.out.print("M" + " ");
					} else if (diasemana == 4) {
						System.out.print("J" + " ");
					}
					if (diasemana == 5) {
						System.out.print("V" + " ");
					} else if (diasemana == 6) {
						System.out.print("S" + " ");
					}
					if (diasemana == 7) {
						System.out.print("D" + "]");
					}
					diasemana = diasemana + 1;

				}
				diasemana = 1;
				semana = semana + 1;
			} 
			System.out.println();
			semana=0;
			mes =mes+1;
		}		
	}

}
