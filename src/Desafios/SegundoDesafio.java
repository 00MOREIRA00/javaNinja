package Desafios;

import java.util.Scanner;

public class SegundoDesafio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int NUMERO_MAXIMO = 10;
        String[] ninjas = new String[NUMERO_MAXIMO];

        int ninjasCadastrados = 0;
        int opcoes = 0;

        while(opcoes != 3) {
            // Menu de opçõe sdo projeto
            System.out.println("Bem vindo ao sistema de cadastro de ninjas. Selecione uma opção para prosseguir: ");
            System.out.println("        OPÇÕES");
            System.out.println("|---------------------|");
            System.out.println("1 - Cadastrar um novo ninja");
            System.out.println("2 - Consultar ninjas cadastrados");
            System.out.println("3 Finalizar aplicação ");

            opcoes = sc.nextInt();
            sc.nextLine();

            switch (opcoes) {
                case 1:
                    if (ninjasCadastrados < NUMERO_MAXIMO) {
                       System.out.println("Digite o nome do ninja para cadastro: ");
                       String nomeNinja = sc.nextLine();
                       ninjas[ninjasCadastrados] = nomeNinja;
                       ninjasCadastrados++;
                        System.out.println("Ninjas " + nomeNinja + " cadastrado com sucesso !!");
                    }else {
                        System.out.println("A lista de ninjas já está cheia");
                    }
                    break;

                case 2:
                    if(ninjasCadastrados == 0) {
                        System.out.println("Nenhum ninja cadastrado");
                    } else {
                        for (int i = 0; i < ninjas.length; i++) {
                            if (ninjas[i] == null) {
                                break;
                            } else {
                                System.out.println(ninjas[i]);
                            }
                        }
                    }
                    break;

                case 3:
                    System.out.println("Estamos terminando o programa ..... Aguarde");
                    break;

                default:
                    System.out.println("Essa opção não é valida !!");
                    break;
            }
        }
        sc.close();
    }
}




/*          Descrição
*
* Você foi enccarregado pelo Hokage para gerenciar o cadastro de ninjas na Vila da Folha.
* Sua missão é criar um sistema simples em Java para cadastrar novos ninjas e listar todos os ninjas cadastrados
*
*           Tópicos
* - Array para armazenar os nomes dos ninjas cadastrados
* - Switch Cases para implementar um menu interativos
* - Loops para navegar pelas opções do menu e iterar sobre os ninjas cadastrados
* - Condicionais para controlar a execução das opções do menu e validar o número de ninjas cadastrados
*
*           DICAS EXTRAS
* - Permita o usuário cadastrar o nome de um ninja
* - Exiba a lista de todos os ninjas cadastrados
* - Imprima os dados
* - O usuário pode encerrar o programa a qualquer momento
* */