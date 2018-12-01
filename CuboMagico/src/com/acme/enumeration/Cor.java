package com.acme.enumeration;

public enum Cor {

    AZUL(1), VERMELHO(2), VERDE(3), AMARELO(4), ROSA(5), BRANCO(6);

    private int codigoCor;

    Cor(int codigoCor) {
        this.codigoCor = codigoCor;
    }

    public int getCodigoCor() {
        return codigoCor;
    }
}
