package seguradora;

/**
 * Classe que cadastra pessoa f�sica
 * @author: alvaro.santos
 * @date: 11 de abr de 2017
 */

public class PessoaFisica extends Pessoa {
	
	// Atributos
	
	private String cpf;
	
	/**
	 *  M�todo sobrescrito do m�todo abstrato da classe Pessoa
	 */
	
	@Override
	public void exibir() {
		System.out.println("CPF: " + this.getCpf());
		System.out.println("Nome: " + this.getNome());
		System.out.println("Endere�o: " + this.getEndereco());
	}
	
	// M�todos Acessores e Modificadores
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
