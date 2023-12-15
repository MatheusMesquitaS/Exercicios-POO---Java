package exercicio06OrientacaoAObjetos;

import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		Triangulo triangulo = new Triangulo();
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe o lado A do triângulo");
		double ladoA = leia.nextDouble();
		System.out.println("Informe o lado B do triângulo");
		double ladoB = leia.nextDouble();
		System.out.println("Informe o lado C do triângulo");
		double ladoC = leia.nextDouble();
		leia.close();
		double areaTriangulo = triangulo.calcularTriangulo(ladoA,ladoB,ladoC);
		String mensagem = triangulo.tipoTriangulo(ladoA, ladoB, ladoC);
		
		System.out.println("A área do Triangulo é: " + areaTriangulo);	
		System.out.println(mensagem);
		
		
	}
}
