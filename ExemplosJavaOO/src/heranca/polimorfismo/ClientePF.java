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
public class ClientePF extends Cliente {
	
	private String cpf;

	/**
	 * construtor para nova classe
	 * os atributos nome e endereco 
	 * estao localizados na classe pai
	 */
	public ClientePF(String nome, String endereco, String cpf) {
		super(nome, endereco);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String toString() {		
		return super.toString() + " CPF: " + this.cpf;
	}

}
