package Condicoes;

public class Ternarios {
    public static void main(String[] args) {
        /*
        * Ternaris: São maneiras de reduzir o codigo
        * variavel = (condicao) ? valorSerVerdadeira : valorSerFalso;
        * */


        short numeroMissoes = 11;

        String nivel = (numeroMissoes >= 10) ? "Esse número está com mais de 10 missões" : "Esse número tem menos de 10 missões";
        System.out.println(nivel);

    }
}
