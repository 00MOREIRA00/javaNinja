package NivelIntermediario;



public class Main {
    public static void main(String[] args) {

        Ninja Naruto = new Ninja();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Aldeia da Folha";
        Naruto.idade = 17;

        System.out.println(Naruto.getNome());
        System.out.println(Naruto.anosParaSeTornarHokage(70));

    }
}
