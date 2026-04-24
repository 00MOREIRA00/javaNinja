package NivelIntermediario;

public class Ninja {
    String nome;
    String aldeia;
    int idade;

    public String getNome() {
        return "O nome do ninja é: " + nome;
    }

    public int anosParaSeTornarHokage(int idadeMinimaParaSerHokage) {
        return idadeMinimaParaSerHokage - idade;
    }

}
