import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pepe="nada";
		System.out.println("Escribe una serie de 4 numeros:");
		Scanner in= new Scanner(System.in);
		pepe=in.nextLine();
		 String[] separa = pepe.split("");   
	        for (int i = 0; i < separa.length; i++)    {     
	            System.out.println(separa[i]);   
	        } 
	}
}
