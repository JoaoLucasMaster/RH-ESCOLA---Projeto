package model;

public class Docentes extends Funcionario {
	private int siap;
	private String areaVinculada;
	
	public Docentes(String nomeFuncionario, String cpf, 
			String endereco, String dataAdmissao, String titulacao, double salarioBase, int siap, String areaVinculada)
	{
		super(nomeFuncionario,cpf,endereco,dataAdmissao,titulacao,salarioBase);
		this.siap = siap;
		this.areaVinculada = areaVinculada;
	}

	public int getSiap() {
		return siap;
	}

	public void setSiap(int siap) {
		this.siap = siap;
	}

	public String getAreaVinculada() {
		return areaVinculada;
	}

	public void setAreaVinculada(String areaVinculada) {
		this.areaVinculada = areaVinculada;
	}
	
    @Override
	public  double calculaSalario() 
    {
    	double salarioMestre = this.getSalarioBase() + this.getSalarioBase()*0.2;
    	double salarioDoutor = this.getSalarioBase() + this.getSalarioBase()*0.4;
    	
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
				"\nTitulação: "+ this.getTitulacao() + "\nSalario base: "+ this.getSalarioBase() + "\nSiap: "+ this.getSiap() + "\nArea Vinculada: "+ this.areaVinculada + 
				"\nNovo salario: "+ this.calculaSalario();
	}
	
}
