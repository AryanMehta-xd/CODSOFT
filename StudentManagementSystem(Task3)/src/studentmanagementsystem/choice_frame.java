package studentmanagementsystem;

/**
 *
 * @author Aryan Mehta
 */
public class choice_frame extends javax.swing.JFrame {

    public choice_frame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bt_addStud = new javax.swing.JButton();
        bt_removeStud = new javax.swing.JButton();
        bt_seachStudent = new javax.swing.JButton();
        bt_disStud = new javax.swing.JButton();
        bt_exit = new javax.swing.JButton();
        bt_updateStud = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setBackground(new java.awt.Color(51, 51, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 255, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Student Management System");
        jLabel1.setOpaque(true);

        bt_addStud.setBackground(new java.awt.Color(51, 51, 255));
        bt_addStud.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt_addStud.setForeground(new java.awt.Color(102, 255, 102));
        bt_addStud.setText("Add Student");
        bt_addStud.setFocusPainted(false);
        bt_addStud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_addStudActionPerformed(evt);
            }
        });

        bt_removeStud.setBackground(new java.awt.Color(51, 51, 255));
        bt_removeStud.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt_removeStud.setForeground(new java.awt.Color(102, 255, 102));
        bt_removeStud.setText("Remove Student");
        bt_removeStud.setFocusPainted(false);
        bt_removeStud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_removeStudActionPerformed(evt);
            }
        });

        bt_seachStudent.setBackground(new java.awt.Color(51, 51, 255));
        bt_seachStudent.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt_seachStudent.setForeground(new java.awt.Color(102, 255, 102));
        bt_seachStudent.setText("Search Student");
        bt_seachStudent.setFocusPainted(false);

        bt_disStud.setBackground(new java.awt.Color(51, 51, 255));
        bt_disStud.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt_disStud.setForeground(new java.awt.Color(102, 255, 102));
        bt_disStud.setText("Display All Students");
        bt_disStud.setFocusPainted(false);
        bt_disStud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_disStudActionPerformed(evt);
            }
        });

        bt_exit.setBackground(new java.awt.Color(51, 51, 255));
        bt_exit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt_exit.setForeground(new java.awt.Color(102, 255, 102));
        bt_exit.setText("Exit Application");
        bt_exit.setFocusPainted(false);
        bt_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_exitActionPerformed(evt);
            }
        });

        bt_updateStud.setBackground(new java.awt.Color(51, 51, 255));
        bt_updateStud.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt_updateStud.setForeground(new java.awt.Color(102, 255, 102));
        bt_updateStud.setText("Update Student");
        bt_updateStud.setFocusPainted(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_addStud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_removeStud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_seachStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_disStud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_updateStud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_addStud)
                .addGap(18, 18, 18)
                .addComponent(bt_removeStud)
                .addGap(18, 18, 18)
                .addComponent(bt_seachStudent)
                .addGap(18, 18, 18)
                .addComponent(bt_disStud)
                .addGap(18, 18, 18)
                .addComponent(bt_updateStud)
                .addGap(18, 18, 18)
                .addComponent(bt_exit)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_exitActionPerformed
        dispose();
    }//GEN-LAST:event_bt_exitActionPerformed

    private void bt_addStudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_addStudActionPerformed
        dispose();
        new addStud_frame().setVisible(true);
    }//GEN-LAST:event_bt_addStudActionPerformed

    private void bt_removeStudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_removeStudActionPerformed
        dispose();
        new removeStud_frame().setVisible(true);
    }//GEN-LAST:event_bt_removeStudActionPerformed

    private void bt_disStudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_disStudActionPerformed
        dispose();
        new displayAll_frame().setVisible(true);
    }//GEN-LAST:event_bt_disStudActionPerformed

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
            java.util.logging.Logger.getLogger(choice_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(choice_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(choice_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(choice_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new choice_frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_addStud;
    private javax.swing.JButton bt_disStud;
    private javax.swing.JButton bt_exit;
    private javax.swing.JButton bt_removeStud;
    private javax.swing.JButton bt_seachStudent;
    private javax.swing.JButton bt_updateStud;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}