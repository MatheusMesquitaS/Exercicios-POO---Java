package exercicio10OrientacaoAObjetos;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Empresa empresa01 = new Empresa();
		empresa01.cnpj = "1234567";
		empresa01.nomeEmpresa = "Resily";
		String rsp;
		do {
			empresa01.contratarFuncionarios();
			System.out.println("Continuar contratandos? s/n");
			rsp = leia.next();
			rsp = rsp.toUpperCase();
		}while(!rsp.equalsIgnoreCase("n"));
		empresa01.mostraFuncionarios();
		
		do {
			empresa01.demitirFuncionario();
			System.out.println("Continuar demitindo? s/n");
			rsp = leia.next();
		}while(!rsp.equalsIgnoreCase("n"));
		empresa01.mostraFuncionarios();
		
		
	}

	
}
