package Array;

public class array {
    public static void main(String[] args) {
        String[] ninjas = new String[3];
        ninjas[0] = "Naruto Uzumaki";
        ninjas[1] = "Sasuke Uchirra";
        ninjas[2] = "Sakura Haruno";


        int[] idades = new int[3];
        idades[0] = 15;
        idades[1] = 18;
        idades[2] = 17;

        for (int i = 0; i < 3; i++) {
            System.out.println(idades[i]);
        }

    }
}


//Array é uma referencia na memoria. Cada item é um partimento na memoria alocada