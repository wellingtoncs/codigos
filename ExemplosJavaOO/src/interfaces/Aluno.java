/**
 * 
 */
package interfaces;

import encapsulamento.Pessoa;

/**
 * Classe que utiliza a interface e sendo obrigatorio a
 * implementa��o dos metodos da interface utilizando 
 * a anota��o Override
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
		
		String mensagem = "Reprovado: M�dia " + this.media;
		
		if (this.media >= MEDIA_APROVACAO) {
			
			mensagem = "Aprovado: M�dia " + this.media;
		}
		
		return mensagem;
	}

}
