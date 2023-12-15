package exercicio01OrientacaoAObjetos;

import java.util.Scanner;

public class Circulo {
	Scanner leia = new Scanner(System.in);
	static double raio;
	static double valorCirculo;
	int informarA;
	int informarB;
	
	
	
	
	public void pegarCoordenadaA() {
		System.out.println("Informe o valor do centro do círculo correpondente ao eixo A");
		informarA = leia.nextInt();
	}
	public void pegarCoordenadaB() {
		System.out.println("Informe o valor do centro do círculo correpondente ao eixo B");
		informarB = leia.nextInt();
	}
	
	
	
	
	
	static double calculaRaio(int informarX, int informarY, int informarA, int informarB) {	
		
		return raio = Math.sqrt((informarX-informarA)*(informarX-informarA)+(informarY-informarB)*(informarY-informarB));
			
	}
	
	
	static double calculaCirculo() {
		return valorCirculo = 2*3.14d*raio;
	}
}
