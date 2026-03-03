package Geral;

import java.util.Scanner;

public class ScannerUsuario {
    public static void main(String[] args) {


        /*
        * Scanner = É um jeito de trazer o usuário para dentro da aplicação.
        * Objetivo: O usuário vai criar um ninja e vamos validar os dados
        * */

        Scanner caixaDeTexto = new Scanner(System.in);
        System.out.println("Digite o nome do ninja: ");
        String nome = caixaDeTexto.nextLine();

        System.out.println("Digite a idade do ninja; ");
        int idade = caixaDeTexto.nextInt();

        caixaDeTexto.close();

        System.out.println("O nome do ninja é " + nome + ", com a idade de " + idade + " anos.");
    }
}
