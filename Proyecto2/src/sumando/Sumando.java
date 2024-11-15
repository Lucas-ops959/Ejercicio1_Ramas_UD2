package sumando;

import java.util.Scanner;

public class Sumando {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Dame un numero");
		int numero1=sc.nextInt();
		System.out.println("Dame otro numero");
		int numero2=sc.nextInt();
		System.out.println("Tu numero sumado es: "+(numero1 +numero2));
		sc.close();
	}

}
