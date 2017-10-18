/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.max.tester.gui.hangman;

import java.util.ArrayList;
import me.max.tester.managers.lists.ArrayListStringBuilder;
import me.max.tester.managers.random.RandomElement;
import me.max.tester.managers.system.SystemExit;

/**
 *
 * @author mc170171
 */
public class PlayGame extends javax.swing.JFrame {

    private ArrayList<Character> usedLetters = new ArrayList<>();
    
    /**
     * Creates new form PlayGame
     */
    public PlayGame() {
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

        hangmanTitle = new javax.swing.JLabel();
        howToPlayTitle = new javax.swing.JLabel();
        ruleOne = new javax.swing.JLabel();
        submitLetterButton = new javax.swing.JButton();
        submitLetterButton1 = new javax.swing.JButton();
        submitLetterButton2 = new javax.swing.JButton();
        selextLetterBox = new javax.swing.JComboBox<>();
        hangmanPictureChange = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        letterDisplay = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        hangmanTitle.setBackground(new java.awt.Color(153, 153, 153));
        hangmanTitle.setFont(new java.awt.Font("Arial Black", 1, 28)); // NOI18N
        hangmanTitle.setForeground(new java.awt.Color(0, 102, 204));
        hangmanTitle.setText("Hangman");
        hangmanTitle.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                hangmanTitleMouseDragged(evt);
            }
        });

        howToPlayTitle.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        howToPlayTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        howToPlayTitle.setText("How to Play:");

        ruleOne.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        ruleOne.setText("1) Select a letter from the dropdown");

        submitLetterButton.setBackground(new java.awt.Color(204, 204, 204));
        submitLetterButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        submitLetterButton.setForeground(new java.awt.Color(255, 0, 51));
        submitLetterButton.setText("Exit Game");
        submitLetterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitLetterButtonActionPerformed(evt);
            }
        });

        submitLetterButton1.setBackground(new java.awt.Color(204, 204, 204));
        submitLetterButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        submitLetterButton1.setForeground(new java.awt.Color(255, 0, 51));
        submitLetterButton1.setText("Submit Letter");
        submitLetterButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitLetterButton1ActionPerformed(evt);
            }
        });

        submitLetterButton2.setBackground(new java.awt.Color(204, 204, 204));
        submitLetterButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        submitLetterButton2.setForeground(new java.awt.Color(255, 0, 51));
        submitLetterButton2.setText("Main Menu");
        submitLetterButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitLetterButton2ActionPerformed(evt);
            }
        });

        selextLetterBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));

        hangmanPictureChange.setIcon(new javax.swing.ImageIcon(getClass().getResource("/me/max/tester/images/hangman/stages/1.fw.png"))); // NOI18N
        hangmanPictureChange.setText("[hangman pics]");

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel1.setText("Word to Guess: ");

        letterDisplay.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        letterDisplay.setText("_ _ _ _ _ _ _ _ _ _");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(36, Short.MAX_VALUE)
                        .addComponent(selextLetterBox, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(submitLetterButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(submitLetterButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(submitLetterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hangmanTitle)
                    .addComponent(ruleOne, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(howToPlayTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(letterDisplay)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(hangmanPictureChange, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(hangmanTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(howToPlayTitle)
                            .addComponent(letterDisplay))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ruleOne))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(hangmanPictureChange, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(selextLetterBox, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitLetterButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitLetterButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitLetterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hangmanTitleMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hangmanTitleMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_hangmanTitleMouseDragged

    private void submitLetterButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitLetterButton2ActionPerformed
        new FirstMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_submitLetterButton2ActionPerformed

    private void submitLetterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitLetterButtonActionPerformed
        SystemExit n = new SystemExit();
        this.dispose();
        n.exitProgram();
    }//GEN-LAST:event_submitLetterButtonActionPerformed

    private void submitLetterButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitLetterButton1ActionPerformed
        
        String letter = (String)selextLetterBox.getSelectedItem();
        
        if (!usedLetters.contains(letter.charAt(0))) {
            usedLetters.add(letter.charAt(0));
            System.out.println(letter.charAt(0) + " added");
        } else {
            
            System.out.println("error");
            
        }
        
        
        
    }//GEN-LAST:event_submitLetterButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public ArrayList randomWords;
    public String word;
    
    public void setRandomWord() {
        FirstMenu m = new FirstMenu();
        ArrayListStringBuilder list = new ArrayListStringBuilder();
        RandomElement ri = new RandomElement();
        if (m.difficulty == true) {
                randomWords = list.buildArrayListStr("hello-cheese-world-smile-crime-fruit-mouse", "-");
        } else {
            randomWords = list.buildArrayListStr("chocolate-diabolical-oxymoron-critical-analysis", "-");
        }
        word = ri.randomElement(randomWords);
        String[] wordSplit = word.split("");
        ArrayList<Character> unScores = new ArrayList<Character>();
        for (int i = 0; i<word.length(); i++) {
            unScores.add('_');
        }
        System.out.println(unScores);
        letterDisplay.setText("HELLO");
        
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
            java.util.logging.Logger.getLogger(PlayGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlayGame().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel hangmanPictureChange;
    private javax.swing.JLabel hangmanTitle;
    private javax.swing.JLabel howToPlayTitle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel letterDisplay;
    private javax.swing.JLabel ruleOne;
    private javax.swing.JComboBox<String> selextLetterBox;
    private javax.swing.JButton submitLetterButton;
    private javax.swing.JButton submitLetterButton1;
    private javax.swing.JButton submitLetterButton2;
    // End of variables declaration//GEN-END:variables
}
