package me.max.tester.gui.newhangman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import me.max.tester.managers.random.RandomElement;

/**
 *
 * @author Max Carter
 */
public class GUI extends javax.swing.JFrame {
    
    protected final int TOTAL_LIVES = 7;
    protected final String WORDS_GUESSED = "Words Guessed: %s";
    protected final String TOTAL_ACCURACY = "Accuracy: %s";
    protected final String LIVES_FORMAT = "%s/%s";
    protected final String WRONG = "_";
    protected int lives = TOTAL_LIVES;
    protected int wordsGuessed = 0;
    protected int totalGuesses = 0;
    protected int totalAccuracy = 0;
    
    protected JTextField[] fields;
    protected boolean game = false;
    protected ArrayList words = new ArrayList<>();
    protected ArrayList guessed = new ArrayList<>();
    protected String word;
    protected String username;

    protected void downloadEnglishWords() throws MalformedURLException, IOException {
        URL url = new URL("https://raw.githubusercontent.com/first20hours/google-10000-english/master/google-10000-english.txt");
        URLConnection con = url.openConnection();
        InputStream is =con.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        String line = null;
        while ((line = br.readLine()) != null) {
            words.add(line);
        }
    }
    
    protected void formatGame(JComboBox box) {
        box.removeAllItems();
        for (int i = 65; i < 91; i++) {
            if (!guessed.contains(((char) i) + "")) {
                box.addItem((char) i);
            }
        }
        livesHold.setText(String.format(LIVES_FORMAT, lives, TOTAL_LIVES));
    }
    
    protected void checkTextFields(JTextField field) {
        field.getDocument().addDocumentListener(new DocumentListener() {
        public void changedUpdate(DocumentEvent e) {
          warn();
        }
        public void removeUpdate(DocumentEvent e) {
          warn();
        }
        public void insertUpdate(DocumentEvent e) {
          warn();
        }

        public void warn() {
            play.setEnabled(isSet(inUsername));
        }
      });
    }
    
    protected String getRandomWord() {
        return new RandomElement().randomElement(words).toUpperCase();
    }
    
    protected String formatArray(ArrayList array) {
        String build = "";
        for (Object item : array) {
            build+=item + " ";
        }
        return build;
    }
    
    protected void resetGame(boolean won) {
        JOptionPane.showMessageDialog(this, "Correct Word: " + word.toLowerCase() + "\nScore saved, " + username, (won ? "WINNER!" : "LOSER!"), JOptionPane.WARNING_MESSAGE);
        if (won) wordsGuessed++;
        wordsGuessedHold.setText(String.format(WORDS_GUESSED, wordsGuessed));
        guessed.clear();
        words.remove(word);
        lives = TOTAL_LIVES;
        imageForceSet(lives);
        formatGame(inChar);
        gameStatusUpdate(false);
    }
    
    protected void imageForceSet(int num) {
        imHold.setIcon(new javax.swing.ImageIcon(getClass().getResource("/me/max/tester/gui/newhangman/resources/" + (TOTAL_LIVES - num + 1) + ".png")));
    }
    
    protected void playChar(String item) {
        totalGuesses++;
        if (word.contains(item)) {
            totalAccuracy++;
        } else {
            lives--;
        }
        accuracyHold.setText(String.format(TOTAL_ACCURACY, new DecimalFormat("#0.00").format((double) totalAccuracy/totalGuesses)) + "%");
        if (lives == 0) {
            resetGame(false);
        } else {
            guessed.add(item);
            formatGame(inChar);
            imageForceSet(lives);
            updateWordList();
        }
    }
    
    protected void updateWordList() {
        ArrayList temp = new ArrayList<>();

        for (int i = 0; i < word.length(); i++) {
            temp.add(guessed.contains(word.charAt(i) + "") ? word.charAt(i) : WRONG);
        }
        if (!temp.contains(WRONG)) {
            resetGame(true);
        } else {
            wordHold.setText(formatArray(temp));
        }
    }
    
    protected void gameStatusUpdate(boolean state) {
        game = state;
        submit.setEnabled(game);
        inChar.setEnabled(game);
        inUsername.setEnabled(!game);
        play.setEnabled(!game);
        if (state) {
            word = getRandomWord();
        }
        updateWordList();
    }
    
    protected boolean isSet(JTextField field) {
        return !field.getText().equals("");
    }
    
    public GUI() throws IOException {
        initComponents();
        formatGame(inChar);
        downloadEnglishWords();
        fields = new JTextField[]{ inUsername };
        for (JTextField field : fields) {
            checkTextFields(field);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back = new javax.swing.JPanel();
        top = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        userPanel = new javax.swing.JPanel();
        inUsername = new javax.swing.JTextField();
        play = new javax.swing.JButton();
        wordHold = new javax.swing.JLabel();
        imHold = new javax.swing.JLabel();
        gameInfoPanel = new javax.swing.JPanel();
        livesHold = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        inChar = new javax.swing.JComboBox<>();
        statsPanel = new javax.swing.JPanel();
        wordsGuessedHold = new javax.swing.JLabel();
        accuracyHold = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hangman V2");

        back.setBackground(new java.awt.Color(255, 255, 255));

        top.setBackground(new java.awt.Color(0, 153, 153));

        title.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Hangman V2");

        javax.swing.GroupLayout topLayout = new javax.swing.GroupLayout(top);
        top.setLayout(topLayout);
        topLayout.setHorizontalGroup(
            topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        topLayout.setVerticalGroup(
            topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        userPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "User Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 24), new java.awt.Color(0, 153, 153))); // NOI18N
        userPanel.setOpaque(false);

        inUsername.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        inUsername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inUsername.setToolTipText("Username...");
        inUsername.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 2, true));

        play.setBackground(new java.awt.Color(255, 255, 255));
        play.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        play.setForeground(new java.awt.Color(0, 153, 153));
        play.setText("Play!");
        play.setEnabled(false);
        play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout userPanelLayout = new javax.swing.GroupLayout(userPanel);
        userPanel.setLayout(userPanelLayout);
        userPanelLayout.setHorizontalGroup(
            userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inUsername)
                    .addComponent(play, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                .addContainerGap())
        );
        userPanelLayout.setVerticalGroup(
            userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPanelLayout.createSequentialGroup()
                .addComponent(inUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(play))
        );

        wordHold.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        wordHold.setForeground(new java.awt.Color(0, 153, 153));
        wordHold.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wordHold.setToolTipText("");
        wordHold.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "The Word...", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 24), new java.awt.Color(0, 153, 153))); // NOI18N

        imHold.setIcon(new javax.swing.ImageIcon(getClass().getResource("/me/max/tester/gui/newhangman/resources/1.png"))); // NOI18N
        imHold.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Visual Representation of Death", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 24), new java.awt.Color(0, 153, 153))); // NOI18N

        gameInfoPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Game Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 24), new java.awt.Color(0, 153, 153))); // NOI18N
        gameInfoPanel.setOpaque(false);

        livesHold.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        livesHold.setForeground(new java.awt.Color(0, 153, 153));
        livesHold.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        livesHold.setText("<lives>");
        livesHold.setToolTipText("");
        livesHold.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lives", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 24), new java.awt.Color(0, 153, 153))); // NOI18N

        submit.setBackground(new java.awt.Color(255, 255, 255));
        submit.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        submit.setForeground(new java.awt.Color(0, 153, 153));
        submit.setText("Submit");
        submit.setEnabled(false);
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        inChar.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        inChar.setForeground(new java.awt.Color(0, 153, 153));
        inChar.setToolTipText("Select a character...");
        inChar.setEnabled(false);
        inChar.setOpaque(false);

        javax.swing.GroupLayout gameInfoPanelLayout = new javax.swing.GroupLayout(gameInfoPanel);
        gameInfoPanel.setLayout(gameInfoPanelLayout);
        gameInfoPanelLayout.setHorizontalGroup(
            gameInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gameInfoPanelLayout.createSequentialGroup()
                .addGroup(gameInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(gameInfoPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(livesHold, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(gameInfoPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(inChar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(submit)))
                .addContainerGap())
        );
        gameInfoPanelLayout.setVerticalGroup(
            gameInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gameInfoPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(gameInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inChar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(livesHold))
        );

        statsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Overall Stats", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 24), new java.awt.Color(0, 153, 153))); // NOI18N
        statsPanel.setOpaque(false);

        wordsGuessedHold.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        wordsGuessedHold.setForeground(new java.awt.Color(0, 153, 153));
        wordsGuessedHold.setText("Words Guessed:");

        accuracyHold.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        accuracyHold.setForeground(new java.awt.Color(0, 153, 153));
        accuracyHold.setText("Accuracy: ");

        javax.swing.GroupLayout statsPanelLayout = new javax.swing.GroupLayout(statsPanel);
        statsPanel.setLayout(statsPanelLayout);
        statsPanelLayout.setHorizontalGroup(
            statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(wordsGuessedHold, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(accuracyHold, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addContainerGap())
        );
        statsPanelLayout.setVerticalGroup(
            statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statsPanelLayout.createSequentialGroup()
                .addComponent(wordsGuessedHold, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(accuracyHold, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout backLayout = new javax.swing.GroupLayout(back);
        back.setLayout(backLayout);
        backLayout.setHorizontalGroup(
            backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(top, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(userPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(gameInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(statsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(imHold, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(wordHold, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backLayout.setVerticalGroup(
            backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backLayout.createSequentialGroup()
                .addComponent(top, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backLayout.createSequentialGroup()
                        .addComponent(userPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gameInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(statsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(backLayout.createSequentialGroup()
                        .addComponent(wordHold, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imHold, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void playActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playActionPerformed
        username = inUsername.getText();
        gameStatusUpdate(true);
    }//GEN-LAST:event_playActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        playChar(inChar.getSelectedItem().toString());
    }//GEN-LAST:event_submitActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new GUI().setVisible(true);
                } catch (IOException ex) {
                    
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accuracyHold;
    private javax.swing.JPanel back;
    private javax.swing.JPanel gameInfoPanel;
    private javax.swing.JLabel imHold;
    private javax.swing.JComboBox<String> inChar;
    private javax.swing.JTextField inUsername;
    private javax.swing.JLabel livesHold;
    private javax.swing.JButton play;
    private javax.swing.JPanel statsPanel;
    private javax.swing.JButton submit;
    private javax.swing.JLabel title;
    private javax.swing.JPanel top;
    private javax.swing.JPanel userPanel;
    private javax.swing.JLabel wordHold;
    private javax.swing.JLabel wordsGuessedHold;
    // End of variables declaration//GEN-END:variables
}
