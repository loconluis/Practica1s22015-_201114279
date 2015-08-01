package mariomakerv01;

import java.awt.Color;
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luis Locon
 */
public class jfrmprincipal extends javax.swing.JFrame {

    public JButton[][] matriz; 
    
    public jfrmprincipal(int n) {
        super();
        initComponents();
        matriz = new JButton[n][n];
        int posicionx=0;
        int posiciony=0;

        for(int i=0;i<n;i++){
            for(int j=0; j<n;j++){
                matriz[i][j]=new JButton();
                matriz[i][j].setBounds(posicionx,posiciony,49,49);
                posicionx=posicionx+50;
                matriz[i][j].setBackground(Color.WHITE);
                jsworld.add(matriz[i][j]);

            }
            posicionx=0;
            posiciony=posiciony+50;
            jsworld.repaint();
        }
        jsworld.setLayout(null);
        jsworld.repaint();
        jsworld.setBounds(50, 50, 800, 800);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanel_listaObject = new javax.swing.JPanel();
        jlabel_banner = new javax.swing.JLabel();
        jscroll_listObjects = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jsworld = new javax.swing.JScrollPane();
        jmenu_principal = new javax.swing.JMenuBar();
        jmenu_carga = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jmenu_about = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mario Maker v1 :::::::::: ");

        jpanel_listaObject.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpanel_listaObject.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jlabel_banner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo_v2.jpg"))); // NOI18N

        javax.swing.GroupLayout jpanel_listaObjectLayout = new javax.swing.GroupLayout(jpanel_listaObject);
        jpanel_listaObject.setLayout(jpanel_listaObjectLayout);
        jpanel_listaObjectLayout.setHorizontalGroup(
            jpanel_listaObjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_listaObjectLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlabel_banner)
                .addGap(18, 18, 18)
                .addComponent(jscroll_listObjects, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jpanel_listaObjectLayout.setVerticalGroup(
            jpanel_listaObjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_listaObjectLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanel_listaObjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlabel_banner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jscroll_listObjects))
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jsworld)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(jsworld, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jmenu_carga.setText("Cargas");

        jMenuItem1.setText("Carga de Objetos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jmenu_carga.add(jMenuItem1);

        jMenuItem2.setText("Eliminacion de Objetos");
        jmenu_carga.add(jMenuItem2);

        jmenu_principal.add(jmenu_carga);

        jMenu1.setText("Graficar");
        jmenu_principal.add(jMenu1);

        jmenu_about.setText("Acerca de");

        jMenuItem3.setText("Autor");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jmenu_about.add(jMenuItem3);

        jMenuItem4.setText("Manual de Usuario");
        jmenu_about.add(jMenuItem4);

        jmenu_principal.add(jmenu_about);

        setJMenuBar(jmenu_principal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpanel_listaObject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpanel_listaObject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        jfrmobjetosimg vobj;
        vobj = new jfrmobjetosimg();
        
        vobj.setVisible(true);
        
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        javax.swing.JOptionPane.showMessageDialog(null, "Luis Alfredo Locon Peña\n 2011-14279\nPractica 1 Compi 1 \nSeccion: B ");
    }//GEN-LAST:event_jMenuItem3ActionPerformed

/**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(jfrmprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(jfrmprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(jfrmprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(jfrmprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new jfrmprincipal().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlabel_banner;
    private javax.swing.JMenu jmenu_about;
    private javax.swing.JMenu jmenu_carga;
    private javax.swing.JMenuBar jmenu_principal;
    private javax.swing.JPanel jpanel_listaObject;
    private javax.swing.JScrollPane jscroll_listObjects;
    private javax.swing.JScrollPane jsworld;
    // End of variables declaration//GEN-END:variables

    
    
//    public void matriz(int n){
//        
//        matriz = new JButton[n][n];
//        int posicionx=0;
//        int posiciony=0;
//
//        for(int i=0;i<n;i++){
//            for(int j=0; j<n;j++){
//                matriz[i][j]=new JButton();
//                matriz[i][j].setBounds(posicionx,posiciony,49,49);
//                posicionx=posicionx+50;
//                matriz[i][j].setBackground(Color.WHITE);
//                jsworld.add(matriz[i][j]);
//
//            }
//            posicionx=0;
//            posiciony=posiciony+50;
//            jsworld.repaint();
//        }
//        jsworld.setLayout(null);
//        jsworld.repaint();
//        jsworld.setBounds(50, 50, 800, 800);
//    }
}
