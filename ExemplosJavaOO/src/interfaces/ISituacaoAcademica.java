/**
 * 
 */
package interfaces;

/**
 * Este é uma interface utilizada para expor para quem utiliza
 * o que deverá ser implementado para o correto funcionamento 
 * 
 * Conhecido também com um contrato de classe
 * 
 * @author wellington.c.silva
 *
 */
public interface ISituacaoAcademica {
	
	static float MEDIA_APROVACAO = 6;
	
	public void calcularMedia(float nota1, float nota2);
	
	public String verificarAprovacao();

}
