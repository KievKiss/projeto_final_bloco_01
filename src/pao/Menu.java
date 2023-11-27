package pao;

import java.util.Scanner;

import pao.Controller.PaoController;
import pao.model.Doce;
import pao.model.Produto;
import pao.model.Sal;



public class Menu {

	public static void main(String[] args) {
		PaoController produto = new PaoController();
		Scanner leia = new Scanner(System.in);
		String nome,recheio,salgado = "salgado",doce = "doce";
		float preco;
		int opcao,tipo,id;

		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                Panificadora alfa		             ");
			System.out.println("            Pão quentinho a toda hora                ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Adicionar Produto                    ");
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
				System.out.printf("Adicionando produto\n\n");
				System.out.printf("Digite o nome do produto: ");
				nome = leia.next();
				System.out.printf("Digite o preço do produto: ");
				preco = leia.nextFloat();
				
				do {
					System.out.printf("Digite o tipo do produto (1-doce ou 2 - salgado) :");
					tipo = leia.nextInt();
				}while(tipo < 1 && tipo > 2);
				
				switch(tipo) {
				case 1 ->{
					produto.criarProduto(new Sal(nome,preco,tipo,produto.gerarNumero(),salgado));
				}
				case 2 -> {
					produto.criarProduto(new Doce(nome,preco,tipo,produto.gerarNumero(),doce));
					}
				}
				break;
			case 2:
				System.out.println("Listar todos os produtos\n ");
				produto.listarProdutos();
				break;
			case 3:
				System.out.println("Consultar produto por ID\n");
				id = leia.nextInt();
				produto.consultarProdutoPorId(id);
				
				break;
			case 4:
				System.out.println("Atualizar produto");
				
				System.out.println("Digite o id do produto");
				id = leia.nextInt();
				var buscaProduto = produto.buscarNaCollection(id);  
				
				if(buscaProduto != null) {
					tipo = buscaProduto.getId();
					
					System.out.printf("Digite o nome do produto:" );
					nome = leia.next();
					System.out.printf("Digite o preço do produto:");
					preco = leia.nextFloat();
					
					do {
						
					}while(tipo < 1 && tipo > 2);
					
					switch (tipo) {
					case 1 -> {
						produto.atualizarProduto(new Sal(nome,preco,tipo,id,salgado));
						}
					case 2 -> {
						produto.atualizarProduto(new Doce(nome,preco,tipo,id,doce));
						}
					default -> {
						System.out.println("PRODUTO NÃO CADASTRADO!");
						}
					}
				}else {
					System.out.println("PRODUTO NÃO CADASTRADO!");
				}
				
				break;
			case 5:
				System.out.println("Apagar produto\n\n");
				System.out.println("Digite o id");
				id = leia.nextInt();
				
				produto.deletarProduto(id);
				
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
		System.out.println("Projeto Desenvolvido por:Kevin Oliveira              ");
		System.out.println("Generation Brasil - generation@generation.org        ");
		System.out.println("github.com/KievKiss/ContaBancaria                    ");
		System.out.println("***************************************************  ");
	}
	
	
}