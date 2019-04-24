/**
 * 
 */
package encapsulamento;

/**
 * Exemplo de classe utilizando o conceito de encapsulamento
 * onde os atributos utilizados são privados para uso interno,
 * os atributos são acessados atraves dos metodos 
 * get para leitura
 * set para escrita
 * 
 * @author wellington.c.silva
 *
 */
public class Pessoa {
	
	private int codigo;
	private String nome;
	
	public Pessoa(int codigo, String nome) {
		
		this.codigo = codigo;
		this.nome = nome;		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
