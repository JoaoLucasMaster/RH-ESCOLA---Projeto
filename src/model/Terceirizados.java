package model;


public class Terceirizados extends Funcionario{
	private String dataFinalContrato;
	private String funcao;
	
	public Terceirizados(String nomeFuncionario, String cpf, 
			String endereco, String dataAdmissao, String titulacao, double salarioBase, String dataFinalContrato, String funcao)
	{
		super(nomeFuncionario,cpf,endereco,dataAdmissao,titulacao,salarioBase);
		this.dataFinalContrato = dataFinalContrato;
		this.funcao = funcao;
	}

	public String getDataFinalContrato() {
		return dataFinalContrato;
	}

	public void setDataFinalContrato(String dataFinalContrato) {
		this.dataFinalContrato = dataFinalContrato;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	@Override
	public  double calculaSalario() 
    {
    	double salarioMestre = this.getSalarioBase() + 500;
    	double salarioDoutor = this.getSalarioBase() + 1000;
    	
    	if(this.getFuncao().toUpperCase()=="PROFESSOR" && this.getTitulacao().toUpperCase()=="MESTRE")
    	{
    		return salarioMestre;
    	}
    	else if(this.getFuncao().toUpperCase()=="PROFESSOR" && this.getTitulacao().toUpperCase()=="DOUTOR")
    	{
    		return salarioDoutor;
    	}
    	else
    		return this.getSalarioBase();
    
	}
	
	@Override
	public String toString()
	{
		return "\nCpf: "+ this.getCpf() + "\nNome: "+ this.getNomeFuncionario() + "\nEndereço: "+ this.getEndereco() + "\nData de admissao: "+ this.getDataAdmissao() + 
				"\nTitulação: "+ this.getTitulacao() + "\nSalario base: "+ this.getSalarioBase() + "\nFunção: "+ this.getFuncao() + "\nData final de contrato: "+ this.getDataFinalContrato() + 
				"\nNovo salario: "+ this.calculaSalario();
	}
}
