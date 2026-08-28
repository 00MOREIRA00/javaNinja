package NivelIntermediario.constructorr;

public record Peessoa(String nome, int idade, int documento) {

    public void abrir(){
        System.out.println("Garrafa aberta");
    }

    public void derramar_liquido(){
        System.out.println("Liquido derramando");
    }
}
