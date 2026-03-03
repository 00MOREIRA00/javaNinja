package Condicoes;

public class IfElse {
    public static void main(String[] args) {

        /*
        * If e Else
        * Objetivo: Passa o ninja de nivel de acodo com o número de missões
        * */

        String nome = "Naruto Uzumaki";
        int idade = 18;
        boolean isHokage = true;
        short missoes = 26;
        String rank;

        if (missoes > 10 && idade > 15) {
            System.out.println("Rank Chunnin");
        }else if(missoes >= 20){
            System.out.println("Rank Jounin");
        } else {
            System.out.println("Rank Gennim");
        }

    }
}
