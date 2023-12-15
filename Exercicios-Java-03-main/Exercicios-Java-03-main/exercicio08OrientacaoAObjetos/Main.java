package exercicio08OrientacaoAObjetos;

public class Main {
	
	
	public static void main(String[]args) {
		Aluno alunoProa = new Aluno();
		alunoProa.bairro = "Vila Romana";
		alunoProa.contrato = 2;
		alunoProa.cpf = "12345678910";
		alunoProa.curso = "Web Java";
		alunoProa.nome = "Bernardo Prieto";
		alunoProa.nascimento = "14082004";
		alunoProa.nomeMae = "Wanderleia";
		alunoProa.nomePai = "Rogério";
		alunoProa.ra = "9876543211";
		alunoProa.rg = "512804095";
		alunoProa.sexo = 'M';
		
		alunoProa.passarNotasDeMaterias();
		alunoProa.calcularMedia();
		alunoProa.aprovaAluno();
		if(alunoProa.aprovado == false) {
			alunoProa.recuperacao();
		}
		
	}
	
	
	
	
	
}
