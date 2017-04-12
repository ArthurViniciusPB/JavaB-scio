package seguradora;

/**
 * Classe abstrata Sinistro
 * @author: alvaro.santos
 * @date: 11 de abr de 2017
 */

public abstract class Sinistro {
	
	/**
	 *  Classe abstrata n�o pode instanciar objetos
	 */
	
	// Atributos
	
	protected String data;
	protected double porcentagem;
	protected String tipo;	
	
	/**
	 *  M�todo Abstratos somente para fins de heran�a
	 */

	public abstract void tipoSinistro();
	public abstract void exibirSinistro();
	
	// M�todos Acessores e Modificadores
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public double getPorcentagem() {
		return porcentagem;
	}
	public void setPorcentagem(double porcentagem) {
		this.porcentagem = porcentagem;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
