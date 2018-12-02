package com.acme;

import com.acme.enumeration.Cor;
import java.awt.Color;
import java.awt.Component;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class JFPrincipal extends javax.swing.JFrame {

    private Cubo c;
    private Thread threadForcaBruta;

    public JFPrincipal() {
        initComponents();
        novoCubo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        container = new javax.swing.JPanel();
        containerFaces = new javax.swing.JPanel();
        frente = new javax.swing.JPanel();
        pos1 = new javax.swing.JButton();
        pos2 = new javax.swing.JButton();
        pos3 = new javax.swing.JButton();
        pos4 = new javax.swing.JButton();
        pos5 = new javax.swing.JButton();
        pos6 = new javax.swing.JButton();
        pos7 = new javax.swing.JButton();
        pos8 = new javax.swing.JButton();
        pos9 = new javax.swing.JButton();
        direita = new javax.swing.JPanel();
        pos10 = new javax.swing.JButton();
        pos11 = new javax.swing.JButton();
        pos12 = new javax.swing.JButton();
        pos13 = new javax.swing.JButton();
        pos14 = new javax.swing.JButton();
        pos15 = new javax.swing.JButton();
        pos16 = new javax.swing.JButton();
        pos17 = new javax.swing.JButton();
        pos18 = new javax.swing.JButton();
        atras = new javax.swing.JPanel();
        pos19 = new javax.swing.JButton();
        pos20 = new javax.swing.JButton();
        pos21 = new javax.swing.JButton();
        pos22 = new javax.swing.JButton();
        pos23 = new javax.swing.JButton();
        pos24 = new javax.swing.JButton();
        pos25 = new javax.swing.JButton();
        pos26 = new javax.swing.JButton();
        pos27 = new javax.swing.JButton();
        cima = new javax.swing.JPanel();
        pos37 = new javax.swing.JButton();
        pos38 = new javax.swing.JButton();
        pos39 = new javax.swing.JButton();
        pos40 = new javax.swing.JButton();
        pos41 = new javax.swing.JButton();
        pos42 = new javax.swing.JButton();
        pos43 = new javax.swing.JButton();
        pos44 = new javax.swing.JButton();
        pos45 = new javax.swing.JButton();
        esquerda = new javax.swing.JPanel();
        pos28 = new javax.swing.JButton();
        pos29 = new javax.swing.JButton();
        pos30 = new javax.swing.JButton();
        pos31 = new javax.swing.JButton();
        pos32 = new javax.swing.JButton();
        pos33 = new javax.swing.JButton();
        pos34 = new javax.swing.JButton();
        pos35 = new javax.swing.JButton();
        pos36 = new javax.swing.JButton();
        baixo = new javax.swing.JPanel();
        pos46 = new javax.swing.JButton();
        pos47 = new javax.swing.JButton();
        pos48 = new javax.swing.JButton();
        pos49 = new javax.swing.JButton();
        pos50 = new javax.swing.JButton();
        pos51 = new javax.swing.JButton();
        pos52 = new javax.swing.JButton();
        pos53 = new javax.swing.JButton();
        pos54 = new javax.swing.JButton();
        containerComandos = new javax.swing.JPanel();
        jbEmbaralhar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jtfLinha = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfColuna = new javax.swing.JTextField();
        jbGirarCima = new javax.swing.JButton();
        jbGirarHorario = new javax.swing.JButton();
        jbGirarAntiHorario = new javax.swing.JButton();
        jbGirarBaixo = new javax.swing.JButton();
        jbGirarDireita = new javax.swing.JButton();
        jbGirarEsquerda = new javax.swing.JButton();
        jbSolucionarForcaBruta = new javax.swing.JButton();
        jbSolucionarMetodoBasico = new javax.swing.JButton();
        jbNovoCubo = new javax.swing.JButton();
        jlResposta = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jbPararForcaBruta = new javax.swing.JButton();
        barra = new javax.swing.JPanel();
        fechar = new javax.swing.JLabel();
        minimizar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cubo Mágico");
        setBackground(new java.awt.Color(255, 255, 255));
        setExtendedState(6);
        setUndecorated(true);

        container.setBackground(new java.awt.Color(204, 204, 204));

        containerFaces.setBackground(new java.awt.Color(204, 204, 204));

        frente.setBackground(new java.awt.Color(255, 255, 255));
        frente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pos1.setBackground(new java.awt.Color(153, 153, 153));
        pos1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos1.setForeground(new java.awt.Color(153, 153, 153));

        pos2.setBackground(new java.awt.Color(153, 153, 153));
        pos2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos2.setForeground(new java.awt.Color(153, 153, 153));

        pos3.setBackground(new java.awt.Color(153, 153, 153));
        pos3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos3.setForeground(new java.awt.Color(153, 153, 153));

        pos4.setBackground(new java.awt.Color(153, 153, 153));
        pos4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos4.setForeground(new java.awt.Color(153, 153, 153));

        pos5.setBackground(new java.awt.Color(153, 153, 153));
        pos5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos5.setForeground(new java.awt.Color(153, 153, 153));

        pos6.setBackground(new java.awt.Color(153, 153, 153));
        pos6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos6.setForeground(new java.awt.Color(153, 153, 153));

        pos7.setBackground(new java.awt.Color(153, 153, 153));
        pos7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos7.setForeground(new java.awt.Color(153, 153, 153));

        pos8.setBackground(new java.awt.Color(153, 153, 153));
        pos8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos8.setForeground(new java.awt.Color(153, 153, 153));

        pos9.setBackground(new java.awt.Color(153, 153, 153));
        pos9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos9.setForeground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout frenteLayout = new javax.swing.GroupLayout(frente);
        frente.setLayout(frenteLayout);
        frenteLayout.setHorizontalGroup(
            frenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frenteLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(frenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frenteLayout.createSequentialGroup()
                        .addComponent(pos1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(pos2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(pos3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(frenteLayout.createSequentialGroup()
                        .addGroup(frenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(frenteLayout.createSequentialGroup()
                                .addComponent(pos7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(pos8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(frenteLayout.createSequentialGroup()
                                .addComponent(pos4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(pos5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(1, 1, 1)
                        .addGroup(frenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pos6, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(pos9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(1, 1, 1))
        );
        frenteLayout.setVerticalGroup(
            frenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frenteLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(frenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pos1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pos2, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(pos3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(1, 1, 1)
                .addGroup(frenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pos4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pos5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pos6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(frenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pos7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pos8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pos9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1))
        );

        direita.setBackground(new java.awt.Color(255, 255, 255));
        direita.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pos10.setBackground(new java.awt.Color(153, 153, 153));
        pos10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos10.setForeground(new java.awt.Color(153, 153, 153));

        pos11.setBackground(new java.awt.Color(153, 153, 153));
        pos11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos11.setForeground(new java.awt.Color(153, 153, 153));

        pos12.setBackground(new java.awt.Color(153, 153, 153));
        pos12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos12.setForeground(new java.awt.Color(153, 153, 153));

        pos13.setBackground(new java.awt.Color(153, 153, 153));
        pos13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos13.setForeground(new java.awt.Color(153, 153, 153));

        pos14.setBackground(new java.awt.Color(153, 153, 153));
        pos14.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos14.setForeground(new java.awt.Color(153, 153, 153));

        pos15.setBackground(new java.awt.Color(153, 153, 153));
        pos15.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos15.setForeground(new java.awt.Color(153, 153, 153));

        pos16.setBackground(new java.awt.Color(153, 153, 153));
        pos16.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos16.setForeground(new java.awt.Color(153, 153, 153));

        pos17.setBackground(new java.awt.Color(153, 153, 153));
        pos17.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos17.setForeground(new java.awt.Color(153, 153, 153));

        pos18.setBackground(new java.awt.Color(153, 153, 153));
        pos18.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos18.setForeground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout direitaLayout = new javax.swing.GroupLayout(direita);
        direita.setLayout(direitaLayout);
        direitaLayout.setHorizontalGroup(
            direitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(direitaLayout.createSequentialGroup()
                .addGroup(direitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(direitaLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(direitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(direitaLayout.createSequentialGroup()
                                .addComponent(pos16, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(pos17, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(pos18, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(direitaLayout.createSequentialGroup()
                                .addComponent(pos10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(pos11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(pos12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(direitaLayout.createSequentialGroup()
                        .addComponent(pos13, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(pos14, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(pos15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, 0))
        );
        direitaLayout.setVerticalGroup(
            direitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(direitaLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(direitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(direitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(pos11, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                        .addComponent(pos12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(pos10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(direitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pos13, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pos14, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pos15, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(direitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pos16, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pos17, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pos18, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1))
        );

        atras.setBackground(new java.awt.Color(255, 255, 255));
        atras.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pos19.setBackground(new java.awt.Color(153, 153, 153));
        pos19.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos19.setForeground(new java.awt.Color(153, 153, 153));

        pos20.setBackground(new java.awt.Color(153, 153, 153));
        pos20.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos20.setForeground(new java.awt.Color(153, 153, 153));

        pos21.setBackground(new java.awt.Color(153, 153, 153));
        pos21.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos21.setForeground(new java.awt.Color(153, 153, 153));

        pos22.setBackground(new java.awt.Color(153, 153, 153));
        pos22.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos22.setForeground(new java.awt.Color(153, 153, 153));

        pos23.setBackground(new java.awt.Color(153, 153, 153));
        pos23.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos23.setForeground(new java.awt.Color(153, 153, 153));

        pos24.setBackground(new java.awt.Color(153, 153, 153));
        pos24.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos24.setForeground(new java.awt.Color(153, 153, 153));

        pos25.setBackground(new java.awt.Color(153, 153, 153));
        pos25.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos25.setForeground(new java.awt.Color(153, 153, 153));

        pos26.setBackground(new java.awt.Color(153, 153, 153));
        pos26.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos26.setForeground(new java.awt.Color(153, 153, 153));

        pos27.setBackground(new java.awt.Color(153, 153, 153));
        pos27.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos27.setForeground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout atrasLayout = new javax.swing.GroupLayout(atras);
        atras.setLayout(atrasLayout);
        atrasLayout.setHorizontalGroup(
            atrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(atrasLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(atrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(atrasLayout.createSequentialGroup()
                        .addComponent(pos19, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(pos20, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(pos21, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(atrasLayout.createSequentialGroup()
                        .addGroup(atrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(atrasLayout.createSequentialGroup()
                                .addComponent(pos25, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(pos26, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(atrasLayout.createSequentialGroup()
                                .addComponent(pos22, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(pos23, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(1, 1, 1)
                        .addGroup(atrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pos24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pos27, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))))
                .addGap(0, 0, 0))
        );
        atrasLayout.setVerticalGroup(
            atrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(atrasLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(atrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pos19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pos20, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(pos21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(1, 1, 1)
                .addGroup(atrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pos22, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pos23, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pos24, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(atrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pos25, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pos26, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pos27, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1))
        );

        cima.setBackground(new java.awt.Color(255, 255, 255));
        cima.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pos37.setBackground(new java.awt.Color(153, 153, 153));
        pos37.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos37.setForeground(new java.awt.Color(153, 153, 153));

        pos38.setBackground(new java.awt.Color(153, 153, 153));
        pos38.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos38.setForeground(new java.awt.Color(153, 153, 153));

        pos39.setBackground(new java.awt.Color(153, 153, 153));
        pos39.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos39.setForeground(new java.awt.Color(153, 153, 153));

        pos40.setBackground(new java.awt.Color(153, 153, 153));
        pos40.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos40.setForeground(new java.awt.Color(153, 153, 153));

        pos41.setBackground(new java.awt.Color(153, 153, 153));
        pos41.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos41.setForeground(new java.awt.Color(153, 153, 153));

        pos42.setBackground(new java.awt.Color(153, 153, 153));
        pos42.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos42.setForeground(new java.awt.Color(153, 153, 153));

        pos43.setBackground(new java.awt.Color(153, 153, 153));
        pos43.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos43.setForeground(new java.awt.Color(153, 153, 153));

        pos44.setBackground(new java.awt.Color(153, 153, 153));
        pos44.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos44.setForeground(new java.awt.Color(153, 153, 153));

        pos45.setBackground(new java.awt.Color(153, 153, 153));
        pos45.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos45.setForeground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout cimaLayout = new javax.swing.GroupLayout(cima);
        cima.setLayout(cimaLayout);
        cimaLayout.setHorizontalGroup(
            cimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cimaLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(cimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cimaLayout.createSequentialGroup()
                        .addComponent(pos37, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(pos38, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(pos39, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cimaLayout.createSequentialGroup()
                        .addGroup(cimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cimaLayout.createSequentialGroup()
                                .addComponent(pos43, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(pos44, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(cimaLayout.createSequentialGroup()
                                .addComponent(pos40, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(pos41, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(1, 1, 1)
                        .addGroup(cimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pos42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pos45, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))))
                .addGap(0, 0, 0))
        );
        cimaLayout.setVerticalGroup(
            cimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cimaLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(cimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pos37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pos38, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(pos39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(1, 1, 1)
                .addGroup(cimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pos40, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pos41, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pos42, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(cimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pos43, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pos44, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pos45, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1))
        );

        esquerda.setBackground(new java.awt.Color(255, 255, 255));
        esquerda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pos28.setBackground(new java.awt.Color(153, 153, 153));
        pos28.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos28.setForeground(new java.awt.Color(153, 153, 153));

        pos29.setBackground(new java.awt.Color(153, 153, 153));
        pos29.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos29.setForeground(new java.awt.Color(153, 153, 153));

        pos30.setBackground(new java.awt.Color(153, 153, 153));
        pos30.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos30.setForeground(new java.awt.Color(153, 153, 153));

        pos31.setBackground(new java.awt.Color(153, 153, 153));
        pos31.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos31.setForeground(new java.awt.Color(153, 153, 153));

        pos32.setBackground(new java.awt.Color(153, 153, 153));
        pos32.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos32.setForeground(new java.awt.Color(153, 153, 153));

        pos33.setBackground(new java.awt.Color(153, 153, 153));
        pos33.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos33.setForeground(new java.awt.Color(153, 153, 153));

        pos34.setBackground(new java.awt.Color(153, 153, 153));
        pos34.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos34.setForeground(new java.awt.Color(153, 153, 153));

        pos35.setBackground(new java.awt.Color(153, 153, 153));
        pos35.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos35.setForeground(new java.awt.Color(153, 153, 153));

        pos36.setBackground(new java.awt.Color(153, 153, 153));
        pos36.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos36.setForeground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout esquerdaLayout = new javax.swing.GroupLayout(esquerda);
        esquerda.setLayout(esquerdaLayout);
        esquerdaLayout.setHorizontalGroup(
            esquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(esquerdaLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(esquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(esquerdaLayout.createSequentialGroup()
                        .addComponent(pos28, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(pos29, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(pos30, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(esquerdaLayout.createSequentialGroup()
                        .addGroup(esquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(esquerdaLayout.createSequentialGroup()
                                .addComponent(pos34, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(pos35, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(esquerdaLayout.createSequentialGroup()
                                .addComponent(pos31, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(pos32, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(1, 1, 1)
                        .addGroup(esquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pos33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pos36, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))))
                .addGap(0, 0, 0))
        );
        esquerdaLayout.setVerticalGroup(
            esquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(esquerdaLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(esquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(esquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(pos29, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                        .addComponent(pos30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(pos28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(esquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pos31, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pos32, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pos33, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(esquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pos34, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pos35, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pos36, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1))
        );

        baixo.setBackground(new java.awt.Color(255, 255, 255));
        baixo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pos46.setBackground(new java.awt.Color(153, 153, 153));
        pos46.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos46.setForeground(new java.awt.Color(153, 153, 153));

        pos47.setBackground(new java.awt.Color(153, 153, 153));
        pos47.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos47.setForeground(new java.awt.Color(153, 153, 153));

        pos48.setBackground(new java.awt.Color(153, 153, 153));
        pos48.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos48.setForeground(new java.awt.Color(153, 153, 153));

        pos49.setBackground(new java.awt.Color(153, 153, 153));
        pos49.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos49.setForeground(new java.awt.Color(153, 153, 153));

        pos50.setBackground(new java.awt.Color(153, 153, 153));
        pos50.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos50.setForeground(new java.awt.Color(153, 153, 153));

        pos51.setBackground(new java.awt.Color(153, 153, 153));
        pos51.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos51.setForeground(new java.awt.Color(153, 153, 153));

        pos52.setBackground(new java.awt.Color(153, 153, 153));
        pos52.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos52.setForeground(new java.awt.Color(153, 153, 153));

        pos53.setBackground(new java.awt.Color(153, 153, 153));
        pos53.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos53.setForeground(new java.awt.Color(153, 153, 153));

        pos54.setBackground(new java.awt.Color(153, 153, 153));
        pos54.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos54.setForeground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout baixoLayout = new javax.swing.GroupLayout(baixo);
        baixo.setLayout(baixoLayout);
        baixoLayout.setHorizontalGroup(
            baixoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(baixoLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(baixoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(baixoLayout.createSequentialGroup()
                        .addComponent(pos46, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(pos47, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(pos48, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(baixoLayout.createSequentialGroup()
                        .addGroup(baixoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(baixoLayout.createSequentialGroup()
                                .addComponent(pos52, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(pos53, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(baixoLayout.createSequentialGroup()
                                .addComponent(pos49, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(pos50, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(1, 1, 1)
                        .addGroup(baixoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pos54, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(pos51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 0, 0))
        );
        baixoLayout.setVerticalGroup(
            baixoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(baixoLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(baixoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(baixoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(baixoLayout.createSequentialGroup()
                            .addComponent(pos48, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addComponent(pos46, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pos47, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(baixoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pos49, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pos50, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pos51, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(baixoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pos52, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pos53, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pos54, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1))
        );

        javax.swing.GroupLayout containerFacesLayout = new javax.swing.GroupLayout(containerFaces);
        containerFaces.setLayout(containerFacesLayout);
        containerFacesLayout.setHorizontalGroup(
            containerFacesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerFacesLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(esquerda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(containerFacesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cima, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(baixo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(frente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(direita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        containerFacesLayout.setVerticalGroup(
            containerFacesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerFacesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(containerFacesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(esquerda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(frente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(direita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(baixo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        containerComandos.setBackground(new java.awt.Color(255, 255, 255));

        jbEmbaralhar.setBackground(new java.awt.Color(204, 204, 204));
        jbEmbaralhar.setText("Embaralhar");
        jbEmbaralhar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEmbaralharActionPerformed(evt);
            }
        });

        jLabel1.setText("Linha:");

        jtfLinha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfLinha.setText("0");
        jtfLinha.setToolTipText("Linha");

        jLabel2.setText("Coluna:");

        jtfColuna.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfColuna.setText("0");
        jtfColuna.setToolTipText("Coluna");

        jbGirarCima.setBackground(new java.awt.Color(204, 204, 204));
        jbGirarCima.setText("Girar Cima");
        jbGirarCima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGirarCimaActionPerformed(evt);
            }
        });

        jbGirarHorario.setBackground(new java.awt.Color(204, 204, 204));
        jbGirarHorario.setText("Girar Horario");
        jbGirarHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGirarHorarioActionPerformed(evt);
            }
        });

        jbGirarAntiHorario.setBackground(new java.awt.Color(204, 204, 204));
        jbGirarAntiHorario.setText("Girar Anti Horario");
        jbGirarAntiHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGirarAntiHorarioActionPerformed(evt);
            }
        });

        jbGirarBaixo.setBackground(new java.awt.Color(204, 204, 204));
        jbGirarBaixo.setText("Girar Baixo");
        jbGirarBaixo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGirarBaixoActionPerformed(evt);
            }
        });

        jbGirarDireita.setBackground(new java.awt.Color(204, 204, 204));
        jbGirarDireita.setText("Girar Direita");
        jbGirarDireita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGirarDireitaActionPerformed(evt);
            }
        });

        jbGirarEsquerda.setBackground(new java.awt.Color(204, 204, 204));
        jbGirarEsquerda.setText("Girar Esquerda");
        jbGirarEsquerda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGirarEsquerdaActionPerformed(evt);
            }
        });

        jbSolucionarForcaBruta.setBackground(new java.awt.Color(204, 204, 204));
        jbSolucionarForcaBruta.setText("Solucionar Por Força Bruta");
        jbSolucionarForcaBruta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSolucionarForcaBrutaActionPerformed(evt);
            }
        });

        jbSolucionarMetodoBasico.setBackground(new java.awt.Color(204, 204, 204));
        jbSolucionarMetodoBasico.setText("Solucionar Pelo Metódo Básico");
        jbSolucionarMetodoBasico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSolucionarMetodoBasicoActionPerformed(evt);
            }
        });

        jbNovoCubo.setBackground(new java.awt.Color(204, 204, 204));
        jbNovoCubo.setText("Novo Cubo");
        jbNovoCubo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoCuboActionPerformed(evt);
            }
        });

        jlResposta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlResposta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Cubo Mágico");

        jbPararForcaBruta.setBackground(new java.awt.Color(204, 204, 204));
        jbPararForcaBruta.setText("Parar  Força Bruta");
        jbPararForcaBruta.setEnabled(false);
        jbPararForcaBruta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPararForcaBrutaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout containerComandosLayout = new javax.swing.GroupLayout(containerComandos);
        containerComandos.setLayout(containerComandosLayout);
        containerComandosLayout.setHorizontalGroup(
            containerComandosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerComandosLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(containerComandosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(containerComandosLayout.createSequentialGroup()
                        .addGroup(containerComandosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbGirarCima, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jbGirarBaixo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(containerComandosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbGirarAntiHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbGirarHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jtfColuna)
                    .addComponent(jLabel1)
                    .addComponent(jbGirarEsquerda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbEmbaralhar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbGirarDireita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfLinha)
                    .addComponent(jbSolucionarForcaBruta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbSolucionarMetodoBasico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbNovoCubo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbPararForcaBruta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlResposta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );
        containerComandosLayout.setVerticalGroup(
            containerComandosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerComandosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jbNovoCubo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jbEmbaralhar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jbSolucionarForcaBruta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jbPararForcaBruta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jbSolucionarMetodoBasico, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jlResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addComponent(jtfLinha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jbGirarEsquerda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jbGirarDireita, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(0, 0, 0)
                .addComponent(jtfColuna, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(containerComandosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGirarCima, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbGirarHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(containerComandosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGirarBaixo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbGirarAntiHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80))
        );

        barra.setBackground(new java.awt.Color(204, 204, 204));

        fechar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/acme/resources/cancel.png"))); // NOI18N
        fechar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        fechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fecharMouseClicked(evt);
            }
        });

        minimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/acme/resources/down-arrow.png"))); // NOI18N
        minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout barraLayout = new javax.swing.GroupLayout(barra);
        barra.setLayout(barraLayout);
        barraLayout.setHorizontalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fechar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        barraLayout.setVerticalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(minimizar, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(fechar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addComponent(containerFaces, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(containerComandos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(barra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerLayout.createSequentialGroup()
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(containerFaces, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(containerComandos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, containerLayout.createSequentialGroup()
                        .addComponent(barra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_minimizarMouseClicked

    private void fecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fecharMouseClicked
        System.exit(0);
    }//GEN-LAST:event_fecharMouseClicked

    private void jbGirarEsquerdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGirarEsquerdaActionPerformed
        jlResposta.setText("");
        String campo = jtfLinha.getText().trim();

        if (campo.equals("0") || campo.equals("2")) {
            c.girarEsquerda(Integer.parseInt(campo));
            colorir();
        } else {
            JOptionPane.showMessageDialog(this, "Insira um valor válido [0 - 2]", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbGirarEsquerdaActionPerformed

    private void jbGirarDireitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGirarDireitaActionPerformed
        jlResposta.setText("");
        String campo = jtfLinha.getText().trim();

        if (campo.equals("0") || campo.equals("2")) {
            c.girarDireita(Integer.parseInt(campo));
            colorir();
        } else {
            JOptionPane.showMessageDialog(this, "Insira um valor válido [0 - 2]", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbGirarDireitaActionPerformed

    private void jbGirarCimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGirarCimaActionPerformed
        jlResposta.setText("");
        String campo = jtfColuna.getText().trim();

        if (campo.equals("0") || campo.equals("2")) {
            c.girarCima(Integer.parseInt(campo));
            colorir();
        } else {
            JOptionPane.showMessageDialog(this, "Insira um valor válido [0 - 2]", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbGirarCimaActionPerformed

    private void jbGirarBaixoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGirarBaixoActionPerformed
        jlResposta.setText("");
        String campo = jtfColuna.getText().trim();

        if (campo.equals("0") || campo.equals("2")) {
            c.girarBaixo(Integer.parseInt(campo));
            colorir();
        } else {
            JOptionPane.showMessageDialog(this, "Insira um valor válido [0 - 2]", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbGirarBaixoActionPerformed

    private void jbGirarHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGirarHorarioActionPerformed
        jlResposta.setText("");
        String campo = jtfColuna.getText().trim();

        if (campo.equals("0") || campo.equals("2")) {
            c.girarHorario(Integer.parseInt(campo));
            colorir();
        } else {
            JOptionPane.showMessageDialog(this, "Insira um valor válido [0 - 2]", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbGirarHorarioActionPerformed

    private void jbGirarAntiHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGirarAntiHorarioActionPerformed
        jlResposta.setText("");
        String campo = jtfColuna.getText().trim();

        if (campo.equals("0") || campo.equals("2")) {
            c.girarAntiHorario(Integer.parseInt(campo));
            colorir();
        } else {
            JOptionPane.showMessageDialog(this, "Insira um valor válido [0 - 2]", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbGirarAntiHorarioActionPerformed

    private void jbEmbaralharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEmbaralharActionPerformed
        desabilitarComponentes();

        jlResposta.setText("");

        Thread t = new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                try {
                    c.embaralhar();
                    colorir();

                    Thread.sleep(300);
                } catch (InterruptedException ex) {
                    Logger.getLogger(JFPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            habilitarComponentes();
            jbPararForcaBruta.setEnabled(false);
        });

        t.start();
    }//GEN-LAST:event_jbEmbaralharActionPerformed

    private void jbSolucionarForcaBrutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSolucionarForcaBrutaActionPerformed
        if (c.estaResolvido()) {
            jlResposta.setText("O cubo está resolvido!");
        } else {
            desabilitarComponentes();
            jbPararForcaBruta.setEnabled(true);

            jlResposta.setText("");

            threadForcaBruta = new Thread(() -> {
                while (!c.estaResolvido()) {
                    try {
                        SolucionarCubo sc = new SolucionarCubo(c);
                        c = sc.solucionarPorForcaBruta();
                        colorir();

                        Thread.sleep(50);

                        if (c.estaResolvido()) {
                            jlResposta.setText("Cubo Resolvido");
                            habilitarComponentes();
                            jbPararForcaBruta.setEnabled(false);
                        }
                    } catch (InterruptedException ex) {
                        Logger.getLogger(JFPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });

            threadForcaBruta.start();
        }
    }//GEN-LAST:event_jbSolucionarForcaBrutaActionPerformed

    private void jbSolucionarMetodoBasicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSolucionarMetodoBasicoActionPerformed
        metodoBasico();
    }//GEN-LAST:event_jbSolucionarMetodoBasicoActionPerformed

    private void jbNovoCuboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoCuboActionPerformed
        novoCubo();
    }//GEN-LAST:event_jbNovoCuboActionPerformed

    private void jbPararForcaBrutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPararForcaBrutaActionPerformed
        habilitarComponentes();
        jbPararForcaBruta.setEnabled(false);
        threadForcaBruta.stop();
        jlResposta.setText("");
    }//GEN-LAST:event_jbPararForcaBrutaActionPerformed

    private void metodoBasico() {
        if (c.estaResolvido()) {
            jlResposta.setText("O cubo está resolvido!");
        } else {
            jlResposta.setText("");

            int count = 0;
            while (!c.estaResolvido() && count < 10) {
                SolucionarCubo sc = new SolucionarCubo(c);
                c = sc.solucionarPorMetodoBasico();
                colorir();

                count++;
            }

            if (count == 10) {
                c.embaralhar();
                metodoBasico();
            } else {
                jlResposta.setText("Cubo Resolvido");
            }
        }
    }

    private void novoCubo() {
        jlResposta.setText("");
        c = new Cubo();
        colorir();
    }

    private void desabilitarComponentes() {
        for (Component c : containerComandos.getComponents()) {
            c.setEnabled(false);
        }
    }

    private void habilitarComponentes() {
        for (Component c : containerComandos.getComponents()) {
            c.setEnabled(true);
        }
    }

    private void colorir() {
        List<int[][]> faces = c.getFaces();

        int[][] faceFrente = faces.get(0);
        int[][] faceCima = faces.get(1);
        int[][] faceAtras = faces.get(2);
        int[][] faceBaixo = faces.get(3);
        int[][] faceEsquerda = faces.get(4);
        int[][] faceDireita = faces.get(5);

        // Frente
        pos1.setBackground(getCor(faceFrente[0][0]));
        pos2.setBackground(getCor(faceFrente[0][1]));
        pos3.setBackground(getCor(faceFrente[0][2]));

        pos4.setBackground(getCor(faceFrente[1][0]));
        pos5.setBackground(getCor(faceFrente[1][1]));
        pos6.setBackground(getCor(faceFrente[1][2]));

        pos7.setBackground(getCor(faceFrente[2][0]));
        pos8.setBackground(getCor(faceFrente[2][1]));
        pos9.setBackground(getCor(faceFrente[2][2]));

        // Direita
        pos10.setBackground(getCor(faceDireita[0][0]));
        pos11.setBackground(getCor(faceDireita[0][1]));
        pos12.setBackground(getCor(faceDireita[0][2]));

        pos13.setBackground(getCor(faceDireita[1][0]));
        pos14.setBackground(getCor(faceDireita[1][1]));
        pos15.setBackground(getCor(faceDireita[1][2]));

        pos16.setBackground(getCor(faceDireita[2][0]));
        pos17.setBackground(getCor(faceDireita[2][1]));
        pos18.setBackground(getCor(faceDireita[2][2]));

        // Atras
        pos19.setBackground(getCor(faceAtras[0][0]));
        pos20.setBackground(getCor(faceAtras[0][1]));
        pos21.setBackground(getCor(faceAtras[0][2]));

        pos22.setBackground(getCor(faceAtras[1][0]));
        pos23.setBackground(getCor(faceAtras[1][1]));
        pos24.setBackground(getCor(faceAtras[1][2]));

        pos25.setBackground(getCor(faceAtras[2][0]));
        pos26.setBackground(getCor(faceAtras[2][1]));
        pos27.setBackground(getCor(faceAtras[2][2]));

        // Esquerda
        pos28.setBackground(getCor(faceEsquerda[0][0]));
        pos29.setBackground(getCor(faceEsquerda[0][1]));
        pos30.setBackground(getCor(faceEsquerda[0][2]));

        pos31.setBackground(getCor(faceEsquerda[1][0]));
        pos32.setBackground(getCor(faceEsquerda[1][1]));
        pos33.setBackground(getCor(faceEsquerda[1][2]));

        pos34.setBackground(getCor(faceEsquerda[2][0]));
        pos35.setBackground(getCor(faceEsquerda[2][1]));
        pos36.setBackground(getCor(faceEsquerda[2][2]));

        // Cima
        pos37.setBackground(getCor(faceCima[0][0]));
        pos38.setBackground(getCor(faceCima[0][1]));
        pos39.setBackground(getCor(faceCima[0][2]));

        pos40.setBackground(getCor(faceCima[1][0]));
        pos41.setBackground(getCor(faceCima[1][1]));
        pos42.setBackground(getCor(faceCima[1][2]));

        pos43.setBackground(getCor(faceCima[2][0]));
        pos44.setBackground(getCor(faceCima[2][1]));
        pos45.setBackground(getCor(faceCima[2][2]));

        // Baixo
        pos46.setBackground(getCor(faceBaixo[0][0]));
        pos47.setBackground(getCor(faceBaixo[0][1]));
        pos48.setBackground(getCor(faceBaixo[0][2]));

        pos49.setBackground(getCor(faceBaixo[1][0]));
        pos50.setBackground(getCor(faceBaixo[1][1]));
        pos51.setBackground(getCor(faceBaixo[1][2]));

        pos52.setBackground(getCor(faceBaixo[2][0]));
        pos53.setBackground(getCor(faceBaixo[2][1]));
        pos54.setBackground(getCor(faceBaixo[2][2]));
    }

    private Color getCor(int valorCor) {
        if (valorCor == Cor.AZUL.getCodigoCor()) {
            return Color.BLUE;
        } else if (valorCor == Cor.AMARELO.getCodigoCor()) {
            return Color.YELLOW;
        } else if (valorCor == Cor.BRANCO.getCodigoCor()) {
            return Color.WHITE;
        } else if (valorCor == Cor.ROSA.getCodigoCor()) {
            return Color.MAGENTA;
        } else if (valorCor == Cor.VERDE.getCodigoCor()) {
            return Color.GREEN;
        } else if (valorCor == Cor.VERMELHO.getCodigoCor()) {
            return Color.RED;
        }

        return null;
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("GTK+".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel atras;
    private javax.swing.JPanel baixo;
    private javax.swing.JPanel barra;
    private javax.swing.JPanel cima;
    private javax.swing.JPanel container;
    private javax.swing.JPanel containerComandos;
    private javax.swing.JPanel containerFaces;
    private javax.swing.JPanel direita;
    private javax.swing.JPanel esquerda;
    private javax.swing.JLabel fechar;
    private javax.swing.JPanel frente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jbEmbaralhar;
    private javax.swing.JButton jbGirarAntiHorario;
    private javax.swing.JButton jbGirarBaixo;
    private javax.swing.JButton jbGirarCima;
    private javax.swing.JButton jbGirarDireita;
    private javax.swing.JButton jbGirarEsquerda;
    private javax.swing.JButton jbGirarHorario;
    private javax.swing.JButton jbNovoCubo;
    private javax.swing.JButton jbPararForcaBruta;
    private javax.swing.JButton jbSolucionarForcaBruta;
    private javax.swing.JButton jbSolucionarMetodoBasico;
    private javax.swing.JLabel jlResposta;
    private javax.swing.JTextField jtfColuna;
    private javax.swing.JTextField jtfLinha;
    private javax.swing.JLabel minimizar;
    private javax.swing.JButton pos1;
    private javax.swing.JButton pos10;
    private javax.swing.JButton pos11;
    private javax.swing.JButton pos12;
    private javax.swing.JButton pos13;
    private javax.swing.JButton pos14;
    private javax.swing.JButton pos15;
    private javax.swing.JButton pos16;
    private javax.swing.JButton pos17;
    private javax.swing.JButton pos18;
    private javax.swing.JButton pos19;
    private javax.swing.JButton pos2;
    private javax.swing.JButton pos20;
    private javax.swing.JButton pos21;
    private javax.swing.JButton pos22;
    private javax.swing.JButton pos23;
    private javax.swing.JButton pos24;
    private javax.swing.JButton pos25;
    private javax.swing.JButton pos26;
    private javax.swing.JButton pos27;
    private javax.swing.JButton pos28;
    private javax.swing.JButton pos29;
    private javax.swing.JButton pos3;
    private javax.swing.JButton pos30;
    private javax.swing.JButton pos31;
    private javax.swing.JButton pos32;
    private javax.swing.JButton pos33;
    private javax.swing.JButton pos34;
    private javax.swing.JButton pos35;
    private javax.swing.JButton pos36;
    private javax.swing.JButton pos37;
    private javax.swing.JButton pos38;
    private javax.swing.JButton pos39;
    private javax.swing.JButton pos4;
    private javax.swing.JButton pos40;
    private javax.swing.JButton pos41;
    private javax.swing.JButton pos42;
    private javax.swing.JButton pos43;
    private javax.swing.JButton pos44;
    private javax.swing.JButton pos45;
    private javax.swing.JButton pos46;
    private javax.swing.JButton pos47;
    private javax.swing.JButton pos48;
    private javax.swing.JButton pos49;
    private javax.swing.JButton pos5;
    private javax.swing.JButton pos50;
    private javax.swing.JButton pos51;
    private javax.swing.JButton pos52;
    private javax.swing.JButton pos53;
    private javax.swing.JButton pos54;
    private javax.swing.JButton pos6;
    private javax.swing.JButton pos7;
    private javax.swing.JButton pos8;
    private javax.swing.JButton pos9;
    // End of variables declaration//GEN-END:variables
}
