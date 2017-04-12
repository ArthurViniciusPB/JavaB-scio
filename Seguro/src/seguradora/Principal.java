package seguradora;

/**
 * Classe com main que simula uma seguradora de im�veis
 * @author: alvaro.santos
 * @date: 11 de abr de 2017
 */

import java.util.Scanner; // Importa��o da classe Scanner

public class Principal {
	
	/**
	 * Menu de op��es
	 */
	
	public static void menu() {
		System.out.println("\n[1] Cadastro de clientes");
		System.out.println("[2] Cadastro de contratos");
		System.out.println("[3] Lista de clientes");
		System.out.println("[4] Lista de contratos");
		System.out.println("[5] Cadastro de sinistro");
		System.out.println("[6] Lista de sinistro");
		System.out.println("[7] Lista de contratos sem sinistro");
		System.out.println("[8] Sair");
		
		System.out.println("\nDigite uma op��o: ");
	}
	
	public static void main(String[] args) {
		
		int opcao = 0;
		
		Scanner leitor = new Scanner(System.in); // Instanciamento da classe Scanner
		
		/**
		 * Vari�veis de controle
		 */
		
		int contPf = 0, contPj = 0, contContRes = 0, contContEmp = 0, contSinRes = 0, contSinEmp = 0, tamvt = 50;
		
		/**
		 * # Vari�veis de Controle #
		 * 
		 * contPf - contador de pessoa f�sica
		 * 
		 * contPj - contador de pessoa jur�dica
		 * 
		 * contContRes - contador de contrato residencial
		 *  
		 * contContEmp - contador de contrato empresarial
		 *  
		 * contSinRes - contador de sinistro residencial
		 *  
		 * contSinEmp - contador de sinistro empresarial
		 *  
		 * tamvt - tamanho dos vetores
		 */
		
		/**
		 *  Instanciamento de Pessoa F�sica
		 */
		PessoaFisica pf[] = new PessoaFisica[tamvt];
		/**
		 *  Instanciamento de Pessoa Jur�dica
		 */
		PessoaJuridica pj[] = new PessoaJuridica[tamvt];
		
		/**
		 *  Instanciamento de Contrato Residencial
		 */
		ContratoResidencial ctres[] = new ContratoResidencial[tamvt];
		/**
		 *  Instanciamento de Contrato Empresarial
		 */
		ContratoEmpresarial ctemp[] = new ContratoEmpresarial[tamvt];
		
		/**
		 *  Instanciamento de Sinistro Residencial
		 */
		SinistroResidencial snres[] = new SinistroResidencial[tamvt];
		/**
		 *  Instanciamento de Contrato Empresarial
		 */
		SinistroEmpresarial snemp[] = new SinistroEmpresarial[tamvt];
				 
		System.out.println("*********************************");
		System.out.println("CORRETORA DE SEGUROS - S/A");
		System.out.println("*********************************\n");
		
		do {
		
			// Menu de Op��es
			
			menu();
			opcao = leitor.nextInt();
			
			switch (opcao) {
			
			case 1:
				
				int opcaolaco = 1;
				while (opcaolaco != 0) {				
					
					int opcaopessoa = 0;
					System.out.println("[1] Pessoa F�sica [2] Pessoa Jur�dica: ");
					opcaopessoa = leitor.nextInt();
					
					/**
					 * Pessoa F�sica
					 */
					
					if (opcaopessoa == 1) {
						
						pf[contPf] = new PessoaFisica(); // inicia array de pessoa f�sica
									
						System.out.println("CPF: ");
						pf[contPf].setCpf(new Scanner(System.in).nextLine());
									
						System.out.println("Nome: ");
						pf[contPf].setNome(new Scanner(System.in).nextLine());
									
						System.out.println("Endere�o: ");
						pf[contPf].setEndereco(new Scanner(System.in).nextLine());
						
						contPf++; // Incrementa o contador pessoa f�sica
					}
					
					/**
					 * Pessoa Jur�dica
					 */
					
					if (opcaopessoa == 2) {
						
						pj[contPj] = new PessoaJuridica(); // inicia array de pessoa jur�dica
								
						System.out.println("CNPJ: ");
						pj[contPj].setCnpj(new Scanner(System.in).nextLine());
								
						System.out.println("Nome: ");
						pj[contPj].setNome(new Scanner(System.in).nextLine());
								
						System.out.println("Endere�o: ");
						pj[contPj].setEndereco(new Scanner(System.in).nextLine());
								
						contPj++; // incrementa o contador pessoa jur�dica		
					}
					
					System.out.println("\nDeseja adicionar outro cliente? [1] Sim [0] Nao");
					opcaolaco = leitor.nextInt();
				}
				
				break;
				
			case 2:
				
				int opcaolaco2 = 1;
				while (opcaolaco2 != 0) {				
					
					int opcaopessoa2 = 0;
					System.out.println("[1] Contrato Residencial [2] Contrato Empresarial: ");
					opcaopessoa2 = leitor.nextInt();
					
					/**
					 * Contrato Residencial
					 */
					
					if (opcaopessoa2 == 1) {
						
						ctres[contContRes] = new ContratoResidencial(); // inicia array de contrato residecial
									
						int i = 0, escolha = 0;
						
						/**
						 * Exibe lista de pessoas f�sicas cadastradas
						 */
						
						for (i = 0; i < contPf; i++) {
							System.out.printf("[%d] %s - %s\n", i, pf[i].getCpf(), pf[i].getNome());
						}
						
						System.out.println("\nDigite o n�mero do cliente que deseja adicionar o contrato: ");
						escolha = leitor.nextInt();
						
						ctres[contContRes].setCltpf(pf[escolha]); // adiciona cliente selecionado no contrado a ser cadastrado
						
						System.out.println("Endere�o: ");
						ctres[contContRes].setEndereco(new Scanner(System.in).nextLine());
						
						System.out.println("Valor do Im�vel: ");
						ctres[contContRes].setVlrimv(new Scanner(System.in).nextInt());
						
						System.out.println("Zona:  1 - [Urbana] - 2 - [Suburbana] - 3 - [Rural]: ");
						ctres[contContRes].setZona(new Scanner(System.in).nextInt());
						
						System.out.println("Tipo: 1 - [Apartamento] - 2 - [Casa]");
						ctres[contContRes].setTipo(new Scanner(System.in).nextInt());

						contContRes++; // incrementa contador contrato residencial	
					}
					
					/**
					 * Contrato Empresarial
					 */
					
					if (opcaopessoa2 == 2) {
						
						ctemp[contContEmp] = new ContratoEmpresarial(); // inicia array de contrato empresarial
						
						int i = 0, escolha = 0;
						
						/**
						 * Exibe lista de pessoas jur�dicas cadastradas
						 */
						
						for (i = 0; i < contPj; i++) {
							System.out.printf("[%d] %s - %s\n", i, pj[i].getCnpj(), pj[i].getNome());
						}
						
						System.out.println("\nDigite o n�mero do cliente que deseja adicionar o contrato: ");
						escolha = leitor.nextInt();
						
						ctemp[contContEmp].setCltpj(pj[escolha]); // adiciona cliente selecionado ao contrato a ser cadastrado
						
						System.out.println("Valor do Im�vel: ");
						ctemp[contContEmp].setVlrimv(new Scanner(System.in).nextInt());

						System.out.println("N�mero de Funcion�rios: ");
						ctemp[contContEmp].setNfunc(new Scanner(System.in).nextInt());
						
						System.out.println("N�mero de Visitas Di�rias: ");
						ctemp[contContEmp].setNvis(new Scanner(System.in).nextInt());
						
						System.out.println("Ramo:  1 - [Com�rcio] - 2 - [Ind�stria] - 3 - [Agropecu�ria]: ");
						ctemp[contContEmp].setRamo(new Scanner(System.in).nextInt());
						
						contContEmp++; // incrementa contador contrato empresarial			
					}
					
					System.out.println("\nDeseja adicionar outro contrato? [1] Sim [0] Nao");
					opcaolaco2 = leitor.nextInt();
				}
				
				break;
				
			case 3:
		
				System.out.println("LISTA DE CLIENTES CADASTRADOS\n");
				
				int ii1 = 0, ii2 = 0;
				
				System.out.println("Pessoa F�sica");
				System.out.println("************************************");
				
				/**
				 * Exibe lista de pessoas f�sicas cadastradas
				 */
				
				for (ii1 = 0; ii1 < contPf; ii1++) {
					System.out.println("--------------------------------------------------------------------------------");
					pf[ii1].exibir();
					System.out.println("--------------------------------------------------------------------------------\n");
				}
				
				System.out.println("Pessoa Jur�dica");
				System.out.println("************************************");
				
				/**
				 * Exibe lista de pessoas jur�dicas cadastradas
				 */
				
				for (ii2 = 0; ii2 < contPj; ii2++) {
					System.out.println("--------------------------------------------------------------------------------");
					pj[ii2].exibir();
					System.out.println("--------------------------------------------------------------------------------\n");
				}
				
				break;
				
			case 4:
				
				System.out.println("LISTA DE CONTRATOS CADASTRADOS\n");
				
				int ii3 = 0, ii4 = 0;
				
				System.out.println("Contrato Residencial");
				System.out.println("************************************");
				
				/**
				 * Exibe lista de contratos residenciais cadastrados
				 */
				
				for (ii3 = 0; ii3 < contContRes; ii3++) {
					System.out.println("--------------------------------------------------------------------------------");
					ctres[ii3].calcularContrato();
					ctres[ii3].exibirContrato();
					System.out.println("--------------------------------------------------------------------------------\n");
				}
				
				System.out.println("Contrato Empresarial");
				System.out.println("************************************");
				
				/**
				 * Exibe lista de contratos empresariais cadastrados
				 */
				
				for (ii4 = 0; ii4 < contContEmp; ii4++) {
					System.out.println("--------------------------------------------------------------------------------");
					ctemp[ii4].calcularContrato();
					ctemp[ii4].exibirContrato();
					System.out.println("--------------------------------------------------------------------------------\n");
				}
				
				break;
				
			case 5:
				
				int opcaolaco3 = 1;
				while (opcaolaco3 != 0) {				
					
					int opcaopessoa3 = 0;
					System.out.println("[1] Sinistro Residencial [2] Sinistro Empresarial: ");
					opcaopessoa3 = leitor.nextInt();
					
					/**
					 * Sinistro Residencial
					 */
					
					if (opcaopessoa3 == 1) {
						
						snres[contSinRes] = new SinistroResidencial(); // inicia array de sinistro residencial
									
						int i2 = 0, escolha = 0;
						
						/**
						 * Exibe lista de contratos residenciais
						 */
						
						for (i2 = 0; i2 < contContRes; i2++) {
							System.out.printf("[%d] %s - %s\n", i2, ctres[i2].getCltpf().nome, ctres[i2].getEndereco());
						}
						
						System.out.println("\nDigite o n�mero do contrato que deseja adicionar o sinistro residencial: ");
						escolha = leitor.nextInt();
						
						snres[contSinRes].setPf(pf[escolha]); // adiciona cliente selecionado no sinistro a ser cadastrado
						snres[contSinRes].setContrato(ctres[escolha]); // adiciona contrato do cliente selecionado
						ctres[escolha].setSinistro(true); // diz que o contrato do cliente selecionado cont�m sinistro
						
						System.out.println("Data - Ex: 20/03/2017:  ");
						snres[contSinRes].setData(new Scanner(System.in).nextLine());
						
						System.out.println("Porcentagem da Perca: ");
						snres[contSinRes].setPorcentagem(new Scanner(System.in).nextDouble());

						contSinRes++; // incrementa contador sinistro residencial	
					}

					/**
					 * Sinistro Empresarial
					 */
					
					if (opcaopessoa3 == 2) {
						
						snemp[contSinEmp] = new SinistroEmpresarial(); // inicia array de sinistro empresarial
									
						int i2 = 0, escolha = 0;
						
						/**
						 * Exibe lista de contratos empresariais
						 */
						
						for (i2 = 0; i2 < contContEmp; i2++) {
							System.out.printf("[%d] %s - %s\n", i2, ctemp[i2].getCltpj().nome, ctemp[i2].getCltpj().endereco);
						}
						
						System.out.println("\nDigite o n�mero do contrato que deseja adicionar o sinistro empresarial: ");
						escolha = leitor.nextInt();
						
						snemp[contSinEmp].setPj(pj[escolha]); // adiciona cliente selecionado no sinistro a ser cadastrado
						snemp[contSinEmp].setContrato(ctemp[escolha]); // adiciona contrato do cliente selecionado
						ctemp[escolha].setSinistro(true); // diz que o contrato do cliente selecionado cont�m sinistro
						
						System.out.println("Data - Ex: 20/03/2017:  ");
						snemp[contSinEmp].setData(new Scanner(System.in).nextLine());
						
						System.out.println("Porcentagem da Perca - Ex: 20 30 50: ");
						snemp[contSinEmp].setPorcentagem(new Scanner(System.in).nextDouble());

						contSinEmp++; // incrementa contador sinistro empresarial	
					}
					
					System.out.println("\nDeseja adicionar outro contrato? [1] Sim [0] Nao");
					opcaolaco3 = leitor.nextInt();
				}

				break;
				
			case 6:
				
				System.out.println("LISTA DE SINISTROS CADASTRADOS\n");
				
				int ii5 = 0, ii6 = 0;
				
				System.out.println("Sinistro Residencial");
				System.out.println("************************************");
				
				/**
				 * Exibe lista de sinistros residenciais cadastrados
				 */
				
				for (ii5 = 0; ii5 < contSinRes; ii5++) {
					System.out.println("--------------------------------------------------------------------------------");
					snres[ii5].tipoSinistro();
					snres[ii5].exibirSinistro();
					System.out.println("--------------------------------------------------------------------------------\n");
				}
				
				System.out.println("Sinistro Empresarial");
				System.out.println("************************************");
				
				/**
				 * Exibe lista de sinistros empresariais cadastrados
				 */
				
				for (ii6 = 0; ii6 < contSinEmp; ii6++) {
					System.out.println("--------------------------------------------------------------------------------");
					snemp[ii6].tipoSinistro();;
					snemp[ii6].exibirSinistro();
					System.out.println("--------------------------------------------------------------------------------\n");
				}
				
				break;
				
			case 7:
				
				System.out.println("LISTA DE CONTRATOS CADASTRADOS SEM SINISTRO\n");
				
				int ii7 = 0, ii8 = 0;
				
				System.out.println("Contrato Residencial");
				System.out.println("************************************");
				
				/**
				 * Exibe lista de contratos residenciais sem sinistro
				 */
				
				for (ii7 = 0; ii7 < contContRes; ii7++) {
					
					if (ctres[ii7].getSinistro() == false) {
						System.out.println("--------------------------------------------------------------------------------");
						ctres[ii7].calcularContrato();
						ctres[ii7].exibirContrato();
						System.out.println("--------------------------------------------------------------------------------\n");
					}
				}
				
				System.out.println("Contrato Empresarial");
				System.out.println("************************************");
				
				/**
				 * Exibe lista de contratos empresariais sem sinistro
				 */
				
				for (ii8 = 0; ii8 < contContEmp; ii8++) {
										
					if (ctemp[ii8].getSinistro() == false) {
						System.out.println("--------------------------------------------------------------------------------");
						ctemp[ii8].calcularContrato();
						ctemp[ii8].exibirContrato();
						System.out.println("--------------------------------------------------------------------------------\n");
					}
				}
					
				break;
				
			case 8:
				System.out.println("Programa Finalizado.");
				System.exit(0);
				break;
			}
		
		} while (opcao != 8);
	}
}
