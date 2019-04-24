/**
 * 
 */
package sobrecarga;

/**
 * Classe com construtores realizando sobregarca de metodo
 * sobrecarga e 2 ou mais metodos com o mesmo nome mas suas
 * assinaturas são diferentes
 * 
 * @author wellington.c.silva
 *
 */
public class ContaCorrente {
	
	private int numero, agencia;
	private float limite;

	/**
	 * Primero construtor
	 * utiliza na sua assinatua 2 argumentos
	 */
	public ContaCorrente(int numero, int agencia) {
		
		this.numero = numero;
		this.agencia = agencia;
	}
	
	/**
	 * Segundo construtor sobrecarga
	 * utiliza na sua assinatua 3 argumentos
	 */
	public ContaCorrente(int numero, int agencia, float limite) {
		
		this.numero = numero;
		this.agencia = agencia;
		this.limite = limite;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
}
