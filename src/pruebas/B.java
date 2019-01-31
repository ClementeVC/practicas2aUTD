package pruebas;
	import java.util.Scanner;
public class B {

	public static void main(String[] args) {
		// Calculadora
		System.out.println("Qué operacion quiere hacer?");
		/*System.out.println("Sumar (+)");
		System.out.println("Restar (-)");
		System.out.println("Multiplicar (*)");
		System.out.println("Dividir (/)");*/
		Scanner l = new Scanner(System.in);
		
		double a, b, c;
		//System.out.println("Pimer valor:");
		a= l.nextDouble();
		char x = l.next().charAt(0);
		//System.out.println("Segundo valor:");
		b= l.nextDouble();
		c=0;
		switch (x){
			case '+':
				c=a+b;
				System.out.print("El resultado es: "+c);
				break;
			case '-':
				c=a-b;
				System.out.print("El resultado es: "+c);
				break;
			case '*':
				c=a*b;
				System.out.print("El resultado es: "+c);
				break;
			case '/':
				c=a/b;
				System.out.print("El resultado es: "+c);
				break;
			default:
				System.out.print("opción invalida.");
		}

	}

}
