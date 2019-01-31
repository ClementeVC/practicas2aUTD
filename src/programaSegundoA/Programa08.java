package programaSegundoA;
	import java.util.Scanner;
public class Programa08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner l = new Scanner(System.in);
		System.out.println("Ingrese un numero enntre 1-7");
		byte n = l.nextByte();
		
		switch(n) {
		case 1:
			System.out.print("Lunes");
			break;
		case 2:
			System.out.print("Martes");
			break;
		case 3:
			System.out.print("Miercoles");
			break;
		case 4:
			System.out.print("Jueves");
			break;
		case 5:
			System.out.print("Viernes");
			break;
		case 6:
			System.out.print("Savado");
			break;
		case 7:
			System.out.print("Domingo");
			break;
		default:
			System.out.print("Opcion invalida");
			break;
		
		}
	}

}
