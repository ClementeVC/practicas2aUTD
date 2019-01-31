package programaSegundoA;
	import java.util.Scanner;
public class Programa10b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner l = new Scanner(System.in);
		int a,b,n;
		a=0;
		n=0;
		System.out.println("ingrese los numeros.");
		do{
			b=l.nextInt();
			a+=b;
			n++;
		}while(b>=0 && b<77);
		a-=b;
		n--;
		a/=n;
		System.out.print("Promedio: "+a);
		
	}

}
