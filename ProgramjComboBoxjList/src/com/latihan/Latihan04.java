
package com.latihan;

import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Latihan04 extends javax.swing.JFrame {

    public Latihan04() {
        initComponents();
        icon();
    }
    
    String nama, asal;
    int pilihan;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        showTA = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        namaTF = new javax.swing.JTextField();
        showBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listLst = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Latihan 4 jList");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        showTA.setColumns(20);
        showTA.setRows(5);
        jScrollPane1.setViewportView(showTA);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("jList dengan method getSelectedIndex()");

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
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(31, 31, 31))
        );

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nama");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Asal");

        showBtn.setText("Print");
        showBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showBtnMouseClicked(evt);
            }
        });

        exitBtn.setText("Exit");
        exitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitBtnMouseClicked(evt);
            }
        });

        clearBtn.setText("Clear");
        clearBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearBtnMouseClicked(evt);
            }
        });

        backBtn.setText("Back");
        backBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBtnMouseClicked(evt);
            }
        });

        listLst.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Banda Aceh", "Langsa", "Lhokseumawe", "Meulaboh", "Sabang", "Subulussalam", "Denpasar", "Pangkalpinang", "Cilegon", "Serang", "Tangerang Selatan", "Tangerang", "Bengkulu", "Gorontalo", "Kota Administrasi Jakarta Barat", "Kota Administrasi Jakarta Pusat", "Kota Administrasi Jakarta Selatan", "Kota Administrasi Jakarta Timur", "Kota Administrasi Jakarta Utara", "Sungai Penuh", "Jambi", "Bandung", "Bekasi", "Bogor", "Cimahi", "Cirebon", "Depok", "Cianjur", "Sukabumi", "Tasikmalaya", "Banjar", "Magelang", "Pekalongan", "Purwokerto", "Salatiga", "Semarang", "Surakarta", "Tegal", "Batu", "Blitar", "Kediri", "Madiun", "Malang", "Mojokerto", "Pasuruan", "Probolinggo", "Surabaya", "Pontianak", "Singkawang", "Banjarbaru", "Banjarmasin", "Palangkaraya", "Balikpapan", "Bontang", "Samarinda", "Tarakan", "Batam", "Tanjungpinang", "Bandar Lampung", "Metro", "Ternate", "Tidore Kepulauan", "Ambon", "Tual", "Bima", "Mataram", "Kupang", "Sorong", "Jayapura", "Dumai", "Pekanbaru", "Makassar", "Palopo", "Parepare", "Palu", "Bau-Bau", "Kendari", "Bitung", "Kotamobagu", "Manado", "Tomohon", "Bukittinggi", "Padang", "Padangpanjang", "Pariaman", "Payakumbuh", "Sawahlunto", "Solok", "Lubuklinggau", "Pagaralam", "Jakarta", "Palembang", "Binjai", "Medan", "Padang Sidempuan", "Pematangsiantar", "Sibolga", "Tanjungbalai", "Tebingtinggi", "Yogyakarta" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listLst);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(clearBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(backBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(exitBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(showBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(namaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(191, 191, 191))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(showBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(backBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exitBtn))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 677, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(685, 513));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void clearBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearBtnMouseClicked
        int jawab = JOptionPane.showOptionDialog(this,
            "Ingin Muat Ulang Inputan?",
            "Ulang",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE, null, null, null );
        if (jawab == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(this, "Input Data Akan Dimuat Ulang");
            namaTF.setText("");
            showTA.setText("");
        }
    }//GEN-LAST:event_clearBtnMouseClicked

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

    private void showBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showBtnMouseClicked
        nama = namaTF.getText();
        
        pilihan = listLst.getSelectedIndex();
        switch(pilihan){
            case 0:
                asal = "Banda Aceh";
                break;
            case 1:
                asal = "Langsa";
                break;    
            case 2:
                asal = "Lhokseumawe";
                break;
            case 3:
                asal = "Meulaboh";
                break;
            case 4:
                asal = "Sabang";
                break;
            case 5:
                asal = "Subulussalam";
                break;
            case 6:
                asal = "Jakarta";
                break;
            case 7:
                asal = "Denpasar";
                break;
            case 8:
                asal = "Pangkalpinang";
                break;
            case 9:
                asal = "Cilegon";
                break;
            case 10:
                asal = "Serang";
                break;
            case 11:
                asal = "Tangerang Selatan";
                break;
            case 12:
                asal = "Tangerang";
                break;
            case 13:
                asal = "Bengkulu";
                break;    
            case 14:
                asal = "Gorontalo";
                break; 
            case 15:
                asal = "Kota Administrasi Jakarta Barat";
                break;
            case 16:
                asal = "Kota Administrasi Jakarta Pusat";
                break;
            case 17:
                asal = "Kota Administrasi Jakarta Selatan";
                break;
            case 18:
                asal = "Kota Administrasi Jakarta Timur";
                break;
            case 19:
                asal = "Kota Administrasi Jakarta Utara";
                break;
            case 20:
                asal = "Sungai Penuh";
                break;
            case 21:
                asal = "Jambi";
                break;
            case 22:
                asal = "Bandung";
                break;    
            case 23:
                asal = "Bekasi";
                break;
            case 24:
                asal = "Bogor";
                break;
            case 25:
                asal = "Cimahi";
                break;
            case 26:
                asal = "Cirebon";
                break;
            case 27:
                asal = "Depok";
                break;
            case 28:
                asal = "Cianjur";
                break;
            case 29:
                asal = "Sukabumi";
                break;
            case 30:    
                asal = "Tasikmalaya";
                break;
            case 31:    
                asal = "Banjar";
                break;    
            case 32:    
                asal = "Magelang";
                break;
            case 33:    
                asal = "Pekalongan";
                break;    
            case 34:    
                asal = "Purwokerto";
                break;
            case 35:    
                asal = "Salatiga";
                break;    
            case 36:    
                asal = "Semarang";
                break;
            case 37:    
                asal = "Surakarta";
                break;    
            case 38:    
                asal = "Tegal";
                break;
            case 39:    
                asal = "Batu";
                break;    
            case 40:    
                asal = "Blitar";
                break;
            case 41:    
                asal = "Kediri";
                break;    
            case 42:    
                asal = "Madiun";
                break;
            case 43:    
                asal = "Malang";
                break; 
            case 44:    
                asal = "Mojokerto";
                break;
            case 45:    
                asal = "Pasuruan";
                break;    
            case 46:    
                asal = "Probolinggo";
                break;
            case 47:    
                asal = "Surabaya";
                break;    
            case 48:    
                asal = "Pontianak";
                break;
            case 49:    
                asal = "Singkawang";
                break;    
            case 50:    
                asal = "Banjarbaru";
                break;
            case 51:    
                asal = "Banjarmasin";
                break;    
            case 52:    
                asal = "Palangkaraya";
                break;
            case 53:    
                asal = "Balikpapan";
                break;    
            case 54:    
                asal = "Bontang";
                break;
            case 55:    
                asal = "Samarinda";
                break;    
            case 56:    
                asal = "Tarakan";
                break;
            case 57:    
                asal = "Batam";
                break;    
            case 58:    
                asal = "Tanjungpinang";
                break;
            case 59:    
                asal = "Bandar Lampung";
                break;    
            case 60:    
                asal = "Metro";
                break;
            case 61:    
                asal = "Ternate";
                break;    
            case 62:    
                asal = "Tidore Kepulauan";
                break;
            case 63:    
                asal = "Ambon";
                break;    
            case 64:    
                asal = "Tual";
                break;
            case 65:    
                asal = "Bima";
                break;    
            case 66:    
                asal = "Mataram";
                break;
            case 67:    
                asal = "Kupang";
                break;    
            case 68:    
                asal = "Sorong";
                break;
            case 69:    
                asal = "Jayapura";
                break;    
            case 70:    
                asal = "Dumai";
                break;
            case 71:    
                asal = "Pekanbaru";
                break;    
            case 72:    
                asal = "Makassar";
                break;
            case 73:    
                asal = "Palopo";
                break;    
            case 74:    
                asal = "Parepare";
                break;
            case 75:    
                asal = "Palu";
                break;    
            case 76:    
                asal = "Bau-Bau";
                break;
            case 77:    
                asal = "Kendari";
                break;    
            case 78:    
                asal = "Bitung";
                break;
            case 79:    
                asal = "Kotamobagu";
                break;   
            case 80:    
                asal = "Manado";
                break;
            case 81:    
                asal = "Tomohon";
                break;    
            case 82:    
                asal = "Bukittinggi";
                break;
            case 83:    
                asal = "Padang";
                break;    
            case 84:    
                asal = "Padangpanjang";
                break;
            case 85:    
                asal = "Pariaman";
                break;    
            case 86:    
                asal = "Payakumbuh";
                break;
            case 87:    
                asal = "Sawahlunto";
                break;    
            case 88:    
                asal = "Solok";
                break;
            case 89:    
                asal = "Lubuklinggau";
                break;    
            case 90:    
                asal = "Pagaralam";
                break;
            case 91:    
                asal = "Palembang";
                break;    
            case 92:    
                asal = "Binjai";
                break;
            case 93:    
                asal = "Medan";
                break;    
            case 94:    
                asal = "Padang Sidempuan";
                break;
            case 95:    
                asal = "Pematangsiantar";
                break;    
            case 96:    
                asal = "Sibolga";
                break;
            case 97:    
                asal = "Tanjungbalai";
                break;    
            case 98:    
                asal = "Tebingtinggi";
                break;
            case 99:    
                asal = "Yogyakarta";
                break;
        }
       
        showTA.setText(String.format("Nama\t:\t%s\nAsal\t:\t%s",nama,asal));
    }//GEN-LAST:event_showBtnMouseClicked

    private void backBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseClicked
        int jawab = JOptionPane.showOptionDialog(this,
            "Anda yakin Ingin Kembali?",
            "Back",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE, null, null, null );
        if (jawab == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "Aplikai akan kembali", "Kembali", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
            new main().setVisible(true);
        }
    }//GEN-LAST:event_backBtnMouseClicked

    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Latihan04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Latihan04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Latihan04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Latihan04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Latihan04().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listLst;
    private javax.swing.JTextField namaTF;
    private javax.swing.JButton showBtn;
    private javax.swing.JTextArea showTA;
    // End of variables declaration//GEN-END:variables

    private void icon() {
        ImageIcon icon;
        icon = new ImageIcon("src/com/icon/icon.png");
        setIconImage(icon.getImage());
    }
}
