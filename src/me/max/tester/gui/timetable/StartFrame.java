/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.max.tester.gui.timetable;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import me.max.tester.managers.system.SystemExit;

/**
 *
 * @author Max
 */
public class StartFrame extends javax.swing.JFrame {

    protected void startTask() { // starts everything
        
        
        
    }
    
    
    
    /**
     * Creates new form StartFrame
     */
    public StartFrame() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/me/max/tester/gui/timetable/resources/images/reigate_college_icon.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        banner = new javax.swing.JLabel();
        bottom = new javax.swing.JPanel();
        credits = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        mBar = new javax.swing.JMenuBar();
        mBarOptions = new javax.swing.JMenu();
        mBarGetStarted = new javax.swing.JMenuItem();
        mBarAbout = new javax.swing.JMenuItem();
        mBarExit = new javax.swing.JMenuItem();
        mBarSettings = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(204, 204, 255));
        background.setForeground(new java.awt.Color(204, 204, 255));

        banner.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        banner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/me/max/tester/gui/timetable/resources/background/rcbanner.PNG"))); // NOI18N
        banner.setText("picHold");

        bottom.setBackground(new java.awt.Color(0, 0, 0));

        credits.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        credits.setForeground(new java.awt.Color(153, 153, 153));
        credits.setText("Created: Max Carter - Source: GitHub");

        javax.swing.GroupLayout bottomLayout = new javax.swing.GroupLayout(bottom);
        bottom.setLayout(bottomLayout);
        bottomLayout.setHorizontalGroup(
            bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomLayout.createSequentialGroup()
                .addComponent(credits, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        bottomLayout.setVerticalGroup(
            bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottomLayout.createSequentialGroup()
                .addGap(0, 122, Short.MAX_VALUE)
                .addComponent(credits))
        );

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1093, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 524, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bottom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(banner, javax.swing.GroupLayout.PREFERRED_SIZE, 1419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addComponent(banner)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(bottom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        mBarOptions.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mBarOptions.setForeground(new java.awt.Color(255, 51, 51));
        mBarOptions.setText("Options");
        mBarOptions.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N

        mBarGetStarted.setText("Get Started!");
        mBarGetStarted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBarGetStartedActionPerformed(evt);
            }
        });
        mBarOptions.add(mBarGetStarted);

        mBarAbout.setText("About");
        mBarAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBarAboutActionPerformed(evt);
            }
        });
        mBarOptions.add(mBarAbout);

        mBarExit.setText("Exit");
        mBarExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBarExitActionPerformed(evt);
            }
        });
        mBarOptions.add(mBarExit);

        mBar.add(mBarOptions);

        mBarSettings.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mBarSettings.setForeground(new java.awt.Color(255, 51, 51));
        mBarSettings.setText("Settings");
        mBarSettings.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        mBar.add(mBarSettings);

        setJMenuBar(mBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mBarExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBarExitActionPerformed
        new SystemExit().exitProgram();
        this.dispose();
    }//GEN-LAST:event_mBarExitActionPerformed

    private void mBarAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBarAboutActionPerformed
        JOptionPane.showMessageDialog(null, "Created: Max Carter\nDate: 31/10/17\nSource: GitHub");
    }//GEN-LAST:event_mBarAboutActionPerformed

    private void mBarGetStartedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBarGetStartedActionPerformed
        startTask();
    }//GEN-LAST:event_mBarGetStartedActionPerformed

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
            java.util.logging.Logger.getLogger(StartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JLabel banner;
    private javax.swing.JPanel bottom;
    private javax.swing.JLabel credits;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar mBar;
    private javax.swing.JMenuItem mBarAbout;
    private javax.swing.JMenuItem mBarExit;
    private javax.swing.JMenuItem mBarGetStarted;
    private javax.swing.JMenu mBarOptions;
    private javax.swing.JMenu mBarSettings;
    // End of variables declaration//GEN-END:variables
}
