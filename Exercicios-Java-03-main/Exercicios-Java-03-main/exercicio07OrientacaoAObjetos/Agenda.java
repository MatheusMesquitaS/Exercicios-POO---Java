package exercicio07OrientacaoAObjetos;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
	ArrayList<String> listaNomes = new ArrayList<String>();
	ArrayList<String> listaNumeros = new ArrayList<String>();
	Scanner leia = new Scanner(System.in);
	
	public void adicionaContato() {
		int contadora = 0;
		System.out.println("Qual o nome que você deseja inserir?");
		String nomeContato = leia.nextLine();
		System.out.println("Qual o número que você quer adicionar a esta pessoa?");
		String numeroContato = leia.nextLine();
		
		while(contadora < 1) {
			
			
			if(listaNomes.contains(nomeContato)) {
				System.out.println("Este contato já existe na sua agenda");
				System.out.println("Escolha outro nome");
				nomeContato = leia.nextLine();
				
				
			}else {
				listaNomes.add(nomeContato);
				break;
			}
		}
		while(contadora < 1) {
			if(listaNumeros.contains(numeroContato)) {
				System.out.println("Este número já existe na sua agenda");
				int ultimoNome = listaNomes.size() -1;
				listaNomes.remove(ultimoNome);
				break;
			}else {
				listaNumeros.add(numeroContato);
				break;
			}
		}	
		
		
		
	}
	
	public void mostraTodaAgenda() {
			for (int i = 0; i < listaNomes.size(); i++) {
				System.out.print(listaNomes.get(i) + " : ");
				System.out.println(listaNumeros.get(i));
			}
			
	}
	
	public void mostraUmaPessoa() {
		System.out.println("Qual pessoa você quer encontrar da sua agenda?");
		String valorProcurado = leia.nextLine();
		int indice = listaNomes.indexOf(valorProcurado);
		System.out.print(listaNomes.get(indice) + " : ");
		System.out.println(listaNumeros.get(indice));
		
	}
	
	public void removeContato() {
		System.out.println("Qual pessoa você quer excluir da sua agenda?");
		String valorProcurado = leia.nextLine();
		int indice = listaNomes.indexOf(valorProcurado);
		
		try{
            listaNomes.remove(indice);
            listaNumeros.remove(indice);
            System.out.println("Contato removido com sucesso.");
        } catch(Exception e){
            System.out.println("Pessoa não encontrada na agenda.");
        }
	}
	 
	
	
	
	
}
