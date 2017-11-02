/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.max.tester.gui.timetable;

import java.awt.Color;
import java.awt.color.ColorSpace;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import me.max.tester.managers.system.SystemExit;

/**
 *
 * @author Max
 */
public class StartFrame extends javax.swing.JFrame {

    protected void startTask() { // starts everything
        
        
        
    }
    
    protected void setBackgroundColour(String col) {
        
        switch (col) {
            case "red":
                background.setBackground(new Color(255, 102, 102));
                break;
            case "purple":
                background.setBackground(new Color(204, 204, 255));
                break;
            case "grey":
                background.setBackground(new Color(240, 240, 240));
                break;
            case "blue":
                background.setBackground(new Color(51, 153, 255));
                break;
            case "green":
                background.setBackground(new Color(204, 255, 204));
                break;
            case "white":
                background.setBackground(new Color(255, 255, 255));
                break;
            default:
                background.setBackground(new Color(255, 255, 102));
                break;
            
        }
    
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
        desktop = new javax.swing.JDesktopPane();
        mBar = new javax.swing.JMenuBar();
        mBarOptions = new javax.swing.JMenu();
        mBarGetStarted = new javax.swing.JMenuItem();
        mBarAbout = new javax.swing.JMenuItem();
        mBarExit = new javax.swing.JMenuItem();
        mBarSettings = new javax.swing.JMenu();
        mBarColourChoser = new javax.swing.JMenu();
        mBarOptionsSettingsColourRed = new javax.swing.JMenuItem();
        mBarOptionsSettingsColourWhite = new javax.swing.JMenuItem();
        mBarOptionsSettingColourGreen = new javax.swing.JMenuItem();
        mBarOptionsSettingColourPurple = new javax.swing.JMenuItem();
        mBarOptionsSettingColourBlue = new javax.swing.JMenuItem();
        mBarCustomColour = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reigate College • Timetable");

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

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1093, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addComponent(banner)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(bottom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        mBar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mBar.setName(""); // NOI18N

        mBarOptions.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mBarOptions.setForeground(new java.awt.Color(255, 51, 51));
        mBarOptions.setText("Options");
        mBarOptions.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N

        mBarGetStarted.setText("   Get Started!   ");
        mBarGetStarted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBarGetStartedActionPerformed(evt);
            }
        });
        mBarOptions.add(mBarGetStarted);

        mBarAbout.setText("   About   ");
        mBarAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBarAboutActionPerformed(evt);
            }
        });
        mBarOptions.add(mBarAbout);

        mBarExit.setText("   Exit   ");
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

        mBarColourChoser.setText("   Background Colour    ");

        mBarOptionsSettingsColourRed.setFont(new java.awt.Font("Agency FB", 1, 15)); // NOI18N
        mBarOptionsSettingsColourRed.setForeground(new java.awt.Color(255, 102, 102));
        mBarOptionsSettingsColourRed.setText("   Red");
        mBarOptionsSettingsColourRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBarOptionsSettingsColourRedActionPerformed(evt);
            }
        });
        mBarColourChoser.add(mBarOptionsSettingsColourRed);

        mBarOptionsSettingsColourWhite.setFont(new java.awt.Font("Agency FB", 1, 15)); // NOI18N
        mBarOptionsSettingsColourWhite.setForeground(new java.awt.Color(255, 255, 255));
        mBarOptionsSettingsColourWhite.setText("   White");
        mBarOptionsSettingsColourWhite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBarOptionsSettingsColourWhiteActionPerformed(evt);
            }
        });
        mBarColourChoser.add(mBarOptionsSettingsColourWhite);

        mBarOptionsSettingColourGreen.setFont(new java.awt.Font("Agency FB", 1, 15)); // NOI18N
        mBarOptionsSettingColourGreen.setForeground(new java.awt.Color(204, 255, 204));
        mBarOptionsSettingColourGreen.setText("   Green");
        mBarOptionsSettingColourGreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBarOptionsSettingColourGreenActionPerformed(evt);
            }
        });
        mBarColourChoser.add(mBarOptionsSettingColourGreen);

        mBarOptionsSettingColourPurple.setBackground(new java.awt.Color(204, 204, 255));
        mBarOptionsSettingColourPurple.setFont(new java.awt.Font("Agency FB", 1, 15)); // NOI18N
        mBarOptionsSettingColourPurple.setForeground(new java.awt.Color(204, 204, 255));
        mBarOptionsSettingColourPurple.setText("   Purple (Default)");
        mBarOptionsSettingColourPurple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBarOptionsSettingColourPurpleActionPerformed(evt);
            }
        });
        mBarColourChoser.add(mBarOptionsSettingColourPurple);

        mBarOptionsSettingColourBlue.setFont(new java.awt.Font("Agency FB", 1, 15)); // NOI18N
        mBarOptionsSettingColourBlue.setForeground(new java.awt.Color(51, 153, 255));
        mBarOptionsSettingColourBlue.setText("   Blue");
        mBarOptionsSettingColourBlue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBarOptionsSettingColourBlueActionPerformed(evt);
            }
        });
        mBarColourChoser.add(mBarOptionsSettingColourBlue);

        mBarCustomColour.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        mBarCustomColour.setText("   Custom Colour   ");
        mBarCustomColour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBarCustomColourActionPerformed(evt);
            }
        });
        mBarColourChoser.add(mBarCustomColour);

        mBarSettings.add(mBarColourChoser);

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

    private void mBarOptionsSettingsColourRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBarOptionsSettingsColourRedActionPerformed
        setBackgroundColour("red");
    }//GEN-LAST:event_mBarOptionsSettingsColourRedActionPerformed

    private void mBarOptionsSettingsColourWhiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBarOptionsSettingsColourWhiteActionPerformed
        setBackgroundColour("white");
    }//GEN-LAST:event_mBarOptionsSettingsColourWhiteActionPerformed

    private void mBarOptionsSettingColourGreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBarOptionsSettingColourGreenActionPerformed
        setBackgroundColour("green");
    }//GEN-LAST:event_mBarOptionsSettingColourGreenActionPerformed

    private void mBarOptionsSettingColourPurpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBarOptionsSettingColourPurpleActionPerformed
        setBackgroundColour("purple");
    }//GEN-LAST:event_mBarOptionsSettingColourPurpleActionPerformed

    private void mBarOptionsSettingColourBlueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBarOptionsSettingColourBlueActionPerformed
        setBackgroundColour("blue");
    }//GEN-LAST:event_mBarOptionsSettingColourBlueActionPerformed

    private void mBarCustomColourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBarCustomColourActionPerformed
        // custom colour
        
        Color colourPick = JColorChooser.showDialog(null, "Choose a color", Color.RED).darker();
        background.setBackground(new Color(colourPick.getRed(), colourPick.getGreen(), colourPick.getBlue()));
        mBarCustomColour.setForeground(new Color(colourPick.getRed(), colourPick.getGreen(), colourPick.getBlue()));
        
    }//GEN-LAST:event_mBarCustomColourActionPerformed

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
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenuBar mBar;
    private javax.swing.JMenuItem mBarAbout;
    private javax.swing.JMenu mBarColourChoser;
    private javax.swing.JMenuItem mBarCustomColour;
    private javax.swing.JMenuItem mBarExit;
    private javax.swing.JMenuItem mBarGetStarted;
    private javax.swing.JMenu mBarOptions;
    private javax.swing.JMenuItem mBarOptionsSettingColourBlue;
    private javax.swing.JMenuItem mBarOptionsSettingColourGreen;
    private javax.swing.JMenuItem mBarOptionsSettingColourPurple;
    private javax.swing.JMenuItem mBarOptionsSettingsColourRed;
    private javax.swing.JMenuItem mBarOptionsSettingsColourWhite;
    private javax.swing.JMenu mBarSettings;
    // End of variables declaration//GEN-END:variables
}
