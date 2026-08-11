package Comeco;

public class Variaveis {
    public static void main(String[] args) {
        /*
         * Variáveis são espaços na memória do computador que armazenam valores temporariamente.
         * Elas podem ser de diferentes tipos, como inteiros, decimais, caracteres, booleanos, etc.
         * O tipo da variável determina o tipo de valor que ela pode armazenar.
         *
         * Tipos de Variáveis:
         * - int: armazena números inteiros (ex: 1, 2, 3)
         * - double: armazena números decimais (ex: 1.5, 2.75)
         * - char: armazena um único caractere (ex: 'a', 'b', 'c')
         * - boolean: armazena valores verdadeiro ou falso (true/false)
         * - String: armazena uma sequência de caracteres (ex: "Olá", "Mundo")
         *
         * Exemplo de declaração e inicialização de variáveis:
         */

        int idade = 25; // variável do tipo inteiro
        double altura = 1.75; // variável do tipo decimal
        char genero = 'M'; // variável do tipo caractere
        boolean estudante = true; // variável do tipo booleano
        String nome = "João"; // variável do tipo String

        // Exibindo os valores das variáveis
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Gênero: " + genero);
        System.out.println("Estudante: " + estudante);
    }
}
