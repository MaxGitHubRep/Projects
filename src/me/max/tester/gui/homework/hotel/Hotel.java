/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.max.tester.gui.homework.hotel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.UIManager;

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
    private JPanel[] jPanels;
    
    private void updatePrice() {
        price.setText("<html>Price: £" + getRoomPrice() + "0 </html>");
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
    
    private double getRoomPrice() {
        int pricing = 0;
        int days = Integer.parseInt(daysTotal.getValue() + "");
        for (JRadioButton button : rButtons) {
            if (button.isSelected()) {
                pricing = pricing + getPriceFromItem(button);
            }
        }
        return days <= 7 ? pricing * days : (pricing * days)*0.8;
    }
    
    private void formatLabels() {
        prices.setText("<html> Single (1) .................. £" + PRICE_SINGLE + " <br> Double (2) ................ £" + PRICE_DOUBLE + " <br> Family (4) ................. £" + PRICE_FAMILY + " </html>");
        boardtypes.setText("<html> Self Catering ............. +£" + BOARD_SELF + " <br> Half Board ................ +£" + BOARD_HALF + " <br> Full Board ................. +£" + BOARD_FULL + "</html>");
    }
    
    private void makeLabel(String content, int x, int y, int size) {
        JLabel label = new JLabel(content);
        label.setFont(new Font("Agency FB", 1, size));
        label.setForeground(new Color(0, 153, 153));
        label.setSize(600, 300);
        back.add(label);
        label.setLocation(x, y);
    }
    
    public Hotel() {
        initComponents();
        formatLabels();
        
        jPanels = new JPanel[] { datePanel, roomPanel, boardPanel, pricePanel, roomsPanel, boardsPanel };
        rButtons = new JRadioButton[] { bSingle, bDouble, bFamily, bSelfCatered, bHalfBoard, bFullBoard };
        
        for (JRadioButton button : rButtons) {
            update(button);
        }
        calendar.setDate(new Date());
        calendar.getJCalendar().setMinSelectableDate(new Date());
        updatePrice();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tickets = new javax.swing.ButtonGroup();
        boards = new javax.swing.ButtonGroup();
        back = new javax.swing.JPanel();
        top = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        datePanel = new javax.swing.JPanel();
        daysTotal = new javax.swing.JSpinner();
        daysLabel = new javax.swing.JLabel();
        calendar = new com.toedter.calendar.JDateChooser();
        roomPanel = new javax.swing.JPanel();
        bSingle = new javax.swing.JRadioButton();
        bDouble = new javax.swing.JRadioButton();
        bFamily = new javax.swing.JRadioButton();
        boardPanel = new javax.swing.JPanel();
        bSelfCatered = new javax.swing.JRadioButton();
        bHalfBoard = new javax.swing.JRadioButton();
        bFullBoard = new javax.swing.JRadioButton();
        pricePanel = new javax.swing.JPanel();
        buy = new javax.swing.JButton();
        price = new javax.swing.JLabel();
        roomsPanel = new javax.swing.JPanel();
        prices = new javax.swing.JLabel();
        boardsPanel = new javax.swing.JPanel();
        boardtypes = new javax.swing.JLabel();

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

        datePanel.setBackground(new java.awt.Color(255, 255, 255));
        datePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Date", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 24), new java.awt.Color(0, 153, 153))); // NOI18N

        daysTotal.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        daysTotal.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));
        daysTotal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 2, true));
        daysTotal.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                daysTotalStateChanged(evt);
            }
        });

        daysLabel.setBackground(new java.awt.Color(255, 255, 255));
        daysLabel.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        daysLabel.setForeground(new java.awt.Color(0, 153, 153));
        daysLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        daysLabel.setText("Days:");
        daysLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 2, true));

        calendar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 2, true));
        calendar.setForeground(new java.awt.Color(0, 153, 153));
        calendar.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        calendar.setMaxSelectableDate(new java.util.Date(253370768519000L));
        calendar.setMinSelectableDate(new java.util.Date(1515978119000L));

        javax.swing.GroupLayout datePanelLayout = new javax.swing.GroupLayout(datePanel);
        datePanel.setLayout(datePanelLayout);
        datePanelLayout.setHorizontalGroup(
            datePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(datePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calendar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(calendar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        roomPanel.setBackground(new java.awt.Color(255, 255, 255));
        roomPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Room Type", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 24), new java.awt.Color(0, 153, 153))); // NOI18N

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
        boardPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Board Type", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 24), new java.awt.Color(0, 153, 153))); // NOI18N

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

        pricePanel.setBackground(new java.awt.Color(255, 255, 255));
        pricePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pricing", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 24), new java.awt.Color(0, 153, 153))); // NOI18N

        buy.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        buy.setForeground(new java.awt.Color(0, 153, 153));
        buy.setText("Purchase");
        buy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyActionPerformed(evt);
            }
        });

        price.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        price.setForeground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout pricePanelLayout = new javax.swing.GroupLayout(pricePanel);
        pricePanel.setLayout(pricePanelLayout);
        pricePanelLayout.setHorizontalGroup(
            pricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(price, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pricePanelLayout.setVerticalGroup(
            pricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pricePanelLayout.createSequentialGroup()
                .addComponent(price, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buy))
        );

        roomsPanel.setBackground(new java.awt.Color(255, 255, 255));
        roomsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Rooms", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 24), new java.awt.Color(0, 153, 153))); // NOI18N

        prices.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N

        javax.swing.GroupLayout roomsPanelLayout = new javax.swing.GroupLayout(roomsPanel);
        roomsPanel.setLayout(roomsPanelLayout);
        roomsPanelLayout.setHorizontalGroup(
            roomsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roomsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(prices, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                .addContainerGap())
        );
        roomsPanelLayout.setVerticalGroup(
            roomsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(prices, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        boardsPanel.setBackground(new java.awt.Color(255, 255, 255));
        boardsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Boards", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 24), new java.awt.Color(0, 153, 153))); // NOI18N

        boardtypes.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N

        javax.swing.GroupLayout boardsPanelLayout = new javax.swing.GroupLayout(boardsPanel);
        boardsPanel.setLayout(boardsPanelLayout);
        boardsPanelLayout.setHorizontalGroup(
            boardsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boardsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boardtypes, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                .addContainerGap())
        );
        boardsPanelLayout.setVerticalGroup(
            boardsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(boardtypes, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout backLayout = new javax.swing.GroupLayout(back);
        back.setLayout(backLayout);
        backLayout.setHorizontalGroup(
            backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(top, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roomsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boardsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(pricePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        backLayout.setVerticalGroup(
            backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backLayout.createSequentialGroup()
                .addComponent(top, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(backLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(roomPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(datePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roomsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(backLayout.createSequentialGroup()
                            .addComponent(pricePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(94, 94, 94))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backLayout.createSequentialGroup()
                            .addComponent(boardsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(101, 101, 101)))
                    .addComponent(boardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

    private void daysTotalStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_daysTotalStateChanged
        updatePrice();
    }//GEN-LAST:event_daysTotalStateChanged

    private void buyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyActionPerformed
        Date day = calendar.getDate();
        System.out.println(day);
        int daysCount = Integer.parseInt(daysTotal.getValue().toString());
        String include_s = daysCount == 1 ? "" : "s";
        
        for (JPanel panel : jPanels) {
            panel.setVisible(false);
        }
        
        makeLabel("Thank you for your purchase!", 80, 80, 56);
        makeLabel(day.toString().substring(4, 10) + " - " + day.toString().substring(24, 28) + " (" + daysCount + " day" + include_s + ")", 230, 130, 32);
    }//GEN-LAST:event_buyActionPerformed

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
    private javax.swing.JPanel boardPanel;
    private javax.swing.ButtonGroup boards;
    private javax.swing.JPanel boardsPanel;
    private javax.swing.JLabel boardtypes;
    private javax.swing.JButton buy;
    private com.toedter.calendar.JDateChooser calendar;
    private javax.swing.JPanel datePanel;
    private javax.swing.JLabel daysLabel;
    private javax.swing.JSpinner daysTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel price;
    private javax.swing.JPanel pricePanel;
    private javax.swing.JLabel prices;
    private javax.swing.JLabel prices1;
    private javax.swing.JPanel roomPanel;
    private javax.swing.JPanel roomsPanel;
    private javax.swing.ButtonGroup tickets;
    private javax.swing.JPanel top;
    // End of variables declaration//GEN-END:variables
}
