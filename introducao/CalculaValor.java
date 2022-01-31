/*
 +
 -
 /
 *
 %
 */


package introducao;

import java.util.Scanner;

public class CalculaValor {

	public static void main(String[] args) {
		int n1, n2, media;
		Scanner calc = new Scanner(System.in);
		
		System.out.println("Digite um numero:");
		n1=calc.nextInt();
		
		System.out.println("Digite outro numero:");
		n2=calc.nextInt();
		
		media=(n1+n2)/2;
		
		System.out.println("A média é: "+ media);
		calc.close();
	}

}
