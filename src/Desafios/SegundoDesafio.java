package Desafios;

import java.util.Scanner;

public class SegundoDesafio {
    public static void main(String[] args) {

        System.out.println("Bem vindo ao sistema de cadastro de ninjas. Selecione uma opção para prosseguir: ");
        System.out.println("        OPÇÕES");
        System.out.println("|---------------------|");
        System.out.println("1 - Cadastrar um novo ninja");
        System.out.println("2 - Consultar ninjas cadastrados");
        System.out.println("3 Finalizar aplicação ");

        Scanner sc = new Scanner(System.in);
        int selecao = sc.nextInt();
        System.out.println(selecao);
        sc.close();


        switch (selecao) {
            case 1:
                System.out.println("Opção 1 selecionanda");

            case 2:
                System.out.println("Opção 2 selecionanda");

            case 3:
                System.out.println("Opção 3 selecionada");

            default:
                System.out.println("Valor não reconhecido adicionando");
        }
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