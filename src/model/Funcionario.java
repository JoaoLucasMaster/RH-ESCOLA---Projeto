package model;

public abstract class Funcionario {
	private String nomeFuncionario;
	private String cpf;
	private String endereco;
	private String dataAdmissao;
	private String titulacao;
	private double salarioBase;
	
	public Funcionario(String nomeFuncionario, String cpf, 
			String endereco, String dataAdmissao, String titulacao, double salarioBase)
	{
		this.nomeFuncionario=nomeFuncionario;
		this.cpf = cpf;
		this.endereco = endereco;
		this.dataAdmissao = dataAdmissao;
		this.titulacao = titulacao;
		this.salarioBase = salarioBase;
	}

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public  double calculaSalario() {
		return this.salarioBase;
	}
	
	@Override
	public String toString()
	{
		return "/nCpf: "+ this.getCpf() + "\nNome: "+ this.getNomeFuncionario() + "/nEndereço: "+ this.getEndereco() + "/nData de admissao"+ this.getDataAdmissao() + 
				"/nTitulação: "+ this.getTitulacao() + "/nSalario base: "+ this.getSalarioBase();
	}
}
