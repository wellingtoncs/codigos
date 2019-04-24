/**
 * 
 */
package sobrecarga;

/**
 * @author wellington.c.silva
 *
 */
public class ContaCorrenteApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// conta corrente usa o primeiro contrutor
		ContaCorrente contasimples = new ContaCorrente(11111, 1111);
		
		// conta corrente com limite usa o segundo contrutor
		ContaCorrente contaespecial = new ContaCorrente(999999, 9999, 99);
		
		System.out.println("Conta simples numero " + contasimples.getNumero() + " agencia " + contasimples.getAgencia());
		System.out.println("Conta Especial com limete "+ contaespecial.getLimite()  +" numero " + contaespecial.getNumero() + " agencia " + contaespecial.getAgencia());
	}

}
