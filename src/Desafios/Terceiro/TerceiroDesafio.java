package Desafios.Terceiro;

public class TerceiroDesafio {
    public String nome;
    public int idade;
    public String missao;
    public String nivelDificuldade;
    public String statusMissao;

    public void mostrarInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Missão: " + missao);
        System.out.println("Nível de Dificuldade: " + nivelDificuldade);
        System.out.println("Status da Missão: " + statusMissao);
    }
}


//QUER MAIS DIFICULDADE?

//Como desafio adicional, implemente um menu interativo utilizando a classe Scanner para permitir ao usuário escolher entre diferentes opções, como exibir informações de todos os ninjas, adicionar novos ninjas ou atualizar as habilidades especiais. Isso ajudará a praticar o uso de entrada do usuário e controle de fluxo no programa.

//Crie um programa em Java para gerenciar informações de ninjas utilizando herança. Desenvolva uma classe base chamada Ninja e uma subclasse chamada Uchiha.
//Na classe Ninja, defina os atributos nome (String), idade (int), missao (String), nivelDificuldade (String) e statusMissao (String). Adicione um método chamado mostrarInformacoes() que exibe todos esses atributos.
//Crie uma subclasse chamada Uchiha que herda de Ninja. Adicione um atributo adicional habilidadeEspecial (String) e um método chamado mostrarHabilidadeEspecial() para exibir a habilidade especial do ninja.
//Sobrescreva o método mostrarInformacoes() na classe Uchiha para incluir também a habilidade especial.
