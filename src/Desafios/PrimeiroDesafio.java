package Desafios;

public class PrimeiroDesafio {
    public static void main(String[] args) {

        // Ninja 1
        String nomeNinja1 = "Naruto Uzumaki";
        int idadeNinja1 = 16;
        String missaoNinja1 = "pegar bandido";
        String statusMissaoNinja1 = "em andamento";
        char nivelMissaoNinja1 = 'C';

        if (idadeNinja1 < 15) {
            if (nivelMissaoNinja1 == 'C' || nivelMissaoNinja1 == 'D' ) {
                statusMissaoNinja1 = "Missão concluida";
            } else {
                statusMissaoNinja1 = "Missão nao concluida, ninja muito novo";
            }
        } else {
            statusMissaoNinja1 = "Missão concluida";
        }

        System.out.println("===== NINJA 1 =====");
        System.out.println("Nome: " + nomeNinja1);
        System.out.println("Idade: " + idadeNinja1);
        System.out.println("Missão: " + missaoNinja1);
        System.out.println("Status da Missão: " + statusMissaoNinja1);
        System.out.println("Nível da Missão: " + nivelMissaoNinja1);
        System.out.println("====================\n");

        // Ninja 2
        String nomeNinja2 = "Sasuke Uchiha";
        int idadeNinja2 = 14;
        String missaoNinja2 = "pegar bandido";
        String statusMissaoNinja2 = "em andamento";
        char nivelMissaoNinja2 = 'S';

        if (idadeNinja2 < 15) {
            if (nivelMissaoNinja2 == 'C' || nivelMissaoNinja2 == 'D' ) {
                statusMissaoNinja1 = "Missão concluida";
            } else {
                statusMissaoNinja2 = "Missão nao concluida, ninja muito novo";
            }
        } else {
            statusMissaoNinja2 = "Missão concluida";
        }

        System.out.println("===== NINJA 2 =====");
        System.out.println("Nome: " + nomeNinja2);
        System.out.println("Idade: " + idadeNinja2);
        System.out.println("Missão: " + missaoNinja2);
        System.out.println("Status da Missão: " + statusMissaoNinja2);
        System.out.println("Nível da Missão: " + nivelMissaoNinja2);
        System.out.println("====================\n");

        // Ninja 3
        String nomeNinja3 = "Sakura Haruno";
        int idadeNinja3 = 16;
        String missaoNinja3 = "pegar bandido";
        String statusMissaoNinja3 = "em andamento";
        char nivelMissaoNinja3 = 'A';

        if (idadeNinja3 < 15) {
            if (nivelMissaoNinja3 == 'C' || nivelMissaoNinja3 == 'D' ) {
                statusMissaoNinja3 = "Missão concluida";
            } else {
                statusMissaoNinja3 = "Missão nao concluida, ninja muito novo";
            }
        } else {
            statusMissaoNinja3 = "Missão concluida";
        }

        System.out.println("===== NINJA 3 =====");
        System.out.println("Nome: " + nomeNinja3);
        System.out.println("Idade: " + idadeNinja3);
        System.out.println("Missão: " + missaoNinja3);
        System.out.println("Status da Missão: " + statusMissaoNinja3);
        System.out.println("Nível da Missão: " + nivelMissaoNinja3);
        System.out.println("====================");
    }
}