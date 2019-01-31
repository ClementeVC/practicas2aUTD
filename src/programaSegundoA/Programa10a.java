package programaSegundoA;
	import java.util.Scanner;
	import java.text.DecimalFormat;
public class Programa10a {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner l = new Scanner(System.in);
		DecimalFormat f = new DecimalFormat("###,###.##");
		double p, t=0;
		int n,m=1;
		System.out.print("Cuantos productos seran?");
		n= l.nextInt();
		
		do{
			System.out.println("Precio del producto "+m);
			p=l.nextDouble();
			t+=p;
			m++;
		}while(m<=n);
		
		if(t>=1500){
			t*=1.11;
		}
		else{
			t*=1.1;
		}
		
		System.out.print("Total : $"+f.format(t));
	}
}
