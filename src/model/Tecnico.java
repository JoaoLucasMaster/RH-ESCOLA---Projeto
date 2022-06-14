package model;


public class Tecnico extends Funcionario{
	private int siap;
	private String departamento;
	
	public Tecnico(String nomeFuncionario, String cpf, 
			String endereco, String dataAdmissao, String titulacao, double salarioBase, int siap, String departamento)
	{
		super(nomeFuncionario,cpf,endereco,dataAdmissao,titulacao,salarioBase);
		this.siap = siap;
		this.departamento = departamento;
	}

	public int getSiap() {
		return siap;
	}

	public void setSiap(int siap) {
		this.siap = siap;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	@Override
	public  double calculaSalario() 
    {
    	double salarioMestre = this.getSalarioBase() + this.getSalarioBase()*0.15;
    	double salarioDoutor = this.getSalarioBase() + this.getSalarioBase()*0.30;
    	
    	if(this.getTitulacao().toUpperCase()=="MESTRE")
    	{
    		return salarioMestre;
    	}
    	else if(this.getTitulacao().toUpperCase()=="DOUTOR")
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
				"\nTitulação: "+ this.getTitulacao() + "\nSalario base: "+ this.getSalarioBase() + "\nSiap: "+ this.getSiap() + "\nDepartamento: "+ this.departamento + 
				"\nNovo salario: "+ this.calculaSalario();
	}
}
