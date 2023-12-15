package exercicio06OrientacaoAObjetos;

public class Triangulo {
	
	public double areaTriangulo;
	public String mensagem;
	
	
	double calcularTriangulo(double ladoA, double ladoB, double ladoC) {
		
		double semiPerimetro = (ladoA+ladoB+ladoC)/2;
		
		return areaTriangulo = Math.sqrt(semiPerimetro*(semiPerimetro-ladoA)*(semiPerimetro-ladoB)*(semiPerimetro-ladoC));
		
	}
	
	String tipoTriangulo(double ladoA, double ladoB, double ladoC) {
			
		if(ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB) {
			if(ladoA == ladoB && ladoB == ladoC) {
				mensagem = "Triângulo Equilátero";
			} else if(ladoA == ladoB || ladoB == ladoC || ladoA == ladoC){
				mensagem = "Triângulo Isósceles";
			} else {
				mensagem = "Triângulo Escaleno";
			}
		}else{
			mensagem = "Não é possível formar um triângulo";
		}
		
		
		return mensagem;		
		
				
				
				
				
	}

	
	
	
	
	
}
