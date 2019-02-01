package programaSegundoA;
	import java.util.Scanner;
public class Programa12a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner l = new Scanner(System.in);
		int a=0,b=0,c=0;
		char i='S';
		double x=0;
		do{
			System.out.println("venta:");
			x=l.nextDouble();
			
			if(x<=200){
				System.out.println("La venta es menoy o igual a $200");
				a++;
			}
			else if(x>200 && x<400){
				System.out.println("La venta es mayor a $200 pero menor que $400");
				b++;
			}
			else{
				System.out.println("La venta fue mayor de $400");
				c++;
			}
			
			
			System.out.println("hay otra venta?(S/N)");
			i=l.next().charAt(0);
		}while(i!='N');
		System.out.println(a+" fueron menores o iguales a $200");
		System.out.println(b+" fueron mayores a $200 y menores a $400");
		System.out.println(c+" fueron mayores a $400");
		
	}

}
