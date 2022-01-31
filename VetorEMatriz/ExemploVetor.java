package VetorEMatriz;

import java.util.Scanner;

public class ExemploVetor {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[]vet= {1,2,3,4,5};
		/*int maior=0;
		
		
		for(int x=0;x<5;x++)
		{	
			System.out.println("digite um numero");
			vet[x]=ler.nextInt();	
			if(vet[x]>maior)
				maior=vet[x];
		}
		
		System.out.println("O maior valor digitado é: "+ maior);
		*/
		for(int x=0;x<5;x++)
			System.out.println(vet[x]);
	}

}
