package com.acme.model;

import com.acme.enumeration.Cor;
import com.acme.enumeration.Lado;

public class Cubo {

    private int[][] frente;
    private int[][] cima;
    private int[][] atras;
    private int[][] baixo;
    private int[][] esquerda;
    private int[][] direita;

    private int[][] matrizAux;
    private int[] vetorAux;

    public Cubo() {
        frente = new int[3][3];
        cima = new int[3][3];
        atras = new int[3][3];
        baixo = new int[3][3];
        esquerda = new int[3][3];
        direita = new int[3][3];

        matrizAux = new int[3][3];
        vetorAux = new int[3];

        povoarCuboResolvido();
    }

    private void povoarCuboResolvido() {
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                frente[linha][coluna] = Cor.AZUL.getCodigoCor();
                cima[linha][coluna] = Cor.LARANJA.getCodigoCor();
                atras[linha][coluna] = Cor.VERDE.getCodigoCor();
                baixo[linha][coluna] = Cor.BRANCO.getCodigoCor();
                esquerda[linha][coluna] = Cor.AMARELO.getCodigoCor();
                direita[linha][coluna] = Cor.VERMELHO.getCodigoCor();
            }
        }
    }

    public void exibirCubo() {
        System.out.print("        ");
        System.out.println(cima[0][0] + " " + cima[0][1] + " " + cima[0][2]);
        System.out.print("        ");
        System.out.println(cima[1][0] + " " + cima[1][1] + " " + cima[1][2]);
        System.out.print("        ");
        System.out.println(cima[2][0] + " " + cima[2][1] + " " + cima[2][2]);

        System.out.println(esquerda[0][0] + " " + esquerda[0][1] + " " + esquerda[0][2] + "   " + frente[0][0] + " " + frente[0][1] + " " + frente[0][2] + "   " + direita[0][0] + " " + direita[0][1] + " " + direita[0][2] + "   " + atras[0][2] + " " + atras[0][1] + " " + atras[0][0]);
        System.out.println(esquerda[1][0] + " " + esquerda[1][1] + " " + esquerda[1][2] + "   " + frente[1][0] + " " + frente[1][1] + " " + frente[1][2] + "   " + direita[1][0] + " " + direita[1][1] + " " + direita[1][2] + "   " + atras[1][2] + " " + atras[1][1] + " " + atras[1][0]);
        System.out.println(esquerda[2][0] + " " + esquerda[2][1] + " " + esquerda[2][2] + "   " + frente[2][0] + " " + frente[2][1] + " " + frente[2][2] + "   " + direita[2][0] + " " + direita[2][1] + " " + direita[2][2] + "   " + atras[2][2] + " " + atras[2][1] + " " + atras[2][0]);

        System.out.print("        ");
        System.out.println(baixo[0][0] + " " + baixo[0][1] + " " + baixo[0][2]);
        System.out.print("        ");
        System.out.println(baixo[1][0] + " " + baixo[1][1] + " " + baixo[1][2]);
        System.out.print("        ");
        System.out.println(baixo[2][0] + " " + baixo[2][1] + " " + baixo[2][2]);
        System.out.println("");
    }

    public void girarEsquerda(int linha) {
        matrizAux[linha] = esquerda[linha];

        esquerda[linha] = frente[linha];
        frente[linha] = direita[linha];
        direita[linha] = atras[linha];
        atras[linha] = matrizAux[linha];

        switch (linha) {
            case 0:
                matrizAux[0][0] = cima[0][0];

                cima[0][0] = cima[2][0];
                cima[2][0] = cima[2][2];
                cima[2][2] = cima[0][2];
                cima[0][2] = matrizAux[0][0];

                matrizAux[2][1] = cima[2][1];

                cima[2][1] = cima[1][2];
                cima[1][2] = cima[0][1];
                cima[0][1] = cima[1][0];
                cima[1][0] = matrizAux[2][1];
                break;
            case 2:
                matrizAux[0][0] = baixo[0][0];

                baixo[0][0] = baixo[0][2];
                baixo[0][2] = baixo[2][2];
                baixo[2][2] = baixo[2][0];
                baixo[2][0] = matrizAux[0][0];

                matrizAux[0][1] = baixo[0][1];
                baixo[0][1] = baixo[1][2];
                baixo[1][2] = baixo[2][1];
                baixo[2][1] = baixo[1][0];
                baixo[1][0] = matrizAux[0][1];
        }
    }

    public void girarDireita(int linha) {
        matrizAux[linha] = direita[linha];

        direita[linha] = frente[linha];
        frente[linha] = esquerda[linha];
        esquerda[linha] = atras[linha];
        atras[linha] = matrizAux[linha];

        switch (linha) {
            case 0:
                matrizAux[0][0] = cima[0][0];

                cima[0][0] = cima[0][2];
                cima[0][2] = cima[2][2];
                cima[2][2] = cima[2][0];
                cima[2][0] = matrizAux[0][0];

                matrizAux[0][1] = cima[0][1];
                cima[0][1] = cima[1][2];
                cima[1][2] = cima[2][1];
                cima[2][1] = cima[1][0];
                cima[1][0] = matrizAux[0][1];
                break;
            case 2:
                matrizAux[0][0] = baixo[0][0];

                baixo[0][0] = baixo[2][0];
                baixo[2][0] = baixo[2][2];
                baixo[2][2] = baixo[0][2];
                baixo[0][2] = matrizAux[0][0];

                matrizAux[2][1] = baixo[2][1];

                baixo[2][1] = baixo[1][2];
                baixo[1][2] = baixo[0][1];
                baixo[0][1] = baixo[1][0];
                baixo[1][0] = matrizAux[2][1];
        }
    }

    public void girarCima(int numColuna) {
        vetorAux = getColuna(numColuna, Lado.CIMA);
        setColuna(numColuna, getColuna(numColuna, Lado.FRENTE), Lado.CIMA);
        setColuna(numColuna, getColuna(numColuna, Lado.BAIXO), Lado.FRENTE);

    }

    private void girarBaixo(int coluna) {

    }

    private int[] getColuna(int numColuna, Lado lado) {
        int[] coluna = new int[3];

        switch (lado) {
            case FRENTE:
                coluna[0] = frente[0][numColuna];
                coluna[1] = frente[1][numColuna];
                coluna[2] = frente[2][numColuna];
                break;
            case ATRAS:
                coluna[0] = atras[0][numColuna];
                coluna[1] = atras[1][numColuna];
                coluna[2] = atras[2][numColuna];
                break;
            case ESQUERDA:
                coluna[0] = esquerda[0][numColuna];
                coluna[1] = esquerda[1][numColuna];
                coluna[2] = esquerda[2][numColuna];
                break;
            case DIREITA:
                coluna[0] = direita[0][numColuna];
                coluna[1] = direita[1][numColuna];
                coluna[2] = direita[2][numColuna];
                break;
            case CIMA:
                coluna[0] = cima[0][numColuna];
                coluna[1] = cima[1][numColuna];
                coluna[2] = cima[2][numColuna];
                break;
            case BAIXO:
                coluna[0] = baixo[0][numColuna];
                coluna[1] = baixo[1][numColuna];
                coluna[2] = baixo[2][numColuna];
        }

        return coluna;
    }

    private void setColuna(int numColuna, int[] coluna, Lado lado) {
        switch (lado) {
            case FRENTE:
                frente[0][numColuna] = coluna[0];
                frente[1][numColuna] = coluna[1];
                frente[2][numColuna] = coluna[2];
                break;
            case ATRAS:
                atras[0][numColuna] = coluna[0];
                atras[1][numColuna] = coluna[1];
                atras[2][numColuna] = coluna[2];
                break;
            case ESQUERDA:
                esquerda[0][numColuna] = coluna[0];
                esquerda[1][numColuna] = coluna[1];
                esquerda[2][numColuna] = coluna[2];
                break;
            case DIREITA:
                direita[0][numColuna] = coluna[0];
                direita[1][numColuna] = coluna[1];
                direita[2][numColuna] = coluna[2];
                break;
            case CIMA:
                cima[0][numColuna] = coluna[0];
                cima[1][numColuna] = coluna[1];
                cima[2][numColuna] = coluna[2];
                break;
            case BAIXO:
                baixo[0][numColuna] = coluna[0];
                baixo[1][numColuna] = coluna[1];
                baixo[2][numColuna] = coluna[2];
        }
    }

}
