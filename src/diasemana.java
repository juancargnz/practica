import java.util.Scanner;
public class diasemana {
	public static void main(String[] args) {
		
		int diasemana = 1;
		int semana=0;
		int mes=1;
		Scanner teclado;
		teclado=new Scanner(System.in);
		int totaldias=0;
		do {
			System.out.print("introduzca un numero ");
			totaldias = teclado.nextInt();
		} while (1>366);
		while (mes<13) { 
			if (mes==1) {
				System.out.print("Enero"+(" "));
			}else if (mes==2){
				System.out.print("Febrero"+(" "));
			}else if(mes==3){
				System.out.print("Marzo"+(" "));
			}else if(mes==4) {
				System.out.print("Abril"+(" "));
			}else if(mes==5) {
				System.out.print("Mayo"+(" "));
			}else if (mes==6){
				System.out.print("Junio"+(" "));
			}else if(mes==7){
				System.out.print("Julio"+(" "));
			}else if(mes==8) {
				System.out.print("Agosto"+(" "));
			}else if(mes==9) {
				System.out.print("Septiembre"+(" "));
			}else if (mes==10){
				System.out.print("Octubre"+(" "));
			}else if(mes==11){
				System.out.print("Noviembre"+(" "));
			}else if(mes==12) {
				System.out.print("Diciembre"+(" "));
			}
			
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
