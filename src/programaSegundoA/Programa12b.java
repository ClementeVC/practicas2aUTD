package programaSegundoA;
	import java.util.Scanner;
public class Programa12b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner le = new Scanner(System.in);
		System.out.println("Cuantos clienter seran?");
		int n = le.nextInt();
		int m = 1;
		int a,b,c=0;
		//b acumulador total
		//c promedio
		int mayor=0,menor=0;
		int t=0,pt=0,tp=0;
		do{
			byte x = 1;
			b=0;
			do{
			
			System.out.println("Consumo del cliente "+m+"en el mes "+x);
			a=le.nextInt();
			b+=a;
			x++;
			}while(x<=12);
			c=b/12;
			if(c>100){
				mayor++;
			}
			else{
				menor++;
			}
			System.out.println("total del cliente: "+b);
			System.out.println("Promedio meses: "+c);
			t+=b;
			tp+=c;
			
			m++;
		}while(m<=n);
		tp/=n;
		pt=t/n;
		System.out.println("Total de minutos: "+t);
		System.out.println("Promedio de los clientes: "+pt);
		System.out.println("Promedio por mes: "+tp);
		System.out.println("mas de 100 minutos al mes: "+mayor);
		System.out.println("menos de 100 minutos al mes: "+menor);
	}

}