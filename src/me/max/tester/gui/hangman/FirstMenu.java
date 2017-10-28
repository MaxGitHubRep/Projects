/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.max.tester.gui.hangman;

import me.max.tester.managers.system.SystemExit;

/**
 *
 * @author mc170171
 */
public class FirstMenu extends javax.swing.JFrame {

    public boolean difficulty; // true = easy, false = hard
    
    /**
     * Creates new form FirstMenu
     */
    public FirstMenu() {
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

        welcomeMessage = new javax.swing.JLabel();
        playNowButton = new javax.swing.JButton();
        difficultyToggle = new javax.swing.JButton();
        exitGameButton = new javax.swing.JButton();
        previousScores = new javax.swing.JButton();
        creditLabel = new javax.swing.JLabel();
        hangmanTitlePic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));

        welcomeMessage.setBackground(new java.awt.Color(153, 153, 153));
        welcomeMessage.setFont(new java.awt.Font("Arial Black", 1, 28)); // NOI18N
        welcomeMessage.setForeground(new java.awt.Color(0, 102, 204));
        welcomeMessage.setText("Welcome to Hangman!");
        welcomeMessage.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                welcomeMessageMouseDragged(evt);
            }
        });

        playNowButton.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        playNowButton.setForeground(new java.awt.Color(255, 0, 51));
        playNowButton.setText("Play Now!");
        playNowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playNowButtonActionPerformed(evt);
            }
        });

        difficultyToggle.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        difficultyToggle.setForeground(new java.awt.Color(255, 0, 51));
        difficultyToggle.setText("Difficulty (Hard)");
        difficultyToggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                difficultyToggleActionPerformed(evt);
            }
        });

        exitGameButton.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        exitGameButton.setForeground(new java.awt.Color(255, 0, 51));
        exitGameButton.setText("Exit Game");
        exitGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitGameButtonActionPerformed(evt);
            }
        });

        previousScores.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        previousScores.setForeground(new java.awt.Color(255, 0, 51));
        previousScores.setText("Previous Scores");
        previousScores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousScoresActionPerformed(evt);
            }
        });

        creditLabel.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        creditLabel.setText("Creation: Max Carter   -   Source: GitHub");

        hangmanTitlePic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/me/max/tester/gui/hangman/resources/titlescreen/hangman.png"))); // NOI18N
        hangmanTitlePic.setText(".");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(playNowButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(difficultyToggle, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                        .addComponent(previousScores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitGameButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(creditLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(hangmanTitlePic, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 146, Short.MAX_VALUE)
                .addComponent(welcomeMessage)
                .addGap(122, 122, 122))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(welcomeMessage)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hangmanTitlePic)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(playNowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(difficultyToggle, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(previousScores, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exitGameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(creditLabel)))
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void welcomeMessageMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_welcomeMessageMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_welcomeMessageMouseDragged

    private void exitGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitGameButtonActionPerformed
        SystemExit n = new SystemExit();
        this.dispose();
        n.exitProgram();
    }//GEN-LAST:event_exitGameButtonActionPerformed

    private void previousScoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousScoresActionPerformed
        new PreviousScores().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_previousScoresActionPerformed

    private void playNowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playNowButtonActionPerformed
        new PlayGame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_playNowButtonActionPerformed

    private void difficultyToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_difficultyToggleActionPerformed
        setDifficulty();
    }//GEN-LAST:event_difficultyToggleActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public void setDifficulty() {
        
        if (difficulty == true) {
            difficulty = false;
            difficultyToggle.setText("Difficulty (Hard)");
        } else {
            difficulty = true;
            difficultyToggle.setText("Difficulty (Easy)");
        }
        
    }
    
    public boolean getDifficulty() {
        return this.difficulty;
    }
    
    public String getDiffStr() {
        if (getDifficulty() == true) {
            return "Easy";
        } else {
            return "Hard";
        }
    }
    
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
            java.util.logging.Logger.getLogger(FirstMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FirstMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FirstMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FirstMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FirstMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel creditLabel;
    private javax.swing.JButton difficultyToggle;
    private javax.swing.JButton exitGameButton;
    private javax.swing.JLabel hangmanTitlePic;
    private javax.swing.JButton playNowButton;
    private javax.swing.JButton previousScores;
    private javax.swing.JLabel welcomeMessage;
    // End of variables declaration//GEN-END:variables
}
