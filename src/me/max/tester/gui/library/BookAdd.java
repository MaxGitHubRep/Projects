/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.max.tester.gui.library;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import me.max.tester.managers.file.LFileWriter;
import me.max.tester.managers.random.RandomInt;

/**
 *
 * @author mc170171
 */
public class BookAdd extends javax.swing.JFrame {

    Methods m = new Methods();
    
    private void addBookToFile(String title, String author, String isb) {
        error.setText("");
        String format = title + "!-!" + author + "!-!" + isb;
        new LFileWriter().writeToFile(format, "books", true);

        tfTitle.setText("");
        tfAuthor.setText("");
        tfISB.setText("");

        tfTitle.requestFocusInWindow();
    }
    
    private boolean valueIsFreeToUse(String value, JTextField tf) {
        ArrayList bookItems = m.getBookList();
        ArrayList hold = new ArrayList();
        hold.add(tf.getText());

        for (Object line : bookItems) {
            if (hold.contains(m.getValue(line + "", value))) {
                error.setText(value + " already in use.");
                return false;

            } else {
                hold.add(m.getValue(line + "", value));
            }

        }
        return true;
    }
    
    public void addBook(String title, String author, String isb) {
        
        if (m.getBookList().contains(tfTitle.getText())) {
            error.setText("Book title in use.");
        } else {
            
            if (tfTitle.getText().equals("") && tfAuthor.getText().equals("") && tfISB.getText().equals("")){
                error.setText("Missing fields!");
                
            } else {
                if (valueIsFreeToUse("title", tfTitle) == true && valueIsFreeToUse("isb", tfISB) == true) {
                    addBookToFile(title, author, isb);
                }
            }
        }
    }
    
    private void generateISB() {
        String items = "";
        
        for (int i = 0; i < 10; i++) {
            items = items + new RandomInt().randomInt(0, 9);
        }
        
        tfISB.setText(items);
    }
    
    private void updateAuthorTextField() {
        String item = prevAuthors.getSelectedItem() + "";
        
        if (item.equals("(Empty)")) {
            tfAuthor.setText("");
        } else {
            tfAuthor.setText(item);
        }
        
    }
    
    private void prevAuthorsInList() {
        //prevAuthors
        ArrayList bookItems = m.getBookList();
        ArrayList hold = new ArrayList();
        
        for (Object line : bookItems) {
            if (hold.contains(m.getValue(line + "", "author"))) {
                continue;
            } else {
                hold.add(m.getValue(line + "", "author"));
                prevAuthors.addItem(m.getValue(line + "", "author"));
            }
            
        }
    }
    
    public BookAdd() {
        initComponents();
        prevAuthorsInList();
        this.setIconImage(new ImageIcon(getClass().getResource("/me/max/tester/gui/library/resources/bookicon.png")).getImage());
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
        title = new javax.swing.JLabel();
        tfTitle = new javax.swing.JTextField();
        addTitle = new javax.swing.JLabel();
        addAuthor = new javax.swing.JLabel();
        addISB = new javax.swing.JLabel();
        tfAuthor = new javax.swing.JTextField();
        tfISB = new javax.swing.JTextField();
        addBook = new javax.swing.JButton();
        goToMenu = new javax.swing.JButton();
        genISB = new javax.swing.JButton();
        prevAuthors = new javax.swing.JComboBox<>();
        error = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library • Add Book");
        setResizable(false);

        back.setBackground(new java.awt.Color(204, 255, 204));
        back.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        title.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        title.setForeground(new java.awt.Color(255, 51, 0));
        title.setText("Library - Add Book");

        tfTitle.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        tfTitle.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        addTitle.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        addTitle.setText("Title:");

        addAuthor.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        addAuthor.setText("Author:");

        addISB.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        addISB.setText("ISB:");

        tfAuthor.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        tfAuthor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        tfISB.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        tfISB.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        addBook.setFont(new java.awt.Font("Agency FB", 1, 30)); // NOI18N
        addBook.setForeground(new java.awt.Color(255, 51, 51));
        addBook.setText("Add Book");
        addBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookActionPerformed(evt);
            }
        });

        goToMenu.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        goToMenu.setForeground(new java.awt.Color(255, 51, 0));
        goToMenu.setText("Main Menu");
        goToMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goToMenuActionPerformed(evt);
            }
        });

        genISB.setFont(new java.awt.Font("Agency FB", 1, 30)); // NOI18N
        genISB.setForeground(new java.awt.Color(255, 51, 51));
        genISB.setText("Generate ISB");
        genISB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genISBActionPerformed(evt);
            }
        });

        prevAuthors.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        prevAuthors.setForeground(new java.awt.Color(255, 51, 0));
        prevAuthors.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(Empty)" }));
        prevAuthors.setToolTipText("Select a previous author...");
        prevAuthors.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                prevAuthorsItemStateChanged(evt);
            }
        });

        error.setFont(new java.awt.Font("Agency FB", 3, 24)); // NOI18N
        error.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout backLayout = new javax.swing.GroupLayout(back);
        back.setLayout(backLayout);
        backLayout.setHorizontalGroup(
            backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backLayout.createSequentialGroup()
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                        .addComponent(goToMenu))
                    .addGroup(backLayout.createSequentialGroup()
                        .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backLayout.createSequentialGroup()
                                .addComponent(addBook, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(backLayout.createSequentialGroup()
                                .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(addISB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(addAuthor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                    .addComponent(addTitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfTitle)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backLayout.createSequentialGroup()
                                        .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(tfAuthor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                                            .addComponent(tfISB, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(genISB, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                            .addComponent(prevAuthors, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        backLayout.setVerticalGroup(
            backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backLayout.createSequentialGroup()
                        .addComponent(title)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backLayout.createSequentialGroup()
                        .addComponent(goToMenu)
                        .addGap(18, 18, 18)))
                .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(backLayout.createSequentialGroup()
                        .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addTitle)
                            .addComponent(tfTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addAuthor)
                            .addComponent(prevAuthors, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(tfAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(genISB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addISB, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfISB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addBook, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(error, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookActionPerformed
        addBook(tfTitle.getText(), tfAuthor.getText(), tfISB.getText());
    }//GEN-LAST:event_addBookActionPerformed

    private void goToMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goToMenuActionPerformed
        this.dispose();
        new LibrarySystem().setVisible(true);
    }//GEN-LAST:event_goToMenuActionPerformed

    private void genISBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genISBActionPerformed
        generateISB();
    }//GEN-LAST:event_genISBActionPerformed

    private void prevAuthorsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_prevAuthorsItemStateChanged
        updateAuthorTextField();
    }//GEN-LAST:event_prevAuthorsItemStateChanged

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
            java.util.logging.Logger.getLogger(BookAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addAuthor;
    private javax.swing.JButton addBook;
    private javax.swing.JLabel addISB;
    private javax.swing.JLabel addTitle;
    private javax.swing.JPanel back;
    private javax.swing.JLabel error;
    private javax.swing.JButton genISB;
    private javax.swing.JButton goToMenu;
    private javax.swing.JComboBox<String> prevAuthors;
    private javax.swing.JTextField tfAuthor;
    private javax.swing.JTextField tfISB;
    private javax.swing.JTextField tfTitle;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
