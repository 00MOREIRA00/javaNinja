package Desafios.Terceiro;

public class NinjaUchirra extends TerceiroDesafio {
    public String habilidadeEspecial;

    public void mostrarInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Missão: " + missao);
        System.out.println("Nível de Dificuldade: " + nivelDificuldade);
        System.out.println("Status da Missão: " + statusMissao);
        mostrarHabilidadeEspecial();
    }

    public void mostrarHabilidadeEspecial() {
        System.out.println("Habilidade Especial: " + habilidadeEspecial);
    }

}



