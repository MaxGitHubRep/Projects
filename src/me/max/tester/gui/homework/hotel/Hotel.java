/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.max.tester.gui.homework.hotel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author mc170171
 */
public class Hotel extends javax.swing.JFrame {

    private final int PRICE_SINGLE = 50;
    private final int PRICE_DOUBLE = 75;
    private final int PRICE_FAMILY = 105;
    private final int BOARD_SELF = 0;
    private final int BOARD_HALF = 10;
    private final int BOARD_FULL = 20;
    
    private JRadioButton[] rButtons; 
    
    private void updatePrice() {
        price.setText("<html>Price: " + getRoomPrice() + "</html>");
    }
    
    private void update(JRadioButton button) {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updatePrice();
            }
        });
    }
    
    private int getPriceFromItem(JRadioButton item) {
        switch (item.getText()) {
            case "Single":
                return PRICE_SINGLE;
            case "Double":
                return PRICE_DOUBLE;
            case "Family":
                return PRICE_FAMILY;
            case "Self Catered":
                return BOARD_SELF;
            case "Half Board":
                return BOARD_HALF;
            case "Full Board":
                return BOARD_FULL;
        }
        return 0;
    }
    
    private int getRoomPrice() {
        int pricing = 0;
        for (JRadioButton button : rButtons) {
            if (button.isSelected()) {
                pricing = pricing + getPriceFromItem(button);
            }
        }
        return pricing * Integer.parseInt(daysTotal.getValue() + "");
    }
    
    private void formatLabels() {
        prices.setText("<html>Single (1) ................... £" + PRICE_SINGLE + " <br> Double (2) ................ £" + PRICE_DOUBLE + " <br> Family (4) ................. £" + PRICE_FAMILY + " </html>");
        board.setText("<html>Self Catering ............. +£" + BOARD_SELF + " <br> Half Board ................ +£" + BOARD_HALF + " <br> Full Board ................. +£" + BOARD_FULL + " </html>");
    }
    
    
    public Hotel() {
        initComponents();
        formatLabels();
        rButtons = new JRadioButton[] { bSingle, bDouble, bFamily, bSelfCatered, bHalfBoard, bFullBoard };
        for (JRadioButton button : rButtons) {
            update(button);
        }
        getRoomPrice();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tickets = new javax.swing.ButtonGroup();
        boards = new javax.swing.ButtonGroup();
        back = new javax.swing.JPanel();
        top = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        prices = new javax.swing.JLabel();
        board = new javax.swing.JLabel();
        datePanel = new javax.swing.JPanel();
        daysTotal = new javax.swing.JSpinner();
        daysLabel = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        roomPanel = new javax.swing.JPanel();
        bSingle = new javax.swing.JRadioButton();
        bDouble = new javax.swing.JRadioButton();
        bFamily = new javax.swing.JRadioButton();
        boardPanel = new javax.swing.JPanel();
        bSelfCatered = new javax.swing.JRadioButton();
        bHalfBoard = new javax.swing.JRadioButton();
        bFullBoard = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        buy = new javax.swing.JButton();
        price = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hotel Booking");
        setResizable(false);

        back.setBackground(new java.awt.Color(255, 255, 255));

        top.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hotel Bookings");

        javax.swing.GroupLayout topLayout = new javax.swing.GroupLayout(top);
        top.setLayout(topLayout);
        topLayout.setHorizontalGroup(
            topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
                .addContainerGap())
        );
        topLayout.setVerticalGroup(
            topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        prices.setBackground(new java.awt.Color(255, 255, 255));
        prices.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        prices.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        prices.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pricing", 0, 0, new java.awt.Font("Agency FB", 1, 28), new java.awt.Color(0, 153, 153))); // NOI18N

        board.setBackground(new java.awt.Color(255, 255, 255));
        board.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        board.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        board.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Board", 0, 0, new java.awt.Font("Agency FB", 1, 28), new java.awt.Color(0, 153, 153))); // NOI18N

        datePanel.setBackground(new java.awt.Color(255, 255, 255));
        datePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Date", 0, 0, new java.awt.Font("Agency FB", 1, 24), new java.awt.Color(0, 153, 153))); // NOI18N

        daysTotal.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        daysTotal.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));
        daysTotal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 2, true));

        daysLabel.setBackground(new java.awt.Color(255, 255, 255));
        daysLabel.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        daysLabel.setForeground(new java.awt.Color(0, 153, 153));
        daysLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        daysLabel.setText("Days:");
        daysLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 2, true));

        jDateChooser1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 2, true));
        jDateChooser1.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jDateChooser1.setMaxSelectableDate(new java.util.Date(253370768519000L));
        jDateChooser1.setMinSelectableDate(new java.util.Date(1515978119000L));

        javax.swing.GroupLayout datePanelLayout = new javax.swing.GroupLayout(datePanel);
        datePanel.setLayout(datePanelLayout);
        datePanelLayout.setHorizontalGroup(
            datePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(datePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(datePanelLayout.createSequentialGroup()
                        .addComponent(daysLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(daysTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        datePanelLayout.setVerticalGroup(
            datePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datePanelLayout.createSequentialGroup()
                .addGroup(datePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(daysLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(daysTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        roomPanel.setBackground(new java.awt.Color(255, 255, 255));
        roomPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Room Type", 0, 0, new java.awt.Font("Agency FB", 1, 24), new java.awt.Color(0, 153, 153))); // NOI18N

        bSingle.setBackground(new java.awt.Color(255, 255, 255));
        tickets.add(bSingle);
        bSingle.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        bSingle.setForeground(new java.awt.Color(0, 153, 153));
        bSingle.setText("Single");
        bSingle.setIconTextGap(8);

        bDouble.setBackground(new java.awt.Color(255, 255, 255));
        tickets.add(bDouble);
        bDouble.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        bDouble.setForeground(new java.awt.Color(0, 153, 153));
        bDouble.setText("Double");
        bDouble.setIconTextGap(8);

        bFamily.setBackground(new java.awt.Color(255, 255, 255));
        tickets.add(bFamily);
        bFamily.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        bFamily.setForeground(new java.awt.Color(0, 153, 153));
        bFamily.setSelected(true);
        bFamily.setText("Family");
        bFamily.setIconTextGap(8);

        javax.swing.GroupLayout roomPanelLayout = new javax.swing.GroupLayout(roomPanel);
        roomPanel.setLayout(roomPanelLayout);
        roomPanelLayout.setHorizontalGroup(
            roomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roomPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(bSingle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bDouble, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bFamily, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        roomPanelLayout.setVerticalGroup(
            roomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roomPanelLayout.createSequentialGroup()
                .addComponent(bSingle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bDouble)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bFamily)
                .addContainerGap())
        );

        boardPanel.setBackground(new java.awt.Color(255, 255, 255));
        boardPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Board Type", 0, 0, new java.awt.Font("Agency FB", 1, 24), new java.awt.Color(0, 153, 153))); // NOI18N

        bSelfCatered.setBackground(new java.awt.Color(255, 255, 255));
        boards.add(bSelfCatered);
        bSelfCatered.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        bSelfCatered.setForeground(new java.awt.Color(0, 153, 153));
        bSelfCatered.setText("Self Catered");
        bSelfCatered.setIconTextGap(8);

        bHalfBoard.setBackground(new java.awt.Color(255, 255, 255));
        boards.add(bHalfBoard);
        bHalfBoard.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        bHalfBoard.setForeground(new java.awt.Color(0, 153, 153));
        bHalfBoard.setText("Half Board");
        bHalfBoard.setIconTextGap(8);

        bFullBoard.setBackground(new java.awt.Color(255, 255, 255));
        boards.add(bFullBoard);
        bFullBoard.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        bFullBoard.setForeground(new java.awt.Color(0, 153, 153));
        bFullBoard.setSelected(true);
        bFullBoard.setText("Full Board");
        bFullBoard.setIconTextGap(8);

        javax.swing.GroupLayout boardPanelLayout = new javax.swing.GroupLayout(boardPanel);
        boardPanel.setLayout(boardPanelLayout);
        boardPanelLayout.setHorizontalGroup(
            boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boardPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bFullBoard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bHalfBoard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(boardPanelLayout.createSequentialGroup()
                        .addComponent(bSelfCatered)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        boardPanelLayout.setVerticalGroup(
            boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boardPanelLayout.createSequentialGroup()
                .addComponent(bSelfCatered)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bHalfBoard)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bFullBoard)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pricing", 0, 0, new java.awt.Font("Agency FB", 1, 24), new java.awt.Color(0, 153, 153))); // NOI18N

        buy.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        buy.setForeground(new java.awt.Color(0, 153, 153));
        buy.setText("Purchase");

        price.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        price.setForeground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(price, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(price, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buy))
        );

        javax.swing.GroupLayout backLayout = new javax.swing.GroupLayout(back);
        back.setLayout(backLayout);
        backLayout.setHorizontalGroup(
            backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(top, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(prices, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(board, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(backLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(roomPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(datePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        backLayout.setVerticalGroup(
            backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backLayout.createSequentialGroup()
                .addComponent(top, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backLayout.createSequentialGroup()
                        .addComponent(prices, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(board, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backLayout.createSequentialGroup()
                        .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(roomPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(datePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(92, 92, 92))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Hotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        try {
            UIManager.setLookAndFeel(
            UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {}

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hotel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton bDouble;
    private javax.swing.JRadioButton bFamily;
    private javax.swing.JRadioButton bFullBoard;
    private javax.swing.JRadioButton bHalfBoard;
    private javax.swing.JRadioButton bSelfCatered;
    private javax.swing.JRadioButton bSingle;
    private javax.swing.JPanel back;
    private javax.swing.JLabel board;
    private javax.swing.JPanel boardPanel;
    private javax.swing.ButtonGroup boards;
    private javax.swing.JButton buy;
    private javax.swing.JPanel datePanel;
    private javax.swing.JLabel daysLabel;
    private javax.swing.JSpinner daysTotal;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel price;
    private javax.swing.JLabel prices;
    private javax.swing.JPanel roomPanel;
    private javax.swing.ButtonGroup tickets;
    private javax.swing.JPanel top;
    // End of variables declaration//GEN-END:variables
}
