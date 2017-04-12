package seguradora;

/**
 * Classe abstrata Pessoa
 * @author: alvaro.santos
 * @date: 11 de abr de 2017
 */

public abstract class Pessoa { 
	
	/**
	 *  Classe abstrata n�o pode instanciar objetos
	 */
	
	// Atributos
	
	protected String nome;
	protected String endereco;
	
	/**
	 *  M�todo Abstrato somente para fins de heran�a
	 */
	
	public abstract void exibir();
	
	// M�todos Acessores e Modificadores
	
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
}
