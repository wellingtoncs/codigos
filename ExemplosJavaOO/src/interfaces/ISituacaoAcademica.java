/**
 * 
 */
package interfaces;

/**
 * Este � uma interface utilizada para expor para quem utiliza
 * o que dever� ser implementado para o correto funcionamento 
 * 
 * Conhecido tamb�m com um contrato de classe
 * 
 * @author wellington.c.silva
 *
 */
public interface ISituacaoAcademica {
	
	static float MEDIA_APROVACAO = 6;
	
	public void calcularMedia(float nota1, float nota2);
	
	public String verificarAprovacao();

}
