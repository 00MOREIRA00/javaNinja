package Comeco;

import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {

        String[] convidados = new String[3];
        convidados[0] = "Naruto Uzumaki";
        convidados[1] = "Sasuke Uchiha";
        convidados[2] = "Sakura Haruno";


        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Naruto Uzumaki");
        System.out.println(nomes.get(0));
        nomes.set(0, "Sasuke Uchiha");
        System.out.println(nomes.get(0));
        nomes.remove(0);
        System.out.println(nomes.size());
    }
}
