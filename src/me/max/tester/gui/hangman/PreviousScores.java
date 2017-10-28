/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.max.tester.gui.hangman;

import javax.swing.DefaultListModel;
import me.max.tester.managers.file.LFileClear;
import me.max.tester.managers.file.LFileReader;
import me.max.tester.managers.system.SystemExit;

/**
 *
 * @author MC170171
 */
public class PreviousScores extends javax.swing.JFrame {

    /**
     * Creates new form PreviousScores
     */
    public PreviousScores() {
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

        jLabel1 = new javax.swing.JLabel();
        buttonEasy = new javax.swing.JButton();
        quitGame = new javax.swing.JButton();
        buttonHard = new javax.swing.JButton();
        submitLetterButton4 = new javax.swing.JButton();
        clearScores = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listPrevScores = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("PREVIOUS SCORES!");

        buttonEasy.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        buttonEasy.setForeground(new java.awt.Color(255, 0, 51));
        buttonEasy.setText("Easy");
        buttonEasy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEasyActionPerformed(evt);
            }
        });

        quitGame.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        quitGame.setForeground(new java.awt.Color(255, 0, 51));
        quitGame.setText("Exit Game");
        quitGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitGameActionPerformed(evt);
            }
        });

        buttonHard.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        buttonHard.setForeground(new java.awt.Color(255, 0, 51));
        buttonHard.setText("Hard");
        buttonHard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHardActionPerformed(evt);
            }
        });

        submitLetterButton4.setBackground(new java.awt.Color(204, 204, 204));
        submitLetterButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        submitLetterButton4.setForeground(new java.awt.Color(255, 0, 51));
        submitLetterButton4.setText("Main Menu");
        submitLetterButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitLetterButton4ActionPerformed(evt);
            }
        });

        clearScores.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        clearScores.setForeground(new java.awt.Color(255, 0, 51));
        clearScores.setText("Clear");
        clearScores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearScoresActionPerformed(evt);
            }
        });

        listPrevScores.setBorder(javax.swing.BorderFactory.createTitledBorder("Easy"));
        listPrevScores.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        listPrevScores.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listPrevScores);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonHard, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonEasy, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearScores, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(submitLetterButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quitGame))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonHard, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonEasy, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quitGame, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitLetterButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearScores, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void printData(String mode) {
        DefaultListModel listModel = new DefaultListModel();
        fr.getFileContent(pg.fileName).stream().filter(item -> item.toString().contains(mode)).forEachOrdered((Object item) -> {
            listModel.addElement(item.toString().replace("Difficulty: " + mode + " - ", ""));
        });
        listPrevScores.setModel(listModel);
    }
    
    PlayGame pg = new PlayGame();
    LFileReader fr = new LFileReader();
    
    private void buttonEasyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEasyActionPerformed
        // easy
        printData("Easy");


    }//GEN-LAST:event_buttonEasyActionPerformed

    private void quitGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitGameActionPerformed
        SystemExit n = new SystemExit();
        this.dispose();
        n.exitProgram();
    }//GEN-LAST:event_quitGameActionPerformed

    private void buttonHardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHardActionPerformed
        // hard
        printData("Hard");
  
    }//GEN-LAST:event_buttonHardActionPerformed

    private void submitLetterButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitLetterButton4ActionPerformed
        new FirstMenu().setVisible(true);
        FirstMenu fm = new FirstMenu();
        fm.setDifficulty();
        this.dispose();
    }//GEN-LAST:event_submitLetterButton4ActionPerformed

    private void clearScoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearScoresActionPerformed
        // clear
        
        LFileClear fc = new LFileClear();
        fc.clearFile(pg.fileName);
        
        
    }//GEN-LAST:event_clearScoresActionPerformed

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
            java.util.logging.Logger.getLogger(PreviousScores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PreviousScores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PreviousScores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PreviousScores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PreviousScores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEasy;
    private javax.swing.JButton buttonHard;
    private javax.swing.JButton clearScores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listPrevScores;
    private javax.swing.JButton quitGame;
    private javax.swing.JButton submitLetterButton2;
    private javax.swing.JButton submitLetterButton3;
    private javax.swing.JButton submitLetterButton4;
    // End of variables declaration//GEN-END:variables
}
