package VetorEMatriz;

import java.util.Scanner;

public class ExemploMatriz {

	public static void main(String[] args) 
	{
				
		int mat[][]= {{1,2,3},{4,5,6}};
	
		int mat2[][] = new int[2][3];
		
		Scanner ler = new Scanner(System.in);
	
		for(int linha=0;linha<2;linha++)
		{
			for(int coluna=0;coluna<3;coluna++)
			{
				System.out.println("digit um numero");
				mat2[linha][coluna]=ler.nextInt();
			}
		}
		
		for(int x=0;x<2;x++)
		{
			for(int y=0;y<3;y++)
			{
				System.out.print(mat[x][y]+"\t");
			}
			System.out.println("\n");
		}
		for(int x=0;x<2;x++)
		{
			for(int y=0;y<3;y++)
			{
				System.out.print(mat2[x][y]+"\t");
			}
			System.out.println("\n");
		}
	}

}
