/*
if -> se 
else -> senao
else if -> senao se
*/

package Condicional;

import java.util.Scanner;

public class ExemploIf {

	public static void main(String[] args) {
		int x;
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um numero: ");
		x = ler.nextInt();

		if (x == 5 || x == 7) 
		{
			System.out.println("O valor � 5 ou 7");
		} 
		
		else if (x < 5 && x > 3) 
		{
			System.out.println("O valor esta entre 5 e 3");
		} 
		
		else 
		{
			System.out.println("O valor � maior que 5");
		}
		System.out.println("\nFIM DO PROGRAMA");

	}

}
