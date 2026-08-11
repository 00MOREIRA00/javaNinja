package Comeco;

public class VariaveisEscopo {
    public static void main(String[] args) {
        /* Escopos de Variaveis - Onde a variavel vai existir e poderá ser acessada.
        Temos 3 tipos de escopos:
        1- Variavel de Bloco: Variavel declarada dentro de um bloco de codigo, só pode ser acessada dentro do bloco (Método, Construtores, etc).
        2 - Variavel de Instance: Variavel declarada dentro de uma classe, mas fora de qualquer metodo, pode ser acessada por qualquer metodo da classe.
        3 - Variavel de Classe : Variavel declarada dentro de uma classe, mas fora de qualquer metodo, e com o modificador static, pode ser acessada por qualquer metodo da classe e tambem por outras classes.


         ## Final (Constante)
         `final` é um valor reservado em java para indicar que a variavel é uma cconstante, e logo não pode ser alterada.
         - Existem uma convensão de que variaveis constantes devem ser declaradas com letras maiusculas, e com o separador de palavras sendo o underline (_). Ex: NOME_DA_CONSTANTE

         sintexe: final tipo nomeDaVariavel = valor;

         final int IDADE_MINIMA = 18; // Variavel constante do tipo inteiro


        ## Var
        Utilizar `var` é uma forma de declarar variaveis em java, mas sem decclarar o tipo da variavel, o compilador fica responsavel por inferir o tipo da variavel, baseado no valor atribuido a ela.
        Sintaxe: var nomeDaVariavel = valor;

        var nome = "João"; // Variavel do tipo String
         */
     String metodoBloco = metodoBloco();
        System.out.println(metodoBloco);
        // System.out.println(nome); NAO CONSEGUE ENCONTRAR A VARIAVEL DE BLOCO, POIS ELA SO EXISTE DENTRO DO METODO
    }

    public static String metodoBloco() {
        String nome = "João"; // Variavel de Bloco
        return nome;
    }
}

