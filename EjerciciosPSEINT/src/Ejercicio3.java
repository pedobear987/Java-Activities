import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int primo = 0, si=0, cuenta;
		System.out.println("Introduce un numero entre 1 y 100: ");
		Scanner in= new Scanner(System.in);
		int n=in.nextInt();
		for (int i=0; i<=n; i++) {
			for (int a=1;i>=a;a++) {
				cuenta=a%i;
				if (cuenta==0) {
					primo++;
				}
			}
			if (primo>=2) {
				si++;
			}
			primo=0;
		}
		System.out.println("Existen: "+si+" "+"Numeros primos");
	}

}
