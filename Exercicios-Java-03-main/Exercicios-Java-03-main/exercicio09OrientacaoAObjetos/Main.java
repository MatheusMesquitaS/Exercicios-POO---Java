package exercicio09OrientacaoAObjetos;

public class Main {
	public static void main(String[] args) {
		Produto produto01 = new Produto();
		produto01.nomeProduto = "Copos de vidro";
		produto01.quantidadeEmEstoque = 50;
		produto01.valorProduto = 23.34d;
		
		produto01.mostraProduto();
		produto01.comprarProduto();
		produto01.mostraProduto();
		
		Produto produto02 = new Produto();
		produto02.nomeProduto = "Pratos";
		produto02.quantidadeEmEstoque = 30;
		produto02.valorProduto = 15.29d;
		
		produto02.mostraProduto();
		produto02.comprarProduto();
		produto02.mostraProduto();
		
	}
}
