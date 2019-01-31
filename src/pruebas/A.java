package pruebas;
	import java.util.Scanner;
public class A {
	
	public static void main(String[] args) {
		// piedra, papel o tigera
		System.out.println("Escoja una opción.");
		System.out.println("1.-Piedra");
		System.out.println("2.-Papel");
		System.out.println("3.-Tijera");
		Scanner l = new Scanner(System.in);
		byte n = l.nextByte();
		
		switch (n){
			case 1:
				System.out.println("El oponente escoje tijeras.");
				System.out.println("Ganaste.");
				break;
			case 2:
				System.out.println("El oponente escoje piedra.");
				System.out.println("Ganaste.");
				break;
			case 3:
				System.out.println("El oponente escoje papel.");
				System.out.println("Ganaste.");
				break;
			default:
				System.out.print("opción invalida.");
		}
	}

}
