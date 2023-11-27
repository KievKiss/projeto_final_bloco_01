package pao;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int opcao;

		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                Panificadora alfa		             ");
			System.out.println("            Pão quentinho a toda hora                ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Produto                        ");
			System.out.println("            2 - Listar todos os produtos             ");
			System.out.println("            3 - Buscar produto por ID                ");
			System.out.println("            4 - Atualizar produto                    ");
			System.out.println("            5 - Apagar produto                       ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("*****************************************************");
			System.out.println("\tEntre com a opção desejada:                        ");
			System.out.println("                                                     ");

			opcao = leia.nextInt();

			if (opcao == 6) {
				System.out.println("Saindo do programa");

				sobre();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("Criar produto\n\n");

				break;
			case 2:
				System.out.println("Listar todos os produtos\n ");

				break;
			case 3:
				System.out.println("Consultar produto por ID\n");

				break;
			case 4:
				System.out.println("Atualizar produto");

				break;
			case 5:
				System.out.println("Apagar produto\n\n");

				break;
			case 6:
				System.out.println("Fechando programa");
				break;
			default:
				System.out.println("Opção invalida");
				System.out.println("");
				break;

			}

		}
	}

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Kevin Oliveira");
		System.out.println("*********************************************************");
	}
}