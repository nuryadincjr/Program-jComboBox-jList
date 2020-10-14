
package com.latihan;

import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class main extends javax.swing.JFrame {

    public main() {
        initComponents();
        icon();
    }
    
    String nama, pekerjaan;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        latihan1L = new javax.swing.JLabel();
        latihan2L = new javax.swing.JLabel();
        latihan3L = new javax.swing.JLabel();
        latihan1P = new javax.swing.JPanel();
        latihan3P = new javax.swing.JPanel();
        latihan2P = new javax.swing.JPanel();
        exitBtn = new javax.swing.JButton();
        latihan4L = new javax.swing.JLabel();
        latihan4P = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Menu Latihan");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addGap(31, 31, 31))
        );

        latihan1L.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        latihan1L.setForeground(new java.awt.Color(255, 255, 255));
        latihan1L.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        latihan1L.setText("Latihan 1: jComboBox menggunakan method getSelectedItem()");
        latihan1L.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                latihan1LMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                latihan1LMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                latihan1LMouseEntered(evt);
            }
        });

        latihan2L.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        latihan2L.setForeground(new java.awt.Color(255, 255, 255));
        latihan2L.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        latihan2L.setText("Latihan 2: jComboBox menggunakan method getSelectedIndex()");
        latihan2L.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                latihan2LMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                latihan2LMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                latihan2LMouseEntered(evt);
            }
        });

        latihan3L.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        latihan3L.setForeground(new java.awt.Color(255, 255, 255));
        latihan3L.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        latihan3L.setText("Latihan 3: jList dengan method getSelectedvalue()");
        latihan3L.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                latihan3LMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                latihan3LMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                latihan3LMouseEntered(evt);
            }
        });

        latihan1P.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout latihan1PLayout = new javax.swing.GroupLayout(latihan1P);
        latihan1P.setLayout(latihan1PLayout);
        latihan1PLayout.setHorizontalGroup(
            latihan1PLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        latihan1PLayout.setVerticalGroup(
            latihan1PLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        latihan3P.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout latihan3PLayout = new javax.swing.GroupLayout(latihan3P);
        latihan3P.setLayout(latihan3PLayout);
        latihan3PLayout.setHorizontalGroup(
            latihan3PLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        latihan3PLayout.setVerticalGroup(
            latihan3PLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        latihan2P.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout latihan2PLayout = new javax.swing.GroupLayout(latihan2P);
        latihan2P.setLayout(latihan2PLayout);
        latihan2PLayout.setHorizontalGroup(
            latihan2PLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        latihan2PLayout.setVerticalGroup(
            latihan2PLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        exitBtn.setText("Exit");
        exitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitBtnMouseClicked(evt);
            }
        });

        latihan4L.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        latihan4L.setForeground(new java.awt.Color(255, 255, 255));
        latihan4L.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        latihan4L.setText("Latihan 4: jList dengan method getSelectedIndex()");
        latihan4L.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                latihan4LMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                latihan4LMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                latihan4LMouseEntered(evt);
            }
        });

        latihan4P.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout latihan4PLayout = new javax.swing.GroupLayout(latihan4P);
        latihan4P.setLayout(latihan4PLayout);
        latihan4PLayout.setHorizontalGroup(
            latihan4PLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        latihan4PLayout.setVerticalGroup(
            latihan4PLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitBtn)
                .addGap(76, 76, 76))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(latihan4P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(latihan4L, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(latihan3P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(latihan2P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(latihan1P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(latihan1L)
                            .addComponent(latihan2L)
                            .addComponent(latihan3L, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 94, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(latihan1L, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(latihan1P, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(latihan2L, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(latihan2P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(latihan3P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(latihan3L, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(latihan4P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(latihan4L, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(exitBtn)
                .addGap(27, 27, 27)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(685, 513));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void latihan1LMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_latihan1LMouseEntered
        setColorImk();
    }//GEN-LAST:event_latihan1LMouseEntered

    private void latihan1LMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_latihan1LMouseExited
        getColorImk();
    }//GEN-LAST:event_latihan1LMouseExited

    private void latihan2LMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_latihan2LMouseEntered
        setColorImk2();
    }//GEN-LAST:event_latihan2LMouseEntered

    private void latihan2LMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_latihan2LMouseExited
        getColorImk2();
    }//GEN-LAST:event_latihan2LMouseExited

    private void latihan3LMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_latihan3LMouseEntered
        setColorImk3();
    }//GEN-LAST:event_latihan3LMouseEntered

    private void latihan3LMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_latihan3LMouseExited
        getColorImk3();
    }//GEN-LAST:event_latihan3LMouseExited

    private void latihan1LMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_latihan1LMouseClicked
        this.dispose ();
        new Latihan01().setVisible(true);
    }//GEN-LAST:event_latihan1LMouseClicked

    private void latihan2LMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_latihan2LMouseClicked
        this.dispose ();
        new Latihan02().setVisible(true);
    }//GEN-LAST:event_latihan2LMouseClicked

    private void latihan3LMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_latihan3LMouseClicked
        this.dispose ();
        new Latihan03().setVisible(true);
    }//GEN-LAST:event_latihan3LMouseClicked

    private void exitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseClicked
        int jawab = JOptionPane.showOptionDialog(this,
            "Anda yakin Ingin Keluar?",
            "Exit",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE, null, null, null );
        if (jawab == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "Aplikasi akan keluar", "Aplikasi Keluar", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        }
    }//GEN-LAST:event_exitBtnMouseClicked

    private void latihan4LMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_latihan4LMouseClicked
        this.dispose ();
        new Latihan04().setVisible(true);
    }//GEN-LAST:event_latihan4LMouseClicked

    private void latihan4LMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_latihan4LMouseExited
        getColorImk4();
    }//GEN-LAST:event_latihan4LMouseExited

    private void latihan4LMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_latihan4LMouseEntered
        setColorImk4();
    }//GEN-LAST:event_latihan4LMouseEntered

    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel latihan1L;
    private javax.swing.JPanel latihan1P;
    private javax.swing.JLabel latihan2L;
    private javax.swing.JPanel latihan2P;
    private javax.swing.JLabel latihan3L;
    private javax.swing.JPanel latihan3P;
    private javax.swing.JLabel latihan4L;
    private javax.swing.JPanel latihan4P;
    // End of variables declaration//GEN-END:variables
    
    // Action Warna
    private void getColorImk(){
        latihan1L.setForeground(java.awt.Color.white);
        latihan1P.setBackground(java.awt.Color.white);
    }
    
    private void setColorImk(){
        latihan1L.setForeground(java.awt.Color.gray);
        latihan1P.setBackground(java.awt.Color.gray);
    }
    
    // Action Warna
    private void getColorImk2(){
        latihan2L.setForeground(java.awt.Color.white);
        latihan2P.setBackground(java.awt.Color.white);
    }
    
    private void setColorImk2(){
        latihan2L.setForeground(java.awt.Color.gray);
        latihan2P.setBackground(java.awt.Color.gray);
    }
    
    // Action Warna
    private void getColorImk3(){
        latihan3L.setForeground(java.awt.Color.white);
        latihan3P.setBackground(java.awt.Color.white);
    }
    
    private void setColorImk3(){
        latihan3L.setForeground(java.awt.Color.gray);
        latihan3P.setBackground(java.awt.Color.gray);
    }
    
    // Action Warna
    private void getColorImk4(){
        latihan4L.setForeground(java.awt.Color.white);
        latihan4P.setBackground(java.awt.Color.white);
    }
    
    private void setColorImk4(){
        latihan4L.setForeground(java.awt.Color.gray);
        latihan4P.setBackground(java.awt.Color.gray);
    }
    
    private void icon() {
        ImageIcon icon;
        icon = new ImageIcon("src/com/icon/icon.png");
        setIconImage(icon.getImage());
    }
}
