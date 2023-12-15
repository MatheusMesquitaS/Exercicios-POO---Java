package exercicio05OrientacaoAObjetos;

public class Main {
	public static void main(String[]args) {
		Carro carro01 = new Carro();
		carro01.ano = 1960;
		carro01.cor = "Branco";
		carro01.modeloCarro = "Corolla";
		
		Carro carro02 = new Carro();
		carro02.ano = 1964;
		carro02.cor = "Vermelho";
		carro02.modeloCarro = "Mustang";
		
		System.out.println("Primeiro carro");	
		carro01.atributosCarro();
		System.out.println("Segundo carro");
		carro02.atributosCarro();
		
		carro01.ligarCarro();
		carro01.ligarCarro();
		carro01.desligarCarro();
		
		carro02.desligarCarro();
		carro02.ligarCarro();
		carro02.ligarCarro();
		
		
		
		
		
	}
}
