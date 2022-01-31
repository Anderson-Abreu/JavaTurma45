/*
 * do -> faça
 * while -> enquanto
 */

package Repeticao;

import java.util.Scanner;

public class ExemploDoWhile {

	public static void main(String[] args) {
		int n1, n2;
		Scanner leia = new Scanner(System.in);
		System.out.print("Digite um numero: ");
		n1=leia.nextInt();
		System.out.print("Digite um numero: ");
		n2=leia.nextInt();
		
		do
		{
			System.out.print("A soma é "+ (n1+n2));
			System.out.print("\nDigite um numero: ");
			n1=leia.nextInt();
			System.out.print("\nDigite um numero: ");
			n2=leia.nextInt();
		}while(n1!=-1 );

	}

}
