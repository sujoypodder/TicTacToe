
import java.awt.Color;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jahid Haider
 */
public class Game extends javax.swing.JFrame {

    //Game m=new Game();
    String first = "x";
    String player1;
    String player2;

    public Game() {
        initComponents();
        setSize(500, 500);
    }

    void turn() {
        if (first.equals("x")) {
            first = "o";
        } else {
            first = "x";
        }
    }

    void resetgame() {
        jButton1.setText("");
        jButton1.setEnabled(true);
        jButton2.setText("");
        jButton2.setEnabled(true);
        jButton3.setText("");
        jButton3.setEnabled(true);
        jButton4.setText("");
        jButton4.setEnabled(true);
        jButton10.setText("");
        jButton10.setEnabled(true);
        jButton6.setText("");
        jButton6.setEnabled(true);
        jButton7.setText("");
        jButton7.setEnabled(true);
        jButton8.setText("");
        jButton8.setEnabled(true);
        jButton9.setText("");
        jButton9.setEnabled(true);
    }

    void xwin() {
        JOptionPane.showMessageDialog(this, player1 + " win");
        resetgame();

    }

    void owin() {

        JOptionPane.showMessageDialog(this, player2 + " win");
        resetgame();
    }
    void tie()
    {
        String no1 = jButton1.getText();
        String no2 = jButton2.getText();
        String no3 = jButton3.getText();
        String no4 = jButton4.getText();
        String no5 = jButton10.getText();
        String no6 = jButton6.getText();
        String no7 = jButton7.getText();
        String no8 = jButton8.getText();
        String no9 = jButton9.getText();

        if (no1 != "" && no2 != "" && no3 != "" && no4 !="" && no5 !="" && no6 != "" && no7 !=  "" && no8 !=  "" && no9 != "" ) {
        JOptionPane.showMessageDialog(this,"match draw");
        resetgame();
        }
    }

    void condition() {
        String no1 = jButton1.getText();
        String no2 = jButton2.getText();
        String no3 = jButton3.getText();
        String no4 = jButton4.getText();
        String no5 = jButton10.getText();
        String no6 = jButton6.getText();
        String no7 = jButton7.getText();
        String no8 = jButton8.getText();
        String no9 = jButton9.getText();

        if (no1 == "x" && no2 == "x" && no3 == "x") {
            xwin();

        }
        if (no4 == "x" && no5 == "x" && no6 == "x") {
            xwin();

        }
        if (no7 == "x" && no8 == "x" && no9 == "x") {
            xwin();
        }
        if (no1 == "x" && no4 == "x" && no7 == "x") {
            xwin();
        }
        if (no2 == "x" && no5 == "x" && no8 == "x") {
            xwin();
        }
        if (no3 == "x" && no6 == "x" && no9 == "x") {
            xwin();
        }
        if (no1 == "x" && no5 == "x" && no9 == "x") {
            xwin();
        }
        if (no3 == "x" && no5 == "x" && no7 == "x") {
            xwin();
        }
        //for o

        if (no1 == "o" && no2 == "o" && no3 == "o") {
            owin();
        }
        if (no4 == "o" && no5 == "o" && no6 == "o") {
            owin();
        }
        if (no7 == "o" && no8 == "o" && no9 == "o") {
            owin();
        }
        if (no1 == "o" && no4 == "o" && no7 == "o") {
            owin();
        }
        if (no2 == "o" && no5 == "o" && no8 == "o") {
            owin();
        }
        if (no3 == "o" && no6 == "o" && no9 == "o") {
            owin();
        }
        if (no1 == "o" && no5 == "o" && no9 == "o") {
            owin();
        }
        if (no3 == "o" && no5 == "o" && no7 == "o") {
            owin();
        }
     
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel12 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("tic tac toe");
        setMinimumSize(new java.awt.Dimension(400, 400));

        jPanel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel12.setForeground(new java.awt.Color(153, 153, 153));
        jPanel12.setLayout(new java.awt.BorderLayout());
        jPanel12.add(jLabel1, java.awt.BorderLayout.PAGE_END);

        jPanel1.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new java.awt.GridLayout(3, 3, 1, 1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 3));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 100)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 3));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jButton2.setFont(new java.awt.Font("Tahoma", 3, 100)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 3));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jButton3.setFont(new java.awt.Font("Tahoma", 3, 100)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 3));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jButton4.setFont(new java.awt.Font("Tahoma", 3, 100)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton4, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 3));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jButton10.setFont(new java.awt.Font("Tahoma", 3, 100)); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton10, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 3));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jButton6.setFont(new java.awt.Font("Tahoma", 3, 100)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton6, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 3));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jButton7.setFont(new java.awt.Font("Tahoma", 3, 100)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton7, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 3));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jButton8.setFont(new java.awt.Font("Tahoma", 3, 100)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton8, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 3));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jButton9.setFont(new java.awt.Font("Tahoma", 3, 100)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton9, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel10);

        jPanel12.add(jPanel1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel12, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jButton1.setEnabled(false);
        jButton1.setText(first);
        if (first.equals("x")) {
            jButton1.setForeground(Color.GREEN);
        } else {
            jButton1.setForeground(Color.BLACK);
        }
        turn();
        condition();
        tie();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jButton2.setEnabled(false);
        jButton2.setText(first);

        if (first.equals("x")) {
            jButton2.setForeground(Color.GREEN);
        } else {
            jButton2.setForeground(Color.BLACK);
        }
        turn();
        condition();
        tie();


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        jButton3.setEnabled(false);
        jButton3.setText(first);

        if (first.equals("x")) {
            jButton3.setForeground(Color.GREEN);
        } else {
            jButton3.setForeground(Color.BLACK);
        }
        turn();
        condition();
        tie();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        jButton4.setEnabled(false);
        jButton4.setText(first);

        if (first.equals("x")) {
            jButton4.setForeground(Color.GREEN);
        } else {
            jButton4.setForeground(Color.BLACK);
        }
        turn();
        condition();
        tie();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

        jButton10.setEnabled(false);
        jButton10.setText(first);
        if (first.equals("x")) {
            jButton10.setForeground(Color.GREEN);
        } else {
            jButton10.setForeground(Color.BLACK);
        }
        turn();
        condition();
        tie();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        jButton6.setEnabled(false);
        jButton6.setText(first);
        if (first.equals("x")) {
            jButton6.setForeground(Color.GREEN);
        } else {
            jButton6.setForeground(Color.BLACK);
        }
        turn();
        condition();
        tie();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        jButton7.setEnabled(false);
        jButton7.setText(first);

        if (first.equals("x")) {
            jButton7.setForeground(Color.GREEN);
        } else {
            jButton7.setForeground(Color.BLACK);
        }
        turn();
        condition();
        tie();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        jButton8.setEnabled(false);
        jButton8.setText(first);

        if (first.equals("x")) {
            jButton8.setForeground(Color.GREEN);
        } else {
            jButton8.setForeground(Color.BLACK);
        }
        turn();
        condition();
        tie();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

        jButton9.setEnabled(false);
        jButton9.setText(first);

        if (first.equals("x")) {
            jButton9.setForeground(Color.GREEN);
        } else {
            jButton9.setForeground(Color.BLACK);
        }
        turn();
        condition();
        tie();
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the /**
         * Creates new form Game
         */form  */
                 java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new Game().setVisible(true);
                    }
                });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
