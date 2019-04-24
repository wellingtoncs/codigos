/**
 * 
 */
package interfaces;

import encapsulamento.Pessoa;

/**
 * Classe que utiliza a interface e sendo obrigatorio a
 * implementação dos metodos da interface utilizando 
 * a anotação Override
 * 
 * @author wellington.c.silva
 *
 */
public class Aluno extends Pessoa implements ISituacaoAcademica {
	
	private float media;

	public Aluno(int codigo, String nome) {
		super(codigo, nome);
	}

	/* 
	 * metodo da interface
	 * @see interfaces.ISituacaoAcademica#calcularMedia(float, float)
	 */
	@Override
	public void calcularMedia(float nota1, float nota2) {
		
		this.media = (nota1+nota2) / 2;
	}

	/* 
	 * metodo da interface
	 * @see interfaces.ISituacaoAcademica#verificarAprovacao()
	 */
	@Override
	public String verificarAprovacao() {
		
		String mensagem = "Reprovado: Média " + this.media;
		
		if (this.media >= MEDIA_APROVACAO) {
			
			mensagem = "Aprovado: Média " + this.media;
		}
		
		return mensagem;
	}

}
