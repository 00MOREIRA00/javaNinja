package Condicoes;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        /*
        * Switch Cases: Que servem para gerar casos especificos
        * Objetivo: Pedir pro usuário escolher entre Ninjas
        * */

        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha um personagem: ");
        System.out.println("1 - Naruto Uzumaki: ");
        System.out.println("2 - Sasuke Uchiha: ");
        System.out.println("2 - Sacura Haruno: ");

        int personagem = sc.nextInt();
        sc.close();

        switch (personagem) {
            case 1:
                System.out.println("Você selecionou o Naruto Uzumaki");
                break;
            case 2:
                System.out.println("VocÊ selecionou o Sasuke Uchiha");
                break;
            case 3:
                System.out.println("VocÊ selecionou a personagem Sakura Haruno");
            default:
                System.out.println("Você selecionou uma opção não valida");
        }


    }
}
