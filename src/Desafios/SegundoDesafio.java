package Desafios;

import java.util.Scanner;

public class SegundoDesafio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int NUMERO_MAXIMO = 10;
        String[] ninjas = new String[NUMERO_MAXIMO];

        int ninjasCadastrados = 0;
        int opcoes = 0;

        while (opcoes != 4) {
            System.out.println("Bem vindo ao sistema de cadastro de ninjas. Selecione uma opção para prosseguir: ");
            System.out.println("        OPÇÕES");
            System.out.println("|---------------------|");
            System.out.println("1 - Cadastrar um novo ninja");
            System.out.println("2 - Consultar ninjas cadastrados");
            System.out.println("3 - Excluir ninja cadastrado");
            System.out.println("4 - Finalizar aplicação");

            opcoes = sc.nextInt();
            sc.nextLine();

            switch (opcoes) {
                case 1:
                    if (ninjasCadastrados < NUMERO_MAXIMO) {
                        System.out.println("Digite o nome do ninja para cadastro: ");
                        String nomeNinja = sc.nextLine();
                        ninjas[ninjasCadastrados] = nomeNinja;
                        ninjasCadastrados++;
                        System.out.println("Ninja " + nomeNinja + " cadastrado com sucesso!");
                    } else {
                        System.out.println("A lista de ninjas já está cheia");
                    }
                    break;

                case 2:
                    if (ninjasCadastrados == 0) {
                        System.out.println("Nenhum ninja cadastrado");
                    } else {
                        for (int i = 0; i < ninjasCadastrados; i++) {
                            System.out.println(i + " - " + ninjas[i]);
                        }
                    }
                    break;

                case 3:
                    if (ninjasCadastrados == 0) {
                        System.out.println("Nenhum ninja cadastrado para excluir.");
                    } else {
                        System.out.println("Selecione o índice do ninja que será excluído: ");
                        int ninjaExcluido = sc.nextInt();
                        sc.nextLine();

                        if (ninjaExcluido < 0 || ninjaExcluido >= ninjasCadastrados) {
                            System.out.println("Índice inválido!");
                        } else {
                            System.out.println("Ninja " + ninjas[ninjaExcluido] + " excluído com sucesso!");

                            for (int i = ninjaExcluido; i < ninjasCadastrados - 1; i++) {
                                ninjas[i] = ninjas[i + 1];
                            }

                            ninjas[ninjasCadastrados - 1] = null;
                            ninjasCadastrados--;
                        }
                    }
                    break;

                case 4:
                    System.out.println("Estamos terminando o programa...");
                    break;

                default:
                    System.out.println("Essa opção não é válida!!");
                    break;
            }
        }

        sc.close();
    }
}