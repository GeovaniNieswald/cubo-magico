package com.acme;

import com.acme.model.Cubo;

public class JFPrincipal extends javax.swing.JFrame {

    public JFPrincipal() {
        initComponents();
        
        Cubo c = new Cubo();
        
        System.out.println("Cubo original\n");
        
        c.exibirCubo();
        
//        System.out.println("Cubo cima\n");
//        
//        c.girarCima(0);        
//        c.girarCima(1);        
//        c.girarCima(2);        
//        c.exibirCubo();
//        
        
        System.out.println("Cubo esquerda\n");
        
        c.girarEsquerda(0);        
        c.girarEsquerda(1);        
        c.girarEsquerda(2);        
        c.exibirCubo();
        
        
//        System.out.println("Cubo direita\n");
//        
//        c.girarDireita(0);        
//        c.girarDireita(1);        
//        c.girarDireita(2);        
//        c.exibirCubo();
//        
        
        
        
        
        
        
        System.exit(0);
    }
    
    //qualquermerda

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        container = new javax.swing.JPanel();
        barra = new javax.swing.JPanel();
        fechar = new javax.swing.JLabel();
        minimizar = new javax.swing.JLabel();
        face1 = new javax.swing.JPanel();
        pos1 = new javax.swing.JButton();
        pos2 = new javax.swing.JButton();
        pos3 = new javax.swing.JButton();
        pos4 = new javax.swing.JButton();
        pos5 = new javax.swing.JButton();
        pos6 = new javax.swing.JButton();
        pos7 = new javax.swing.JButton();
        pos8 = new javax.swing.JButton();
        pos9 = new javax.swing.JButton();
        face2 = new javax.swing.JPanel();
        pos10 = new javax.swing.JButton();
        pos11 = new javax.swing.JButton();
        pos12 = new javax.swing.JButton();
        pos13 = new javax.swing.JButton();
        pos14 = new javax.swing.JButton();
        pos15 = new javax.swing.JButton();
        pos16 = new javax.swing.JButton();
        pos17 = new javax.swing.JButton();
        pos18 = new javax.swing.JButton();
        face3 = new javax.swing.JPanel();
        pos19 = new javax.swing.JButton();
        pos20 = new javax.swing.JButton();
        pos21 = new javax.swing.JButton();
        pos22 = new javax.swing.JButton();
        pos23 = new javax.swing.JButton();
        pos24 = new javax.swing.JButton();
        pos25 = new javax.swing.JButton();
        pos26 = new javax.swing.JButton();
        pos27 = new javax.swing.JButton();
        face4 = new javax.swing.JPanel();
        pos28 = new javax.swing.JButton();
        pos29 = new javax.swing.JButton();
        pos30 = new javax.swing.JButton();
        pos31 = new javax.swing.JButton();
        pos32 = new javax.swing.JButton();
        pos33 = new javax.swing.JButton();
        pos34 = new javax.swing.JButton();
        pos35 = new javax.swing.JButton();
        pos36 = new javax.swing.JButton();
        face5 = new javax.swing.JPanel();
        pos37 = new javax.swing.JButton();
        pos38 = new javax.swing.JButton();
        pos39 = new javax.swing.JButton();
        pos40 = new javax.swing.JButton();
        pos41 = new javax.swing.JButton();
        pos42 = new javax.swing.JButton();
        pos43 = new javax.swing.JButton();
        pos44 = new javax.swing.JButton();
        pos45 = new javax.swing.JButton();
        face6 = new javax.swing.JPanel();
        pos46 = new javax.swing.JButton();
        pos47 = new javax.swing.JButton();
        pos48 = new javax.swing.JButton();
        pos49 = new javax.swing.JButton();
        pos50 = new javax.swing.JButton();
        pos51 = new javax.swing.JButton();
        pos52 = new javax.swing.JButton();
        pos53 = new javax.swing.JButton();
        pos54 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cubo Mágico");
        setBackground(new java.awt.Color(255, 255, 255));
        setExtendedState(6);
        setUndecorated(true);

        container.setBackground(new java.awt.Color(255, 255, 255));

        barra.setBackground(new java.awt.Color(255, 255, 255));

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
                .addGap(10, 10, 10)
                .addComponent(fechar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        barraLayout.setVerticalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        face1.setBackground(new java.awt.Color(255, 255, 255));
        face1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pos1.setBackground(new java.awt.Color(0, 0, 255));
        pos1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos1.setForeground(new java.awt.Color(153, 153, 153));
        pos1.setText("1");

        pos2.setBackground(new java.awt.Color(0, 0, 255));
        pos2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos2.setForeground(new java.awt.Color(153, 153, 153));
        pos2.setText("2");

        pos3.setBackground(new java.awt.Color(0, 0, 255));
        pos3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos3.setForeground(new java.awt.Color(153, 153, 153));
        pos3.setText("3");

        pos4.setBackground(new java.awt.Color(0, 0, 255));
        pos4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos4.setForeground(new java.awt.Color(153, 153, 153));
        pos4.setText("4");

        pos5.setBackground(new java.awt.Color(0, 0, 255));
        pos5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos5.setForeground(new java.awt.Color(153, 153, 153));
        pos5.setText("5");

        pos6.setBackground(new java.awt.Color(0, 0, 255));
        pos6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos6.setForeground(new java.awt.Color(153, 153, 153));
        pos6.setText("6");

        pos7.setBackground(new java.awt.Color(0, 0, 255));
        pos7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos7.setForeground(new java.awt.Color(153, 153, 153));
        pos7.setText("7");

        pos8.setBackground(new java.awt.Color(0, 0, 255));
        pos8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos8.setForeground(new java.awt.Color(153, 153, 153));
        pos8.setText("8");

        pos9.setBackground(new java.awt.Color(0, 0, 255));
        pos9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos9.setForeground(new java.awt.Color(153, 153, 153));
        pos9.setText("9");

        javax.swing.GroupLayout face1Layout = new javax.swing.GroupLayout(face1);
        face1.setLayout(face1Layout);
        face1Layout.setHorizontalGroup(
            face1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(face1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(face1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(face1Layout.createSequentialGroup()
                        .addComponent(pos1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(pos2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(pos3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(face1Layout.createSequentialGroup()
                        .addComponent(pos7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(pos8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(pos9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(face1Layout.createSequentialGroup()
                        .addComponent(pos4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(pos5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(pos6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(1, 1, 1))
        );
        face1Layout.setVerticalGroup(
            face1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(face1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(face1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pos1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pos2, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(pos3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(1, 1, 1)
                .addGroup(face1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pos4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pos5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pos6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(face1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pos7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pos8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pos9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1))
        );

        face2.setBackground(new java.awt.Color(255, 255, 255));
        face2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pos10.setBackground(new java.awt.Color(204, 0, 0));
        pos10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos10.setForeground(new java.awt.Color(153, 153, 153));
        pos10.setText("10");

        pos11.setBackground(new java.awt.Color(204, 0, 0));
        pos11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos11.setForeground(new java.awt.Color(153, 153, 153));
        pos11.setText("11");

        pos12.setBackground(new java.awt.Color(204, 0, 0));
        pos12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos12.setForeground(new java.awt.Color(153, 153, 153));
        pos12.setText("12");

        pos13.setBackground(new java.awt.Color(204, 0, 0));
        pos13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos13.setForeground(new java.awt.Color(153, 153, 153));
        pos13.setText("13");

        pos14.setBackground(new java.awt.Color(204, 0, 0));
        pos14.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos14.setForeground(new java.awt.Color(153, 153, 153));
        pos14.setText("14");

        pos15.setBackground(new java.awt.Color(204, 0, 0));
        pos15.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos15.setForeground(new java.awt.Color(153, 153, 153));
        pos15.setText("15");

        pos16.setBackground(new java.awt.Color(204, 0, 0));
        pos16.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos16.setForeground(new java.awt.Color(153, 153, 153));
        pos16.setText("16");

        pos17.setBackground(new java.awt.Color(204, 0, 0));
        pos17.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos17.setForeground(new java.awt.Color(153, 153, 153));
        pos17.setText("17");

        pos18.setBackground(new java.awt.Color(204, 0, 0));
        pos18.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos18.setForeground(new java.awt.Color(153, 153, 153));
        pos18.setText("18");

        javax.swing.GroupLayout face2Layout = new javax.swing.GroupLayout(face2);
        face2.setLayout(face2Layout);
        face2Layout.setHorizontalGroup(
            face2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(face2Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(face2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(face2Layout.createSequentialGroup()
                        .addComponent(pos16, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(pos17, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(pos18, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(face2Layout.createSequentialGroup()
                        .addComponent(pos10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(pos11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(pos12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(face2Layout.createSequentialGroup()
                        .addComponent(pos13, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(pos14, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(pos15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(1, 1, 1))
        );
        face2Layout.setVerticalGroup(
            face2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(face2Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(face2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(face2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(pos11, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                        .addComponent(pos12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(pos10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(face2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pos13, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pos14, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pos15, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(face2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pos16, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pos17, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pos18, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1))
        );

        face3.setBackground(new java.awt.Color(255, 255, 255));
        face3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pos19.setBackground(new java.awt.Color(0, 153, 0));
        pos19.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos19.setForeground(new java.awt.Color(153, 153, 153));
        pos19.setText("19");

        pos20.setBackground(new java.awt.Color(0, 153, 0));
        pos20.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos20.setForeground(new java.awt.Color(153, 153, 153));
        pos20.setText("20");

        pos21.setBackground(new java.awt.Color(0, 153, 0));
        pos21.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos21.setForeground(new java.awt.Color(153, 153, 153));
        pos21.setText("21");

        pos22.setBackground(new java.awt.Color(0, 153, 0));
        pos22.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos22.setForeground(new java.awt.Color(153, 153, 153));
        pos22.setText("22");

        pos23.setBackground(new java.awt.Color(0, 153, 0));
        pos23.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos23.setForeground(new java.awt.Color(153, 153, 153));
        pos23.setText("23");

        pos24.setBackground(new java.awt.Color(0, 153, 0));
        pos24.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos24.setForeground(new java.awt.Color(153, 153, 153));
        pos24.setText("24");

        pos25.setBackground(new java.awt.Color(0, 153, 0));
        pos25.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos25.setForeground(new java.awt.Color(153, 153, 153));
        pos25.setText("25");

        pos26.setBackground(new java.awt.Color(0, 153, 0));
        pos26.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos26.setForeground(new java.awt.Color(153, 153, 153));
        pos26.setText("26");

        pos27.setBackground(new java.awt.Color(0, 153, 0));
        pos27.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos27.setForeground(new java.awt.Color(153, 153, 153));
        pos27.setText("27");

        javax.swing.GroupLayout face3Layout = new javax.swing.GroupLayout(face3);
        face3.setLayout(face3Layout);
        face3Layout.setHorizontalGroup(
            face3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(face3Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(face3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(face3Layout.createSequentialGroup()
                        .addComponent(pos19, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(pos20, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(pos21, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(face3Layout.createSequentialGroup()
                        .addComponent(pos25, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(pos26, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(pos27, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(face3Layout.createSequentialGroup()
                        .addComponent(pos22, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(pos23, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(pos24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(1, 1, 1))
        );
        face3Layout.setVerticalGroup(
            face3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(face3Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(face3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pos19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pos20, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(pos21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(1, 1, 1)
                .addGroup(face3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pos22, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pos23, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pos24, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(face3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pos25, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pos26, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pos27, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1))
        );

        face4.setBackground(new java.awt.Color(255, 255, 255));
        face4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pos28.setBackground(new java.awt.Color(255, 102, 0));
        pos28.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos28.setForeground(new java.awt.Color(153, 153, 153));
        pos28.setText("37");

        pos29.setBackground(new java.awt.Color(255, 102, 0));
        pos29.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos29.setForeground(new java.awt.Color(153, 153, 153));
        pos29.setText("38");

        pos30.setBackground(new java.awt.Color(255, 102, 0));
        pos30.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos30.setForeground(new java.awt.Color(153, 153, 153));
        pos30.setText("39");

        pos31.setBackground(new java.awt.Color(255, 102, 0));
        pos31.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos31.setForeground(new java.awt.Color(153, 153, 153));
        pos31.setText("40");

        pos32.setBackground(new java.awt.Color(255, 102, 0));
        pos32.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos32.setForeground(new java.awt.Color(153, 153, 153));
        pos32.setText("41");

        pos33.setBackground(new java.awt.Color(255, 102, 0));
        pos33.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos33.setForeground(new java.awt.Color(153, 153, 153));
        pos33.setText("42");

        pos34.setBackground(new java.awt.Color(255, 102, 0));
        pos34.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos34.setForeground(new java.awt.Color(153, 153, 153));
        pos34.setText("43");

        pos35.setBackground(new java.awt.Color(255, 102, 0));
        pos35.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos35.setForeground(new java.awt.Color(153, 153, 153));
        pos35.setText("44");

        pos36.setBackground(new java.awt.Color(255, 102, 0));
        pos36.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos36.setForeground(new java.awt.Color(153, 153, 153));
        pos36.setText("45");

        javax.swing.GroupLayout face4Layout = new javax.swing.GroupLayout(face4);
        face4.setLayout(face4Layout);
        face4Layout.setHorizontalGroup(
            face4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(face4Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(face4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(face4Layout.createSequentialGroup()
                        .addComponent(pos28, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(pos29, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(pos30, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(face4Layout.createSequentialGroup()
                        .addComponent(pos34, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(pos35, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(pos36, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(face4Layout.createSequentialGroup()
                        .addComponent(pos31, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(pos32, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(pos33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(1, 1, 1))
        );
        face4Layout.setVerticalGroup(
            face4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(face4Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(face4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pos28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pos29, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(pos30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(1, 1, 1)
                .addGroup(face4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pos31, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pos32, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pos33, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(face4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pos34, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pos35, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pos36, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1))
        );

        face5.setBackground(new java.awt.Color(255, 255, 255));
        face5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pos37.setBackground(new java.awt.Color(255, 255, 0));
        pos37.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos37.setForeground(new java.awt.Color(153, 153, 153));
        pos37.setText("28");

        pos38.setBackground(new java.awt.Color(255, 255, 0));
        pos38.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos38.setForeground(new java.awt.Color(153, 153, 153));
        pos38.setText("29");

        pos39.setBackground(new java.awt.Color(255, 255, 0));
        pos39.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos39.setForeground(new java.awt.Color(153, 153, 153));
        pos39.setText("30");

        pos40.setBackground(new java.awt.Color(255, 255, 0));
        pos40.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos40.setForeground(new java.awt.Color(153, 153, 153));
        pos40.setText("31");

        pos41.setBackground(new java.awt.Color(255, 255, 0));
        pos41.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos41.setForeground(new java.awt.Color(153, 153, 153));
        pos41.setText("32");

        pos42.setBackground(new java.awt.Color(255, 255, 0));
        pos42.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos42.setForeground(new java.awt.Color(153, 153, 153));
        pos42.setText("33");

        pos43.setBackground(new java.awt.Color(255, 255, 0));
        pos43.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos43.setForeground(new java.awt.Color(153, 153, 153));
        pos43.setText("34");

        pos44.setBackground(new java.awt.Color(255, 255, 0));
        pos44.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos44.setForeground(new java.awt.Color(153, 153, 153));
        pos44.setText("35");

        pos45.setBackground(new java.awt.Color(255, 255, 0));
        pos45.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos45.setForeground(new java.awt.Color(153, 153, 153));
        pos45.setText("36");

        javax.swing.GroupLayout face5Layout = new javax.swing.GroupLayout(face5);
        face5.setLayout(face5Layout);
        face5Layout.setHorizontalGroup(
            face5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(face5Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(face5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(face5Layout.createSequentialGroup()
                        .addComponent(pos37, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(pos38, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(pos39, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(face5Layout.createSequentialGroup()
                        .addComponent(pos43, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(pos44, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(pos45, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(face5Layout.createSequentialGroup()
                        .addComponent(pos40, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(pos41, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(pos42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(1, 1, 1))
        );
        face5Layout.setVerticalGroup(
            face5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(face5Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(face5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(face5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(pos38, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                        .addComponent(pos39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(pos37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(face5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pos40, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pos41, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pos42, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(face5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pos43, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pos44, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pos45, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1))
        );

        face6.setBackground(new java.awt.Color(255, 255, 255));
        face6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pos46.setBackground(new java.awt.Color(255, 255, 255));
        pos46.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos46.setForeground(new java.awt.Color(153, 153, 153));
        pos46.setText("46");

        pos47.setBackground(new java.awt.Color(255, 255, 255));
        pos47.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos47.setForeground(new java.awt.Color(153, 153, 153));
        pos47.setText("47");

        pos48.setBackground(new java.awt.Color(255, 255, 255));
        pos48.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos48.setForeground(new java.awt.Color(153, 153, 153));
        pos48.setText("48");

        pos49.setBackground(new java.awt.Color(255, 255, 255));
        pos49.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos49.setForeground(new java.awt.Color(153, 153, 153));
        pos49.setText("49");

        pos50.setBackground(new java.awt.Color(255, 255, 255));
        pos50.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos50.setForeground(new java.awt.Color(153, 153, 153));
        pos50.setText("50");

        pos51.setBackground(new java.awt.Color(255, 255, 255));
        pos51.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos51.setForeground(new java.awt.Color(153, 153, 153));
        pos51.setText("51");

        pos52.setBackground(new java.awt.Color(255, 255, 255));
        pos52.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos52.setForeground(new java.awt.Color(153, 153, 153));
        pos52.setText("52");

        pos53.setBackground(new java.awt.Color(255, 255, 255));
        pos53.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos53.setForeground(new java.awt.Color(153, 153, 153));
        pos53.setText("53");

        pos54.setBackground(new java.awt.Color(255, 255, 255));
        pos54.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pos54.setForeground(new java.awt.Color(153, 153, 153));
        pos54.setText("54");

        javax.swing.GroupLayout face6Layout = new javax.swing.GroupLayout(face6);
        face6.setLayout(face6Layout);
        face6Layout.setHorizontalGroup(
            face6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(face6Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(face6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(face6Layout.createSequentialGroup()
                        .addComponent(pos46, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(pos47, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(pos48, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(face6Layout.createSequentialGroup()
                        .addComponent(pos52, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(pos53, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(pos54, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(face6Layout.createSequentialGroup()
                        .addComponent(pos49, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(pos50, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(pos51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(1, 1, 1))
        );
        face6Layout.setVerticalGroup(
            face6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(face6Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(face6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(face6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(face6Layout.createSequentialGroup()
                            .addComponent(pos48, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addComponent(pos46, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pos47, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(face6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pos49, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pos50, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pos51, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(face6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pos52, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pos53, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pos54, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1))
        );

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(face5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(face4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(face6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(containerLayout.createSequentialGroup()
                        .addComponent(face1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(face2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(face3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                .addComponent(barra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(barra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(containerLayout.createSequentialGroup()
                        .addContainerGap(20, Short.MAX_VALUE)
                        .addComponent(face4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(face5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(face3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(face2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(face1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addComponent(face6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
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

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
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
    private javax.swing.JPanel barra;
    private javax.swing.JPanel container;
    private javax.swing.JPanel face1;
    private javax.swing.JPanel face2;
    private javax.swing.JPanel face3;
    private javax.swing.JPanel face4;
    private javax.swing.JPanel face5;
    private javax.swing.JPanel face6;
    private javax.swing.JLabel fechar;
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
