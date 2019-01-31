package programaSegundoA;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Programa10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner l = new Scanner(System.in);
				DecimalFormat f = new DecimalFormat("###,###.##");
				double p1,p2,p3, t=0;
				
					System.out.println("Precio del producto 1");
					p1=l.nextDouble();
					System.out.println("Precio del producto 2");
					p2=l.nextDouble();
					System.out.println("Precio del producto 3");
					p3=l.nextDouble();
					
					t=p1+p2+p3;
				
				if(t>=1500){
					t*=1.11;
				}
				else{
					t*=1.1;
				}
				
				System.out.print("Total : $"+f.format(t));
	}

}
