package seguradora;

/**
 * Classe abstrata Contrato
 * @author: alvaro.santos
 * @date: 11 de abr de 2017
 */

public abstract class Contrato { 
	
	/**
	 *  Classe abstrata n�o pode instanciar objetos
	 */

	// Atributos
	
	protected double vlrimv;
	protected double vlrseguro;
	protected boolean sinistro = false;
	
	/**
	 *  M�todo Abstratos somente para fins de heran�a
	 */
	
	public abstract void exibirContrato();
	public abstract void calcularContrato();
	
	// M�todos Acessores e Modificadores
	
	public double getVlrimv() {
		return vlrimv;
	}
	public void setVlrimv(double vlrimv) {
		this.vlrimv = vlrimv;
	}
	public double getVlrseguro() {
		return vlrseguro;
	}
	public void setVlrseguro(double vlrseguro) {
		this.vlrseguro = vlrseguro;
	}
	
	public boolean getSinistro() {
		return sinistro;
	}
	public void setSinistro(boolean sinistro) {
		this.sinistro = sinistro;
	}
}
