package NivelIntermediario.constructorr;

class Humano {

    protected Boolean cabeca;
    protected Boolean tronco;
    protected Boolean bracos;
    protected Boolean pernas;

    public Humano(Boolean cabeca, Boolean tronco, Boolean bracos, Boolean pernas) {
        this.cabeca = cabeca;
        this.tronco = tronco;
        this.bracos = bracos;
        this.pernas = pernas;
    }

    public Humano(Boolean tronco){
        this.tronco = tronco;
    }
}
