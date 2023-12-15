package exercicio03OrientacaoAObjetos;

public class Main {
	public static void main(String[]args) {
		Livro livro01 = new Livro();
		livro01.paginas = 784;
		livro01.titulo = "O Guia do Mochileiro das Galáxias";
		livro01.autor = "Douglas Adams";
		
		livro01.mostraAutor();
		livro01.mostraTitulo();
		livro01.mostraPaginas();
		
		Livro livro02 = new Livro();
		livro02.paginas = 165;
		livro02.titulo = "MySQL";
		livro02.autor = "Vinícius Carvalho";
		
		livro02.mostraAutor();
		livro02.mostraTitulo();
		livro02.mostraPaginas();
		
		
	}
}
