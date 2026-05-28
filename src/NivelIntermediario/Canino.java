package NivelIntermediario;

public class Canino extends Animal{

    public Canino(String nome, String especie, int idade){
        super(nome, especie, idade);
    }

    @Override
    public void comer() {
        System.out.println("O canino está comendo ração.");
    }

    @Override
    public void fazerSom() {
        System.out.println("O canino está latindo.");
    }

    @Override
    public void gerarRecurso() {
        System.out.println("O canino está gerando um recurso: um osso.");
    }
}
