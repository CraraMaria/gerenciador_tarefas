// precisa de alguns ajustes


package gerenciadordetarefas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();
        
        int opcao;
        
        do {
            System.out.println("\n--- Gerenciador de Tarefas ---");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Listar Tarefas");
            System.out.println("3. Remover Tarefa");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consome a nova linha
            
            switch (opcao) {
                case 1:
                    System.out.print("Digite a tarefa: ");
                    String tarefa = scanner.nextLine();
                    tarefas.add(tarefa);
                    System.out.println("Tarefa adicionada com sucesso!");
                    break;
                case 2:
                    System.out.println("\n--- Lista de Tarefas ---");
                    if (tarefas.isEmpty()) {
                        System.out.println("Nenhuma tarefa adicionada.");
                    } else {
                        for (int i = 0; i < tarefas.size(); i++) {
                            System.out.println((i + 1) + ". " + tarefas.get(i));
                        }
                    }
                    break;
                case 3:
                    System.out.println("\n--- Remover Tarefa ---");
                    if (tarefas.isEmpty()) {
                        System.out.println("Nenhuma tarefa para remover.");
                    } else {
                        System.out.println("Escolha o número da tarefa para remover:");
                        for (int i = 0; i < tarefas.size(); i++) {
                            System.out.println((i + 1) + ". " + tarefas.get(i));
                        }
                        int remover = scanner.nextInt();
                        scanner.nextLine(); // Consome a nova linha
                        if (remover > 0 && remover <= tarefas.size()) {
                            tarefas.remove(remover - 1);
                            System.out.println("Tarefa removida com sucesso!");
                        } else {
                            System.out.println("Opção inválida.");
                        }
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (opcao != 0);
        
        scanner.close();
    }
}
