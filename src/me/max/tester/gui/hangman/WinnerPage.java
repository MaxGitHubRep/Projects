/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.max.tester.gui.hangman;

import me.max.tester.managers.system.SystemExit;

/**
 *
 * @author Max
 */
public class WinnerPage extends javax.swing.JFrame {

    /**
     * Creates new form WinnerPage
     */
    public WinnerPage() {
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

        victoryText = new javax.swing.JLabel();
        exitGame = new javax.swing.JButton();
        previousScores = new javax.swing.JButton();
        playAgain = new javax.swing.JButton();
        hangmanTitlePic = new javax.swing.JLabel();
        submitLetterButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        victoryText.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        victoryText.setForeground(new java.awt.Color(255, 204, 0));
        victoryText.setText("VICTORY!");

        exitGame.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        exitGame.setForeground(new java.awt.Color(255, 0, 0));
        exitGame.setText("Exit Game");
        exitGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitGameActionPerformed(evt);
            }
        });

        previousScores.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        previousScores.setForeground(new java.awt.Color(255, 0, 0));
        previousScores.setText("Previous Scores");
        previousScores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousScoresActionPerformed(evt);
            }
        });

        playAgain.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        playAgain.setForeground(new java.awt.Color(255, 0, 0));
        playAgain.setText("Play Again!");
        playAgain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playAgainActionPerformed(evt);
            }
        });

        hangmanTitlePic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/me/max/tester/gui/hangman/resources/titlescreen/hangman.png"))); // NOI18N
        hangmanTitlePic.setText(".");

        submitLetterButton2.setBackground(new java.awt.Color(204, 204, 204));
        submitLetterButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        submitLetterButton2.setForeground(new java.awt.Color(255, 0, 0));
        submitLetterButton2.setText("Main Menu");
        submitLetterButton2.setMaximumSize(new java.awt.Dimension(165, 37));
        submitLetterButton2.setMinimumSize(new java.awt.Dimension(165, 37));
        submitLetterButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitLetterButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(299, 299, 299)
                .addComponent(victoryText)
                .addContainerGap(334, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(exitGame, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(previousScores, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playAgain, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitLetterButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(hangmanTitlePic, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(victoryText)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(hangmanTitlePic)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(playAgain, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(submitLetterButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(previousScores, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(exitGame, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitGameActionPerformed
        SystemExit n = new SystemExit();
        this.dispose();
        n.exitProgram();
    }//GEN-LAST:event_exitGameActionPerformed

    private void previousScoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousScoresActionPerformed
        new PreviousScores().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_previousScoresActionPerformed

    private void playAgainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playAgainActionPerformed
        new PlayGame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_playAgainActionPerformed

    private void submitLetterButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitLetterButton2ActionPerformed
        new FirstMenu().setVisible(true);
        FirstMenu fm = new FirstMenu();
        fm.setDifficulty();
        this.dispose();
    }//GEN-LAST:event_submitLetterButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(WinnerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinnerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinnerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinnerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WinnerPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitGame;
    private javax.swing.JLabel hangmanTitlePic;
    private javax.swing.JButton playAgain;
    private javax.swing.JButton previousScores;
    private javax.swing.JButton submitLetterButton2;
    private javax.swing.JLabel victoryText;
    // End of variables declaration//GEN-END:variables
}
