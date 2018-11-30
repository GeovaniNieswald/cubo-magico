package com.acme.model;

import com.acme.enumeration.Cor;
import com.acme.enumeration.Lado;
import java.util.ArrayList;
import java.util.List;

public class Cubo {

    private int[][] frente;
    private int[][] cima;
    private int[][] atras;
    private int[][] baixo;
    private int[][] esquerda;
    private int[][] direita;

    public Cubo() {
        frente = new int[3][3];
        cima = new int[3][3];
        atras = new int[3][3];
        baixo = new int[3][3];
        esquerda = new int[3][3];
        direita = new int[3][3];

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

    public List<int[][]> getFaces() {
        List<int[][]> faces = new ArrayList<>();

        faces.add(frente);
        faces.add(cima);
        faces.add(atras);
        faces.add(baixo);
        faces.add(esquerda);
        faces.add(direita);

        return faces;
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

    public void girarEsquerda(int numLinha) {
        int[][] matrizAux = new int[3][3];

        matrizAux[numLinha] = esquerda[numLinha];

        esquerda[numLinha] = frente[numLinha];
        frente[numLinha] = direita[numLinha];
        direita[numLinha] = atras[numLinha];
        atras[numLinha] = matrizAux[numLinha];

        matrizAux = new int[3][3];

        switch (numLinha) {
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

    public void girarDireita(int numLinha) {
        int[][] matrizAux = new int[3][3];

        matrizAux[numLinha] = direita[numLinha];

        direita[numLinha] = frente[numLinha];
        frente[numLinha] = esquerda[numLinha];
        esquerda[numLinha] = atras[numLinha];
        atras[numLinha] = matrizAux[numLinha];

        matrizAux = new int[3][3];

        switch (numLinha) {
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
        int[] vetorAux = new int[3];
        int[][] matrizAux = new int[3][3];

        vetorAux = getColuna(numColuna, Lado.CIMA);
        setColuna(numColuna, getColuna(numColuna, Lado.FRENTE), Lado.CIMA);
        setColuna(numColuna, getColuna(numColuna, Lado.BAIXO), Lado.FRENTE);
        setColuna(numColuna, getColuna(numColuna, Lado.ATRAS), Lado.BAIXO);
        setColuna(numColuna, vetorAux, Lado.ATRAS);

        switch (numColuna) {
            case 0:
                matrizAux[0][0] = esquerda[0][0];
                
                esquerda[0][0] = esquerda[0][2];
                esquerda[0][2] = esquerda[2][2];
                esquerda[2][2] = esquerda[2][0];
                esquerda[2][0] = matrizAux[0][0];
                
                matrizAux[0][1] = esquerda[0][1];
                
                esquerda[0][1] = esquerda[1][2];
                esquerda[1][2] = esquerda[2][1];
                esquerda[2][1] = esquerda[1][0];
                esquerda[1][0] = matrizAux[0][1];
                break;
            case 2:
                matrizAux[0][2] = direita[0][2];
                
                direita[0][2] = direita[0][0];
                direita[0][0] = direita[2][0];
                direita[2][0] = direita[2][2];
                direita[2][2] = matrizAux[0][2];
                
                matrizAux[1][2] = direita[1][2];
                
                direita[1][2] = direita[0][1];
                direita[0][1] = direita[1][0];
                direita[1][0] = direita[2][1];
                direita[2][1] = matrizAux[1][2];
        }
    }

    public void girarBaixo(int numColuna) {
        int[] vetorAux = new int[3];
        int[][] matrizAux = new int[3][3];

        vetorAux = getColuna(numColuna, Lado.BAIXO);
        setColuna(numColuna, getColuna(numColuna, Lado.FRENTE), Lado.BAIXO);
        setColuna(numColuna, getColuna(numColuna, Lado.CIMA), Lado.FRENTE);
        setColuna(numColuna, getColuna(numColuna, Lado.ATRAS), Lado.CIMA);
        setColuna(numColuna, vetorAux, Lado.ATRAS);
        
        switch (numColuna) {
            case 0:
                matrizAux[0][2] = esquerda[0][2];
                
                esquerda[0][2] = esquerda[0][0];
                esquerda[0][0] = esquerda[2][0];
                esquerda[2][0] = esquerda[2][2];
                esquerda[2][2] = matrizAux[0][2];
                
                matrizAux[1][2] = esquerda[1][2];
                
                esquerda[1][2] = esquerda[0][1];
                esquerda[0][1] = esquerda[1][0];
                esquerda[1][0] = esquerda[2][1];
                esquerda[2][1] = matrizAux[1][2];
                break;
            case 2:
                matrizAux[0][0] = direita[0][0];
                
                direita[0][0] = direita[0][2];
                direita[0][2] = direita[2][2];
                direita[2][2] = direita[2][0];
                direita[2][0] = matrizAux[0][0];
                
                matrizAux[0][1] = direita[0][1];
                
                direita[0][1] = direita[1][2];
                direita[1][2] = direita[2][1];
                direita[2][1] = direita[1][0];
                direita[1][0] = matrizAux[0][1];
        }
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
                if (numColuna == 0) {
                    numColuna = 2;
                } else if (numColuna == 2) {
                    numColuna = 0;
                }

                coluna[0] = atras[2][numColuna];
                coluna[1] = atras[1][numColuna];
                coluna[2] = atras[0][numColuna];
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
                if (numColuna == 0) {
                    numColuna = 2;
                } else if (numColuna == 2) {
                    numColuna = 0;
                }

                atras[2][numColuna] = coluna[0];
                atras[1][numColuna] = coluna[1];
                atras[0][numColuna] = coluna[2];
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
