package com.acme;

import com.acme.enumeration.Cor;
import java.util.ArrayList;
import java.util.List;

public class SolucionarCubo {

    private Cubo c;

    private int[][] frente;
    private int[][] cima;
    private int[][] atras;
    private int[][] baixo;
    private int[][] esquerda;
    private int[][] direita;

    private int branco;
    private int amarelo;
    private int verde;
    private int azul;
    private int rosa;
    private int vermelho;

    public SolucionarCubo(Cubo c) {
        this.c = c;
        List<int[][]> faces = c.getFaces();

        frente = faces.get(0);
        cima = faces.get(1);
        atras = faces.get(2);
        baixo = faces.get(3);
        esquerda = faces.get(4);
        direita = faces.get(5);

        branco = Cor.BRANCO.getCodigoCor();
        amarelo = Cor.AMARELO.getCodigoCor();
        verde = Cor.VERDE.getCodigoCor();
        azul = Cor.AZUL.getCodigoCor();
        rosa = Cor.ROSA.getCodigoCor();
        vermelho = Cor.VERMELHO.getCodigoCor();
    }

    public Cubo solucionarPorMetodoBasico() {
        primeiraCamada();
        segundaCamada();
        cruzAmarela();
        orientacaoCantos();
        permutacoesDosCantos();
        permutacoesDosMeios();

        List<int[][]> faces = new ArrayList<>();
        faces.add(frente);
        faces.add(cima);
        faces.add(atras);
        faces.add(baixo);
        faces.add(esquerda);
        faces.add(direita);
        c.setFaces(faces);
        
        return c;
    }

    public Cubo solucionarPorForcaBruta() {

        // Algoritmo
        List<int[][]> faces = new ArrayList<>();
        faces.add(frente);
        faces.add(cima);
        faces.add(atras);
        faces.add(baixo);
        faces.add(esquerda);
        faces.add(direita);
        c.setFaces(faces);

        return c;
    }

    private void primeiraCamada() {
        //(Branco, Verde)
        if (baixo[1][2] == branco && direita[2][1] == verde) {
            c.girarEsquerda(2);
        } else if (baixo[2][1] == branco && atras[2][1] == verde) {
            c.girarEsquerda(2);
            c.girarEsquerda(2);
        } else if (baixo[1][0] == branco && esquerda[2][1] == verde) {
            c.girarDireita(2);
        } else if (frente[2][1] == branco && baixo[0][1] == verde) {
            c.girarAntiHorario(2);
            c.girarBaixo(2);
            c.girarEsquerda(2);
        } else if (frente[1][2] == branco && direita[1][0] == verde) {
            c.girarBaixo(2);
            c.girarEsquerda(2);
        } else if (frente[0][1] == branco && cima[2][1] == verde) {
            c.girarEsquerda(0);
            c.girarBaixo(0);
            c.girarAntiHorario(2);
        } else if (frente[1][0] == branco && esquerda[1][2] == verde) {
            c.girarBaixo(0);
            c.girarDireita(2);
        } else if (esquerda[1][2] == branco && frente[1][0] == verde) {
            c.girarAntiHorario(2);
        } else if (esquerda[2][1] == branco && baixo[1][0] == verde) {
            c.girarCima(0);
            c.girarAntiHorario(2);
        } else if (esquerda[0][1] == branco && cima[1][0] == verde) {
            c.girarBaixo(0);
            c.girarAntiHorario(2);
        } else if (esquerda[1][0] == branco && atras[1][0] == verde) {
            c.girarCima(0);
            c.girarCima(0);
            c.girarAntiHorario(2);
        } else if (direita[1][0] == branco && frente[1][2] == verde) {
            c.girarHorario(2);
        } else if (direita[2][1] == branco && baixo[1][2] == verde) {
            c.girarCima(2);
            c.girarHorario(2);
        } else if (direita[1][2] == branco && atras[1][2] == verde) {
            c.girarCima(2);
            c.girarCima(2);
            c.girarHorario(2);
        } else if (direita[0][1] == branco && cima[1][2] == verde) {
            c.girarBaixo(2);
            c.girarHorario(2);
        } else if (cima[2][1] == branco && frente[0][1] == verde) {
            c.girarAntiHorario(2);
            c.girarAntiHorario(2);
        } else if (cima[1][0] == branco && esquerda[0][1] == verde) {
            c.girarDireita(0);
            c.girarAntiHorario(2);
            c.girarAntiHorario(2);
        } else if (cima[1][2] == branco && direita[0][1] == verde) {
            c.girarEsquerda(0);
            c.girarAntiHorario(2);
            c.girarAntiHorario(2);
        } else if (cima[0][1] == branco && atras[0][1] == verde) {
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarAntiHorario(2);
            c.girarAntiHorario(2);
        } else if (atras[0][1] == branco && cima[0][1] == verde) {
            c.girarDireita(0);
            c.girarBaixo(0);
            c.girarAntiHorario(2);
        } else if (atras[1][0] == branco && esquerda[1][0] == verde) {
            c.girarCima(0);
            c.girarDireita(2);
        } else if (atras[1][2] == branco && direita[1][2] == verde) {
            c.girarCima(2);
            c.girarEsquerda(2);
        } else if (atras[2][1] == branco && baixo[2][1] == verde) {
            c.girarHorario(0);
            c.girarCima(0);
            c.girarDireita(2);
        }

        //(Branco, Vermelho)
        if (baixo[2][1] == branco && atras[2][1] == vermelho) {
            c.girarHorario(0);
            c.girarHorario(0);
            c.girarDireita(0);
            c.girarCima(0);
            c.girarCima(0);
        } else if (baixo[1][2] == branco && direita[2][1] == vermelho) {
            c.girarCima(2);
            c.girarCima(2);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarCima(0);
            c.girarCima(0);
        } else if (esquerda[2][1] == branco && baixo[1][0] == vermelho) {
            c.girarCima(0);
            c.girarCima(0);
            c.girarEsquerda(0);
            c.girarAntiHorario(0);
            c.girarCima(0);
        } else if (esquerda[1][2] == branco && frente[1][0] == vermelho) {
            c.girarCima(0);
            c.girarEsquerda(0);
            c.girarAntiHorario(0);
            c.girarCima(0);
        } else if (esquerda[0][1] == branco && cima[1][0] == vermelho) {
            c.girarEsquerda(0);
            c.girarAntiHorario(0);
            c.girarCima(0);
        } else if (esquerda[1][0] == branco && atras[1][0] == vermelho) {
            c.girarBaixo(0);
            c.girarEsquerda(0);
            c.girarAntiHorario(0);
            c.girarCima(0);
        } else if (direita[1][0] == branco && frente[1][2] == vermelho) {
            c.girarCima(2);
            c.girarCima(2);
            c.girarAntiHorario(0);
            c.girarDireita(0);
            c.girarCima(0);
            c.girarCima(0);
        } else if (direita[0][1] == branco && cima[1][2] == vermelho) {
            c.girarCima(2);
            c.girarAntiHorario(0);
            c.girarDireita(0);
            c.girarCima(0);
            c.girarCima(0);
        } else if (direita[1][2] == branco && atras[1][2] == vermelho) {
            c.girarAntiHorario(0);
            c.girarDireita(0);
            c.girarCima(0);
            c.girarCima(0);
        } else if (direita[2][1] == branco && baixo[1][2] == vermelho) {
            c.girarBaixo(2);
            c.girarAntiHorario(0);
            c.girarDireita(0);
            c.girarCima(0);
            c.girarCima(0);
        } else if (frente[1][0] == branco && esquerda[1][2] == vermelho) {
            c.girarBaixo(0);
        } else if (frente[0][1] == branco && cima[2][1] == vermelho) {
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarAntiHorario(0);
            c.girarCima(0);
        } else if (frente[1][2] == branco && direita[1][0] == vermelho) {
            c.girarCima(2);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarCima(0);
            c.girarCima(0);
        } else if (cima[2][1] == branco && frente[0][1] == vermelho) {
            c.girarEsquerda(0);
            c.girarCima(0);
            c.girarCima(0);
        } else if (cima[1][0] == branco && esquerda[0][1] == vermelho) {
            c.girarCima(0);
            c.girarCima(0);
        } else if (cima[0][1] == branco && atras[0][1] == vermelho) {
            c.girarDireita(0);
            c.girarCima(0);
            c.girarCima(0);
        } else if (cima[1][2] == branco && direita[0][1] == vermelho) {
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarCima(0);
            c.girarCima(0);
        } else if (atras[2][1] == branco && baixo[2][1] == vermelho) {
            c.girarHorario(0);
            c.girarCima(0);
        } else if (atras[1][0] == branco && esquerda[1][0] == vermelho) {
            c.girarCima(0);
        } else if (atras[1][2] == branco && direita[1][2] == vermelho) {
            c.girarHorario(0);
            c.girarHorario(0);
            c.girarCima(0);
        } else if (atras[0][1] == branco && cima[0][1] == vermelho) {
            c.girarAntiHorario(0);
            c.girarCima(0);
        }

        //(Branco, Azul)
        if (baixo[1][2] == branco && direita[2][1] == azul) {
            c.girarCima(2);
            c.girarCima(2);
            c.girarDireita(0);
            c.girarHorario(0);
            c.girarHorario(0);
        } else if (esquerda[1][0] == branco && atras[1][0] == azul) {
            c.girarAntiHorario(0);
        } else if (esquerda[1][2] == branco && frente[1][0] == azul) {
            c.girarCima(0);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarBaixo(0);
            c.girarCima(2);
            c.girarHorario(0);
        } else if (esquerda[0][1] == branco && cima[1][0] == azul) {
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarCima(2);
            c.girarHorario(0);
        } else if (direita[1][0] == branco && frente[1][2] == azul) {
            c.girarCima(2);
            c.girarCima(2);
            c.girarHorario(0);
        } else if (direita[0][1] == branco && cima[1][2] == azul) {
            c.girarCima(2);
            c.girarHorario(0);
        } else if (direita[1][2] == branco && atras[1][2] == azul) {
            c.girarHorario(0);
        } else if (direita[2][1] == branco && baixo[1][2] == azul) {
            c.girarBaixo(2);
            c.girarHorario(0);
        } else if (frente[1][0] == branco && esquerda[1][2] == azul) {
            c.girarCima(0);
            c.girarDireita(0);
            c.girarBaixo(0);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarHorario(0);
            c.girarHorario(0);
        } else if (frente[1][2] == branco && direita[1][0] == azul) {
            c.girarCima(2);
            c.girarDireita(0);
            c.girarHorario(0);
            c.girarHorario(0);
        } else if (frente[0][1] == branco && cima[2][1] == azul) {
            c.girarDireita(0);
            c.girarCima(2);
            c.girarHorario(0);
        } else if (cima[2][1] == branco && frente[0][1] == azul) {
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarHorario(0);
            c.girarHorario(0);
        } else if (cima[1][0] == branco && esquerda[0][1] == azul) {
            c.girarEsquerda(0);
            c.girarHorario(0);
            c.girarHorario(0);
        } else if (cima[1][2] == branco && direita[0][1] == azul) {
            c.girarDireita(0);
            c.girarHorario(0);
            c.girarHorario(0);
        } else if (cima[0][1] == branco && atras[0][1] == azul) {
            c.girarHorario(0);
            c.girarHorario(0);
        } else if (atras[0][1] == branco && cima[0][1] == azul) {
            c.girarEsquerda(0);
            c.girarCima(2);
            c.girarHorario(0);
        } else if (atras[1][0] == branco && esquerda[1][0] == azul) {
            c.girarHorario(0);
            c.girarEsquerda(0);
            c.girarCima(2);
            c.girarHorario(0);
        } else if (atras[1][2] == branco && direita[1][2] == azul) {
            c.girarAntiHorario(0);
            c.girarEsquerda(0);
            c.girarCima(2);
            c.girarHorario(0);
        } else if (atras[2][1] == branco && baixo[2][1] == azul) {
            c.girarHorario(0);
            c.girarHorario(0);
            c.girarEsquerda(0);
            c.girarCima(2);
            c.girarHorario(0);
        }

        //(Branco, Rosa)
        if (direita[2][1] == branco && baixo[1][2] == rosa) {
            c.girarHorario(0);
            c.girarBaixo(2);
            c.girarAntiHorario(0);
            c.girarEsquerda(0);
            c.girarCima(2);
            c.girarCima(2);
        } else if (direita[1][0] == branco && frente[1][2] == rosa) {
            c.girarHorario(0);
            c.girarCima(2);
            c.girarCima(2);
            c.girarAntiHorario(0);
            c.girarEsquerda(0);
            c.girarCima(2);
            c.girarCima(2);
        } else if (direita[0][1] == branco && cima[1][2] == rosa) {
            c.girarHorario(0);
            c.girarCima(2);
            c.girarAntiHorario(0);
            c.girarEsquerda(0);
            c.girarCima(2);
            c.girarCima(2);
        } else if (direita[1][2] == branco && atras[1][2] == rosa) {
            c.girarAntiHorario(0);
            c.girarEsquerda(0);
            c.girarHorario(0);
            c.girarCima(2);
            c.girarCima(2);
        } else if (frente[1][0] == branco && esquerda[1][2] == rosa) {
            c.girarCima(0);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarBaixo(0);
            c.girarCima(2);
            c.girarCima(2);
        } else if (frente[1][2] == branco && direita[1][0] == rosa) {
            c.girarBaixo(2);
        } else if (frente[0][1] == branco && cima[2][1] == rosa) {
            c.girarHorario(2);
            c.girarBaixo(2);
            c.girarAntiHorario(2);
        } else if (esquerda[0][1] == branco && cima[1][0] == rosa) {
            c.girarAntiHorario(2);
            c.girarDireita(0);
            c.girarHorario(2);
            c.girarBaixo(2);
        } else if (esquerda[1][2] == branco && frente[1][0] == rosa) {
            c.girarHorario(2);
            c.girarDireita(0);
            c.girarCima(2);
            c.girarCima(2);
            c.girarAntiHorario(2);
        } else if (esquerda[1][0] == branco && atras[1][0] == rosa) {
            c.girarHorario(0);
            c.girarEsquerda(0);
            c.girarCima(2);
            c.girarCima(2);
            c.girarAntiHorario(0);
        } else if (cima[2][1] == branco && frente[0][1] == rosa) {
            c.girarDireita(0);
            c.girarCima(2);
            c.girarCima(2);
        } else if (cima[1][2] == branco && direita[0][1] == rosa) {
            c.girarCima(2);
            c.girarCima(2);
        } else if (cima[1][0] == branco && esquerda[0][1] == rosa) {
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarCima(2);
            c.girarCima(2);
        } else if (cima[0][1] == branco && atras[0][1] == rosa) {
            c.girarEsquerda(0);
            c.girarCima(2);
            c.girarCima(2);
        } else if (atras[1][2] == branco && direita[1][2] == rosa) {
            c.girarCima(2);
        } else if (atras[1][0] == branco && esquerda[1][0] == rosa) {
            c.girarBaixo(0);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarCima(2);
            c.girarCima(2);
            c.girarCima(0);
        } else if (atras[0][1] == branco && cima[0][1] == rosa) {
            c.girarHorario(0);
            c.girarCima(2);
            c.girarAntiHorario(0);
        }

        //FINALIZANDO PRIMEIRA CAMADA
        //(Branco, Verde, Rosa)
        if (baixo[0][0] == branco && frente[2][0] == rosa && esquerda[2][2] == verde) {
            c.girarCima(0);
            c.girarDireita(0);
            c.girarBaixo(0);
            c.girarCima(2);
            c.girarEsquerda(0);
            c.girarBaixo(2);
        } else if (baixo[2][0] == branco && esquerda[2][0] == rosa && atras[2][0] == verde) {
            c.girarHorario(0);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarAntiHorario(0);
            c.girarCima(2);
            c.girarEsquerda(0);
            c.girarBaixo(2);
        } else if (baixo[2][2] == branco && direita[2][2] == verde && atras[2][2] == rosa) {
            c.girarAntiHorario(0);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarHorario(0);
            c.girarCima(2);
            c.girarDireita(0);
            c.girarBaixo(2);
        } else if (frente[2][2] == branco && baixo[0][2] == rosa && direita[2][0] == verde) {
            c.girarCima(2);
            c.girarDireita(0);
            c.girarBaixo(2);
            c.girarEsquerda(0);
            c.girarCima(2);
            c.girarDireita(0);
            c.girarBaixo(2);
        } else if (frente[2][0] == branco && baixo[0][0] == verde && esquerda[2][2] == rosa) {
            c.girarCima(0);
            c.girarEsquerda(0);
            c.girarBaixo(0);
            c.girarDireita(0);
            c.girarCima(2);
            c.girarEsquerda(0);
            c.girarBaixo(2);
        } else if (frente[0][2] == branco && cima[2][2] == verde && direita[0][0] == rosa) {
            c.girarEsquerda(0);
            c.girarCima(2);
            c.girarDireita(0);
            c.girarBaixo(2);
        } else if (frente[0][0] == branco && cima[2][0] == rosa && esquerda[0][2] == verde) {
            c.girarDireita(0);
            c.girarCima(2);
            c.girarEsquerda(0);
            c.girarBaixo(2);
        } else if (esquerda[2][2] == branco && frente[2][0] == verde && baixo[0][0] == rosa) {
            c.girarCima(0);
            c.girarCima(2);
            c.girarDireita(0);
            c.girarBaixo(0);
            c.girarBaixo(2);
        } else if (esquerda[0][2] == branco && frente[0][0] == rosa && cima[2][0] == verde) {
            c.girarCima(2);
            c.girarDireita(0);
            c.girarBaixo(2);
        } else if (esquerda[0][0] == branco && cima[0][0] == rosa && atras[0][0] == verde) {
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarCima(2);
            c.girarEsquerda(0);
            c.girarBaixo(2);
        } else if (esquerda[2][0] == branco && baixo[2][0] == verde && atras[2][0] == rosa) {
            c.girarHorario(0);
            c.girarEsquerda(0);
            c.girarAntiHorario(0);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarCima(2);
            c.girarEsquerda(0);
            c.girarBaixo(2);
        } else if (direita[2][0] == branco && frente[2][2] == rosa && baixo[0][2] == verde) {
            c.girarCima(2);
            c.girarEsquerda(0);
            c.girarBaixo(2);
            c.girarDireita(0);
            c.girarCima(2);
            c.girarEsquerda(0);
            c.girarBaixo(2);
        } else if (direita[0][0] == branco && frente[0][2] == verde && cima[2][2] == rosa) {
            c.girarCima(2);
            c.girarEsquerda(0);
            c.girarBaixo(2);
        } else if (direita[0][2] == branco && cima[0][2] == verde && atras[0][2] == rosa) {
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarCima(2);
            c.girarDireita(0);
            c.girarBaixo(2);
        } else if (direita[2][2] == branco && baixo[2][2] == rosa && atras[2][2] == verde) {
            c.girarAntiHorario(0);
            c.girarDireita(0);
            c.girarHorario(0);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarCima(2);
            c.girarDireita(0);
            c.girarBaixo(2);
        } else if (cima[2][2] == branco && frente[0][2] == rosa && direita[0][0] == verde) {
            c.girarCima(2);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarBaixo(2);
            c.girarDireita(0);
            c.girarCima(2);
            c.girarEsquerda(0);
            c.girarBaixo(2);
        } else if (cima[2][0] == branco && frente[0][0] == verde && esquerda[0][2] == rosa) {
            c.girarDireita(0);
            c.girarCima(2);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarBaixo(2);
            c.girarDireita(0);
            c.girarCima(2);
            c.girarEsquerda(0);
            c.girarBaixo(2);
        } else if (cima[0][2] == branco && direita[0][2] == rosa && atras[0][2] == verde) {
            c.girarEsquerda(0);
            c.girarCima(2);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarBaixo(2);
            c.girarDireita(0);
            c.girarCima(2);
            c.girarEsquerda(0);
            c.girarBaixo(2);
        } else if (cima[0][0] == branco && esquerda[0][0] == verde && atras[0][0] == rosa) {
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarCima(2);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarBaixo(2);
            c.girarDireita(0);
            c.girarCima(2);
            c.girarEsquerda(0);
            c.girarBaixo(2);
        } else if (atras[0][0] == branco && esquerda[0][0] == rosa && cima[0][0] == verde) {
            c.girarCima(2);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarBaixo(2);
        } else if (atras[0][2] == branco && direita[0][2] == verde && cima[0][2] == rosa) {
            c.girarEsquerda(0);
            c.girarCima(2);
            c.girarEsquerda(0);
            c.girarBaixo(2);
        } else if (atras[2][2] == branco && baixo[2][2] == verde && direita[2][2] == rosa) {
            c.girarAntiHorario(0);
            c.girarEsquerda(0);
            c.girarHorario(0);
            c.girarCima(2);
            c.girarEsquerda(0);
            c.girarBaixo(2);
        } else if (atras[2][0] == branco && esquerda[2][0] == verde && baixo[2][0] == rosa) {
            c.girarHorario(0);
            c.girarDireita(0);
            c.girarAntiHorario(0);
            c.girarCima(2);
            c.girarDireita(0);
            c.girarBaixo(2);
        }

        //(Branco, Verde, Vermelho)
        if (baixo[2][0] == branco && esquerda[2][0] == verde && atras[2][0] == vermelho) {
            c.girarHorario(0);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarAntiHorario(0);
            c.girarCima(0);
            c.girarEsquerda(0);
            c.girarBaixo(0);
        } else if (baixo[2][2] == branco && direita[2][2] == vermelho && atras[2][2] == verde) {
            c.girarAntiHorario(0);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarHorario(0);
            c.girarCima(0);
            c.girarDireita(0);
            c.girarBaixo(0);
        } else if (frente[2][0] == branco && baixo[0][0] == vermelho && esquerda[2][2] == verde) {
            c.girarCima(0);
            c.girarEsquerda(0);
            c.girarBaixo(0);
            c.girarDireita(0);
            c.girarCima(0);
            c.girarEsquerda(0);
            c.girarBaixo(0);
        } else if (frente[0][0] == branco && cima[2][0] == verde && esquerda[0][2] == vermelho) {
            c.girarDireita(0);
            c.girarCima(0);
            c.girarEsquerda(0);
            c.girarBaixo(0);
        } else if (frente[0][2] == branco && cima[2][2] == vermelho && direita[0][0] == verde) {
            c.girarEsquerda(0);
            c.girarCima(0);
            c.girarDireita(0);
            c.girarBaixo(0);
        } else if (esquerda[2][2] == branco && frente[2][0] == vermelho && baixo[0][0] == verde) {
            c.girarCima(0);
            c.girarDireita(0);
            c.girarBaixo(0);
            c.girarEsquerda(0);
            c.girarCima(0);
            c.girarDireita(0);
            c.girarBaixo(0);
        } else if (esquerda[2][0] == branco && atras[2][0] == verde && baixo[2][0] == vermelho) {
            c.girarHorario(0);
            c.girarEsquerda(0);
            c.girarAntiHorario(0);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarCima(0);
            c.girarEsquerda(0);
            c.girarBaixo(0);
        } else if (esquerda[0][2] == branco && frente[0][0] == verde && cima[2][0] == vermelho) {
            c.girarCima(0);
            c.girarDireita(0);
            c.girarBaixo(0);
        } else if (esquerda[0][0] == branco && cima[0][0] == verde && atras[0][0] == vermelho) {
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarCima(0);
            c.girarEsquerda(0);
            c.girarBaixo(0);
        } else if (direita[0][0] == branco && frente[0][2] == vermelho && cima[2][2] == verde) {
            c.girarCima(0);
            c.girarEsquerda(0);
            c.girarBaixo(0);
        } else if (direita[0][2] == branco && cima[0][2] == vermelho && atras[0][2] == verde) {
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarCima(0);
            c.girarDireita(0);
            c.girarBaixo(0);
        } else if (direita[2][2] == branco && baixo[2][2] == verde && atras[2][2] == vermelho) {
            c.girarAntiHorario(0);
            c.girarDireita(0);
            c.girarHorario(0);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarCima(0);
            c.girarDireita(0);
            c.girarBaixo(0);
        } else if (cima[2][0] == branco && frente[0][0] == vermelho && esquerda[0][2] == verde) {
            c.girarCima(0);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarBaixo(0);
            c.girarEsquerda(0);
            c.girarCima(0);
            c.girarDireita(0);
            c.girarBaixo(0);
        } else if (cima[2][2] == branco && frente[0][2] == verde && direita[0][0] == vermelho) {
            c.girarCima(0);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarBaixo(0);
            c.girarDireita(0);
            c.girarCima(0);
            c.girarEsquerda(0);
            c.girarBaixo(0);
        } else if (cima[0][2] == branco && direita[0][2] == verde && atras[0][2] == vermelho) {
            c.girarCima(0);
            c.girarDireita(0);
            c.girarBaixo(0);
            c.girarDireita(0);
            c.girarCima(0);
            c.girarEsquerda(0);
            c.girarBaixo(0);
        } else if (cima[0][0] == branco && esquerda[0][0] == vermelho && atras[0][0] == verde) {
            c.girarDireita(0);
            c.girarCima(0);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarBaixo(0);
            c.girarEsquerda(0);
            c.girarCima(0);
            c.girarDireita(0);
            c.girarBaixo(0);
        } else if (atras[0][0] == branco && esquerda[0][0] == verde && cima[0][0] == vermelho) {
            c.girarDireita(0);
            c.girarCima(0);
            c.girarDireita(0);
            c.girarBaixo(0);
        } else if (atras[0][2] == branco && cima[0][2] == verde && direita[0][2] == vermelho) {
            c.girarCima(0);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarBaixo(0);
        } else if (atras[2][0] == branco && baixo[2][0] == verde && esquerda[2][0] == vermelho) {
            c.girarHorario(0);
            c.girarDireita(0);
            c.girarAntiHorario(0);
            c.girarCima(0);
            c.girarDireita(0);
            c.girarBaixo(0);
        } else if (atras[2][2] == branco && direita[2][2] == verde && baixo[2][2] == vermelho) {
            c.girarAntiHorario(0);
            c.girarEsquerda(0);
            c.girarHorario(0);
            c.girarCima(0);
            c.girarEsquerda(0);
            c.girarBaixo(0);
        }

        //(Branco, Vermelho, Azul)
        if (baixo[2][2] == branco && direita[2][2] == azul && atras[2][2] == vermelho) {
            c.girarAntiHorario(0);
            c.girarDireita(0);
            c.girarHorario(0);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarHorario(0);
            c.girarEsquerda(0);
            c.girarAntiHorario(0);
        } else if (atras[2][0] == branco && baixo[2][0] == vermelho && esquerda[2][0] == azul) {
            c.girarHorario(0);
            c.girarDireita(0);
            c.girarAntiHorario(0);
            c.girarEsquerda(0);
            c.girarHorario(0);
            c.girarDireita(0);
            c.girarAntiHorario(0);
        } else if (atras[2][2] == branco && baixo[2][2] == azul && direita[2][2] == vermelho) {
            c.girarAntiHorario(0);
            c.girarEsquerda(0);
            c.girarHorario(0);
            c.girarHorario(0);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarAntiHorario(0);
        } else if (atras[0][0] == branco && cima[0][0] == azul && esquerda[0][0] == vermelho) {
            c.girarHorario(0);
            c.girarDireita(0);
            c.girarAntiHorario(0);
        } else if (atras[0][2] == branco && cima[0][2] == vermelho && direita[0][2] == azul) {
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarHorario(0);
            c.girarEsquerda(0);
            c.girarAntiHorario(0);
        } else if (esquerda[2][0] == branco && baixo[2][0] == azul && atras[2][0] == vermelho) {
            c.girarHorario(0);
            c.girarEsquerda(0);
            c.girarAntiHorario(0);
            c.girarDireita(0);
            c.girarHorario(0);
            c.girarEsquerda(0);
            c.girarAntiHorario(0);
        } else if (esquerda[0][2] == branco && frente[0][0] == vermelho && cima[2][0] == azul) {
            c.girarEsquerda(0);
            c.girarHorario(0);
            c.girarDireita(0);
            c.girarAntiHorario(0);
        } else if (esquerda[0][0] == branco && cima[0][0] == vermelho && atras[0][0] == azul) {
            c.girarDireita(0);
            c.girarHorario(0);
            c.girarEsquerda(0);
            c.girarAntiHorario(0);
        } else if (direita[0][0] == branco && frente[0][2] == azul && cima[2][2] == vermelho) {
            c.girarHorario(0);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarAntiHorario(0);
        } else if (direita[0][2] == branco && cima[0][2] == azul && atras[0][2] == vermelho) {
            c.girarDireita(0);
            c.girarHorario(0);
            c.girarDireita(0);
            c.girarAntiHorario(0);
        } else if (direita[2][2] == branco && baixo[2][2] == vermelho && atras[2][2] == azul) {
            c.girarAntiHorario(0);
            c.girarDireita(0);
            c.girarHorario(0);
            c.girarDireita(0);
            c.girarHorario(0);
            c.girarDireita(0);
            c.girarAntiHorario(0);
        } else if (frente[0][0] == branco && cima[2][0] == vermelho && esquerda[0][2] == azul) {
            c.girarHorario(0);
            c.girarEsquerda(0);
            c.girarAntiHorario(0);
        } else if (frente[0][2] == branco && cima[2][2] == azul && direita[0][0] == vermelho) {
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarHorario(0);
            c.girarDireita(0);
            c.girarAntiHorario(0);
        } else if (cima[2][0] == branco && frente[0][0] == azul && esquerda[0][2] == vermelho) {
            c.girarEsquerda(0);
            c.girarHorario(0);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarAntiHorario(0);
            c.girarEsquerda(0);
            c.girarHorario(0);
            c.girarDireita(0);
            c.girarAntiHorario(0);
        } else if (cima[2][2] == branco && frente[0][2] == vermelho && direita[0][0] == azul) {
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarHorario(0);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarAntiHorario(0);
            c.girarEsquerda(0);
            c.girarHorario(0);
            c.girarDireita(0);
            c.girarAntiHorario(0);
        } else if (cima[0][0] == branco && esquerda[0][0] == azul && atras[0][0] == vermelho) {
            c.girarHorario(0);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarAntiHorario(0);
            c.girarEsquerda(0);
            c.girarHorario(0);
            c.girarDireita(0);
            c.girarAntiHorario(0);
        } else if (cima[0][2] == branco && direita[0][2] == vermelho && atras[0][2] == azul) {
            c.girarDireita(0);
            c.girarHorario(0);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarAntiHorario(0);
            c.girarEsquerda(0);
            c.girarHorario(0);
            c.girarDireita(0);
            c.girarAntiHorario(0);
        }

        //(Branco, Rosa, Azul)
        if (direita[2][2] == branco && baixo[2][2] == azul && atras[2][2] == rosa) {
            c.girarAntiHorario(0);
            c.girarDireita(0);
            c.girarHorario(0);
            c.girarEsquerda(0);
            c.girarAntiHorario(0);
            c.girarDireita(0);
            c.girarHorario(0);
        } else if (direita[0][2] == branco && cima[0][2] == rosa && atras[0][2] == azul) {
            c.girarEsquerda(0);
            c.girarAntiHorario(0);
            c.girarDireita(0);
            c.girarHorario(0);
        } else if (direita[0][0] == branco && frente[0][2] == rosa && cima[2][2] == azul) {
            c.girarDireita(0);
            c.girarAntiHorario(0);
            c.girarEsquerda(0);
            c.girarHorario(0);
        } else if (esquerda[0][2] == branco && frente[0][0] == azul && cima[2][0] == rosa) {
            c.girarAntiHorario(0);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarHorario(0);
        } else if (esquerda[0][0] == branco && cima[0][0] == azul && atras[0][0] == rosa) {
            c.girarEsquerda(0);
            c.girarAntiHorario(0);
            c.girarEsquerda(0);
            c.girarHorario(0);
        } else if (frente[0][0] == branco && cima[2][0] == azul && esquerda[0][2] == rosa) {
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarAntiHorario(0);
            c.girarEsquerda(0);
            c.girarHorario(0);
        } else if (frente[0][2] == branco && cima[2][2] == rosa && direita[0][0] == azul) {
            c.girarAntiHorario(0);
            c.girarDireita(0);
            c.girarHorario(0);
        } else if (atras[2][2] == branco && direita[2][2] == azul && baixo[2][2] == rosa) {
            c.girarAntiHorario(0);
            c.girarEsquerda(0);
            c.girarHorario(0);
            c.girarDireita(0);
            c.girarAntiHorario(0);
            c.girarEsquerda(0);
            c.girarHorario(0);
        } else if (atras[0][2] == branco && direita[0][2] == rosa && cima[0][2] == azul) {
            c.girarAntiHorario(0);
            c.girarEsquerda(0);
            c.girarHorario(0);
        } else if (atras[0][0] == branco && cima[0][0] == rosa && esquerda[0][0] == azul) {
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarAntiHorario(0);
            c.girarDireita(0);
            c.girarHorario(0);
        } else if (cima[0][0] == branco && atras[0][0] == azul && esquerda[0][0] == rosa) {
            c.girarEsquerda(0);
            c.girarAntiHorario(0);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarHorario(0);
            c.girarDireita(0);
            c.girarAntiHorario(0);
            c.girarEsquerda(0);
            c.girarHorario(0);
        } else if (cima[0][2] == branco && atras[0][2] == rosa && direita[0][2] == azul) {
            c.girarAntiHorario(0);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarHorario(0);
            c.girarDireita(0);
            c.girarAntiHorario(0);
            c.girarEsquerda(0);
            c.girarHorario(0);
        } else if (cima[2][0] == branco && frente[0][0] == rosa && esquerda[0][2] == azul) {
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarAntiHorario(0);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarHorario(0);
            c.girarDireita(0);
            c.girarAntiHorario(0);
            c.girarEsquerda(0);
            c.girarHorario(0);
        } else if (cima[2][2] == branco && frente[0][2] == azul && direita[0][0] == rosa) {
            c.girarDireita(0);
            c.girarAntiHorario(0);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarHorario(0);
            c.girarDireita(0);
            c.girarAntiHorario(0);
            c.girarEsquerda(0);
            c.girarHorario(0);
        }
    }

    private void segundaCamada() {
        //(Verde, Rosa)
        if (frente[1][0] == verde && esquerda[1][2] == rosa) {
            c.girarCima(0);
            c.girarEsquerda(0);
            c.girarBaixo(0);
            c.girarAntiHorario(2);
            c.girarEsquerda(0);
            c.girarHorario(2);
            c.girarEsquerda(0);
            c.girarCima(2);
            c.girarDireita(0);
            c.girarBaixo(2);
            c.girarCima(0);
            c.girarDireita(0);
            c.girarBaixo(0);
        } else if (frente[0][1] == verde && cima[2][1] == rosa) {
            c.girarEsquerda(0);
            c.girarCima(2);
            c.girarDireita(0);
            c.girarBaixo(2);
            c.girarDireita(0);
            c.girarAntiHorario(2);
            c.girarEsquerda(0);
            c.girarHorario(2);
        } else if (esquerda[1][2] == verde && frente[1][0] == rosa) {
            c.girarCima(0);
            c.girarDireita(0);
            c.girarBaixo(0);
            c.girarEsquerda(0);
            c.girarCima(2);
            c.girarDireita(0);
            c.girarBaixo(2);
            c.girarDireita(0);
            c.girarAntiHorario(2);
            c.girarEsquerda(0);
            c.girarHorario(2);
            c.girarCima(0);
            c.girarEsquerda(0);
            c.girarBaixo(0);
        } else if (esquerda[1][0] == verde && atras[1][0] == rosa) {
            c.girarHorario(0);
            c.girarDireita(0);
            c.girarAntiHorario(0);
            c.girarEsquerda(0);
            c.girarAntiHorario(2);
            c.girarEsquerda(0);
            c.girarHorario(2);
            c.girarEsquerda(0);
            c.girarCima(2);
            c.girarDireita(0);
            c.girarBaixo(2);
            c.girarHorario(0);
            c.girarDireita(0);
            c.girarAntiHorario(0);
        } else if (esquerda[0][1] == verde && cima[1][0] == rosa) {
            c.girarCima(2);
            c.girarDireita(0);
            c.girarBaixo(2);
            c.girarDireita(0);
            c.girarAntiHorario(2);
            c.girarEsquerda(0);
            c.girarHorario(2);
        } else if (direita[1][0] == verde && frente[1][2] == rosa) {
            c.girarCima(2);
            c.girarEsquerda(0);
            c.girarBaixo(2);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarCima(2);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarBaixo(2);
            c.girarEsquerda(0);
            c.girarAntiHorario(2);
            c.girarDireita(0);
            c.girarHorario(2);
        } else if (direita[0][1] == verde && cima[1][2] == rosa) {
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarCima(2);
            c.girarDireita(0);
            c.girarBaixo(2);
            c.girarDireita(0);
            c.girarAntiHorario(2);
            c.girarEsquerda(0);
            c.girarHorario(2);
        } else if (direita[1][2] == verde && atras[1][2] == rosa) {
            c.girarAntiHorario(0);
            c.girarEsquerda(0);
            c.girarHorario(0);
            c.girarDireita(0);
            c.girarAntiHorario(2);
            c.girarEsquerda(0);
            c.girarHorario(2);
            c.girarEsquerda(0);
            c.girarCima(2);
            c.girarDireita(0);
            c.girarBaixo(2);
            c.girarAntiHorario(0);
            c.girarDireita(0);
            c.girarHorario(0);
        } else if (atras[1][0] == verde && esquerda[1][0] == rosa) {
            c.girarHorario(0);
            c.girarDireita(0);
            c.girarAntiHorario(0);
            c.girarCima(2);
            c.girarDireita(0);
            c.girarBaixo(2);
            c.girarDireita(0);
            c.girarAntiHorario(2);
            c.girarEsquerda(0);
            c.girarHorario(2);
            c.girarHorario(0);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarAntiHorario(0);
        } else if (atras[1][2] == verde && direita[1][2] == rosa) {
            c.girarAntiHorario(0);
            c.girarDireita(0);
            c.girarHorario(0);
            c.girarCima(2);
            c.girarDireita(0);
            c.girarBaixo(2);
            c.girarDireita(0);
            c.girarAntiHorario(2);
            c.girarEsquerda(0);
            c.girarHorario(2);
            c.girarAntiHorario(0);
            c.girarEsquerda(0);
            c.girarHorario(0);
        } else if (atras[0][1] == verde && cima[0][1] == rosa) {
            c.girarDireita(0);
            c.girarCima(2);
            c.girarDireita(0);
            c.girarBaixo(2);
            c.girarDireita(0);
            c.girarAntiHorario(2);
            c.girarEsquerda(0);
            c.girarHorario(2);
        } else if (cima[2][1] == verde && frente[0][1] == rosa) {
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarAntiHorario(2);
            c.girarEsquerda(0);
            c.girarHorario(2);
            c.girarEsquerda(0);
            c.girarCima(2);
            c.girarDireita(0);
            c.girarBaixo(2);
        } else if (cima[1][0] == verde && esquerda[0][1] == rosa) {
            c.girarEsquerda(0);
            c.girarAntiHorario(2);
            c.girarEsquerda(0);
            c.girarHorario(2);
            c.girarEsquerda(0);
            c.girarCima(2);
            c.girarDireita(0);
            c.girarBaixo(2);
        } else if (cima[1][2] == verde && direita[0][1] == rosa) {
            c.girarDireita(0);
            c.girarAntiHorario(2);
            c.girarEsquerda(0);
            c.girarHorario(2);
            c.girarEsquerda(0);
            c.girarCima(2);
            c.girarDireita(0);
            c.girarBaixo(2);
        } else if (cima[0][1] == verde && atras[0][1] == rosa) {
            c.girarAntiHorario(2);
            c.girarEsquerda(0);
            c.girarHorario(2);
            c.girarEsquerda(0);
            c.girarCima(2);
            c.girarDireita(0);
            c.girarBaixo(2);
        }

        //(Verde, Vermelho)
        if (frente[0][1] == verde && cima[2][1] == vermelho) {
            c.girarDireita(0);
            c.girarCima(0);
            c.girarEsquerda(0);
            c.girarBaixo(0);
            c.girarEsquerda(0);
            c.girarHorario(2);
            c.girarDireita(0);
            c.girarAntiHorario(2);
        } else if (esquerda[1][2] == verde && frente[1][0] == vermelho) {
            c.girarHorario(2);
            c.girarEsquerda(0);
            c.girarAntiHorario(2);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarHorario(2);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarAntiHorario(2);
            c.girarEsquerda(0);
            c.girarCima(0);
            c.girarDireita(0);
            c.girarBaixo(0);
        } else if (esquerda[0][1] == verde && cima[1][0] == vermelho) {
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarCima(0);
            c.girarEsquerda(0);
            c.girarBaixo(0);
            c.girarEsquerda(0);
            c.girarHorario(2);
            c.girarDireita(0);
            c.girarAntiHorario(2);
        } else if (esquerda[1][0] == verde && atras[1][0] == vermelho) {
            c.girarHorario(0);
            c.girarDireita(0);
            c.girarAntiHorario(0);
            c.girarEsquerda(0);
            c.girarHorario(2);
            c.girarDireita(0);
            c.girarAntiHorario(2);
            c.girarDireita(0);
            c.girarCima(0);
            c.girarEsquerda(0);
            c.girarBaixo(0);
            c.girarHorario(0);
            c.girarEsquerda(0);
            c.girarAntiHorario(0);
        } else if (atras[1][0] == verde && esquerda[1][0] == vermelho) {
            c.girarHorario(0);
            c.girarEsquerda(0);
            c.girarAntiHorario(0);
            c.girarCima(0);
            c.girarEsquerda(0);
            c.girarBaixo(0);
            c.girarEsquerda(0);
            c.girarHorario(2);
            c.girarDireita(0);
            c.girarAntiHorario(2);
            c.girarHorario(0);
            c.girarDireita(0);
            c.girarAntiHorario(0);
        } else if (atras[1][2] == verde && direita[1][2] == vermelho) {
            c.girarAntiHorario(0);
            c.girarEsquerda(0);
            c.girarHorario(0);
            c.girarCima(0);
            c.girarEsquerda(0);
            c.girarBaixo(0);
            c.girarEsquerda(0);
            c.girarHorario(2);
            c.girarDireita(0);
            c.girarAntiHorario(2);
            c.girarAntiHorario(0);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarHorario(0);
        } else if (atras[0][1] == verde && cima[0][1] == vermelho) {
            c.girarEsquerda(0);
            c.girarCima(0);
            c.girarEsquerda(0);
            c.girarBaixo(0);
            c.girarEsquerda(0);
            c.girarHorario(2);
            c.girarDireita(0);
            c.girarAntiHorario(2);
        } else if (direita[1][2] == verde && atras[1][2] == vermelho) {
            c.girarAntiHorario(0);
            c.girarDireita(0);
            c.girarHorario(0);
            c.girarEsquerda(0);
            c.girarHorario(2);
            c.girarDireita(0);
            c.girarAntiHorario(2);
            c.girarDireita(0);
            c.girarCima(0);
            c.girarEsquerda(0);
            c.girarBaixo(0);
            c.girarDireita(0);
            c.girarAntiHorario(0);
            c.girarEsquerda(0);
            c.girarHorario(0);
        } else if (direita[0][1] == verde && cima[1][2] == vermelho) {
            c.girarCima(0);
            c.girarEsquerda(0);
            c.girarBaixo(0);
            c.girarEsquerda(0);
            c.girarHorario(2);
            c.girarDireita(0);
            c.girarAntiHorario(2);
        } else if (cima[1][0] == verde && esquerda[0][1] == vermelho) {
            c.girarEsquerda(0);
            c.girarHorario(2);
            c.girarDireita(0);
            c.girarAntiHorario(2);
            c.girarDireita(0);
            c.girarCima(0);
            c.girarEsquerda(0);
            c.girarBaixo(0);
        } else if (cima[2][1] == verde && frente[0][1] == vermelho) {
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarHorario(2);
            c.girarDireita(0);
            c.girarAntiHorario(2);
            c.girarDireita(0);
            c.girarCima(0);
            c.girarEsquerda(0);
            c.girarBaixo(0);
        } else if (cima[1][2] == verde && direita[0][1] == vermelho) {
            c.girarDireita(0);
            c.girarHorario(2);
            c.girarDireita(0);
            c.girarAntiHorario(2);
            c.girarDireita(0);
            c.girarCima(0);
            c.girarEsquerda(0);
            c.girarBaixo(0);
        } else if (cima[0][1] == verde && atras[0][1] == vermelho) {
            c.girarHorario(2);
            c.girarDireita(0);
            c.girarAntiHorario(2);
            c.girarDireita(0);
            c.girarCima(0);
            c.girarEsquerda(0);
            c.girarBaixo(0);
        }

        //(Vermelho, Azul)
        if (frente[0][1] == vermelho && cima[2][1] == azul) {
            c.girarHorario(0);
            c.girarEsquerda(0);
            c.girarAntiHorario(0);
            c.girarEsquerda(0);
            c.girarBaixo(0);
            c.girarDireita(0);
            c.girarCima(0);
        } else if (esquerda[0][1] == vermelho && cima[1][0] == azul) {
            c.girarDireita(0);
            c.girarHorario(0);
            c.girarEsquerda(0);
            c.girarAntiHorario(0);
            c.girarEsquerda(0);
            c.girarBaixo(0);
            c.girarDireita(0);
            c.girarCima(0);
        } else if (atras[1][0] == vermelho && esquerda[1][0] == azul) {
            c.girarBaixo(0);
            c.girarEsquerda(0);
            c.girarCima(0);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarBaixo(0);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarCima(0);
            c.girarEsquerda(0);
            c.girarHorario(0);
            c.girarDireita(0);
            c.girarAntiHorario(0);
        } else if (atras[1][2] == vermelho && direita[1][2] == azul) {
            c.girarAntiHorario(0);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarAntiHorario(0);
            c.girarAntiHorario(0);
            c.girarEsquerda(0);
            c.girarAntiHorario(0);
            c.girarEsquerda(0);
            c.girarBaixo(0);
            c.girarDireita(0);
            c.girarCima(0);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarAntiHorario(0);
            c.girarDireita(0);
            c.girarHorario(0);
        } else if (atras[0][1] == vermelho && cima[0][1] == azul) {
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarHorario(0);
            c.girarEsquerda(0);
            c.girarAntiHorario(0);
            c.girarEsquerda(0);
            c.girarBaixo(0);
            c.girarDireita(0);
            c.girarCima(0);
        } else if (direita[1][2] == vermelho && atras[1][2] == azul) {
            c.girarAntiHorario(0);
            c.girarEsquerda(0);
            c.girarHorario(0);
            c.girarBaixo(0);
            c.girarDireita(0);
            c.girarCima(0);
            c.girarDireita(0);
            c.girarHorario(0);
            c.girarEsquerda(0);
            c.girarAntiHorario(0);
            c.girarDireita(0);
            c.girarAntiHorario(0);
            c.girarEsquerda(0);
            c.girarHorario(0);
        } else if (direita[0][1] == vermelho && cima[1][2] == azul) {
            c.girarEsquerda(0);
            c.girarHorario(0);
            c.girarEsquerda(0);
            c.girarAntiHorario(0);
            c.girarEsquerda(0);
            c.girarBaixo(0);
            c.girarDireita(0);
            c.girarCima(0);
        } else if (cima[2][1] == vermelho && frente[0][1] == azul) {
            c.girarDireita(0);
            c.girarBaixo(0);
            c.girarDireita(0);
            c.girarCima(0);
            c.girarDireita(0);
            c.girarHorario(0);
            c.girarEsquerda(0);
            c.girarAntiHorario(0);
        } else if (cima[1][2] == vermelho && direita[0][1] == azul) {
            c.girarBaixo(0);
            c.girarDireita(0);
            c.girarCima(0);
            c.girarDireita(0);
            c.girarHorario(0);
            c.girarEsquerda(0);
            c.girarAntiHorario(0);
        } else if (cima[1][0] == vermelho && esquerda[0][1] == azul) {
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarBaixo(0);
            c.girarDireita(0);
            c.girarCima(0);
            c.girarDireita(0);
            c.girarHorario(0);
            c.girarEsquerda(0);
            c.girarAntiHorario(0);
        } else if (cima[0][1] == vermelho && atras[0][1] == azul) {
            c.girarEsquerda(0);
            c.girarBaixo(0);
            c.girarDireita(0);
            c.girarCima(0);
            c.girarDireita(0);
            c.girarHorario(0);
            c.girarEsquerda(0);
            c.girarAntiHorario(0);
        }

        //(Rosa, Azul)
        if (frente[0][1] == rosa && cima[2][1] == azul) {
            c.girarAntiHorario(0);
            c.girarDireita(0);
            c.girarHorario(0);
            c.girarDireita(0);
            c.girarBaixo(2);
            c.girarEsquerda(0);
            c.girarCima(2);
        } else if (esquerda[0][1] == rosa && cima[1][0] == azul) {
            c.girarDireita(0);
            c.girarAntiHorario(0);
            c.girarDireita(0);
            c.girarHorario(0);
            c.girarDireita(0);
            c.girarBaixo(2);
            c.girarEsquerda(0);
            c.girarCima(2);
        } else if (atras[0][1] == rosa && cima[0][1] == azul) {
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarAntiHorario(0);
            c.girarDireita(0);
            c.girarHorario(0);
            c.girarDireita(0);
            c.girarBaixo(2);
            c.girarEsquerda(0);
            c.girarCima(2);
        } else if (atras[1][2] == rosa && direita[1][2] == azul) {
            c.girarAntiHorario(0);
            c.girarEsquerda(0);
            c.girarHorario(0);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarAntiHorario(0);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarHorario(0);
            c.girarEsquerda(0);
            c.girarBaixo(2);
            c.girarDireita(0);
            c.girarCima(2);
        } else if (direita[0][1] == rosa && cima[1][2] == azul) {
            c.girarEsquerda(0);
            c.girarAntiHorario(0);
            c.girarDireita(0);
            c.girarHorario(0);
            c.girarDireita(0);
            c.girarBaixo(2);
            c.girarEsquerda(0);
            c.girarCima(2);
        } else if (cima[1][0] == rosa && esquerda[0][1] == azul) {
            c.girarBaixo(2);
            c.girarEsquerda(0);
            c.girarCima(2);
            c.girarEsquerda(0);
            c.girarAntiHorario(0);
            c.girarDireita(0);
            c.girarHorario(0);
        } else if (cima[2][1] == rosa && frente[0][1] == azul) {
            c.girarEsquerda(0);
            c.girarBaixo(2);
            c.girarEsquerda(0);
            c.girarCima(2);
            c.girarEsquerda(0);
            c.girarAntiHorario(0);
            c.girarDireita(0);
            c.girarHorario(0);
        } else if (cima[1][2] == rosa && direita[0][1] == azul) {
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarBaixo(2);
            c.girarEsquerda(0);
            c.girarCima(2);
            c.girarEsquerda(0);
            c.girarAntiHorario(0);
            c.girarDireita(0);
            c.girarHorario(0);
        } else if (cima[0][1] == rosa && atras[0][1] == azul) {
            c.girarDireita(0);
            c.girarBaixo(2);
            c.girarEsquerda(0);
            c.girarCima(2);
            c.girarEsquerda(0);
            c.girarAntiHorario(0);
            c.girarDireita(0);
            c.girarHorario(0);
        }
    }

    private void cruzAmarela() {
        // RESOLVENDO A CRUZ AMARELA
        // Se só tiver peça amarela no centro
        if (cima[0][1] != 2 && cima[1][0] != 2 && cima[1][2] != 2 && cima[2][1] != 2) {
            // (F R' F' R) U2 F R' F' R2 U2 R'
            c.girarHorario(2);
            c.girarBaixo(2);
            c.girarAntiHorario(2);
            c.girarCima(2);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarHorario(2);
            c.girarBaixo(2);
            c.girarAntiHorario(2);
            c.girarBaixo(2);
            c.girarBaixo(2);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarBaixo(2);
        } else if (cima[0][1] == amarelo && cima[2][1] == amarelo && cima[1][0] != 2 && cima[1][2] != 2) {
            // Se as peças estivem na vertical --> U F(R U R′ U′) F′
            c.girarEsquerda(0);
            c.girarHorario(2);
            c.girarCima(2);
            c.girarEsquerda(0);
            c.girarBaixo(2);
            c.girarDireita(0);
            c.girarAntiHorario(2);
        } else if (cima[0][1] != 2 && cima[2][1] != 2 && cima[1][0] == amarelo && cima[1][2] == amarelo) {
            // Se as peças estivem na horizontal --> F(R U R′ U′) F′
            c.girarHorario(2);
            c.girarCima(2);
            c.girarEsquerda(0);
            c.girarBaixo(2);
            c.girarDireita(0);
            c.girarAntiHorario(2);
        } else if (cima[0][1] == amarelo && cima[1][0] == amarelo && cima[1][2] != 2 && cima[2][1] != 2) {
            // quando as peças estão orientadas de modo a forma um L (caso 1)
            // F U R U′ R′ F′
            c.girarHorario(2);
            c.girarEsquerda(0);
            c.girarCima(2);
            c.girarDireita(0);
            c.girarBaixo(2);
            c.girarAntiHorario(2);
        } else if (cima[0][1] == amarelo && cima[1][0] != 2 && cima[1][2] == amarelo && cima[2][1] != 2) {
            // quando as peças estão orientadas de modo a forma um L (caso 2)
            // U' F U R U′ R′ F′
            c.girarDireita(0);
            c.girarHorario(2);
            c.girarEsquerda(0);
            c.girarCima(2);
            c.girarDireita(0);
            c.girarBaixo(2);
            c.girarAntiHorario(2);
        } else if (cima[0][1] != 2 && cima[1][0] != 2 && cima[1][2] == amarelo && cima[2][1] == amarelo) {
            // quando as peças estão orientadas de modo a forma um L (caso 3)
            // U2 F U R U′ R′ F′
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarHorario(2);
            c.girarEsquerda(0);
            c.girarCima(2);
            c.girarDireita(0);
            c.girarBaixo(2);
            c.girarAntiHorario(2);
        } else if (cima[0][1] != 2 && cima[1][0] == amarelo && cima[1][2] != 2 && cima[2][1] == amarelo) {
            // quando as peças estão orientadas de modo a forma um L (caso 4)
            // U F U R U′ R′ F′
            c.girarEsquerda(0);
            c.girarHorario(2);
            c.girarEsquerda(0);
            c.girarCima(2);
            c.girarDireita(0);
            c.girarBaixo(2);
            c.girarAntiHorario(2);
        }

        //ORIENTAÇÕES DOS CANTOS
    }

    private void orientacaoCantos() {
        if (cima[2][0] == amarelo && frente[0][2] == amarelo && direita[0][2] == amarelo && atras[0][0] == amarelo) {
            // 1º CASO
            // R U R' U R U2 R'
            c.girarCima(2);
            c.girarEsquerda(0);
            c.girarBaixo(2);
            c.girarEsquerda(0);
            c.girarCima(2);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarBaixo(2);
        } else if (cima[2][2] == amarelo && esquerda[0][2] == amarelo && direita[0][2] == amarelo && atras[0][0] == amarelo) {
            // 1º CASO
            // U R U R' U R U2 R'
            c.girarEsquerda(0);
            c.girarCima(2);
            c.girarEsquerda(0);
            c.girarBaixo(2);
            c.girarEsquerda(0);
            c.girarCima(2);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarBaixo(2);
        } else if (cima[0][2] == amarelo && atras[0][0] == amarelo && esquerda[0][2] == amarelo && frente[0][2] == amarelo) {
            // 1º CASO            
            // U2 R U R' U R U2 R'
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarCima(2);
            c.girarEsquerda(0);
            c.girarBaixo(2);
            c.girarEsquerda(0);
            c.girarCima(2);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarBaixo(2);
        } else if (cima[0][0] == amarelo && esquerda[0][2] == amarelo && frente[0][2] == amarelo && direita[0][2] == amarelo) {
            // 1º CASO
            // U' R U R' U R U2 R'
            c.girarDireita(0);
            c.girarCima(2);
            c.girarEsquerda(0);
            c.girarBaixo(2);
            c.girarEsquerda(0);
            c.girarCima(2);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarBaixo(2);
        } else if (cima[0][2] == amarelo && esquerda[0][0] == amarelo && frente[0][0] == amarelo && direita[0][0] == amarelo) {
            // 2º CASO
            // R U2 R′ U′ R U′ R′
            c.girarCima(2);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarBaixo(2);
            c.girarDireita(0);
            c.girarCima(2);
            c.girarDireita(0);
            c.girarBaixo(2);
        } else if (cima[0][0] == amarelo && frente[0][0] == amarelo && direita[0][0] == amarelo && atras[0][2] == amarelo) {
            // 2º CASO
            // U R U2 R′ U′ R U′ R′
            c.girarEsquerda(0);
            c.girarCima(2);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarBaixo(2);
            c.girarDireita(0);
            c.girarCima(2);
            c.girarDireita(0);
            c.girarBaixo(2);
        } else if (cima[2][0] == amarelo && direita[0][0] == amarelo && atras[0][2] == amarelo && esquerda[0][0] == amarelo) {
            // 2º CASO
            // U2 R U2 R′ U′ R U′ R′
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarCima(2);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarBaixo(2);
            c.girarDireita(0);
            c.girarCima(2);
            c.girarDireita(0);
            c.girarBaixo(2);
        } else if (cima[2][2] == amarelo && atras[0][2] == amarelo && esquerda[0][0] == amarelo && frente[0][0] == amarelo) {
            // 2º CASO
            // U' R U2 R′ U′ R U′ R′
            c.girarDireita(0);
            c.girarCima(2);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarBaixo(2);
            c.girarDireita(0);
            c.girarCima(2);
            c.girarDireita(0);
            c.girarBaixo(2);
        } else if (esquerda[0][0] == amarelo && esquerda[0][2] == amarelo && frente[0][2] == amarelo && atras[0][2] == amarelo) {
            // 3º CASO
            // R U2 R2 U' R2 U' R2 U2 R
            c.girarCima(2);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarBaixo(2);
            c.girarBaixo(2);
            c.girarDireita(0);
            c.girarBaixo(2);
            c.girarBaixo(2);
            c.girarDireita(0);
            c.girarBaixo(2);
            c.girarBaixo(2);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarCima(2);
        } else if (frente[0][0] == amarelo && frente[0][2] == amarelo && direita[0][2] == amarelo && esquerda[0][0] == amarelo) {
            // 3º CASO
            // U R U2 R2 U' R2 U' R2 U2 R
            c.girarEsquerda(0);
            c.girarCima(2);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarBaixo(2);
            c.girarBaixo(2);
            c.girarDireita(0);
            c.girarBaixo(2);
            c.girarBaixo(2);
            c.girarDireita(0);
            c.girarBaixo(2);
            c.girarBaixo(2);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarCima(2);
        } else if (direita[0][0] == amarelo && direita[0][2] == amarelo && atras[0][0] == amarelo && frente[0][0] == amarelo) {
            // 3º CASO
            // U2 R U2 R2 U' R2 U' R2 U2 R
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarCima(2);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarBaixo(2);
            c.girarBaixo(2);
            c.girarDireita(0);
            c.girarBaixo(2);
            c.girarBaixo(2);
            c.girarDireita(0);
            c.girarBaixo(2);
            c.girarBaixo(2);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarCima(2);
        } else if (atras[0][0] == amarelo && atras[0][2] == amarelo && esquerda[0][2] == amarelo && direita[0][0] == amarelo) {
            // 3º CASO
            // U' R U2 R2 U' R2 U' R2 U2 R
            c.girarDireita(0);
            c.girarCima(2);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarBaixo(2);
            c.girarBaixo(2);
            c.girarDireita(0);
            c.girarBaixo(2);
            c.girarBaixo(2);
            c.girarDireita(0);
            c.girarBaixo(2);
            c.girarBaixo(2);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarCima(2);
        } else if (frente[0][0] == amarelo && frente[0][2] == amarelo && atras[0][0] == amarelo && atras[0][2] == amarelo) {
            // 4º CASO
            // R U2 R' U' R U R' U' R U' R'
            c.girarCima(2);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarBaixo(2);
            c.girarDireita(0);
            c.girarCima(2);
            c.girarEsquerda(0);
            c.girarBaixo(2);
            c.girarDireita(0);
            c.girarCima(2);
            c.girarDireita(0);
            c.girarBaixo(2);
        } else if (esquerda[0][0] == amarelo && esquerda[0][2] == amarelo && direita[0][0] == amarelo && direita[0][2] == amarelo) {
            // 4º CASO
            // U R U2 R' U' R U R' U' R U' R'
            c.girarEsquerda(0);
            c.girarCima(2);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarBaixo(2);
            c.girarDireita(0);
            c.girarCima(2);
            c.girarEsquerda(0);
            c.girarBaixo(2);
            c.girarDireita(0);
            c.girarCima(2);
            c.girarDireita(0);
            c.girarBaixo(2);
        } else if (cima[0][0] == amarelo && cima[2][0] == amarelo && frente[0][2] == amarelo && atras[0][2] == amarelo) {
            // 5º CASO
            // (R' F' L F) (R F' L' F)
            c.girarBaixo(2);
            c.girarAntiHorario(2);
            c.girarBaixo(0);
            c.girarHorario(2);
            c.girarCima(2);
            c.girarAntiHorario(2);
            c.girarCima(0);
            c.girarHorario(2);
        } else if (cima[2][0] == amarelo && cima[2][2] == amarelo && direita[0][2] == amarelo && esquerda[0][0] == amarelo) {
            // 5º CASO
            // U (R' F' L F) (R F' L' F)
            c.girarEsquerda(0);
            c.girarBaixo(2);
            c.girarAntiHorario(2);
            c.girarBaixo(0);
            c.girarHorario(2);
            c.girarCima(2);
            c.girarAntiHorario(2);
            c.girarCima(0);
            c.girarHorario(2);
        } else if (cima[2][2] == amarelo && cima[0][2] == amarelo && frente[0][0] == amarelo && atras[0][0] == amarelo) {
            // 5º CASO
            // U2 (R' F' L F) (R F' L' F)
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarBaixo(2);
            c.girarAntiHorario(2);
            c.girarBaixo(0);
            c.girarHorario(2);
            c.girarCima(2);
            c.girarAntiHorario(2);
            c.girarCima(0);
            c.girarHorario(2);
        } else if (cima[0][0] == amarelo && cima[0][2] == amarelo && esquerda[0][2] == amarelo && direita[0][0] == amarelo) {
            // 5º CASO
            // U' (R' F' L F) (R F' L' F)
            c.girarDireita(0);
            c.girarBaixo(2);
            c.girarAntiHorario(2);
            c.girarBaixo(0);
            c.girarHorario(2);
            c.girarCima(2);
            c.girarAntiHorario(2);
            c.girarCima(0);
            c.girarHorario(2);
        } else if (cima[0][0] == amarelo && cima[0][2] == amarelo && frente[0][0] == amarelo && frente[0][2] == amarelo) {
            // 6º CASO
            // R2 D R' U2 R D' R' U2 R'
            c.girarBaixo(2);
            c.girarBaixo(2);
            c.girarDireita(2);
            c.girarBaixo(2);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarCima(2);
            c.girarEsquerda(2);
            c.girarBaixo(2);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarBaixo(2);
        } else if (cima[0][0] == amarelo && cima[2][0] == amarelo && direita[0][0] == amarelo && direita[0][2] == amarelo) {
            // 6º CASO
            // U R2 D R' U2 R D' R' U2 R'
            c.girarEsquerda(0);
            c.girarBaixo(2);
            c.girarBaixo(2);
            c.girarDireita(2);
            c.girarBaixo(2);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarCima(2);
            c.girarEsquerda(2);
            c.girarBaixo(2);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarBaixo(2);
        } else if (cima[2][0] == amarelo && cima[2][2] == amarelo && atras[0][0] == amarelo && atras[0][2] == amarelo) {
            // 6º CASO
            // U2 R2 D R' U2 R D' R' U2 R'
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarBaixo(2);
            c.girarBaixo(2);
            c.girarDireita(2);
            c.girarBaixo(2);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarCima(2);
            c.girarEsquerda(2);
            c.girarBaixo(2);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarBaixo(2);
        } else if (cima[0][2] == amarelo && cima[2][2] == amarelo && esquerda[0][0] == amarelo && esquerda[0][2] == amarelo) {
            // 6º CASO
            // U' R2 D R' U2 R D' R' U2 R'
            c.girarDireita(0);
            c.girarBaixo(2);
            c.girarBaixo(2);
            c.girarDireita(2);
            c.girarBaixo(2);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarCima(2);
            c.girarEsquerda(2);
            c.girarBaixo(2);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarBaixo(2);
        } else if (cima[0][0] == amarelo && cima[2][2] == amarelo && frente[0][0] == amarelo && direita[0][2] == amarelo) {
            // 7º CASO
            // (R' F R B') (R' F' R B)
            c.girarBaixo(2);
            c.girarHorario(2);
            c.girarCima(2);
            c.girarHorario(0);
            c.girarBaixo(2);
            c.girarAntiHorario(2);
            c.girarCima(2);
            c.girarAntiHorario(0);
        } else if (cima[2][0] == amarelo && cima[0][2] == amarelo && direita[0][0] == amarelo && atras[0][0] == amarelo) {
            // 7º CASO
            // U (R' F R B') (R' F' R B)
            c.girarEsquerda(0);
            c.girarBaixo(2);
            c.girarHorario(2);
            c.girarCima(2);
            c.girarHorario(0);
            c.girarBaixo(2);
            c.girarAntiHorario(2);
            c.girarCima(2);
            c.girarAntiHorario(0);
        } else if (cima[0][0] == amarelo && cima[2][2] == amarelo && esquerda[0][2] == amarelo && atras[0][2] == amarelo) {
            // 7º CASO
            // U2     (R' F R B') (R' F' R B)
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarBaixo(2);
            c.girarHorario(2);
            c.girarCima(2);
            c.girarHorario(0);
            c.girarBaixo(2);
            c.girarAntiHorario(2);
            c.girarCima(2);
            c.girarAntiHorario(0);
        } else if (cima[2][0] == amarelo && cima[0][2] == amarelo && frente[0][2] == amarelo && esquerda[0][0] == amarelo) {
            // 7º CASO
            // U'     (R' F R B') (R' F' R B)
            c.girarDireita(0);
            c.girarBaixo(2);
            c.girarHorario(2);
            c.girarCima(2);
            c.girarHorario(0);
            c.girarBaixo(2);
            c.girarAntiHorario(2);
            c.girarCima(2);
            c.girarAntiHorario(0);
        }
    }

    private void permutacoesDosCantos() {
        if ((atras[0][0] == atras[0][2]) && (frente[0][0] != frente[0][2]) && (direita[0][0] != direita[0][2]) && (esquerda[0][0] != esquerda[0][2])) {
            // 1º CASO
            // R' F R' B2 R F' R' B2 R2
            c.girarBaixo(2);
            c.girarHorario(2);
            c.girarBaixo(2);
            c.girarAntiHorario(0);
            c.girarAntiHorario(0);
            c.girarCima(2);
            c.girarAntiHorario(2);
            c.girarBaixo(2);
            c.girarAntiHorario(0);
            c.girarAntiHorario(0);
            c.girarBaixo(2);
            c.girarBaixo(2);
        } else if ((frente[0][0] == frente[0][2]) && (esquerda[0][0] != esquerda[0][2]) && (direita[0][0] != direita[0][2]) && (atras[0][0] != atras[0][2])) {
            // 1º CASO
            // U2 R' F R' B2 R F' R' B2 R2
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarBaixo(2);
            c.girarHorario(2);
            c.girarBaixo(2);
            c.girarAntiHorario(0);
            c.girarAntiHorario(0);
            c.girarCima(2);
            c.girarAntiHorario(2);
            c.girarBaixo(2);
            c.girarAntiHorario(0);
            c.girarAntiHorario(0);
            c.girarBaixo(2);
            c.girarBaixo(2);
        } else if ((esquerda[0][0] == esquerda[0][2]) && (frente[0][0] != frente[0][2]) && (direita[0][0] != direita[0][2]) && (atras[0][0] != atras[0][2])) {
            // 1º CASO
            // U R' F R' B2 R F' R' B2 R2
            c.girarEsquerda(0);
            c.girarBaixo(2);
            c.girarHorario(2);
            c.girarBaixo(2);
            c.girarAntiHorario(0);
            c.girarAntiHorario(0);
            c.girarCima(2);
            c.girarAntiHorario(2);
            c.girarBaixo(2);
            c.girarAntiHorario(0);
            c.girarAntiHorario(0);
            c.girarBaixo(2);
            c.girarBaixo(2);
        } else if ((direita[0][0] == direita[0][2]) && (frente[0][0] != frente[0][2]) && (esquerda[0][0] != esquerda[0][2]) && (atras[0][0] != atras[0][2])) {
            // 1º CASO
            // U' R' F R' B2 R F' R' B2 R2
            c.girarDireita(0);
            c.girarBaixo(2);
            c.girarHorario(2);
            c.girarBaixo(2);
            c.girarAntiHorario(0);
            c.girarAntiHorario(0);
            c.girarCima(2);
            c.girarAntiHorario(2);
            c.girarBaixo(2);
            c.girarAntiHorario(0);
            c.girarAntiHorario(0);
            c.girarBaixo(2);
            c.girarBaixo(2);
        } else if ((atras[0][0] != atras[0][2]) && (frente[0][0] != frente[0][2]) && (esquerda[0][0] != esquerda[0][2]) && (direita[0][0] != direita[0][2])) {
            // 2º CASO
            // R2 U R' (BU'B'U)³ R U' R2
            c.girarBaixo(2);
            c.girarBaixo(2);
            c.girarEsquerda(0);
            c.girarBaixo(2);
            c.girarAntiHorario(0);
            c.girarDireita(0);
            c.girarHorario(0);
            c.girarEsquerda(0);
            c.girarAntiHorario(0);
            c.girarDireita(0);
            c.girarHorario(0);
            c.girarEsquerda(0);
            c.girarAntiHorario(0);
            c.girarDireita(0);
            c.girarHorario(0);
            c.girarEsquerda(0);
            c.girarCima(2);
            c.girarDireita(0);
            c.girarBaixo(2);
            c.girarBaixo(2);
        }
    }

    private void permutacoesDosMeios() {
        if ((atras[0][0] == atras[0][1] && atras[0][1] == atras[0][2]) && (esquerda[0][0] == esquerda[0][2] && esquerda[0][2] == frente[0][1]) && (esquerda[0][1] == direita[0][0] && direita[0][0] == direita[0][2]) && (frente[0][0] == frente[0][2] && frente[0][2] == direita[0][1])) {
            // 1º CASO
            // F2 U(R' L F2 R L')U F2
            c.girarHorario(2);
            c.girarHorario(2);
            c.girarEsquerda(0);
            c.girarBaixo(2);
            c.girarBaixo(0);
            c.girarHorario(2);
            c.girarHorario(2);
            c.girarCima(2);
            c.girarCima(0);
            c.girarEsquerda(0);
            c.girarHorario(2);
            c.girarHorario(2);
        } else if ((direita[0][0] == direita[0][1] && direita[0][1] == direita[0][2]) && (frente[0][0] == frente[0][2] && frente[0][2] == atras[0][1]) && (frente[0][1] == esquerda[0][0] && esquerda[0][0] == esquerda[0][2]) && (esquerda[0][1] == atras[0][0] && atras[0][0] == atras[0][2])) {
            // 1º CASO
            // U' F2 U(R' L F2 R L')U F2
            c.girarDireita(0);
            c.girarHorario(2);
            c.girarHorario(2);
            c.girarEsquerda(0);
            c.girarBaixo(2);
            c.girarBaixo(0);
            c.girarHorario(2);
            c.girarHorario(2);
            c.girarCima(2);
            c.girarCima(0);
            c.girarEsquerda(0);
            c.girarHorario(2);
            c.girarHorario(2);
        } else if ((frente[0][0] == frente[0][1] && frente[0][1] == frente[0][2]) && (esquerda[0][0] == esquerda[0][2] && esquerda[0][2] == direita[0][1]) && (esquerda[0][1] == atras[0][0] && atras[0][0] == atras[0][2]) && (atras[0][1] == direita[0][0] && direita[0][0] == direita[0][2])) {
            // 1º CASO
            // U2 F2 U(R' L F2 R L')U F2
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarHorario(2);
            c.girarHorario(2);
            c.girarEsquerda(0);
            c.girarBaixo(2);
            c.girarBaixo(0);
            c.girarHorario(2);
            c.girarHorario(2);
            c.girarCima(2);
            c.girarCima(0);
            c.girarEsquerda(0);
            c.girarHorario(2);
            c.girarHorario(2);
        } else if ((esquerda[0][0] == esquerda[0][1] && esquerda[0][1] == esquerda[0][2]) && (frente[0][0] == frente[0][2] && frente[0][2] == direita[0][1]) && (frente[0][1] == atras[0][0] && atras[0][0] == atras[0][2]) && (atras[0][1] == direita[0][0] && direita[0][0] == direita[0][2])) {
            // 1º CASO
            // U F2 U(R' L F2 R L')U F2
            c.girarEsquerda(0);
            c.girarHorario(2);
            c.girarHorario(2);
            c.girarEsquerda(0);
            c.girarBaixo(2);
            c.girarBaixo(0);
            c.girarHorario(2);
            c.girarHorario(2);
            c.girarCima(2);
            c.girarCima(0);
            c.girarEsquerda(0);
            c.girarHorario(2);
            c.girarHorario(2);
        } else if ((atras[0][0] == atras[0][1] && atras[0][1] == atras[0][2]) && (direita[0][0] == direita[0][2] && direita[0][2] == frente[0][1]) && (direita[0][1] == esquerda[0][0] && esquerda[0][0] == esquerda[0][2]) && (esquerda[0][1] == frente[0][0] && frente[0][0] == frente[0][2])) {
            // 3º CASO
            // F2 U'(R' L F2 R L')U' F2
            c.girarHorario(2);
            c.girarHorario(2);
            c.girarDireita(0);
            c.girarBaixo(2);
            c.girarBaixo(0);
            c.girarHorario(2);
            c.girarHorario(2);
            c.girarCima(2);
            c.girarCima(0);
            c.girarDireita(0);
            c.girarHorario(2);
            c.girarHorario(2);
        } else if ((direita[0][0] == direita[0][1] && direita[0][1] == direita[0][2]) && (frente[0][0] == frente[0][2] && frente[0][2] == esquerda[0][1]) && (frente[0][1] == atras[0][0] && atras[0][0] == atras[0][2]) && (atras[0][1] == esquerda[0][0] && esquerda[0][0] == esquerda[0][2])) {
            // 3º CASO
            // U' F2 U'(R' L F2 R L')U' F2
            c.girarDireita(0);
            c.girarHorario(2);
            c.girarHorario(2);
            c.girarDireita(0);
            c.girarBaixo(2);
            c.girarBaixo(0);
            c.girarHorario(2);
            c.girarHorario(2);
            c.girarCima(2);
            c.girarCima(0);
            c.girarDireita(0);
            c.girarHorario(2);
            c.girarHorario(2);
        } else if ((frente[0][0] == frente[0][1] && frente[0][1] == frente[0][2]) && (esquerda[0][0] == esquerda[0][2] && esquerda[0][2] == atras[0][1]) && (esquerda[0][1] == direita[0][0] && direita[0][0] == direita[0][2]) && (direita[0][1] == atras[0][0] && atras[0][0] == atras[0][2])) {
            // 3º CASO
            // U2 F2 U'(R' L F2 R L')U' F2
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarHorario(2);
            c.girarHorario(2);
            c.girarDireita(0);
            c.girarBaixo(2);
            c.girarBaixo(0);
            c.girarHorario(2);
            c.girarHorario(2);
            c.girarCima(2);
            c.girarCima(0);
            c.girarDireita(0);
            c.girarHorario(2);
            c.girarHorario(2);
        } else if ((esquerda[0][0] == esquerda[0][1] && esquerda[0][1] == esquerda[0][2]) && (atras[0][0] == atras[0][2] && atras[0][2] == direita[0][1]) && (atras[0][1] == frente[0][0] && frente[0][0] == frente[0][2]) && (frente[0][1] == direita[0][0] && direita[0][0] == direita[0][2])) {
            // 3º CASO
            // U F2 U'(R' L F2 R L')U' F2
            c.girarEsquerda(0);
            c.girarHorario(2);
            c.girarHorario(2);
            c.girarDireita(0);
            c.girarBaixo(2);
            c.girarBaixo(0);
            c.girarHorario(2);
            c.girarHorario(2);
            c.girarCima(2);
            c.girarCima(0);
            c.girarDireita(0);
            c.girarHorario(2);
            c.girarHorario(2);
        } else if ((atras[0][0] == atras[0][2] && atras[0][2] == esquerda[0][1]) && (atras[0][1] == esquerda[0][0] && esquerda[0][0] == esquerda[0][2]) && (direita[0][0] == direita[0][2] && direita[0][2] == frente[0][1]) && (direita[0][1] == frente[0][0] && frente[0][0] == frente[0][2])) {
            // 2º CASO
            // R' U' R'  F R F' U R F' U' L' U L F
            c.girarBaixo(2);
            c.girarDireita(0);
            c.girarBaixo(2);
            c.girarHorario(2);
            c.girarCima(2);
            c.girarAntiHorario(2);
            c.girarEsquerda(0);
            c.girarCima(2);
            c.girarAntiHorario(2);
            c.girarDireita(0);
            c.girarCima(0);
            c.girarEsquerda(0);
            c.girarBaixo(0);
            c.girarHorario(2);
        } else if ((atras[0][0] == atras[0][2] && atras[0][2] == direita[0][1]) && (atras[0][1] == direita[0][0] && direita[0][0] == direita[0][2]) && (frente[0][0] == frente[0][2] && frente[0][2] == esquerda[0][1]) && (esquerda[0][0] == esquerda[0][2] && esquerda[0][2] == frente[0][1])) {
            // 2º CASO
            // U' R' U' R'  F R F' U R F' U' L' U L F
            c.girarDireita(0);
            c.girarBaixo(2);
            c.girarDireita(0);
            c.girarBaixo(2);
            c.girarHorario(2);
            c.girarCima(2);
            c.girarAntiHorario(2);
            c.girarEsquerda(0);
            c.girarCima(2);
            c.girarAntiHorario(2);
            c.girarDireita(0);
            c.girarCima(0);
            c.girarEsquerda(0);
            c.girarBaixo(0);
            c.girarHorario(2);
        } else if ((atras[0][0] == atras[0][2] && atras[0][2] == esquerda[0][1]) && (atras[0][1] == esquerda[0][0] && esquerda[0][0] == esquerda[0][2]) && (frente[0][0] == frente[0][2] && frente[0][2] == direita[0][1]) && (frente[0][1] == direita[0][0] && direita[0][0] == direita[0][2])) {
            // 2º CASO
            // U2 R' U' R'  F R F' U R F' U' L' U L F
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarBaixo(2);
            c.girarDireita(0);
            c.girarBaixo(2);
            c.girarHorario(2);
            c.girarCima(2);
            c.girarAntiHorario(2);
            c.girarEsquerda(0);
            c.girarCima(2);
            c.girarAntiHorario(2);
            c.girarDireita(0);
            c.girarCima(0);
            c.girarEsquerda(0);
            c.girarBaixo(0);
            c.girarHorario(2);
        } else if ((frente[0][0] == frente[0][2] && frente[0][2] == esquerda[0][1]) && (frente[0][1] == esquerda[0][0] && esquerda[0][0] == esquerda[0][2]) && (atras[0][0] == atras[0][2] && atras[0][2] == direita[0][1]) && (atras[0][1] == direita[0][0] && direita[0][0] == direita[0][2])) {
            // 2º CASO
            // U R' U' R'  F R F' U R F' U' L' U L F
            c.girarEsquerda(0);
            c.girarBaixo(2);
            c.girarDireita(0);
            c.girarBaixo(2);
            c.girarHorario(2);
            c.girarCima(2);
            c.girarAntiHorario(2);
            c.girarEsquerda(0);
            c.girarCima(2);
            c.girarAntiHorario(2);
            c.girarDireita(0);
            c.girarCima(0);
            c.girarEsquerda(0);
            c.girarBaixo(0);
            c.girarHorario(2);
        } else if ((atras[0][0] == atras[0][2] && atras[0][2] == frente[0][1]) && (atras[0][1] == frente[0][0] && frente[0][0] == frente[0][2]) && (esquerda[0][0] == esquerda[0][2] && esquerda[0][2] == direita[0][1]) && (direita[0][0] == direita[0][2] && direita[0][2] == esquerda[0][1])) {
            // 4º CASO
            // (R2 U2)^2 R2 U (R2 U2)^2 R2 U'
            c.girarBaixo(2);
            c.girarBaixo(2);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarBaixo(2);
            c.girarBaixo(2);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarBaixo(2);
            c.girarBaixo(2);
            c.girarEsquerda(0);
            c.girarBaixo(2);
            c.girarBaixo(2);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarBaixo(2);
            c.girarBaixo(2);
            c.girarDireita(0);
            c.girarDireita(0);
            c.girarBaixo(2);
            c.girarBaixo(2);
            c.girarDireita(0);
        }

        //Mover o topo para "juntar" as cores certas
        if (frente[1][1] == direita[0][0]) {
            c.girarEsquerda(0);
        } else if (frente[1][1] == atras[0][0]) {
            c.girarDireita(0);
            c.girarDireita(0);
        } else if (frente[1][1] == esquerda[0][0]) {
            c.girarDireita(0);
        }
    }
}
