/**
 * 
 */
package heranca.polimorfismo;

/**
 * Classe principal também conhecida como classe Pai
 * Esta classe tem os atributos comuns
 * Outras podem usa-lá 
 * 
 * @author wellington.c.silva
 *
 */
public class Cliente {

	private String nome;
	private String endereco;
	
	public Cliente (String nome, String endereco) {
		
		this.nome = nome;
		this.endereco = endereco;		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String toString() {
		
		return "Nome: " + this.nome + " Endereço: " + this.endereco;
	}	
}
