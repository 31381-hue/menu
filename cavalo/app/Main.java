package app;

import java.util.Scanner;
import model.Cavalo;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Cavalo cavalo = null;

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Criar um novo cavalo");
            System.out.println("2 - Ver detalhes do cavalo");
            System.out.println("3 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.print("Digite o nome do cavalo: ");
                String nome = scanner.nextLine();
                System.out.print("Digite a raça do cavalo: ");
                String raca = scanner.nextLine();
                System.out.print("Digite a idade do cavalo: ");
                int idade = scanner.nextInt();
                scanner.nextLine();

                cavalo = new Cavalo(nome, raca, idade);
                System.out.println("Cavalo criado com sucesso!");
            } 
            else if (opcao == 2) {
                if (cavalo != null) {
                    System.out.println("Detalhes do Cavalo:");
                    System.out.println(cavalo.toString());
                } else {
                    System.out.println("Nenhum cavalo criado ainda.");
                }
            } 
            else if (opcao == 3) {
                System.out.println("Saindo...");
                scanner.close();
                break;
            } 
            else {
                System.out.println("Opção inválida, tente novamente.");
            }
        }
    }
}