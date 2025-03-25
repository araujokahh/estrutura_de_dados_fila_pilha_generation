package fila_e_pilha;

import java.util.Scanner;
import java.util.Stack;

public class Atividade2_Pilha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<String> pilhaLivros = new Stack<String>();
		int opcao = 1;
		
		do {
			System.out.println("*********************************");
			System.out.println("1 - Adicionar um novo livro na pilha.");
			System.out.println("2 - Listar todos os livros da Pilha.");
			System.out.println("3 - Retirar um livro da pilha.");
			System.out.println("0 - Sair.");
			System.out.println("*********************************");

			while (opcao != 0 && opcao <= 3) {
				System.out.println("\nDigite a opção: ");
				opcao = sc.nextInt();
				sc.nextLine();

				switch (opcao) {
				case 1:

					System.out.println("Digite o nome do livro: ");
					String nomeLivro = sc.nextLine();

					pilhaLivros.push(nomeLivro);
					System.out.println("\nPila: ");

					for (String listaLivros : pilhaLivros) {
						System.out.println(listaLivros);
					}

					System.out.println("\nLivro adicionado!");

					break;
				case 2:

					if (pilhaLivros.isEmpty()) {
						System.out.println("Lista de livros na pilha.");
					} else {
						System.out.println("\nLista de livros na pilha: \n");
						for (String pilhaString : pilhaLivros) {
							System.out.println(pilhaString);
						}
					}
					break;

				case 3:
					if (pilhaLivros.isEmpty()) {
						System.out.println("A pilha está vazia!");
					} else {
						pilhaLivros.pop();
						System.out.println("\nLista de livros na pilha: \n ");

						for (String listaCliente : pilhaLivros) {
							System.out.println(listaCliente);
						}
						System.out.println("\nO livro foi retirado da pilha!");

					}

					break;
				case 0:
					pilhaLivros.clear();
					System.out.println("Programa finalizado!");

					break;

				default:
					System.out.println("Opção inválida!");
					break;
				}
			}

		} while (opcao != 0);

		
		
		
		
		sc.close();
	}

}
