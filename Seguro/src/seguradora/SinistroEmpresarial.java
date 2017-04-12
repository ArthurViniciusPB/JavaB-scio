package seguradora;

/**
 * Classe que cadastra sinistro empresarial
 * @author: alvaro.santos
 * @date: 11 de abr de 2017
 */

public class SinistroEmpresarial extends Sinistro {

	// Atributos
	
	private PessoaJuridica pj;
	private ContratoEmpresarial contrato;
	
	// M�todos Especiais
	
	@Override
	public void tipoSinistro() {
		double porcentagem = this.getPorcentagem();
		if (porcentagem > 75.0) {
			this.setTipo("TOTAL");
		} else if (porcentagem < 75.0) {
			this.setTipo("PARCIAL");
		}
	}
	
	@Override
	public void exibirSinistro() {
		
		System.out.println("*************************************");
		System.out.println("TIPO DE SINISTRO: Empresarial");
		System.out.println("*************************************");
		
		System.out.println("DADOS DO CLIENTE");
		System.out.println("-------------------------------------");
		System.out.println("CNPJ: " + this.getPj().getCnpj());
		System.out.println("Nome: " + this.getPj().getNome());
		System.out.println("Endere�o: " + this.getPj().getEndereco());
		System.out.println("-------------------------------------");
		
		System.out.println("DADOS DO CONTRATO");
		System.out.println("-------------------------------------");
		System.out.printf("Valor do Im�vel: R$ %.2f \n", this.getContrato().getVlrimv());
		System.out.println("N�mero de Funcion�rios: " + this.getContrato().getNfunc());
		System.out.println("N�mero de Visitas Di�rias: " + this.getContrato().getNvis());

		// Ramo
		
		if (this.getContrato().getRamo() == 1) {
			System.out.println("Ramo: Com�rcio");
		} else if (this.getContrato().getRamo() == 2) {
			System.out.println("Ramo: Ind�stria");
		} else if (this.getContrato().getRamo() == 3) {
			System.out.println("Ramo: Agropecu�ria");
		}
		
		System.out.printf("Valor do Seguro: R$ %.2f \n", this.getContrato().getVlrseguro());
		System.out.println("-------------------------------------");
		
		System.out.println("DADOS DO SINISTRO");
		System.out.println("-------------------------------------");
		System.out.println("Data: " + this.getData());
		System.out.println("Porcentagem: " + this.getPorcentagem() + " %");
		System.out.println("Perca: " + this.getTipo());
		System.out.println("-------------------------------------");
	}
	
	// M�todos Acessores e Modificadores
	
	public ContratoEmpresarial getContrato() {
		return contrato;
	}
	public void setContrato(ContratoEmpresarial contrato) {
		this.contrato = contrato;
	}
	
	public PessoaJuridica getPj() {
		return pj;
	}
	public void setPj(PessoaJuridica pj) {
		this.pj = pj;
	}
}
