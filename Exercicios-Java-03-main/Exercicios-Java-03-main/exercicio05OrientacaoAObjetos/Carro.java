package exercicio05OrientacaoAObjetos;

public class Carro {
	String modeloCarro;
	String cor;
	int ano;
	boolean ligado = false;
	
	
	void atributosCarro() {
		System.out.println("Modelo: " + modeloCarro);
		System.out.println("Cor: " + cor );
		System.out.println("Ano: " + ano);
	}
	void ligarCarro() {
		if(ligado == true) {
			System.out.println("O carro já está ligado");
		}else {
			ligado = true;
			System.out.println("O carro foi ligado!");
		}
	}
	void desligarCarro() {
		if(ligado == false) {
			System.out.println("O carro já está desligado");
		}else {
			ligado = false;
			System.out.println("O carro foi desligado!");
		}
	}
	
	
}
