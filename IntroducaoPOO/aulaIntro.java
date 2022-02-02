package IntroducaoPOO;

import java.util.Scanner;

public class aulaIntro {

	public static void main(String[] args) {

		int x;
		String m="rosa";
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a carga: ");
		x=ler.nextInt();
				
		Caneta c1 = new Caneta(x,m);	
		
		x=c1.getCarga();
		System.out.println("A carga esta em "+x);
		
		c1.setCarga(30);
		
		System.out.println("A carga foi alterada para "+c1.getCarga());
		System.out.println("A cor e "+c1.getCor());
	}

}
