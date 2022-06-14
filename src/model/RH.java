package model;
import java.util.*;

public class RH {
	Scanner leiaRh = new Scanner(System.in);
	private String nome;
	private ArrayList<Funcionario>funcionarios = new ArrayList<>();

	public void addFuncionario(Funcionario funcionario1)
	{
		
			funcionarios.add(funcionario1);
	}
	public ArrayList<Funcionario> mostraTodosFuncionarios()
	{
		return funcionarios;
	}


	public Funcionario buscaFuncionarios() 
	{
		this.nome= leiaRh.next();
		for (Funcionario funcionario1 : funcionarios) 
		{
			if (funcionario1.getNomeFuncionario().equals(this.nome)) 
			{
				return funcionario1;
			}
		}
		return null;
	}

	
}
