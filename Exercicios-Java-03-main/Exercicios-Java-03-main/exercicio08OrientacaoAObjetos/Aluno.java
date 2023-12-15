package exercicio08OrientacaoAObjetos;

import java.util.Scanner;

public class Aluno {
	Scanner leia = new Scanner(System.in);
	
	String nome;
	String ra;
	String rg;
	String cpf;
	String nascimento;
	String graduacao;
	String curso;
	String turno;
	String nomePai;
	String nomeMae;
	String telefone;
	String rua;
	String bairro;
	String numeroCasa;
	char sexo;
	int matricula;
	int contrato;
	double materia01;
	double materia02;
	double materia03;
	double media;	
	double mediaRecuperacao;
	double provaRecuperacao;	
	boolean aprovado;
	
	public void passarNotasDeMaterias() {
		System.out.println("Informe a nota do aluno na primeira matéria");
		this.materia01 = leia.nextDouble();
		System.out.println("Informe a nota do aluno na segunda matéria");
		this.materia02 = leia.nextDouble();
		System.out.println("Informe a nota do aluno na terceira matéria");
		this.materia03 = leia.nextDouble();
	}
	public void calcularMedia() {
		media = (materia01 + materia02 + materia03)/3;
	}
	public void aprovaAluno() {
		if(media > 5) {
			System.out.println("O aluno foi aprovado, sua média foi de: "+ media);
			aprovado = true;
		}else {
			System.out.println("O aluno não foi aprovado, sua média foi de: " + media);
			aprovado = false;
		}
	}
	public void recuperacao() {
		System.out.println("Informe a nota da prova do aluno");
		provaRecuperacao = leia.nextDouble();
		mediaRecuperacao = 0.5*media+(0.5*provaRecuperacao);
				
		if(mediaRecuperacao > 6) {
			System.out.println("O aluno foi aprovado, sua nova média foi de: "+ mediaRecuperacao);
			aprovado = true;
		} else {
			System.out.println("O aluno não foi aprovado, sua nova média foi de: "+ mediaRecuperacao);
			aprovado = false;
		}
	}
	
	
	
	
	
	
	
	
	
}
