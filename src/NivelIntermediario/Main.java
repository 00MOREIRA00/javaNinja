package NivelIntermediario;


import Desafios.Terceiro.NinjaUchirra;
import Desafios.Terceiro.TerceiroDesafio;

public class Main {
    public static void main(String[] args) {

        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Aldeia da Folha";
        Naruto.idade = 17;
        System.out.println(Naruto.apresentacaoUzumaki());
        Naruto.ativarModoSabio();


        Uchirra Sasuke = new Uchirra();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Aldeia da Folha";
        Sasuke.idade = 17;
        System.out.println(Sasuke.apresentacaoUchirra());
        Sasuke.SharinganAtivado();


        NinjaUchirra SasukeUchirra = new NinjaUchirra();
        SasukeUchirra.nome = "Sasuke Uchiha";
        SasukeUchirra.idade = 17;
        SasukeUchirra.missao = "Derrotar Orochimaru";
        SasukeUchirra.nivelDificuldade = "Alta";
        SasukeUchirra.statusMissao = "Em andamento";
        SasukeUchirra.habilidadeEspecial = "Sharingan";
        SasukeUchirra.mostrarInformacoes();
    }
}

