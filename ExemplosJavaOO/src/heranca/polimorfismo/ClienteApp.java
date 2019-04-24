/**
 * 
 */
package heranca.polimorfismo;

/**
 * Classe utiliza para realizar execução
 * 
 * @author wellington.c.silva
 *
 */
public class ClienteApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// realiza as instancias para os novos objesto com herança de cliente
		ClientePF pessoaFisica = new ClientePF("Wellington", "Rua Mucunã", "227.229.570-35");
		ClientePJ pessoaJuridica = new ClientePJ("wclick", "Rua Mucunã", "42.853.687/0001-58");
		
		System.out.println("Objeto Pessoa Fisica com o nome " + pessoaFisica.getNome() + " CPF " + pessoaFisica.getCpf());
		System.out.println("Objeto Pessoa Juridica com o nome " + pessoaJuridica.getNome() + " CNPJ " + pessoaJuridica.getCnpj());
		
		//usa o metodo toString que realiza polimorfismo
		System.out.println("Objeto Pessoa Fisica usando toString " + pessoaFisica.toString());
		System.out.println("Objeto Pessoa Juridica usando toString " + pessoaJuridica.toString());
		
	}

}
