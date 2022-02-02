/*
caracteristicas -> atributos
comportamentos -> metodos
 */

package IntroducaoPOO;

public class Caneta {
	
	//ATRIBUTOS
	private String cor;
	private float ponta;
	private int carga;
	public boolean tampada;
	
	
	//metodo construtor
	public Caneta(int valor, String v)
	{
		this.tampada=true;
		this.carga=valor;
		this.cor=v;
		this.ponta=0.5f;
	}
	
	
	//METODOS
	public void tampar()
	{
		this.tampada=true;
	}
	
	public void destampar()
	{
		this.tampada=false;
	}
	
	public void escrever()
	{
		if(this.tampada==true)
			System.out.println("ERRO!!! Caneta esta tampada");
		else
			System.out.println("Escrevendo...");
	}
	
	public void status() {
		System.out.println("A cor da caneta é: "+this.cor);
		System.out.println("A ponta é: "+this.ponta);
		System.out.println("Esta tampdada? "+this.tampada);
		System.out.println("A carga esta em "+this.carga+"%");
	}


	public int getCarga() {
		return carga;
	}


	public void setCarga(int carga) {
		this.carga = carga;
	}


	public String getCor() {
		return cor;
	}


	public void setPonta(float ponta) {
		this.ponta = ponta;
	}
	
	
	
}
