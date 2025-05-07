package livraria_cultura;


import livraria_cultura.model.Produto;
import livraria_cultura.model.Livros;
import livraria_cultura.model.CDs;
import livraria_cultura.util.Cores;

import java.io.IOException;
import java.util.Scanner;


public class Menu {

	public static void main(String[] args) {
		
			
		Scanner leia = new Scanner(System.in);

		
		int opcao, id, tipo;
		String nome, estilo, genero;
		float preco;

		/* Testes do modelo de dados */

		Livros l1 = new Livros(1010, "Pense e Enriqueça", 1, 41f, "Desenvolvimento pessoal\n");
		l1.visualizar();

		CDs c1 = new CDs(2010, "Elis & Tom", 2, 30f, "MPB\n");
		c1.visualizar();
		
				

		while (true) {

			System.out.println(Cores.TEXT_CYAN_BRIGHT + Cores.ANSI_BLACK_BACKGROUND
					+ "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("              ⫸ Livraria Cultura ⫷                  ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Produto                        ");
			System.out.println("            2 - Listar todos os Produtos             ");
			System.out.println("            3 - Buscar Produto por ID                ");
			System.out.println("            4 - Atualizar Dados do Produto           ");
			System.out.println("            5 - Apagar Produto                       ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " + Cores.TEXT_RESET);

			opcao = leia.nextInt();

			if (opcao == 6) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nLivraria Cultura - Livros, músicas e ideias que inspiram!");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE + "Criar Produto\n\n");

				System.out.println("Digite o nome do Produto:");
				leia.skip("\\R");
				nome = leia.nextLine();

				System.out.println("Digite o tipo do Produto (1 - Livro | 2 - CD:");
				tipo = leia.nextInt();

				System.out.println("Digite o preço do Produto:");
				preco = leia.nextFloat();

				keyPress();
				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE + "Listar todos as Produtos\n\n");
				
				keyPress();
				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE + "Consultar dados da Produto - por número\n\n");

				System.out.println("Digite o ID do Produto: ");
				id = leia.nextInt();

				keyPress();
				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE + "Atualizar dados do Produto\n\n");

				System.out.println("Digite o id do produto: ");
				id = leia.nextInt();		

				keyPress();
				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE + "Apagar a Produto\n\n");

				System.out.println("Digite o ID do Produto: ");
				id = leia.nextInt();

				keyPress();
				break;
			default:
				System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Cores.TEXT_RESET);
				
				keyPress();
				break;
			}
		}

	}

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Luiza Gonçalves - luizag@genstudents.org");
		System.out.println("github.com/luizaeg");
		System.out.println("*********************************************************");
	}

	public static void keyPress() {
		try {
			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");

			
			int input;
			while ((input = System.in.read()) != '\n') {
				
				if (input == -1) {
					throw new IOException("Entrada encerrada inesperadamente");
				}
			}

		} catch (IOException e) {
			System.err.println("Erro de entrada/saída: " + e.getMessage());
		} catch (Exception e) {
			System.err.println("Ocorreu um erro ao processar a entrada: " + e.getMessage());
		}
	}


}

