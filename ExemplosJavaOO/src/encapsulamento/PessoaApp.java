/**
 * 
 */
package encapsulamento;

/**
 * Classe utiliza para realizar execução
 * 
 * @author wellington.c.silva
 *
 */
public class PessoaApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//a partir a classe criada gera 2 objeto
		Pessoa pessoa1 = new Pessoa(1, "Lucas");
		Pessoa pessoa2 = new Pessoa(2, "Carolina");
		
		//utilizando o metodo de acesso get
		System.out.println("Nome do objeto 1 é " + pessoa1.getNome());
		System.out.println("Nome do objeto 2 é " + pessoa2.getNome());
		
		//utilizando o metodo modificar set
		pessoa2.setNome("Ana Carolina");
		
		System.out.println("Objeto 2 foi modificado para " + pessoa2.getNome());
		

	}

}
