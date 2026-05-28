package NivelIntermediario;

public abstract class Animal implements Comportamento {
    protected String nome;
    protected String especie;
    protected int idade;

    public Animal(String nome, String especie, int idade) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
    }

    public void locomover(){
        System.out.println("Se locomoveu");
    }

    @Override
    public abstract void comer();

    @Override
    public abstract void fazerSom();

    @Override
    public abstract void gerarRecurso();
}
