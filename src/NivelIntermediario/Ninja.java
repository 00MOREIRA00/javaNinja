package NivelIntermediario;

public class Ninja {
    String nome;
    String aldeia;
    int idade;

    public void SharinganAtivado() {
        System.out.println("Sharingan ativado!");
    }

    public String getNome() {
        return "O nome do ninja é: " + nome;
    }

    public int anosParaSeTornarHokage(int idadeMinimaParaSerHokage) {
        return idadeMinimaParaSerHokage - idade;
    }

}
