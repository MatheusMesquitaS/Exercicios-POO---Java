package exercicio01OrientacaoAObjetos;


public class Main {
	public static void main(String[]args) {
		Ponto ponto = new Ponto();
		
		
		Circulo circulo = new Circulo();
		ponto.pegarCoordenadasX();;
		ponto.pegarCoordenadasY();
		
		circulo.pegarCoordenadaA();
		circulo.pegarCoordenadaB();
		
		
		
        Ponto.exibirCoordenadas(ponto.informarX,ponto.informarY, circulo.informarA, circulo.informarB);
		
																																																																																																																																																																															
		Circulo.calculaRaio(ponto.informarX,ponto.informarY, circulo.informarA, circulo.informarB);
		
		double perimetroCirculo = Circulo.calculaCirculo();
		System.out.println(perimetroCirculo);
		
	}
}
