package pacote;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero:");
		int a = scan.nextInt();
		System.out.print("Digite o segundo numero:");
		int b = scan.nextInt();
		System.out.print("A soma é " + (a + b));
		
		scan.close();
	}
	
	

}
