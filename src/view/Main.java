package view;
import model.*;
import java.util.*;
public class Main {

	public static void main(String[] args) 
	{
		int opcao;
		Menu menuUtilizavel = new Menu();
		RH funcoesRH = new RH();
		Scanner leitorParaMenu = new Scanner(System.in);
		
		do {
			menuUtilizavel.menuOpcao();
			opcao = leitorParaMenu.nextInt();
			switch(opcao) {
			
			
			case 1: //Caso queira selecionar adição de funcionario
				switch(menuUtilizavel.qualTipoFuncionario())
				{
				case 1:
					funcoesRH.addFuncionario(menuUtilizavel.informacoesDocentes());
					break;
				case 2:
					funcoesRH.addFuncionario(menuUtilizavel.informacoesTecnicos());
					break;
				case 3:
					funcoesRH.addFuncionario(menuUtilizavel.informacoesTerceirizados());
					break;
				}
			break;
			
			case 2:
				System.out.println(funcoesRH.buscaFuncionarios());
			break;
			
			case 3: 
				System.out.println(funcoesRH.mostraTodosFuncionarios());
				break;
			}
			
		}while( opcao!= 4);//Fim do case para qual função executar do menu
		}
		
		

	
	}//Fim da classe statict void main
	