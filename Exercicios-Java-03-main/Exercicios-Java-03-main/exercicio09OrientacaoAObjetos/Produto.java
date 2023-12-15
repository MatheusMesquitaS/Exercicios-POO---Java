package exercicio09OrientacaoAObjetos;

import java.util.Scanner;

public class Produto {
	Scanner leia = new Scanner(System.in);
	String nomeProduto;
	double valorProduto;
	int quantidadeEmEstoque;
	
	void mostraProduto() {
		System.out.println("Produto: " + nomeProduto);
		System.out.println("Preço: " + valorProduto + "R$");
		System.out.println("Quantidade em estoque: " + quantidadeEmEstoque);
	}
	void comprarProduto() {
		System.out.println("Quantos você deseja comprar?");
		int quantidadeCompra = leia.nextInt();
		double valorTotal = valorProduto*quantidadeCompra;
		System.out.println("Sua compra foi de: "+ valorTotal+ "R$");
		System.out.println("Confirmar a compra? S/N");
		String resposta = leia.next();
		resposta = resposta.toUpperCase();
		if(resposta.equals("S")) {
			System.out.println("Compra realizada com sucesso");
			quantidadeEmEstoque -= quantidadeCompra;
		}else {
			System.out.println("Compra recusada");
		}
		
		
	}
	
	
	
	
}
