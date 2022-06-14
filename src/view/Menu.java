package view;
import java.util.*;
import model.*;
public class Menu {
	Scanner leiaOpcao = new Scanner(System.in);
	private int opcao;
	private int opcaoFuncionario;
	private String cpf;
	private String nome;
	private String endereco;
	private String dataAdmissao;
	private String titulacao;
	private double salarioBase;
	private int siap;
	private String areaVinculada;
	private String departamento;
	private String dataFinalContrato;
	private String funcao;
	
public void menuOpcao()
	{
	System.out.println("~~~~~~~~--------~~~~~~~~--------");
	System.out.println("  Escolha uma das opções abaixo ");
	System.out.println("~~~~~~~~--------~~~~~~~~--------");
	
	
	System.out.println("[1]- Cadastrar um novo funcionario");
	System.out.println("[2]- Pesquisa funcionario por nome");
	System.out.println("[3]- Listar todos os funcionarios");
	System.out.println("[4]- Sair do programa");
	System.out.println("Digite sua opção: ");
	}


	private void informacoesFuncionario()
	{
    System.out.println("Qual o CPF? ");
    this.cpf = leiaOpcao.next();
    System.out.println("Qual o nome? ");
    this.nome = leiaOpcao.next();
    System.out.println("Endereço: ");
    this.endereco = leiaOpcao.next();
    System.out.println("Qual a data de admissão? ");
    this.dataAdmissao = leiaOpcao.next();
    System.out.println("Qual a titulação? ");
    this.titulacao = leiaOpcao.next();
    System.out.println("Qual o salario base? ");
    this.salarioBase = leiaOpcao.nextDouble();
    
	}

	public Funcionario informacoesDocentes()
	{
		informacoesFuncionario();
		System.out.println("Qual o siap do Docente?: ");
		this.siap = leiaOpcao.nextInt();
		System.out.println("Qual a área vinculada?: ");
		this.areaVinculada = leiaOpcao.next();
		
		Docentes funcionario1 = new Docentes(this.nome,this.cpf,this.endereco,this.dataAdmissao,this.titulacao,this.salarioBase,this.siap,this.areaVinculada);
		funcionario1.calculaSalario();
		return funcionario1;
	}
	
	public Funcionario informacoesTecnicos()
	{
		informacoesFuncionario();
		System.out.println("Qual o siap do Tecnico?: ");
		this.siap = leiaOpcao.nextInt();
		System.out.println("Qual o departamento?: ");
		this.departamento = leiaOpcao.next();
		
		Tecnico funcionario1 = new Tecnico(this.nome,this.cpf,this.endereco,this.dataAdmissao,this.titulacao,this.salarioBase,this.siap,this.departamento);
		funcionario1.calculaSalario();
		return funcionario1;
	}
	
	public Funcionario informacoesTerceirizados()
	{
		informacoesFuncionario();
		System.out.println("Qual é a data final de contrato?: ");
		this.dataFinalContrato = leiaOpcao.next();
		System.out.println("Qual a função?: ");
		this.funcao = leiaOpcao.next();
		Terceirizados funcionario1 = new Terceirizados(this.nome,this.cpf,this.endereco,this.dataAdmissao,this.titulacao,this.salarioBase,this.dataFinalContrato,this.funcao);
		funcionario1.calculaSalario();
		return funcionario1;
	}
	
	public int qualTipoFuncionario()
	{
	System.out.println("~~~~~~~~--------~~~~~~~~--------");
	System.out.println("  Escolha uma das opções abaixo ");
	System.out.println("~~~~~~~~--------~~~~~~~~--------");
	
	
	System.out.println("[1]- Cadastrar Docente");
	System.out.println("[2]- Cadastrar Tecnico");
	System.out.println("[3]- Cadastrar Terceirizado");
	System.out.println("Digite sua opção: ");
	this.opcaoFuncionario = leiaOpcao.nextInt(); 
	
	return this.opcaoFuncionario;
	}
}

