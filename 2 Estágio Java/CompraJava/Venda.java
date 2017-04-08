/** 
 * Classe que efetua as vendas
 * @author: alvaro.santos
 * @author rafael.matheus
 * @date: 31 de mar de 2017
 * 
 */

public class Venda {
	
	// Atributos
	
	private Produto produto;
	private Vendedor vendedor;
	private double desconto;
	private int quantidadeItens;
	private double valor;
	
	// M�todos Especiais
	
	/**
	 * M�todo que efetua o desconto sobre uma venda
	 * 
	 * @param pDesconto porcentagem do desconto
	 * 
	 */
	
	public void efetuarDesconto(int pDesconto) {
		
		double desconto = 0.0;
		
		double valorFinal = 0.0;
		
		double valorVenda = produto.getValorVenda();
		
		desconto = (valorVenda * pDesconto) / 100;
		
		valorFinal = valorVenda - desconto;
		
		if (valorFinal < produto.getValorCusto()) {
			System.out.println("\n\nATEN��O: O valor do produto com desconto n�o pode ser menor que o valor de custo.");
			this.setDesconto(valorFinal);
		}
	}

	/**
	 * M�todo que calcula o valor da venda
	 * 
	 * @param quantItens quantidade de itens
	 * @param vlrVenda valor da venda
	 * @param valor do desconto
	 * 
	 */
	
	public void calcularValor(int quantItens, double vlrVenda, double desconto) {
		
		double valorVenda = 0.0;
		
		valorVenda = (vlrVenda * quantItens) - desconto;
		
		this.setValor(valorVenda);
		
	}

	/**
	 * M�todo que calcula a comiss�o do vendedor em rela��o a uma venda
	 * 
	 * @param vlrVenda valor da venda
	 * @param quantItens quantidade de itens
	 * @param comissaoVendedor comissao do vendedor em rela��o as vendas
	 * @param pPromocao indica se o produto est� ou n�o em promo��o
	 * 
	 * @return comissao valor calculado da comissao em rela��o a venda efetuada
	 * 
	 */
	
	public double calcularComissao(double vlrVenda, int quantItens, double comissaoVendedor, boolean pPromocao) {
		
		double comissao = 0.0;
		
		comissao = (vlrVenda * quantItens * comissaoVendedor) / 100;
		
		if (pPromocao == true) {
			
			comissao = comissao / 2;
			
		}
		
		return comissao;
	}
	
	/**
	 * M�todo que imprime os dados do vendedor e da venda
	 */
	
	public void imprimir() {
		
		System.out.println("----------------------------------------------------------");
		System.out.println("# Dados do Vendedor");
		System.out.println("----------------------------------------------------------");
		
		System.out.println("C�digo: " + vendedor.getCodigo());
		System.out.println("Nome: " + vendedor.getNome());
		System.out.printf("Comiss�o pela Venda: R$ %.2f\n", this.calcularComissao(produto.getValorVenda(), this.getQuantidadeItens(), vendedor.getCOMISSAO(), produto.isPromocao()));
		
		System.out.println("----------------------------------------------------------");
		System.out.println("# Dados da Venda");
		System.out.println("----------------------------------------------------------");
		
		System.out.println("Quantidade de produtos: " + this.getQuantidadeItens());
		System.out.println("C�digo do produto: " + produto.getCodigo());
		System.out.println("Descri��o do produto: " + produto.getDescricao());	
		System.out.printf("Valor de venda: R$ %.2f\n",  produto.getValorVenda());

		if (produto.isPromocao() == false) {
			System.out.println("Promo��o: N�o");
		} else {
			System.out.println("Promo��o: Sim");
		}
				
		System.out.printf("Valor de desconto sobre o produto: R$ %.2f\n", this.getDesconto());
		System.out.printf("Valor total da venda: R$ %.2f\n ", this.getValor());
		
	}
	
	// M�todo Construtor
	
	public Venda(Produto produto, Vendedor vendedor, int quantidadeItens) {
		this.produto = produto;
		this.vendedor = vendedor;
		this.quantidadeItens = quantidadeItens;
	}
	
	// M�todos Acessores e Modificadores
	
	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Vendedor getVendedor() {
		return vendedor;
	}
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	
	public int getQuantidadeItens() {
		return quantidadeItens;
	}
	public void setQuantidadeItens(int quantidadeItens) {
		this.quantidadeItens = quantidadeItens;
	}
	
	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
}