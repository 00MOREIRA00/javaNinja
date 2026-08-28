package NivelIntermediario.record;

public record Pessoa(String nome, int idade) {
    public Pessoa {
        if(nome.isEmpty()){
            throw new IllegalArgumentException("Nome não pode ser nulo ou vazio");
        }
    }

    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
    }
}
