package heranca.polimorfismo;

/**
 * Esta classe utiliza a classe Cliente
 * sendo assim ela herda todos seus atributos e metodos
 * 
 * o metodo toString realiza o polimorfismo
 * 
 * @author wellington.c.silva
 *
 */
public class ClientePJ extends Cliente {
	
	private String cnpj;

	/**
	 * construtor para nova classe
	 * os atributos nome e endereco 
	 * estao localizados na classe pai
	 */
	public ClientePJ(String nome, String endereco, String cnpj) {
		super(nome, endereco);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String toString() {		
		return super.toString() + " CNPJ: " + this.cnpj;
	}
}
