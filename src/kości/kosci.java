/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kości;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.beans.PropertyChangeEvent;
import static java.lang.Thread.sleep;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
import javax.swing.border.LineBorder;

/**
 *
 * @author Patryk
 */
public class kosci extends javax.swing.JFrame {

    int liczba_graczy, liczba_6, liczba_5, liczba_4, liczba_3, liczba_2, liczba_1;
    int rzuty = 3, tura, kostka1, kostka2, kostka3, kostka4, kostka5;
    String gracz2 = "2 graczy", gracz3 = "3 graczy", gracz4 = "4 graczy";
    Icon szesc, piec, cztery, trzy, dwa, jeden;
    boolean trzymaj1, trzymaj2, trzymaj3, trzymaj4, trzymaj5;
    grajek[] players = new grajek[4];

    /**
     * Creates new form kosci
     */
    public kosci() {
        boolean prawidlowosc = false;
        szesc = new ImageIcon(this.getClass().getResource("k6.png"));
        piec = new ImageIcon(this.getClass().getResource("k5.png"));
        cztery = new ImageIcon(this.getClass().getResource("k4.png"));
        trzy = new ImageIcon(this.getClass().getResource("k3.png"));
        dwa = new ImageIcon(this.getClass().getResource("k2.png"));
        jeden = new ImageIcon(this.getClass().getResource("k1.png"));
        initComponents();
        Object[] opcje = {gracz2, gracz3, gracz4};
        do {
            try {
                liczba_graczy = (JOptionPane.showOptionDialog(null, "WYBIERZ LICZBĘ GRACZY", "WYBÓR",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcje, null)) + 2;
                prawidlowosc = liczba_graczy >= 2;
            } catch (HeadlessException | NumberFormatException e) {
                JOptionPane.showMessageDialog(rootPane, "Błąd źle podana liczba graczy./n"
                        + "musi to być liczba całkowita.");
                prawidlowosc = false;
            }
        } while (prawidlowosc == false);
        String nazwa_gracza;
        for (int i = 1; i <= liczba_graczy; i++) {
            nazwa_gracza = JOptionPane.showInputDialog("podaj nazwę gracza " + i);
            jTable1.setValueAt(nazwa_gracza, 0, i);
            players[i - 1] = new grajek();
            players[i - 1].setNazwa(nazwa_gracza);
        }
        tura = 1;
        rzuty = 3;
    }
    class Rzut extends SwingWorker<Object, Object>{

    @Override
    protected Object doInBackground() throws Exception {
        for(int i = 0;i < 100;i++){
            sleep(10);
           if (trzymaj1 == false) {
              Random anim1 = new Random();
              int los1 = ((anim1.nextInt(6)))+1;
              switch (los1) {
                case 1:
                    kosc1.setIcon(jeden);
                    break;
                case 2:
                    kosc1.setIcon(dwa);
                    break;
                case 3:
                    kosc1.setIcon(trzy);
                    break;
                case 4:
                    kosc1.setIcon(cztery);
                    break;
                case 5:
                    kosc1.setIcon(piec);
                    break;
                case 6:
                    kosc1.setIcon(szesc);
                    break;
            }
           } 
           if (trzymaj2 == false) {
                Random anim2 = new Random();
              int los2 = ((anim2.nextInt(6)))+1;
              switch (los2) {
                case 1:
                    kosc2.setIcon(jeden);
                    break;
                case 2:
                    kosc2.setIcon(dwa);
                    break;
                case 3:
                    kosc2.setIcon(trzy);
                    break;
                case 4:
                    kosc2.setIcon(cztery);
                    break;
                case 5:
                    kosc2.setIcon(piec);
                    break;
                case 6:
                    kosc2.setIcon(szesc);
                    break;
            }
           } 
           if (trzymaj3 == false) {
               Random anim3 = new Random();
              int los3 = ((anim3.nextInt(6)))+3;
              switch (los3) {
                case 1:
                    kosc3.setIcon(jeden);
                    break;
                case 2:
                    kosc3.setIcon(dwa);
                    break;
                case 3:
                    kosc3.setIcon(trzy);
                    break;
                case 4:
                    kosc3.setIcon(cztery);
                    break;
                case 5:
                    kosc3.setIcon(piec);
                    break;
                case 6:
                    kosc3.setIcon(szesc);
                    break;
            } 
           } 
           if (trzymaj4 == false) {
                Random anim4 = new Random();
              int los4 = ((anim4.nextInt(6)))+4;
              switch (los4) {
                case 1:
                    kosc4.setIcon(jeden);
                    break;
                case 2:
                    kosc4.setIcon(dwa);
                    break;
                case 3:
                    kosc4.setIcon(trzy);
                    break;
                case 4:
                    kosc4.setIcon(cztery);
                    break;
                case 5:
                    kosc4.setIcon(piec);
                    break;
                case 6:
                    kosc4.setIcon(szesc);
                    break;
            }
           } 
           if (trzymaj5 == false) {
                Random anim5 = new Random();
              int los5 = ((anim5.nextInt(6)))+5;
              switch (los5) {
                case 1:
                    kosc5.setIcon(jeden);
                    break;
                case 2:
                    kosc5.setIcon(dwa);
                    break;
                case 3:
                    kosc5.setIcon(trzy);
                    break;
                case 4:
                    kosc5.setIcon(cztery);
                    break;
                case 5:
                    kosc5.setIcon(piec);
                    break;
                case 6:
                    kosc5.setIcon(szesc);
                    break;
            }
           } 
        }
        if (trzymaj1 == false) {
            switch (kostka1) {
                case 1:
                    liczba_1 = liczba_1 - 1;
                    break;
                case 2:
                    liczba_2 = liczba_2 - 1;
                    break;
                case 3:
                    liczba_3 = liczba_3 - 1;
                    break;
                case 4:
                    liczba_4 = liczba_4 - 1;
                    break;
                case 5:
                    liczba_5 = liczba_5 - 1;
                    break;
                case 6:
                    liczba_6 = liczba_6 - 1;
                    break;
            }
            Random kostka1los = new Random();
            int wynik = (kostka1los.nextInt(6)) + 1;
            kostka1 = wynik;
            switch (wynik) {
                case 1:
                    liczba_1 = liczba_1 + 1;
                    kosc1.setIcon(jeden);
                    break;
                case 2:
                    liczba_2 = liczba_2 + 1;
                    kosc1.setIcon(dwa);
                    break;
                case 3:
                    liczba_3 = liczba_3 + 1;
                    kosc1.setIcon(trzy);
                    break;
                case 4:
                    liczba_4 = liczba_4 + 1;
                    kosc1.setIcon(cztery);
                    break;
                case 5:
                    liczba_5 = liczba_5 + 1;
                    kosc1.setIcon(piec);
                    break;
                case 6:
                    liczba_6 = liczba_6 + 1;
                    kosc1.setIcon(szesc);
                    break;
            }
        }
        if (trzymaj2 == false) {
            switch (kostka2) {
                case 1:
                    liczba_1 = liczba_1 - 1;
                    break;
                case 2:
                    liczba_2 = liczba_2 - 1;
                    break;
                case 3:
                    liczba_3 = liczba_3 - 1;
                    break;
                case 4:
                    liczba_4 = liczba_4 - 1;
                    break;
                case 5:
                    liczba_5 = liczba_5 - 1;
                    break;
                case 6:
                    liczba_6 = liczba_6 - 1;
                    break;
            }
            Random kostka2los = new Random();
            int wynik = (kostka2los.nextInt(6)) + 1;
            kostka2 = wynik;
            switch (wynik) {
                case 1:
                    liczba_1 = liczba_1 + 1;
                    kosc2.setIcon(jeden);
                    break;
                case 2:
                    liczba_2 = liczba_2 + 1;
                    kosc2.setIcon(dwa);
                    break;
                case 3:
                    liczba_3 = liczba_3 + 1;
                    kosc2.setIcon(trzy);
                    break;
                case 4:
                    liczba_4 = liczba_4 + 1;
                    kosc2.setIcon(cztery);
                    break;
                case 5:
                    liczba_5 = liczba_5 + 1;
                    kosc2.setIcon(piec);
                    break;
                case 6:
                    liczba_6 = liczba_6 + 1;
                    kosc2.setIcon(szesc);
                    break;
            }
        }
        if (trzymaj3 == false) {
            switch (kostka3) {
                case 1:
                    liczba_1 = liczba_1 - 1;
                    break;
                case 2:
                    liczba_2 = liczba_2 - 1;
                    break;
                case 3:
                    liczba_3 = liczba_3 - 1;
                    break;
                case 4:
                    liczba_4 = liczba_4 - 1;
                    break;
                case 5:
                    liczba_5 = liczba_5 - 1;
                    break;
                case 6:
                    liczba_6 = liczba_6 - 1;
                    break;
            }
            Random kostka3los = new Random();
            int wynik = (kostka3los.nextInt(6)) + 1;
            kostka3 = wynik;
            switch (wynik) {
                case 1:
                    liczba_1 = liczba_1 + 1;
                    kosc3.setIcon(jeden);
                    break;
                case 2:
                    liczba_2 = liczba_2 + 1;
                    kosc3.setIcon(dwa);
                    break;
                case 3:
                    liczba_3 = liczba_3 + 1;
                    kosc3.setIcon(trzy);
                    break;
                case 4:
                    liczba_4 = liczba_4 + 1;
                    kosc3.setIcon(cztery);
                    break;
                case 5:
                    liczba_5 = liczba_5 + 1;
                    kosc3.setIcon(piec);
                    break;
                case 6:
                    liczba_6 = liczba_6 + 1;
                    kosc3.setIcon(szesc);
                    break;
            }
        }
        if (trzymaj4 == false) {
            switch (kostka4) {
                case 1:
                    liczba_1 = liczba_1 - 1;
                    break;
                case 2:
                    liczba_2 = liczba_2 - 1;
                    break;
                case 3:
                    liczba_3 = liczba_3 - 1;
                    break;
                case 4:
                    liczba_4 = liczba_4 - 1;
                    break;
                case 5:
                    liczba_5 = liczba_5 - 1;
                    break;
                case 6:
                    liczba_6 = liczba_6 - 1;
                    break;
            }
            Random kostka4los = new Random();
            int wynik = (kostka4los.nextInt(6)) + 1;
            kostka4 = wynik;
            switch (wynik) {
                case 1:
                    liczba_1 = liczba_1 + 1;
                    kosc4.setIcon(jeden);
                    break;
                case 2:
                    liczba_2 = liczba_2 + 1;
                    kosc4.setIcon(dwa);
                    break;
                case 3:
                    liczba_3 = liczba_3 + 1;
                    kosc4.setIcon(trzy);
                    break;
                case 4:
                    liczba_4 = liczba_4 + 1;
                    kosc4.setIcon(cztery);
                    break;
                case 5:
                    liczba_5 = liczba_5 + 1;
                    kosc4.setIcon(piec);
                    break;
                case 6:
                    liczba_6 = liczba_6 + 1;
                    kosc4.setIcon(szesc);
                    break;
            }
        }
        if (trzymaj5 == false) {
            switch (kostka5) {
                case 1:
                    liczba_1 = liczba_1 - 1;
                    break;
                case 2:
                    liczba_2 = liczba_2 - 1;
                    break;
                case 3:
                    liczba_3 = liczba_3 - 1;
                    break;
                case 4:
                    liczba_4 = liczba_4 - 1;
                    break;
                case 5:
                    liczba_5 = liczba_5 - 1;
                    break;
                case 6:
                    liczba_6 = liczba_6 - 1;
                    break;
            }
            Random kostka5los = new Random();
            int wynik = (kostka5los.nextInt(6)) + 1;
            kostka5 = wynik;
            switch (wynik) {
                case 1:
                    liczba_1 = liczba_1 + 1;
                    kosc5.setIcon(jeden);
                    break;
                case 2:
                    liczba_2 = liczba_2 + 1;
                    kosc5.setIcon(dwa);
                    break;
                case 3:
                    liczba_3 = liczba_3 + 1;
                    kosc5.setIcon(trzy);
                    break;
                case 4:
                    liczba_4 = liczba_4 + 1;
                    kosc5.setIcon(cztery);
                    break;
                case 5:
                    liczba_5 = liczba_5 + 1;
                    kosc5.setIcon(piec);
                    break;
                case 6:
                    liczba_6 = liczba_6 + 1;
                    kosc5.setIcon(szesc);
                    break;
            }
        } rzucaj.setEnabled(rzuty != 0);
        Toolkit.getDefaultToolkit().beep();
        return null;
}}

    void czystka() {
        rzucaj.setEnabled(true);
        rzucaj.setText("rzuc koscmi masz 3 rzuty");
        tura = tura + 1;
        kosc1.setIcon(null);
        kosc1.setBorder(null);
        kosc2.setIcon(null);
        kosc2.setBorder(null);
        kosc3.setIcon(null);
        kosc3.setBorder(null);
        kosc4.setIcon(null);
        kosc4.setBorder(null);
        kosc5.setIcon(null);
        kosc5.setBorder(null);
        liczba_1 = 0;
        liczba_2 = 0;
        liczba_3 = 0;
        liczba_4 = 0;
        liczba_5 = 0;
        liczba_6 = 0;
        trzymaj1 = false;
        trzymaj2 = false;
        trzymaj3 = false;
        trzymaj4 = false;
        trzymaj5 = false;
        kostka1 = 0;
        kostka2 = 0;
        kostka3 = 0;
        kostka4 = 0;
        kostka5 = 0;
        if (tura > liczba_graczy) {
            tura = 1;
        }
        rzuty = 3;
        jedynka.setEnabled(players[tura - 1].isCzy1() == false);
        dwojka.setEnabled(players[tura - 1].isCzy2() == false);
        trojka.setEnabled(players[tura - 1].isCzy3() == false);
        czworka.setEnabled(players[tura - 1].isCzy4() == false);
        piatka.setEnabled(players[tura - 1].isCzy5() == false);
        szostka.setEnabled(players[tura - 1].isCzy6() == false);
        x3.setEnabled(players[tura - 1].isCzy3x() == false);
        x4.setEnabled(players[tura - 1].isCzy4x() == false);
        x5.setEnabled(players[tura - 1].isCzy5x() == false);
        pk4.setEnabled(players[tura - 1].isCzy4p() == false);
        pk5.setEnabled(players[tura - 1].isCzy5p() == false);
        full.setEnabled(players[tura - 1].isCzyfull() == false);
        p1.setEnabled(players[tura - 1].isCzypara() == false);
        p2.setEnabled(players[tura - 1].isCzy2pary() == false);
        szansa.setEnabled(players[tura - 1].isCzyszansa() == false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        kosc2 = new javax.swing.JButton();
        kosc3 = new javax.swing.JButton();
        kosc4 = new javax.swing.JButton();
        kosc1 = new javax.swing.JButton();
        kosc5 = new javax.swing.JButton();
        rzucaj = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jedynka = new javax.swing.JButton();
        dwojka = new javax.swing.JButton();
        trojka = new javax.swing.JButton();
        czworka = new javax.swing.JButton();
        szostka = new javax.swing.JButton();
        x3 = new javax.swing.JButton();
        x4 = new javax.swing.JButton();
        pk4 = new javax.swing.JButton();
        pk5 = new javax.swing.JButton();
        piatka = new javax.swing.JButton();
        szansa = new javax.swing.JButton();
        x5 = new javax.swing.JButton();
        full = new javax.swing.JButton();
        p1 = new javax.swing.JButton();
        p2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"nazwa", null, null, null, null},
                {"jedynki", null, null, null, null},
                {"dwojki", null, null, null, null},
                {"trojki", null, null, null, null},
                {"czworki", null, null, null, null},
                {"piatki", null, null, null, null},
                {"szostki", null, null, null, null},
                {"premia", "0", "0", "0", "0"},
                {"suma", "0", "0", "0", "0"},
                {"3 te same", null, null, null, null},
                {"4 te same", null, null, null, null},
                {"4 po kolei", null, null, null, null},
                {"5 po kolei", null, null, null, null},
                {"full", null, null, null, null},
                {"5 te same", null, null, null, null},
                {"para", null, null, null, null},
                {"2 pary", null, null, null, null},
                {"szansa", null, null, null, null},
                {"suma", "0", "0", "0", "0"},
                {"razem", "0", "0", "0", "0"}
            },
            new String [] {
                "rozpiska", "gracz1", "gracz2", "gracz3", "gracz4"
            }
        ));
        jTable1.setEnabled(false);
        jScrollPane1.setViewportView(jTable1);

        kosc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kosc2ActionPerformed(evt);
            }
        });

        kosc3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kosc3ActionPerformed(evt);
            }
        });

        kosc4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kosc4ActionPerformed(evt);
            }
        });

        kosc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kosc1ActionPerformed(evt);
            }
        });

        kosc5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kosc5ActionPerformed(evt);
            }
        });

        rzucaj.setText("Rzuc koscmi masz 3 rzuty");
        rzucaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rzucajActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("ZAPISZ JAKO");

        jedynka.setText("1");
        jedynka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jedynkaActionPerformed(evt);
            }
        });

        dwojka.setText("2");
        dwojka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dwojkaActionPerformed(evt);
            }
        });

        trojka.setText("3");
        trojka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trojkaActionPerformed(evt);
            }
        });

        czworka.setText("4");
        czworka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                czworkaActionPerformed(evt);
            }
        });

        szostka.setText("6");
        szostka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                szostkaActionPerformed(evt);
            }
        });

        x3.setText("3 TE SAME");
        x3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x3ActionPerformed(evt);
            }
        });

        x4.setText("4 TE SAME");
        x4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x4ActionPerformed(evt);
            }
        });

        pk4.setText("4 PO KOLEI");
        pk4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pk4ActionPerformed(evt);
            }
        });

        pk5.setText("5 PO KOLEI");
        pk5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pk5ActionPerformed(evt);
            }
        });

        piatka.setText("5");
        piatka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                piatkaActionPerformed(evt);
            }
        });

        szansa.setText("SZANSA");
        szansa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                szansaActionPerformed(evt);
            }
        });

        x5.setText("5 TE SAME");
        x5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x5ActionPerformed(evt);
            }
        });

        full.setText("FULL");
        full.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullActionPerformed(evt);
            }
        });

        p1.setText("PARA");
        p1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1ActionPerformed(evt);
            }
        });

        p2.setText("2 PARY");
        p2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rzucaj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jedynka)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dwojka)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(trojka)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(czworka)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(piatka)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(szostka))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(p1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(szansa))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(x3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pk4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pk5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(full)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(kosc1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(kosc2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(kosc3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(kosc4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kosc5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kosc2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kosc3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kosc1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kosc4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kosc5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(rzucaj, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dwojka, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jedynka, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(trojka, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(czworka, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(piatka, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(szostka, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(x3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pk4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pk5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(full, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(szansa, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kosc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kosc2ActionPerformed
         if(kosc2.getIcon()!=null){
        if (trzymaj2 == true) {
            trzymaj2 = false;
            kosc2.setBorder(null);
        } else {
            trzymaj2 = true;
            kosc2.setBorder(new LineBorder(Color.GREEN, 4));
        }}
    }//GEN-LAST:event_kosc2ActionPerformed

    private void kosc3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kosc3ActionPerformed
         if(kosc3.getIcon()!=null){
        if (trzymaj3 == true) {
            trzymaj3 = false;
            kosc3.setBorder(null);
        } else {
            trzymaj3 = true;
            kosc3.setBorder(new LineBorder(Color.GREEN, 4));
        }}
    }//GEN-LAST:event_kosc3ActionPerformed

    private void kosc4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kosc4ActionPerformed
         if(kosc4.getIcon()!=null){
        if (trzymaj4 == true) {
            trzymaj4 = false;
            kosc4.setBorder(null);
        } else {
            trzymaj4 = true;
            kosc4.setBorder(new LineBorder(Color.GREEN, 4));
        }}
    }//GEN-LAST:event_kosc4ActionPerformed

    private void kosc5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kosc5ActionPerformed
         if(kosc5.getIcon()!=null){
        if (trzymaj5 == true) {
            trzymaj5 = false;
            kosc5.setBorder(null);
        } else {
            trzymaj5 = true;
            kosc5.setBorder(new LineBorder(Color.GREEN, 4));
        }}
    }//GEN-LAST:event_kosc5ActionPerformed

    private void kosc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kosc1ActionPerformed
        if(kosc1.getIcon()!=null){
        if (trzymaj1 == true) {
            trzymaj1 = false;
            kosc1.setBorder(null);
        } else {
            trzymaj1 = true;
            kosc1.setBorder(new LineBorder(Color.GREEN, 4));
        }
    }
    }//GEN-LAST:event_kosc1ActionPerformed

    private void rzucajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rzucajActionPerformed
        rzuty = rzuty - 1;
        rzucaj.setText("rzuc koscmi masz " + rzuty + " rzuty");
        if (rzuty == 0) {
            rzucaj.setEnabled(false);
            rzucaj.setText("brak dostepnych rzutow");
        }
        rzucaj.setEnabled(false);
        Rzut rzut = new Rzut();
        rzut.addPropertyChangeListener((PropertyChangeEvent evt1) -> {
            String name1 = evt1.getPropertyName();
            if (name1.equals("progress")) {
                repaint();
            } else if (name1.equals("state")) {
                SwingWorker.StateValue state1 = (SwingWorker.StateValue) evt1.getNewValue();
                switch (state1) {
                    case DONE:
                        break;
                }
            }
        });
        rzut.execute();
        
        

    }//GEN-LAST:event_rzucajActionPerformed

    private void jedynkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jedynkaActionPerformed
        players[tura - 1].setJedynki(liczba_1 * 1);
        players[tura - 1].setCzy1(true);
        players[tura - 1].setPremia();
        players[tura - 1].setSumaG();
        players[tura - 1].setRazem();
        jTable1.setValueAt(players[tura - 1].getJedynki(), 1, tura);
        jTable1.setValueAt(players[tura - 1].getPremia(), 7, tura);
        jTable1.setValueAt(players[tura - 1].getSumaG(), 8, tura);
        jTable1.setValueAt(players[tura - 1].getRazem(), 19, tura);
        czystka();
    }//GEN-LAST:event_jedynkaActionPerformed

    private void dwojkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dwojkaActionPerformed
        players[tura - 1].setDwojki(liczba_2 * 2);
        players[tura - 1].setCzy2(true);
        players[tura - 1].setPremia();
        players[tura - 1].setSumaG();
        players[tura - 1].setRazem();
        jTable1.setValueAt(players[tura - 1].getDwojki(), 2, tura);
        jTable1.setValueAt(players[tura - 1].getPremia(), 7, tura);
        jTable1.setValueAt(players[tura - 1].getSumaG(), 8, tura);
        jTable1.setValueAt(players[tura - 1].getRazem(), 19, tura);
        czystka();
    }//GEN-LAST:event_dwojkaActionPerformed

    private void trojkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trojkaActionPerformed
        players[tura - 1].setTrojki(liczba_3 * 3);
        players[tura - 1].setCzy3(true);
        players[tura - 1].setPremia();
        players[tura - 1].setSumaG();
        players[tura - 1].setRazem();
        jTable1.setValueAt(players[tura - 1].getTrojki(), 3, tura);
        jTable1.setValueAt(players[tura - 1].getPremia(), 7, tura);
        jTable1.setValueAt(players[tura - 1].getSumaG(), 8, tura);
        jTable1.setValueAt(players[tura - 1].getRazem(), 19, tura);
        czystka();
    }//GEN-LAST:event_trojkaActionPerformed

    private void czworkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_czworkaActionPerformed
        players[tura - 1].setCzworki(liczba_4 * 4);
        players[tura - 1].setCzy4(true);
        players[tura - 1].setPremia();
        players[tura - 1].setSumaG();
        players[tura - 1].setRazem();
        jTable1.setValueAt(players[tura - 1].getCzworki(), 4, tura);
        jTable1.setValueAt(players[tura - 1].getPremia(), 7, tura);
        jTable1.setValueAt(players[tura - 1].getSumaG(), 8, tura);
        jTable1.setValueAt(players[tura - 1].getRazem(), 19, tura);
        czystka();
    }//GEN-LAST:event_czworkaActionPerformed

    private void piatkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_piatkaActionPerformed
        players[tura - 1].setPiatki(liczba_5 * 5);
        players[tura - 1].setCzy5(true);
        players[tura - 1].setPremia();
        players[tura - 1].setSumaG();
        players[tura - 1].setRazem();
        jTable1.setValueAt(players[tura - 1].getPiatki(), 5, tura);
        jTable1.setValueAt(players[tura - 1].getPremia(), 7, tura);
        jTable1.setValueAt(players[tura - 1].getSumaG(), 8, tura);
        jTable1.setValueAt(players[tura - 1].getRazem(), 19, tura);
        czystka();
    }//GEN-LAST:event_piatkaActionPerformed

    private void szostkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_szostkaActionPerformed
        players[tura - 1].setSzostki(liczba_6 * 6);
        players[tura - 1].setCzy6(true);
        players[tura - 1].setPremia();
        players[tura - 1].setSumaG();
        players[tura - 1].setRazem();
        jTable1.setValueAt(players[tura - 1].getSzostki(), 6, tura);
        jTable1.setValueAt(players[tura - 1].getPremia(), 7, tura);
        jTable1.setValueAt(players[tura - 1].getSumaG(), 8, tura);
        jTable1.setValueAt(players[tura - 1].getRazem(), 19, tura);
        czystka();
    }//GEN-LAST:event_szostkaActionPerformed

    private void x3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x3ActionPerformed
        if (liczba_1 >= 3 || liczba_2 >= 3 || liczba_3 >= 3 || liczba_4 >= 3 || liczba_5 >= 3 || liczba_6 >= 3) {
            players[tura - 1].setTrzy_te_same(kostka1 + kostka2 + kostka3 + kostka4 + kostka5);
        } else {
            players[tura - 1].setTrzy_te_same(0);
        }
        players[tura - 1].setCzy3x(true);
        players[tura - 1].setSumaD();
        players[tura - 1].setRazem();
        jTable1.setValueAt(players[tura - 1].getTrzy_te_same(), 9, tura);
        jTable1.setValueAt(players[tura - 1].getSumaD(), 18, tura);
        jTable1.setValueAt(players[tura - 1].getRazem(), 19, tura);
        czystka();
    }//GEN-LAST:event_x3ActionPerformed

    private void x4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x4ActionPerformed
        if (liczba_1 >= 4 || liczba_2 >= 4 || liczba_3 >= 4 || liczba_4 >= 4 || liczba_5 >= 4 || liczba_6 >= 4) {
            players[tura - 1].setCztery_te_same(kostka1 + kostka2 + kostka3 + kostka4 + kostka5);
        } else {
            players[tura - 1].setCztery_te_same(0);
        }
        players[tura - 1].setCzy4x(true);
        players[tura - 1].setSumaD();
        players[tura - 1].setRazem();
        jTable1.setValueAt(players[tura - 1].getCztery_te_same(), 10, tura);
        jTable1.setValueAt(players[tura - 1].getSumaD(), 18, tura);
        jTable1.setValueAt(players[tura - 1].getRazem(), 19, tura);
        czystka();
    }//GEN-LAST:event_x4ActionPerformed

    private void pk4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pk4ActionPerformed
        if (liczba_6 >= 1 && liczba_5 >= 1 && liczba_3 >= 1 && liczba_4 >= 1) {
            players[tura - 1].setCztery_po_kolei(18 + 30);
        } else {
            if (liczba_5 >= 1 && liczba_2 >= 1 && liczba_3 >= 1 && liczba_4 >= 1) {
                players[tura - 1].setCztery_po_kolei(14 + 30);
            } else {
                if (liczba_1 >= 1 && liczba_2 >= 1 && liczba_3 >= 1 && liczba_4 >= 1) {
                    players[tura - 1].setCztery_po_kolei(10 + 30);
                } else {
                    players[tura - 1].setCztery_po_kolei(0);
                }
            }
        }
        players[tura - 1].setCzy4p(true);
        players[tura - 1].setSumaD();
        players[tura - 1].setRazem();
        jTable1.setValueAt(players[tura - 1].getCztery_po_kolei(), 11, tura);
        jTable1.setValueAt(players[tura - 1].getSumaD(), 18, tura);
        jTable1.setValueAt(players[tura - 1].getRazem(), 19, tura);
        czystka();
    }//GEN-LAST:event_pk4ActionPerformed

    private void pk5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pk5ActionPerformed
        if (liczba_1 == 1 && liczba_2 == 1 && liczba_3 == 1 && liczba_4 == 1 && liczba_5 == 1) {
            players[tura - 1].setPiec_po_kolei(15 + 40);
        } else {
            if (liczba_6 == 1 && liczba_2 == 1 && liczba_3 == 1 && liczba_4 == 1 && liczba_5 == 1) {
                players[tura - 1].setPiec_po_kolei(20 + 40);
            } else {
                players[tura - 1].setPiec_po_kolei(0);
            }
        }
        players[tura - 1].setCzy5p(true);
        players[tura - 1].setSumaD();
        players[tura - 1].setRazem();
        jTable1.setValueAt(players[tura - 1].getPiec_po_kolei(), 12, tura);
        jTable1.setValueAt(players[tura - 1].getSumaD(), 18, tura);
        jTable1.setValueAt(players[tura - 1].getRazem(), 19, tura);
        czystka();
    }//GEN-LAST:event_pk5ActionPerformed

    private void fullActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullActionPerformed
        if ((liczba_1 == 2 || liczba_2 == 2 || liczba_3 == 2 || liczba_4 == 2 || liczba_5 == 2 || liczba_6 == 2)
                && (liczba_1 == 3 || liczba_2 == 3 || liczba_3 == 3 || liczba_4 == 3 || liczba_5 == 3 || liczba_6 == 3)) {
            players[tura - 1].setFull(kostka1 + kostka2 + kostka3 + kostka4 + kostka5 + 25);
        } else {
            players[tura - 1].setFull(0);
        }
        players[tura - 1].setCzyfull(true);
        players[tura - 1].setSumaD();
        players[tura - 1].setRazem();
        jTable1.setValueAt(players[tura - 1].getFull(), 13, tura);
        jTable1.setValueAt(players[tura - 1].getSumaD(), 18, tura);
        jTable1.setValueAt(players[tura - 1].getRazem(), 19, tura);
        czystka();
    }//GEN-LAST:event_fullActionPerformed

    private void x5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x5ActionPerformed
        if (liczba_1 == 5 || liczba_2 == 5 || liczba_3 == 5 || liczba_4 == 5 || liczba_5 == 5 || liczba_6 == 5) {
            players[tura - 1].setPiec_te_same(kostka1 + kostka2 + kostka3 + kostka4 + kostka5 + 50);
        } else {
            players[tura - 1].setPiec_te_same(0);
        }
        players[tura - 1].setCzy5x(true);
        players[tura - 1].setSumaD();
        players[tura - 1].setRazem();
        jTable1.setValueAt(players[tura - 1].getPiec_te_same(), 14, tura);
        jTable1.setValueAt(players[tura - 1].getSumaD(), 18, tura);
        jTable1.setValueAt(players[tura - 1].getRazem(), 19, tura);
        czystka();
    }//GEN-LAST:event_x5ActionPerformed

    private void p1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1ActionPerformed
        if (liczba_1 >= 2 || liczba_2 >= 2 || liczba_3 >= 2 || liczba_4 >= 2 || liczba_5 >= 2 || liczba_6 >= 2) {
            if (liczba_6 >= 2) {
                players[tura - 1].setPara1(12);
            } else {
                if (liczba_5 >= 2) {
                    players[tura - 1].setPara1(10);
                } else {
                    if (liczba_4 >= 2) {
                        players[tura - 1].setPara1(8);
                    } else {
                        if (liczba_3 >=2) {
                            players[tura - 1].setPara1(6);
                        } else {
                            if (liczba_2 >= 2) {
                                players[tura - 1].setPara1(4);
                            } else {
                                if (liczba_1 >= 2) {
                                    players[tura - 1].setPara1(2);
                                }
                            }
                        }
                    }
                }
            }
        } else {
            players[tura - 1].setPara1(0);
        }
        players[tura - 1].setCzypara(true);
        players[tura - 1].setSumaD();
        players[tura - 1].setRazem();
        jTable1.setValueAt(players[tura - 1].getPara1(), 15, tura);
        jTable1.setValueAt(players[tura - 1].getSumaD(), 18, tura);
        jTable1.setValueAt(players[tura - 1].getRazem(), 19, tura);
        czystka();
    }//GEN-LAST:event_p1ActionPerformed

    private void p2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2ActionPerformed
        int parki = 0;
        int[] parara = new int[2];
        if (liczba_6 >= 2) {
            parki = parki + 1;
            parara[0] = 6;
        }
        if (liczba_5 >= 2) {
            parki = parki + 1;
            if (parki == 2) {
                parara[1] = 5;
            } else {
                parara[0] = 5;
            }
        }
        if (liczba_4 >= 2) {
            parki = parki + 1;
            if (parki == 2) {
                parara[1] = 4;
            } else {
                parara[0] = 4;
            }
        }
        if (liczba_3 >= 2) {
            parki = parki + 1;
            if (parki == 2) {
                parara[1] = 3;
            } else {
                parara[0] = 3;
            }
        }
        if (liczba_2 >= 2) {
            parki = parki + 1;
            if (parki == 2) {
                parara[1] = 2;
            } else {
                parara[0] = 2;
            }
        }
        if (liczba_1 >= 2) {
            parki = parki + 1;
            if (parki == 2) {
                parara[1] = 1;
            } else {
                parara[0] = 1;
            }
        }
        if (parki == 2) {
            players[tura - 1].setPara2(parara[0] * 2 + parara[1] * 2);
        } else {
            players[tura - 1].setPara2(0);
        }
        players[tura - 1].setCzy2pary(true);
        players[tura - 1].setSumaD();
        players[tura - 1].setRazem();
        jTable1.setValueAt(players[tura - 1].getPara2(), 16, tura);
        jTable1.setValueAt(players[tura - 1].getSumaD(), 18, tura);
        jTable1.setValueAt(players[tura - 1].getRazem(), 19, tura);
        parki = 0;
        czystka();
    }//GEN-LAST:event_p2ActionPerformed

    private void szansaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_szansaActionPerformed
        players[tura - 1].setSzansa(kostka1 + kostka2 + kostka3 + kostka4 + kostka5);
        players[tura - 1].setCzyszansa(true);
        players[tura - 1].setSumaD();
        players[tura - 1].setRazem();
        jTable1.setValueAt(players[tura - 1].getSzansa(), 17, tura);
        jTable1.setValueAt(players[tura - 1].getSumaD(), 18, tura);
        jTable1.setValueAt(players[tura - 1].getRazem(), 19, tura);
        czystka();
    }//GEN-LAST:event_szansaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kosci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new kosci().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton czworka;
    private javax.swing.JButton dwojka;
    private javax.swing.JButton full;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jedynka;
    private javax.swing.JButton kosc1;
    private javax.swing.JButton kosc2;
    private javax.swing.JButton kosc3;
    private javax.swing.JButton kosc4;
    private javax.swing.JButton kosc5;
    private javax.swing.JButton p1;
    private javax.swing.JButton p2;
    private javax.swing.JButton piatka;
    private javax.swing.JButton pk4;
    private javax.swing.JButton pk5;
    private javax.swing.JButton rzucaj;
    private javax.swing.JButton szansa;
    private javax.swing.JButton szostka;
    private javax.swing.JButton trojka;
    private javax.swing.JButton x3;
    private javax.swing.JButton x4;
    private javax.swing.JButton x5;
    // End of variables declaration//GEN-END:variables
}
