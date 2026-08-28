package NivelIntermediario.constructorr;

class Pessoa extends Humano {
    String nome;
    int idade;
    int documento;

    Pessoa(String nome, int idade, int documento, Boolean tronco){
        super(tronco);

        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser nulo ou vazio");
        }

        this.nome = nome;
        this.idade = idade;
        this.documento = documento;
    }
}
