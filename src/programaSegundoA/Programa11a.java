package programaSegundoA;
	import java.util.Scanner;
public class Programa11a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner l = new Scanner(System.in);
		System.out.println("Numero de empleados:");
		int n = l.nextInt();
		int i = 1;
		double s,min=1000000000,max=0,isr,t = 0;
		do{
			System.out.println("ingrese el sueldo del empleado "+i);
			s=l.nextDouble();
			t=t+s;
			
			if(s<min)
			{
				min=s;
			}
			if(s>max)
			{
				max=s;
			}
			
			i++;
		}while(i<=n);
		isr=t*0.33;
		t=t-isr;
		System.out.println("Nomina: "+t);
		System.out.println("ISR: "+isr);
		System.out.println("máximo: "+max);
		System.out.println("mínimo: "+min);
	}

}
