package NivelIntermediario.enumm;

public class Logica {
    static void main() {
        System.out.println("Iniciando Sistema:");

        Acessos usuarioLogado = Acessos.DESENVOLVEDOR;

        System.out.println("LOgado por um: " + usuarioLogado);

        FormasPagamento pagamento = FormasPagamento.PIX;
        System.out.println(pagamento.getDescricao());


        StatusCompra compra = StatusCompra.VALIDANDO_COMPRA;
        boolean cancel = compra.canCancel();
        System.out.println(cancel);

        Semana dia = Semana.DOMINGO;
        System.out.println(dia);
        System.out.println(dia.getDescricao());
        System.out.println(dia.isFinalSemana());
    }
}
