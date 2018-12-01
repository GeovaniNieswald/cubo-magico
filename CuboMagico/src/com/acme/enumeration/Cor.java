package com.acme.enumeration;

public enum Cor {

    BRANCO(1), AMARELO(2), VERDE(3), ROSA(4), AZUL(5), VERMELHO(6);

    private int codigoCor;

    Cor(int codigoCor) {
        this.codigoCor = codigoCor;
    }

    public int getCodigoCor() {
        return codigoCor;
    }
}
