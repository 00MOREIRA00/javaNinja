package NivelIntermediario.enumm;

public enum StatusCompra {
    PROCESSANDO("Pedido sendo processado em nosso sistema", 1),
    VALIDANDO_COMPRA("Validando pagamento da compra", 2),
    CONCLUIDA("Compra concluida", 3),
    ENTREGUE("Pedido entregue", 4),
    CANCELADA("Pedido cancelado", 0);

    String descricao;
    int etapaProcesso;

    StatusCompra(String descricao, int etapaProcesso) {
        this.descricao = descricao;
        this.etapaProcesso = etapaProcesso;
    }

    public String getProcessando(){
        return descricao;
    }

    public boolean canCancel(){
        return this == PROCESSANDO || this == CONCLUIDA;
    }
}
