// while -> enquanto

package Repeticao;

import java.util.Scanner;

public class ExemploWhile {

	public static void main(String[] args) {
		int n1, n2;
		Scanner leia = new Scanner(System.in);
		System.out.print("Digite o numero que sera dividido: ");
		n1=leia.nextInt();
		System.out.print("Digite o dumero divisor: ");
		n2=leia.nextInt();
		while(n2!=0)
		{
			System.out.println("A divisão é "+n1/n2);
			System.out.print("Digite o numero que sera dividido: ");
			n1=leia.nextInt();
			System.out.print("Digite o dumero divisor: ");
			n2=leia.nextInt();
		}
		System.out.println("Não é possível dividir por zero");
	}

}
