package Heranca;

public class Gen {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Participante p2 = new Participante();
		Professor p3 = new Professor();
		
		p1.setNome("Philadelpho");
		p1.setIdade(76);
		
		p2.setNome("Antonio");
		p2.setIdade(26);
		p2.aniversario();
		
		p2.curso="java";
		System.out.println(p2.curso);
		
		
		System.out.println(p1.getNome()+"\t"+p1.getIdade());
		System.out.println("\n"+p2.getNome()+"\t"+p2.getIdade());
	}

}
