package programaSegundoA;
	import java.util.Scanner;
public class Programa09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte i;
		Scanner l = new Scanner(System.in);
		double in;
		double cm;
		double ft;
		
		System.out.println("Elige una opcion");
		System.out.println("1.in-cm");
		System.out.println("2.ft-cm");
		System.out.println("3.ft-in");
		
		i=l.nextByte();
		
		switch(i)
		{
		case 1:
			System.out.println("ingrese in");
			in =l.nextDouble();
			cm = in*2.54;
			System.out.println("equivale a "+cm+" cm.");
			break;
		case 2:
			System.out.println("ingrese ft");
			ft = l.nextDouble();
			cm = ft*30.48;
			System.out.println("equivale a "+cm+" cm.");
			break;
		case 3:
			System.out.println("ingrese ft");
			ft = l.nextDouble();
			in = ft*12;
			System.out.println("equivale a "+in+" in.");
			break;
		default:
			System.out.println("opcion invalida.");
		}
	}

}
