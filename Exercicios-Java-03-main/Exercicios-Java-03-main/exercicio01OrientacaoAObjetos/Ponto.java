package exercicio01OrientacaoAObjetos;

import java.util.Scanner;

public class Ponto {
	Scanner leia = new Scanner(System.in);
	int informarX;
	int informarY;
	static void exibirCoordenadas(int informarX, int informarY, int informarA, int informarB) {
        System.out.println("Coordenadas do ponto C: (" + informarX + ", " + informarY + ")");
        System.out.println("Coordenadas do ponto P: (" + informarA + ", " + informarB + ")");
        
    }
	public void pegarCoordenadasX() {
		System.out.println("Informe o valor do centro do círculo correpondente ao eixo X");
		this.informarX = leia.nextInt();
		
	}
	public void pegarCoordenadasY() {
		System.out.println("Informe o valor do centro do círculo correpondente ao eixo Y");
		this.informarY = leia.nextInt();
	}
}
