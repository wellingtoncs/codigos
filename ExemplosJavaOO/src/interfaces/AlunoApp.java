package interfaces;

public class AlunoApp {

	public static void main(String[] args) {
		
		// instancia novo objeto aluno aprovado
		Aluno aluno = new Aluno(33, "Wellington");
		
		//aprovado
		System.out.println("Aluno: "+ aluno.getNome() +" Matricula: " + aluno.getCodigo());
		aluno.calcularMedia(10, 10);
		System.out.println("Nota1: 10 Nota2: 10");
		System.out.println(aluno.verificarAprovacao());
		
		// instancia novo objeto aluno aprovado
		Aluno aluno2 = new Aluno(11, "Paulo");
		
		//reprovado
		System.out.println("Aluno: "+ aluno2.getNome() +" Matricula: " + aluno2.getCodigo());
		aluno2.calcularMedia(4, 4);
		System.out.println("Nota1: 4 Nota2: 4");
		System.out.println(aluno2.verificarAprovacao());

	}

}
