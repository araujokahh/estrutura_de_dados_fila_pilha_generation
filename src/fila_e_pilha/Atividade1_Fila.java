package fila_e_pilha;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Atividade1_Fila {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<String> cliente = new LinkedList<String>();
		int opcao = 1;

		do {
			System.out.println("*********************************");
			System.out.println("1 - Adicionar cliente na fila.");
			System.out.println("2 - Listar todos os clientes.");
			System.out.println("3 - Retirar cliente da fila.");
			System.out.println("0 - Sair.");
			System.out.println("*********************************");

			while (opcao != 0 && opcao <= 3) {
				System.out.println("\nDigite a opção desejada: ");
				opcao = sc.nextInt();
				sc.nextLine();

				switch (opcao) {
				case 1:

					System.out.println("Digite o nome do cliente: ");
					String nomeCliente = sc.nextLine();

					cliente.add(nomeCliente);
					System.out.println("\nFila: ");

					for (String listaCliente : cliente) {
						System.out.println(listaCliente);
					}

					System.out.println("\nCliente adicionado!");

					break;
				case 2:

					if (cliente.isEmpty()) {
						System.out.println("A fila está vazia.");
					} else {
						System.out.println("Clientes na fila:");
						for (String filaCliente : cliente) {
							System.out.println(filaCliente);
						}
					}
					break;

				case 3:
					if (cliente.isEmpty()) {
						System.out.println("A fila está vazia!");
					} else {
						cliente.remove();
						System.out.println("\nFila: ");

						for (String listaCliente : cliente) {
							System.out.println(listaCliente);
						}
						System.out.println("O cliente foi chamado!");

					}

					break;
				case 0:
					cliente.clear();
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
