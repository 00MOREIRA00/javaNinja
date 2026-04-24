package NivelIntermediario;

public class Uzumaki extends Ninja{

    public String apresentacaoUzumaki() {
        return "Olá, meu nome é " + nome + ", sou da " + aldeia + " e tenho " + idade + " anos.";
    }

    public void ativarModoSabio() {
        System.out.println("Modo Sábio ativado!");
    }
}
