package com.acme.enumeration;

public enum Cor {
    
    LARANJA(1), AMARELO(2), AZUL(3), VERMELHO(4), VERDE(5), BRANCO(6);
    
    private int codigoCor;
    
    Cor(int codigoCor){
        this.codigoCor= codigoCor;
    }    

    public int getCodigoCor() {
        return codigoCor;
    }    
}
