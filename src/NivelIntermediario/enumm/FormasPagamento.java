package NivelIntermediario.enumm;

public enum FormasPagamento {
    PIX("Forma de Pagamento Pix", 'P'),
    CARTAO_CREDITO("Forma de Pagamento Cartão de Credito", 'C');

    private String descricao;
    private char identificador;

    FormasPagamento(String descricao, char identificador){
        this.descricao = descricao;
        this.identificador = identificador;
    }

    public String getDescricao(){
        return descricao;
    }

    public char getIdentificador(){
        return identificador;
    }
}
