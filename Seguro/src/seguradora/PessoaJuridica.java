package seguradora;

/**
 * Classe que cadastra pessoa jur�dica
 * @author: alvaro.santos
 * @date: 11 de abr de 2017
 */

public class PessoaJuridica extends Pessoa {

	// Atributos
	
	private String cnpj;
	
	/**
	 *  M�todo sobrescrito do m�todo abstrato da classe Pessoa
	 */
	
	@Override
	public void exibir() {
		System.out.println("CNPJ: " + this.getCnpj());
		System.out.println("Nome: " + this.getNome());
		System.out.println("Endere�o: " + this.getEndereco());
	}
	
	// M�todos Acessores e Modificadores
	
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}
