/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.awt.Color;

/**
 *
 * @author flavi
 */
public class Jogodois extends javax.swing.JFrame {
    int erros;
    /**
     * Creates new form Jogodois
     */
    public Jogodois() {
        initComponents();
        erros = 0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        panelImage2 = new org.edisoncor.gui.panel.PanelImage();
        txti = new javax.swing.JFormattedTextField();
        txta = new javax.swing.JFormattedTextField();
        txtb = new javax.swing.JFormattedTextField();
        txtc = new javax.swing.JFormattedTextField();
        txtd = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        panelImage3 = new org.edisoncor.gui.panel.PanelImage();
        jButton1 = new javax.swing.JButton();
        txte = new javax.swing.JFormattedTextField();
        txtf = new javax.swing.JFormattedTextField();
        txtg = new javax.swing.JFormattedTextField();
        txth = new javax.swing.JFormattedTextField();
        vd1 = new org.edisoncor.gui.panel.PanelImage();
        vd2 = new org.edisoncor.gui.panel.PanelImage();
        vd3 = new org.edisoncor.gui.panel.PanelImage();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/backjogo.jpg"))); // NOI18N
        panelImage1.setLayout(null);

        panelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/enrolados.jpg"))); // NOI18N

        javax.swing.GroupLayout panelImage2Layout = new javax.swing.GroupLayout(panelImage2);
        panelImage2.setLayout(panelImage2Layout);
        panelImage2Layout.setHorizontalGroup(
            panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );
        panelImage2Layout.setVerticalGroup(
            panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );

        panelImage1.add(panelImage2);
        panelImage2.setBounds(140, 130, 460, 250);

        try {
            txti.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txti.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtiKeyReleased(evt);
            }
        });
        panelImage1.add(txti);
        txti.setBounds(630, 410, 60, 40);

        try {
            txta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtaKeyReleased(evt);
            }
        });
        panelImage1.add(txta);
        txta.setBounds(70, 410, 60, 40);

        try {
            txtb.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbKeyReleased(evt);
            }
        });
        panelImage1.add(txtb);
        txtb.setBounds(140, 410, 60, 40);

        try {
            txtc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcKeyReleased(evt);
            }
        });
        panelImage1.add(txtc);
        txtc.setBounds(210, 410, 60, 40);

        try {
            txtd.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtdKeyReleased(evt);
            }
        });
        panelImage1.add(txtd);
        txtd.setBounds(280, 410, 60, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(251, 225, 0));
        jLabel1.setText("Qual o nome do filme?");
        panelImage1.add(jLabel1);
        jLabel1.setBounds(310, 20, 210, 30);

        jPanel1.setBackground(new java.awt.Color(248, 210, 17));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panelImage1.add(jPanel1);
        jPanel1.setBounds(300, 10, 2, 50);

        panelImage3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconfilme.png"))); // NOI18N

        javax.swing.GroupLayout panelImage3Layout = new javax.swing.GroupLayout(panelImage3);
        panelImage3.setLayout(panelImage3Layout);
        panelImage3Layout.setHorizontalGroup(
            panelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        panelImage3Layout.setVerticalGroup(
            panelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panelImage1.add(panelImage3);
        panelImage3.setBounds(240, 10, 50, 50);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/voltar.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelImage1.add(jButton1);
        jButton1.setBounds(10, 0, 60, 60);

        try {
            txte.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txteKeyReleased(evt);
            }
        });
        panelImage1.add(txte);
        txte.setBounds(350, 410, 60, 40);

        try {
            txtf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtfKeyReleased(evt);
            }
        });
        panelImage1.add(txtf);
        txtf.setBounds(420, 410, 60, 40);

        try {
            txtg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtgKeyReleased(evt);
            }
        });
        panelImage1.add(txtg);
        txtg.setBounds(490, 410, 60, 40);

        try {
            txth.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txth.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txthKeyReleased(evt);
            }
        });
        panelImage1.add(txth);
        txth.setBounds(560, 410, 60, 40);

        vd1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/vida.png"))); // NOI18N

        javax.swing.GroupLayout vd1Layout = new javax.swing.GroupLayout(vd1);
        vd1.setLayout(vd1Layout);
        vd1Layout.setHorizontalGroup(
            vd1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        vd1Layout.setVerticalGroup(
            vd1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelImage1.add(vd1);
        vd1.setBounds(600, 10, 40, 40);

        vd2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/vida.png"))); // NOI18N

        javax.swing.GroupLayout vd2Layout = new javax.swing.GroupLayout(vd2);
        vd2.setLayout(vd2Layout);
        vd2Layout.setHorizontalGroup(
            vd2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        vd2Layout.setVerticalGroup(
            vd2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelImage1.add(vd2);
        vd2.setBounds(650, 10, 40, 40);

        vd3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/vida.png"))); // NOI18N

        javax.swing.GroupLayout vd3Layout = new javax.swing.GroupLayout(vd3);
        vd3.setLayout(vd3Layout);
        vd3Layout.setHorizontalGroup(
            vd3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        vd3Layout.setVerticalGroup(
            vd3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelImage1.add(vd3);
        vd3.setBounds(700, 10, 40, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(772, 619));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtiKeyReleased
        if (txti.getText().equals("S")){
            txti.setBackground(Color.green);
            new Jogotres().setVisible(true);
            dispose();
        }else{
            txti.setBackground(Color.red);
            txti.setText(null);
            txti.requestFocus();
            erros +=1;
            if (erros == 1){
            vd1.setVisible(false);
            }
            else if (erros == 2){
            vd1.setVisible(false);
            vd2.setVisible(false);
            }
            else if (erros == 3){
            vd1.setVisible(false);
            vd2.setVisible(false);
            vd3.setVisible(false);
            new Perdeu().setVisible(true);
            dispose();
            }
        }
    }//GEN-LAST:event_txtiKeyReleased

    private void txtaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtaKeyReleased
        // Caracter correto
        if (txta.getText().equals("E")){
            txta.setBackground(Color.green);
            txtb.setVisible(true);
            txtb.requestFocus();
        }else{
            txta.setBackground(Color.red);
            txta.setText(null);
            txta.requestFocus();
            erros +=1;
            if (erros == 1){
            vd1.setVisible(false);
            }
            else if (erros == 2){
            vd1.setVisible(false);
            vd2.setVisible(false);
            }
            else if (erros == 3){
            vd1.setVisible(false);
            vd2.setVisible(false);
            vd3.setVisible(false);
            new Perdeu().setVisible(true);
            dispose();
            }
        }
    }//GEN-LAST:event_txtaKeyReleased

    private void txtbKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbKeyReleased
        if (txtb.getText().equals("N")){
            txtb.setBackground(Color.green);
            txtc.setVisible(true);
            txtc.requestFocus();
        }else{
            txtb.setBackground(Color.red);
            txtb.setText(null);
            txtb.requestFocus();
            erros +=1;
            if (erros == 1){
            vd1.setVisible(false);
            }
            else if (erros == 2){
            vd1.setVisible(false);
            vd2.setVisible(false);
            }
            else if (erros == 3){
            vd1.setVisible(false);
            vd2.setVisible(false);
            vd3.setVisible(false);
            new Perdeu().setVisible(true);
            dispose();
            }
        }
    }//GEN-LAST:event_txtbKeyReleased

    private void txtcKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcKeyReleased
        if (txtc.getText().equals("R")){
            txtc.setBackground(Color.green);
            txtd.setVisible(true);
            txtd.requestFocus();
        }else{
            txtc.setBackground(Color.red);
            txtc.setText(null);
            txtc.requestFocus();
            erros +=1;
            if (erros == 1){
            vd1.setVisible(false);
            }
            else if (erros == 2){
            vd1.setVisible(false);
            vd2.setVisible(false);
            }
            else if (erros == 3){
            vd1.setVisible(false);
            vd2.setVisible(false);
            vd3.setVisible(false);
            new Perdeu().setVisible(true);
            dispose();
            }
        }
    }//GEN-LAST:event_txtcKeyReleased

    private void txtdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdKeyReleased
        if (txtd.getText().equals("O")){
            txtd.setBackground(Color.green);
            txte.setVisible(true);
            txte.requestFocus();
        }else{
            txtd.setBackground(Color.red);
            txtd.setText(null);
            txtd.requestFocus();
            erros +=1;
            if (erros == 1){
            vd1.setVisible(false);
            }
            else if (erros == 2){
            vd1.setVisible(false);
            vd2.setVisible(false);
            }
            else if (erros == 3){
            vd1.setVisible(false);
            vd2.setVisible(false);
            vd3.setVisible(false);
            new Perdeu().setVisible(true);
            dispose();
            }
        }
    }//GEN-LAST:event_txtdKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txteKeyReleased
        if (txte.getText().equals("L")){
            txte.setBackground(Color.green);
            txtf.setVisible(true);
            txtf.requestFocus();
        }else{
            txte.setBackground(Color.red);
            txte.setText(null);
            txte.requestFocus();
            erros +=1;
            if (erros == 1){
            vd1.setVisible(false);
            }
            else if (erros == 2){
            vd1.setVisible(false);
            vd2.setVisible(false);
            }
            else if (erros == 3){
            vd1.setVisible(false);
            vd2.setVisible(false);
            vd3.setVisible(false);
            new Perdeu().setVisible(true);
            dispose();
            }
        }
    }//GEN-LAST:event_txteKeyReleased

    private void txtfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfKeyReleased
        if (txtf.getText().equals("A")){
            txtf.setBackground(Color.green);
            txtg.setVisible(true);
            txtg.requestFocus();
        }else{
            txtf.setBackground(Color.red);
            txtf.setText(null);
            txtf.requestFocus();
            erros +=1;
            if (erros == 1){
            vd1.setVisible(false);
            }
            else if (erros == 2){
            vd1.setVisible(false);
            vd2.setVisible(false);
            }
            else if (erros == 3){
            vd1.setVisible(false);
            vd2.setVisible(false);
            vd3.setVisible(false);
            new Perdeu().setVisible(true);
            dispose();
            }
        }
    }//GEN-LAST:event_txtfKeyReleased

    private void txtgKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtgKeyReleased
        if (txtg.getText().equals("D")){
            txtg.setBackground(Color.green);
            txth.setVisible(true);
            txth.requestFocus();
        }else{
            txtg.setBackground(Color.red);
            txtg.setText(null);
            txtg.requestFocus();
            erros +=1;
            if (erros == 1){
            vd1.setVisible(false);
            }
            else if (erros == 2){
            vd1.setVisible(false);
            vd2.setVisible(false);
            }
            else if (erros == 3){
            vd1.setVisible(false);
            vd2.setVisible(false);
            vd3.setVisible(false);
            new Perdeu().setVisible(true);
            dispose();
            }
        }
    }//GEN-LAST:event_txtgKeyReleased

    private void txthKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txthKeyReleased
        if (txth.getText().equals("O")){
            txth.setBackground(Color.green);
            txti.setVisible(true);
            txti.requestFocus();
        }else{
            txth.setBackground(Color.red);
            txth.setText(null);
            txth.requestFocus();
            erros +=1;
            if (erros == 1){
            vd1.setVisible(false);
            }
            else if (erros == 2){
            vd1.setVisible(false);
            vd2.setVisible(false);
            }
            else if (erros == 3){
            vd1.setVisible(false);
            vd2.setVisible(false);
            vd3.setVisible(false);
            new Perdeu().setVisible(true);
            dispose();
            }
        }
    }//GEN-LAST:event_txthKeyReleased

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        txtb.setVisible(false);
        txtc.setVisible(false);
        txtd.setVisible(false);
        txte.setVisible(false);
        txtf.setVisible(false);
        txtg.setVisible(false);
        txth.setVisible(false);
        txti.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Jogodois.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jogodois.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jogodois.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jogodois.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jogodois().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private org.edisoncor.gui.panel.PanelImage panelImage2;
    private org.edisoncor.gui.panel.PanelImage panelImage3;
    private javax.swing.JFormattedTextField txta;
    private javax.swing.JFormattedTextField txtb;
    private javax.swing.JFormattedTextField txtc;
    private javax.swing.JFormattedTextField txtd;
    private javax.swing.JFormattedTextField txte;
    private javax.swing.JFormattedTextField txtf;
    private javax.swing.JFormattedTextField txtg;
    private javax.swing.JFormattedTextField txth;
    private javax.swing.JFormattedTextField txti;
    private org.edisoncor.gui.panel.PanelImage vd1;
    private org.edisoncor.gui.panel.PanelImage vd2;
    private org.edisoncor.gui.panel.PanelImage vd3;
    // End of variables declaration//GEN-END:variables
}
