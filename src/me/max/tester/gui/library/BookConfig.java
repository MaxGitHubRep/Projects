package me.max.tester.gui.library;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import me.max.tester.managers.error.ErrorOutput;
import me.max.tester.managers.file.LFileEdit;
import me.max.tester.managers.file.LFileReader;

/**
 *
 * @author mc170171
 */
public class BookConfig extends javax.swing.JFrame {

    private LFileReader readFile = new LFileReader();
    
    private void resetTextFields() {
        tfTitle.setText("");
        tfAuthor.setText("");
        tfISB.setText("");
    }
    
    private void updateBook() {
        new LFileEdit().editFileByLine("books", bookList.getSelectedIndex()+1, (tfTitle.getText() + "!-!" + tfAuthor.getText() + "!-!" + tfISB.getText()));
        resetBooksInList();
    }
    
    public String getValue(String context, String item) {
        try {
            String[] items = context.split("!-!");
            switch (item) {
                case "title":
                    return items[0];

                case "author":
                    return items[1];

                case "isb":
                    return items[2];

                default:
                    return "null";
            }
            
        } catch (Exception ex) {
            new ErrorOutput().error(ex);
        }
        return "null";
    }
    
    private void removeBook() {
        int bookIndexByLine = bookList.getSelectedIndex()+1;
        new LFileEdit().editFileByLine("books", bookIndexByLine, "null");
        resetBooksInList();

    }
    
    private void resetBooksInList() {
        bookList.removeAllItems();
        resetTextFields();
        displayBooksInList();
    }
    
    private ArrayList getBookList() {
        ArrayList books = readFile.getFileContent("books");
        //Collections.sort(books);
        
        return books;
    }
    
    private void displayBooksInList() {
        ArrayList books = getBookList();
        for (Object book : books) {
            bookList.addItem(getValue(book+"", "title"));
        }
        formatTextFields();
        
    }
    
    private void formatTextFields() {
        ArrayList books = getBookList();
        String book = bookList.getSelectedItem() + "";
        
        for (Object bookItem : books) {
            if (getValue(bookItem+"", "title").equalsIgnoreCase(book)){
                tfTitle.setText(getValue(bookItem+"", "title"));
                tfAuthor.setText(getValue(bookItem+"", "author"));
                tfISB.setText(getValue(bookItem+"", "isb"));
                break;
            }
            
        }

    }
    
    public BookConfig() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/me/max/tester/gui/library/resources/bookicon.png")).getImage());
        displayBooksInList();
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
        bookList = new javax.swing.JComboBox<>();
        removeBook = new javax.swing.JButton();
        addTitle = new javax.swing.JLabel();
        addAuthor = new javax.swing.JLabel();
        addISB = new javax.swing.JLabel();
        tfISB = new javax.swing.JTextField();
        tfAuthor = new javax.swing.JTextField();
        tfTitle = new javax.swing.JTextField();
        removeBook1 = new javax.swing.JButton();
        goToMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library • Book Configuration");
        setResizable(false);

        back.setBackground(new java.awt.Color(204, 255, 204));
        back.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        title.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        title.setForeground(new java.awt.Color(255, 51, 0));
        title.setText("Library - Book Configuration");

        bookList.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        bookList.setMaximumRowCount(80);
        bookList.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        bookList.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                bookListItemStateChanged(evt);
            }
        });

        removeBook.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        removeBook.setForeground(new java.awt.Color(255, 51, 0));
        removeBook.setText("Remove");
        removeBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBookActionPerformed(evt);
            }
        });

        addTitle.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        addTitle.setText("Title:");

        addAuthor.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        addAuthor.setText("Author:");

        addISB.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        addISB.setText("ISB:");

        tfISB.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        tfISB.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        tfAuthor.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        tfAuthor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        tfTitle.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        tfTitle.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        removeBook1.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        removeBook1.setForeground(new java.awt.Color(255, 51, 0));
        removeBook1.setText("Save");
        removeBook1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBook1ActionPerformed(evt);
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

        javax.swing.GroupLayout backLayout = new javax.swing.GroupLayout(back);
        back.setLayout(backLayout);
        backLayout.setHorizontalGroup(
            backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backLayout.createSequentialGroup()
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(goToMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
                    .addGroup(backLayout.createSequentialGroup()
                        .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(removeBook1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bookList, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(removeBook, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(addAuthor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                            .addComponent(addTitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addISB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfISB, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        backLayout.setVerticalGroup(
            backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backLayout.createSequentialGroup()
                        .addComponent(title)
                        .addGap(4, 4, 4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backLayout.createSequentialGroup()
                        .addComponent(goToMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bookList, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addTitle)
                    .addComponent(tfTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addAuthor)
                        .addComponent(removeBook, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tfAuthor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addISB)
                        .addComponent(removeBook1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tfISB, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookListItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_bookListItemStateChanged
        formatTextFields();
    }//GEN-LAST:event_bookListItemStateChanged

    private void removeBook1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBook1ActionPerformed
        updateBook();
    }//GEN-LAST:event_removeBook1ActionPerformed

    private void goToMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goToMenuActionPerformed
        this.dispose();
        new LibrarySystem().setVisible(true);
    }//GEN-LAST:event_goToMenuActionPerformed

    private void removeBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBookActionPerformed
        removeBook();
    }//GEN-LAST:event_removeBookActionPerformed

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
            java.util.logging.Logger.getLogger(BookConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookConfig().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addAuthor;
    private javax.swing.JLabel addISB;
    private javax.swing.JLabel addTitle;
    private javax.swing.JPanel back;
    private javax.swing.JComboBox<String> bookList;
    private javax.swing.JButton goToMenu;
    private javax.swing.JButton removeBook;
    private javax.swing.JButton removeBook1;
    private javax.swing.JTextField tfAuthor;
    private javax.swing.JTextField tfISB;
    private javax.swing.JTextField tfTitle;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
