package programaSegundoA;
	import java.util.Scanner;
public class Programa12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner l = new Scanner(System.in);
		System.out.println("cuantas calificaciones seran?");
		int n = l.nextInt();
		long c;
		
		do{
			System.out.println("inserte calificacion");
			c = l.nextLong();
			
			if(c<50 && c>=0){
				System.out.println("Suspenso");
			}
			else if(c<70 && c>=50){
				System.out.println("Aprobado");
			}
			else if(c<90 && c>=70){
				System.out.println("Notable");
			}
			else if(c<100 && c>=90){
				System.out.println("Sobresalíente");
			}
			else if(c==100){
				System.out.println("Matricula de honor");
			}
			else{
				System.out.println("no cumple con los parametros");
			}
			
			n--;
		}while(n!=0);
	}
}
