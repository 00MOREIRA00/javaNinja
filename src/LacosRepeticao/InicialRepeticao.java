package LacosRepeticao;

public class InicialRepeticao {
    public static void main(String[] args) {
        /*
        * Laços de Repetição vão executar infinitamente ou até quando alcançar determinada condição
        *
        * WHILE - Enquanto a condição for verdadeira, tudo vai acontecer
        *       while (condicao) {Tudo vai acontecer}
        *
        * FOR - Enquanto a condição for verdadeira, tudo vai acontecer
        *       for
        * */


        int numeroDeClones = 0;
        int numeroMaximoDeClones = 40;

//        while (numeroDeClones <= numeroMaximoDeClones) {
//            System.out.println("Esse é o número de clones criados: " + numeroDeClones);
//            numeroDeClones++;
//        }


        for (int i = 0; i <= numeroMaximoDeClones; i++){
            System.out.println("Esse é o número de clones criados: " + i);
        }
    }
}
