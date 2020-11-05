import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float not1, not2, not3, not4, not5, not6;
		System.out.println("Introduce la nota de Programacion:");
		Scanner in = new Scanner(System.in);
		not1 = in.nextInt();
		System.out.println("Introduce la nota de Lenguaje de Marcas:");
		not2 = in.nextInt();
		System.out.println("Introduce la nota de Base de Datos:");
		not3 = in.nextInt();
		System.out.println("Introduce la nota de Entornos de Desarrollo:");
		not4 = in.nextInt();
		System.out.println("Introduce la nota de Sistemas informaticos:");
		not5 = in.nextInt();
		System.out.println("Introduce la nota de FOL:");
		not6 = in.nextInt();
		not1 = (not1 + not2 + not3 + not4 + not5 + not6) / 6;
		System.out.println("La media es de: " + not1);
	}

}
