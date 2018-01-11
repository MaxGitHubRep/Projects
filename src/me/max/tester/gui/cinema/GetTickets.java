package me.max.tester.gui.cinema;

import com.toedter.calendar.JCalendar;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JToggleButton;
import me.max.tester.managers.file.LFileReader;


public class GetTickets extends javax.swing.JFrame {
    
    protected String movieName;
    
    private JToggleButton[] buttons;
    LFileReader fr = new LFileReader();
    
    protected int getPrice() {
        int priceGet = 0;
        
        priceGet += (seat.getItemCount() - seat.getSelectedIndex())*5;
        priceGet += time.getSelectedIndex()/4;
        priceGet = priceGet * (Integer.parseInt(tickets.getValue().toString())+1);
        priceGet += parking.isSelected() ? 15 : 0;

        return priceGet;
    }
    
    protected void addNumbers() {
        for (int i = 6; i < 25; i++) {
            time.addItem(i + ":00");
        }
        
    }
    
    protected void formatButtons() {
        int index = 0;
        for(JToggleButton button : buttons) {
            index++;
            button.setText(fr.getLineFromFile("C_SCREENINGS", index));
        }
    }
    
    protected void formatPurchaseButton() {
        purchase.setText("Purchase: £" + getPrice() + ".00");
    }
    
    protected void updateMovieSelect() {
        for (JToggleButton button : buttons) {
            button.setIcon(null);
            if (button.isSelected()) {
                movieName = button.getText();
                //button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/me/max/tester/gui/cinema/resources/arrow.png")));
            }
        }
        
    }
    
    public GetTickets() {
        initComponents();
        buttons = new JToggleButton[] { s1, s2, s3, s4, s5 };
        formatButtons();
        addNumbers();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.ButtonGroup();
        back = new javax.swing.JPanel();
        top = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        bottom = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        screenBack = new javax.swing.JPanel();
        s1 = new javax.swing.JToggleButton();
        s2 = new javax.swing.JToggleButton();
        s3 = new javax.swing.JToggleButton();
        s4 = new javax.swing.JToggleButton();
        s5 = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        purchase = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        screenBack1 = new javax.swing.JPanel();
        seat = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tickets = new javax.swing.JSpinner();
        jCalendar2 = new com.toedter.calendar.JCalendar();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        time = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        parking = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("West End Cinema - Buy Tickets");

        back.setBackground(new java.awt.Color(255, 255, 255));

        top.setBackground(new java.awt.Color(204, 0, 0));

        title.setFont(new java.awt.Font("Agency FB", 1, 60)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("West End Cinema");

        javax.swing.GroupLayout topLayout = new javax.swing.GroupLayout(top);
        top.setLayout(topLayout);
        topLayout.setHorizontalGroup(
            topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 927, Short.MAX_VALUE)
                .addContainerGap())
        );
        topLayout.setVerticalGroup(
            topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
        );

        bottom.setBackground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout bottomLayout = new javax.swing.GroupLayout(bottom);
        bottom.setLayout(bottomLayout);
        bottomLayout.setHorizontalGroup(
            bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 951, Short.MAX_VALUE)
        );
        bottomLayout.setVerticalGroup(
            bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Screenings");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 2));

        screenBack.setBackground(new java.awt.Color(255, 255, 255));
        screenBack.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 2));

        s1.setBackground(new java.awt.Color(204, 0, 0));
        bg.add(s1);
        s1.setFont(new java.awt.Font("Agency FB", 1, 30)); // NOI18N
        s1.setForeground(new java.awt.Color(255, 255, 255));
        s1.setText("N/A");
        s1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        s1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s1ActionPerformed(evt);
            }
        });

        s2.setBackground(new java.awt.Color(204, 0, 0));
        bg.add(s2);
        s2.setFont(new java.awt.Font("Agency FB", 1, 30)); // NOI18N
        s2.setForeground(new java.awt.Color(255, 255, 255));
        s2.setText("N/A");
        s2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        s2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s2ActionPerformed(evt);
            }
        });

        s3.setBackground(new java.awt.Color(204, 0, 0));
        bg.add(s3);
        s3.setFont(new java.awt.Font("Agency FB", 1, 30)); // NOI18N
        s3.setForeground(new java.awt.Color(255, 255, 255));
        s3.setText("N/A");
        s3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        s3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s3ActionPerformed(evt);
            }
        });

        s4.setBackground(new java.awt.Color(204, 0, 0));
        bg.add(s4);
        s4.setFont(new java.awt.Font("Agency FB", 1, 30)); // NOI18N
        s4.setForeground(new java.awt.Color(255, 255, 255));
        s4.setText("N/A");
        s4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        s4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s4ActionPerformed(evt);
            }
        });

        s5.setBackground(new java.awt.Color(204, 0, 0));
        bg.add(s5);
        s5.setFont(new java.awt.Font("Agency FB", 1, 30)); // NOI18N
        s5.setForeground(new java.awt.Color(255, 255, 255));
        s5.setText("N/A");
        s5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        s5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout screenBackLayout = new javax.swing.GroupLayout(screenBack);
        screenBack.setLayout(screenBackLayout);
        screenBackLayout.setHorizontalGroup(
            screenBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(screenBackLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(screenBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(s1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(s2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(s3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(s4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(s5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        screenBackLayout.setVerticalGroup(
            screenBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(screenBackLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(s1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(s2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(s3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(s4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(s5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Details");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 2));

        purchase.setBackground(new java.awt.Color(204, 0, 0));
        purchase.setFont(new java.awt.Font("Agency FB", 1, 30)); // NOI18N
        purchase.setForeground(new java.awt.Color(255, 255, 255));
        purchase.setText("Purchase: £XX.00");
        purchase.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        purchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseActionPerformed(evt);
            }
        });

        screenBack1.setBackground(new java.awt.Color(255, 255, 255));
        screenBack1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 2));

        seat.setBackground(new java.awt.Color(204, 0, 0));
        seat.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        seat.setForeground(new java.awt.Color(255, 255, 255));
        seat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Royalty", "First Class", "Business Class", "Regular", "Standing" }));
        seat.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                seatItemStateChanged(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(204, 0, 0));
        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ticket Quantity");
        jLabel1.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(204, 0, 0));
        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Seat Type");
        jLabel2.setOpaque(true);

        tickets.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        tickets.setModel(new javax.swing.SpinnerNumberModel(1, 1, 20, 1));
        tickets.setToolTipText("Ticket Quantity");
        tickets.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 2));
        tickets.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ticketsStateChanged(evt);
            }
        });

        javax.swing.GroupLayout screenBack1Layout = new javax.swing.GroupLayout(screenBack1);
        screenBack1.setLayout(screenBack1Layout);
        screenBack1Layout.setHorizontalGroup(
            screenBack1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(screenBack1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(screenBack1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tickets)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(seat, 0, 317, Short.MAX_VALUE))
                .addContainerGap())
        );
        screenBack1Layout.setVerticalGroup(
            screenBack1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(screenBack1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tickets, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seat, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Seating", screenBack1);

        jCalendar2.setBackground(new java.awt.Color(255, 255, 255));
        jCalendar2.setForeground(new java.awt.Color(204, 0, 0));
        jCalendar2.setToolTipText("");
        jCalendar2.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jCalendar2.setMaxSelectableDate(new java.util.Date(1546218072000L));
        jCalendar2.setMinSelectableDate(new java.util.Date(1515718872000L));
        jCalendar2.setNullDateButtonText("");
        jCalendar2.setTodayButtonText("Today's Date");
        jCalendar2.setTodayButtonVisible(true);
        jCalendar2.setWeekOfYearVisible(false);
        jTabbedPane1.addTab("Date", jCalendar2);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 2));

        jLabel5.setBackground(new java.awt.Color(204, 0, 0));
        jLabel5.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Time");
        jLabel5.setOpaque(true);

        time.setBackground(new java.awt.Color(204, 0, 0));
        time.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        time.setForeground(new java.awt.Color(255, 255, 255));
        time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(time, 0, 317, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Time", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 2));

        parking.setBackground(new java.awt.Color(255, 255, 255));
        parking.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        parking.setForeground(new java.awt.Color(204, 0, 0));
        parking.setSelected(true);
        parking.setText("Parking (+£15.00)");
        parking.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 2));
        parking.setBorderPainted(true);
        parking.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        parking.setIconTextGap(8);
        parking.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                parkingItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(parking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(13, 13, 13))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(parking, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(147, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Extras", jPanel2);

        javax.swing.GroupLayout backLayout = new javax.swing.GroupLayout(back);
        back.setLayout(backLayout);
        backLayout.setHorizontalGroup(
            backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(top, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bottom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
                    .addComponent(screenBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1)
                    .addComponent(purchase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backLayout.setVerticalGroup(
            backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backLayout.createSequentialGroup()
                .addComponent(top, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(screenBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(backLayout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(purchase, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bottom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void purchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseActionPerformed
        try {
            new Methods().printReceipt(movieName, time.getSelectedItem().toString(), seat.getSelectedItem().toString() ,tickets.getValue().toString(), getPrice(), parking.isSelected());
        } catch (IOException ex) {
            Logger.getLogger(GetTickets.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_purchaseActionPerformed

    private void timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeActionPerformed
        formatPurchaseButton();
    }//GEN-LAST:event_timeActionPerformed

    private void parkingItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_parkingItemStateChanged
        formatPurchaseButton();
    }//GEN-LAST:event_parkingItemStateChanged

    private void s1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s1ActionPerformed
        updateMovieSelect();
    }//GEN-LAST:event_s1ActionPerformed

    private void s2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s2ActionPerformed
        updateMovieSelect();
    }//GEN-LAST:event_s2ActionPerformed

    private void s3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s3ActionPerformed
        updateMovieSelect();
    }//GEN-LAST:event_s3ActionPerformed

    private void s4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s4ActionPerformed
        updateMovieSelect();
    }//GEN-LAST:event_s4ActionPerformed

    private void s5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s5ActionPerformed
        updateMovieSelect();
    }//GEN-LAST:event_s5ActionPerformed

    private void seatItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_seatItemStateChanged
        formatPurchaseButton();
    }//GEN-LAST:event_seatItemStateChanged

    private void ticketsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ticketsStateChanged
        formatPurchaseButton();
    }//GEN-LAST:event_ticketsStateChanged

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
            java.util.logging.Logger.getLogger(GetTickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GetTickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GetTickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GetTickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GetTickets().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel back;
    private javax.swing.ButtonGroup bg;
    private javax.swing.JPanel bottom;
    private com.toedter.calendar.JCalendar jCalendar2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton parking;
    private javax.swing.JButton purchase;
    private javax.swing.JToggleButton s1;
    private javax.swing.JToggleButton s2;
    private javax.swing.JToggleButton s3;
    private javax.swing.JToggleButton s4;
    private javax.swing.JToggleButton s5;
    private javax.swing.JPanel screenBack;
    private javax.swing.JPanel screenBack1;
    private javax.swing.JComboBox<String> seat;
    private javax.swing.JSpinner tickets;
    private javax.swing.JComboBox<String> time;
    private javax.swing.JLabel title;
    private javax.swing.JPanel top;
    // End of variables declaration//GEN-END:variables
}
