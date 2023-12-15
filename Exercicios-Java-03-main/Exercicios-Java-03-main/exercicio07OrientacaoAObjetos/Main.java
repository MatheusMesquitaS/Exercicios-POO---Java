package exercicio07OrientacaoAObjetos;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Agenda suaAgenda = new Agenda();
		Scanner scanner = new Scanner(System.in);
		int opcao;

        do{
        	System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("1 - Adicionar Contato");
            System.out.println("2 - Mostrar Toda a Agenda");
            System.out.println("3 - Mostrar uma Pessoa");
            System.out.println("4 - Remover Contato");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma opção: ");
            System.out.println("");
            System.out.println("");
            System.out.println("");

            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    suaAgenda.adicionaContato();
                    break;
                case 2:
                    suaAgenda.mostraTodaAgenda();
                    break;
                case 3:
                    suaAgenda.mostraUmaPessoa();
                    break;
                case 4:
                    suaAgenda.removeContato();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    scanner.close();
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }while(opcao != 0);
    }
	
}
