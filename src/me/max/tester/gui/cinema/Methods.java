/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.max.tester.gui.cinema;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JTextField;
import me.max.tester.managers.file.LFileReader;

/**
 *
 * @author mc170171
 */
public class Methods {
    
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
    
    protected void cButton(JTextField[] fields, JButton button) { //checks a condition(s) to toggle button status.
        boolean tester = false;
        for (JTextField field : fields) {
            if (!isSet(field)) {
                disableButton(button);
                tester = true;
                break;
            }
        }
        if (!tester) enableButton(button);
    }
    
    protected void resetField(JTextField[] fields) {
        for (JTextField field : fields) {
            field.setText("");
        }
    }
    
    protected void printReceipt() throws IOException {
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
        gd.setFont(new Font("Agency FB", Font.BOLD, 30));
        gd.drawString("Receipt for: Ryan and The CPU Cooler", 80, 154);
        
        gd.dispose();
        
        File file = new File("receipt.png");
        ImageIO.write(bufferedImage, "png", file);
    }
    
    public static void main(String[] args) {
        if (new LFileReader().getLineFromFile("C_USERDATA", 1).contains("!-!-!")) {
            new LogIn().setVisible(true);
        } else {
            new Register().setVisible(true);
        }
    }
}
