/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.max.tester.gui.cinema;

import me.max.tester.gui.cinema.LogIn;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JTextField;
import me.max.tester.managers.file.LFileReader;
import me.max.tester.managers.file.LFileWriter;

/**
 *
 * @author mc170171
 */
public class Methods {
    
    protected static String user;
    
    protected String getStringFromChar(char[] pw) {
        String text = "";
        for (char item : pw) {
            text = text + item;
        }
        return text;
    }
    
    protected boolean isSet(JTextField field) {
        return !field.getText().equals("");
    }
    
    protected void enableButton(JButton button) {
        button.setForeground(Color.GREEN);
        button.setEnabled(true);
    }
    
    protected void disableButton(JButton button) {
        button.setForeground(Color.RED);
        button.setEnabled(false);
    }
    
    protected void buttonStatus(boolean bool, JButton button) {
        if (bool) {
            enableButton(button);
        } else {
            disableButton(button);
        }
    }
    
    protected boolean fieldsSet(JTextField[] fields) { //checks a condition(s) to toggle button status.
        for (JTextField field : fields) {
            if (!isSet(field)) {
                return false;
            }
        }
        return true;
    }
    
    protected void resetField(JTextField[] fields) {
        for (JTextField field : fields) {
            field.setText("");
        }
    }
    
    protected void printReceipt(String movie, String time, String seat, String quantity, int price, boolean parking) throws IOException {
        int width = 800;
        int height = 500;

        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D gd = bufferedImage.createGraphics();

        gd.setColor(Color.white);
        gd.fillRect(0, 0, width, height);
        gd.setColor(new Color(204, 0, 0));
        gd.fillRect(0, 0, width, 100);
        gd.fillRect(0, height-100, width, 100);
        
        gd.setColor(Color.white);
        gd.setFont(new Font("Agency FB", Font.BOLD, 70));
        gd.drawString("West End Cinema", 200, 80);
        
        gd.setColor(new Color(204, 0, 0));
        gd.setFont(new Font("Agency FB", Font.BOLD, 40));
        
        int index = 145;
        for (String item : new String[] { "Receipt for: " + movie, "Time: " + time, "Seat Type: " + seat, "Quantity: x" + quantity, "Pricing: £" + price + ".00 " + (parking ? "(Parking Included + £15.00)" : "")}) {
            gd.drawString(item, 80, index);
            index+=60;
        }
        
        gd.dispose();
        
        File file = new File("receipt.jpg");
        ImageIO.write(bufferedImage, "jpg", file);
        
        PrinterJob printJob = PrinterJob.getPrinterJob();
        printJob.setPrintable(new Printable() {
            public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
                    if (pageIndex != 0) {
                        return NO_SUCH_PAGE;
                    }
                    graphics.drawImage(null, 0, 0, width, height, null);
                    
                    gd.setColor(Color.white);
                    gd.fillRect(0, 0, width, height);
                    gd.setColor(Color.BLACK);
                    gd.fillRect(0, 0, width, 100);
                    gd.fillRect(0, height-100, width, 100);

                    gd.setColor(Color.white);
                    gd.setFont(new Font("Agency FB", Font.BOLD, 70));
                    gd.drawString("West End Cinema", 200, 80);

                    gd.setColor(Color.BLACK);
                    gd.setFont(new Font("Agency FB", Font.BOLD, 40));

                    int index = 145;
                    for (String item : new String[] { "Receipt for: " + movie, "Time: " + time, "Seat Type: " + seat, "Quantity: x" + quantity, "Pricing: £" + price + ".00 " + (parking ? "(Parking Included + £15.00)" : "")}) {
                        gd.drawString(item, 80, index);
                        index+=60;
                    }

                    gd.dispose();
                    
                    return PAGE_EXISTS;
            }
        });  
        
        try {
            printJob.print();
        } catch (PrinterException e1) {             
            e1.printStackTrace();
        }
        
        new LFileWriter().writeToFile(user + "!-!-!" + movie + "!-!-!" + time + "!-!-!" + seat + "!-!-!" + quantity + "!-!-!" + parking + "!-!-!" + price, "C_BOOKINGS", true);
        
    }
    
    public static void main(String[] args) {
        if (new LFileReader().getLineFromFile("C_USERDATA", 1).contains("!-!-!")) {
            new LogIn().setVisible(true);
        } else {
            new Register().setVisible(true);
        }
    }
}
