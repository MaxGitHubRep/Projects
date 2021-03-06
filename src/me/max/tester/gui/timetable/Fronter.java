/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.max.tester.gui.timetable;

import java.awt.Color;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import me.max.tester.managers.file.LFileReader;
import me.max.tester.managers.file.LFileWriter;
import me.max.tester.managers.system.SystemExit;
import me.max.tester.managers.time.DateTime;
import me.max.tester.managers.time.DayOfWeek;

/**
 *
 * @author Mc170171
 */
public class Fronter extends javax.swing.JFrame {

    // variables
    
    protected boolean signedIn;
    protected final static String fileNameSettingsSavePW = "ttSavePW";
    protected final static String fileNameSettingsUpdateClock = "ttUpdateClock";
    
    protected final static LFileWriter fw = new LFileWriter();
    protected final static LFileReader fr = new LFileReader();
    
    private DateTime dt = new DateTime();
    private DayOfWeek dow = new DayOfWeek();
    
    
    // methods
    
  /*  protected HashMap<Integer, String> getTimeTableMap() {
        
        HashMap<Integer, String> map = new HashMap<>();
        
        map.put(1, "Computer Science;11:40+Maths;15:10"); //mon
        map.put(2, "Computer Science;09:00+Computer Science;10:10+Economics;11:40+Tutor;12:45"); //tue
        map.put(3, "Computer Science;11:40+Maths;15:10"); //wed
        map.put(4, "Computer Science;11:40+Maths;15:10"); //thu
        map.put(5, "Computer Science;11:40+Maths;15:10"); //fri
     
        return map;
    }*/
    
    protected void removePasswordFields() {
        
        pWordField.setVisible(false);
        pWordPrompt.setVisible(false);
        updateButton.setVisible(false);
        signedIn = true;
        scheduleRunTask();
        startPath();
        
    }
    
    protected void setSavePWFalse() {
        fw.writeToFile("false", fileNameSettingsSavePW, false);
        mBarOptionsSettingsSavePW.setForeground(Color.red);

    }
    
    protected void setSavePWTrue() {
        fw.writeToFile("true", fileNameSettingsSavePW, false);
        mBarOptionsSettingsSavePW.setForeground(Color.green);

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
    
    protected void scheduleRunTask() {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        executor.scheduleAtFixedRate(doRunTask, 0, 1, TimeUnit.SECONDS);      
    }
    
    Runnable doRunTask = new Runnable() {
        public void run() {
            updateTimeData();
        }
    };
    
    protected void updateTimeData() {

        String dateTime = dt.getDateTime();
        String dayStr = dow.getDayStr();
        int dayNum = dow.getDayNum();

        String[] temp = dateTime.split(" ");
        dateLabel.setText("Date: " + temp[1]);
        timeLabel.setText("Time: " + temp[0]);
        dayLabel.setText("Day: "+dayStr);

        if (dayNum == 1 || dayNum == 7) {
            pBarSet(120);

        } else {

            String[] hourStr = temp[0].split(":");
            int hour = Integer.parseInt(hourStr[0]);
            int use = (dayNum-2)*24 + hour;
            pBarSet(use);

        }
        
    }
    
    protected void startPath() {
        
        if (signedIn != true) {
            pWordPrompt.setText("Enter Password!");
            pWordPrompt.setForeground(Color.red);
            
        } else {
            pBarDefine();

            updateTimeData();
            
        }    
            
    }
    
    protected void pBarDefine() {
        pBar.setMaximum(120);
        pBar.setMinimum(0);
    }
    
    protected void pBarSet(int percent) {
        pBar.setValue(percent);
    } 
    
    /**
     * Creates new form Fronter
     */
    public Fronter() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/me/max/tester/gui/hangman/resources/titlescreen/hangman.png")).getImage());
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
        pBar = new javax.swing.JProgressBar();
        pBarFriday = new javax.swing.JLabel();
        pBarMonday = new javax.swing.JLabel();
        dayLabel = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        pWordField = new javax.swing.JPasswordField();
        pWordPrompt = new javax.swing.JLabel();
        updateButton = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        banner = new javax.swing.JLabel();
        bottom = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        mBearOptions = new javax.swing.JMenu();
        mBarFileUpdate = new javax.swing.JMenuItem();
        pBarOptionsSettings = new javax.swing.JMenu();
        mBarOptionsSettingsClockUpdate = new javax.swing.JMenuItem();
        mBarOptionsSettingsColour = new javax.swing.JMenu();
        mBarOptionsSettingColourBlue = new javax.swing.JMenuItem();
        mBarOptionsSettingColourPurple = new javax.swing.JMenuItem();
        mBarOptionsSettingColourGreen = new javax.swing.JMenuItem();
        mBarOptionsSettingsColourWhite = new javax.swing.JMenuItem();
        mBarOptionsSettingsColourRed = new javax.swing.JMenuItem();
        mBarOptionsSettingsSavePW = new javax.swing.JMenuItem();
        mBarOptionsAbout = new javax.swing.JMenuItem();
        mBarOptionsExit = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reigate College - Timetable");
        setResizable(false);

        background.setBackground(new java.awt.Color(204, 204, 255));
        background.setToolTipText("");

        pBarFriday.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        pBarFriday.setForeground(new java.awt.Color(255, 51, 0));
        pBarFriday.setText("Weekend!");

        pBarMonday.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        pBarMonday.setForeground(new java.awt.Color(255, 51, 0));
        pBarMonday.setText("Monday...");

        dayLabel.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        dayLabel.setForeground(new java.awt.Color(255, 51, 51));
        dayLabel.setText("Day: d");

        timeLabel.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        timeLabel.setForeground(new java.awt.Color(255, 51, 51));
        timeLabel.setText("Time: ss:mm:hh");

        dateLabel.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        dateLabel.setForeground(new java.awt.Color(255, 51, 51));
        dateLabel.setText("Date: dd/MM/yyyy");

        pWordField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        pWordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pWordFieldActionPerformed(evt);
            }
        });

        pWordPrompt.setFont(new java.awt.Font("Agency FB", 2, 18)); // NOI18N
        pWordPrompt.setText("Enter password to continue!");

        updateButton.setFont(new java.awt.Font("Agency FB", 3, 36)); // NOI18N
        updateButton.setForeground(new java.awt.Color(255, 51, 51));
        updateButton.setText("Update!");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        titleLabel.setFont(new java.awt.Font("Agency FB", 1, 56)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(0, 153, 0));
        titleLabel.setText("Timetable - Max Carter [MC170171]");

        banner.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        banner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/me/max/tester/gui/timetable/resources/background/rcbanner.PNG"))); // NOI18N
        banner.setText("picHold");

        bottom.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout bottomLayout = new javax.swing.GroupLayout(bottom);
        bottom.setLayout(bottomLayout);
        bottomLayout.setHorizontalGroup(
            bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        bottomLayout.setVerticalGroup(
            bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 138, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 458, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(titleLabel)
                        .addGap(64, 64, 64))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pWordField)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addComponent(pWordPrompt, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(393, 393, 393)))
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(pBarMonday)
                        .addGap(18, 18, 18)
                        .addComponent(pBar, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pBarFriday))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                        .addComponent(dayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dateLabel))
                    .addComponent(jDesktopPane1))
                .addGap(38, 38, 38))
            .addComponent(bottom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(banner, javax.swing.GroupLayout.PREFERRED_SIZE, 1419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addComponent(banner)
                .addGap(26, 26, 26)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addComponent(pWordField, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pWordPrompt))
                            .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pBar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pBarFriday, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pBarMonday, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dayLabel)
                            .addComponent(timeLabel)
                            .addComponent(dateLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDesktopPane1)))
                .addGap(18, 18, 18)
                .addComponent(bottom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        menuBar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        mBearOptions.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mBearOptions.setForeground(new java.awt.Color(255, 51, 51));
        mBearOptions.setText("Options");
        mBearOptions.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N

        mBarFileUpdate.setText("   Update   ");
        mBarFileUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBarFileUpdateActionPerformed(evt);
            }
        });
        mBearOptions.add(mBarFileUpdate);

        pBarOptionsSettings.setText("   Settings   ");

        mBarOptionsSettingsClockUpdate.setText("   Clock Update   ");
        pBarOptionsSettings.add(mBarOptionsSettingsClockUpdate);

        mBarOptionsSettingsColour.setText("   Colour   ");

        mBarOptionsSettingColourBlue.setFont(new java.awt.Font("Agency FB", 1, 15)); // NOI18N
        mBarOptionsSettingColourBlue.setForeground(new java.awt.Color(51, 153, 255));
        mBarOptionsSettingColourBlue.setText("   Blue");
        mBarOptionsSettingColourBlue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBarOptionsSettingColourBlueActionPerformed(evt);
            }
        });
        mBarOptionsSettingsColour.add(mBarOptionsSettingColourBlue);

        mBarOptionsSettingColourPurple.setBackground(new java.awt.Color(204, 204, 255));
        mBarOptionsSettingColourPurple.setFont(new java.awt.Font("Agency FB", 1, 15)); // NOI18N
        mBarOptionsSettingColourPurple.setForeground(new java.awt.Color(204, 204, 255));
        mBarOptionsSettingColourPurple.setText("   Purple (Default)");
        mBarOptionsSettingColourPurple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBarOptionsSettingColourPurpleActionPerformed(evt);
            }
        });
        mBarOptionsSettingsColour.add(mBarOptionsSettingColourPurple);

        mBarOptionsSettingColourGreen.setFont(new java.awt.Font("Agency FB", 1, 15)); // NOI18N
        mBarOptionsSettingColourGreen.setForeground(new java.awt.Color(204, 255, 204));
        mBarOptionsSettingColourGreen.setText("   Green");
        mBarOptionsSettingColourGreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBarOptionsSettingColourGreenActionPerformed(evt);
            }
        });
        mBarOptionsSettingsColour.add(mBarOptionsSettingColourGreen);

        mBarOptionsSettingsColourWhite.setFont(new java.awt.Font("Agency FB", 1, 15)); // NOI18N
        mBarOptionsSettingsColourWhite.setForeground(new java.awt.Color(255, 255, 255));
        mBarOptionsSettingsColourWhite.setText("   White");
        mBarOptionsSettingsColourWhite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBarOptionsSettingsColourWhiteActionPerformed(evt);
            }
        });
        mBarOptionsSettingsColour.add(mBarOptionsSettingsColourWhite);

        mBarOptionsSettingsColourRed.setFont(new java.awt.Font("Agency FB", 1, 15)); // NOI18N
        mBarOptionsSettingsColourRed.setForeground(new java.awt.Color(255, 102, 102));
        mBarOptionsSettingsColourRed.setText("   Red");
        mBarOptionsSettingsColourRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBarOptionsSettingsColourRedActionPerformed(evt);
            }
        });
        mBarOptionsSettingsColour.add(mBarOptionsSettingsColourRed);

        pBarOptionsSettings.add(mBarOptionsSettingsColour);

        mBarOptionsSettingsSavePW.setText("   Remember Password");
        mBarOptionsSettingsSavePW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBarOptionsSettingsSavePWActionPerformed(evt);
            }
        });
        pBarOptionsSettings.add(mBarOptionsSettingsSavePW);

        mBearOptions.add(pBarOptionsSettings);

        mBarOptionsAbout.setText("   About   ");
        mBarOptionsAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBarOptionsAboutActionPerformed(evt);
            }
        });
        mBearOptions.add(mBarOptionsAbout);

        mBarOptionsExit.setText("   Exit   ");
        mBarOptionsExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBarOptionsExitActionPerformed(evt);
            }
        });
        mBearOptions.add(mBarOptionsExit);
        mBearOptions.add(jSeparator1);

        menuBar.add(mBearOptions);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 1419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pWordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pWordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pWordFieldActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // Update Button
        
        char[] pw = pWordField.getPassword();
        char[] correct = new char[] {'y', 'e', 's'};
        
        if (Arrays.equals(pw, correct)) {
            removePasswordFields();
            
        } else {
            pWordPrompt.setText("Wrong password!");
            pWordPrompt.setForeground(Color.red);
            pWordField.requestFocusInWindow();
            
        }
        
    }//GEN-LAST:event_updateButtonActionPerformed

    private void mBarFileUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBarFileUpdateActionPerformed
        startPath();
    }//GEN-LAST:event_mBarFileUpdateActionPerformed

    private void mBarOptionsExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBarOptionsExitActionPerformed
        SystemExit se = new SystemExit();
        se.exitProgram();
        this.dispose();
    }//GEN-LAST:event_mBarOptionsExitActionPerformed

    private void mBarOptionsAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBarOptionsAboutActionPerformed
        JOptionPane.showMessageDialog(null, "Created: Max Carter\nDate: 31/10/17\nSource: GitHub");
        
    }//GEN-LAST:event_mBarOptionsAboutActionPerformed

    private void mBarOptionsSettingColourBlueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBarOptionsSettingColourBlueActionPerformed
        setBackgroundColour("blue");
    }//GEN-LAST:event_mBarOptionsSettingColourBlueActionPerformed

    private void mBarOptionsSettingsColourWhiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBarOptionsSettingsColourWhiteActionPerformed
        setBackgroundColour("white");
    }//GEN-LAST:event_mBarOptionsSettingsColourWhiteActionPerformed

    private void mBarOptionsSettingColourPurpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBarOptionsSettingColourPurpleActionPerformed
        setBackgroundColour("purple");
    }//GEN-LAST:event_mBarOptionsSettingColourPurpleActionPerformed

    private void mBarOptionsSettingColourGreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBarOptionsSettingColourGreenActionPerformed
        setBackgroundColour("green");
    }//GEN-LAST:event_mBarOptionsSettingColourGreenActionPerformed

    private void mBarOptionsSettingsColourRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBarOptionsSettingsColourRedActionPerformed
        setBackgroundColour("red");
    }//GEN-LAST:event_mBarOptionsSettingsColourRedActionPerformed

    private void mBarOptionsSettingsSavePWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBarOptionsSettingsSavePWActionPerformed
        if (fr.getFileContent(fileNameSettingsSavePW).toString().contains("true")) {
            setSavePWFalse();
        } else {
            setSavePWTrue();
        }
    }//GEN-LAST:event_mBarOptionsSettingsSavePWActionPerformed

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
            java.util.logging.Logger.getLogger(Fronter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fronter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fronter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fronter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Fronter().setVisible(true);
                
                if (fr.getFileContent(fileNameSettingsSavePW).toString().contains("true")) {
                    new Fronter().setSavePWTrue();
                    new Fronter().removePasswordFields();
                    System.out.println("access yes");
                } else {
                    new Fronter().setSavePWFalse();
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JLabel banner;
    private javax.swing.JPanel bottom;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JLabel dayLabel;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem mBarFileUpdate;
    private javax.swing.JMenuItem mBarOptionsAbout;
    private javax.swing.JMenuItem mBarOptionsExit;
    private javax.swing.JMenuItem mBarOptionsSettingColourBlue;
    private javax.swing.JMenuItem mBarOptionsSettingColourGreen;
    private javax.swing.JMenuItem mBarOptionsSettingColourPurple;
    private javax.swing.JMenuItem mBarOptionsSettingsClockUpdate;
    private javax.swing.JMenu mBarOptionsSettingsColour;
    private javax.swing.JMenuItem mBarOptionsSettingsColourRed;
    private javax.swing.JMenuItem mBarOptionsSettingsColourWhite;
    private javax.swing.JMenuItem mBarOptionsSettingsSavePW;
    private javax.swing.JMenu mBearOptions;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JProgressBar pBar;
    private javax.swing.JLabel pBarFriday;
    private javax.swing.JLabel pBarMonday;
    private javax.swing.JMenu pBarOptionsSettings;
    private javax.swing.JPasswordField pWordField;
    private javax.swing.JLabel pWordPrompt;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
