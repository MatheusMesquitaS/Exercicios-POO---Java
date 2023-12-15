package exercicio04OrientacaoAObjetos;

import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		ContaBancaria contaCliente = new ContaBancaria();
		
		
		System.out.println("Informe o número da sua conta");
		contaCliente.numeroConta = leia.next();
		System.out.println("Informe o saldo da sua conta");
		contaCliente.saldo = leia.nextDouble();
		
		
		System.out.println("Informe o valor do depósito");
		double deposito = leia.nextDouble();
		System.out.println("Informe o valor do saque");
		double saque = leia.nextDouble();
		
		leia.close();
		contaCliente.depositar(deposito);
		contaCliente.sacar(saque);
		
		System.out.println(contaCliente.saldo);
		
		
		
	}
}
