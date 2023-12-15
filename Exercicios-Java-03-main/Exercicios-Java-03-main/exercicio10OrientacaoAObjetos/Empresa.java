package exercicio10OrientacaoAObjetos;

import java.util.ArrayList;
import java.util.Scanner;

public class Empresa {
	Scanner leia = new Scanner(System.in);
	ArrayList<String> funcionarios = new ArrayList<String>();
	String nomeEmpresa;
	String cnpj;
	
	void contratarFuncionarios() {
		System.out.println("Informe o nome do novo funcionario!");
		String novoFuncionario = leia.nextLine();
		funcionarios.add(novoFuncionario);
		System.out.println("Bem vindo! " + novoFuncionario);
	}
	void demitirFuncionario() {
		System.out.println("Qual funcionário quer demitir?");
		String achaFuncionario = leia.nextLine();
		int indice = funcionarios.indexOf(achaFuncionario);
		funcionarios.remove(indice);
		System.out.println(funcionarios.get(indice) + " será demitido!");
	}
	void mostraFuncionarios() {
		System.out.println(nomeEmpresa);
		for(int i = 0; i < funcionarios.size(); i++) {
			System.out.println(funcionarios.get(i));
		}
	}
}
