/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.max.tester.gui.cinema;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;

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
        button.setForeground(Color.green);
        button.setEnabled(true);
    }
    
    protected void disableButton(JButton button) {
        button.setForeground(Color.RED);
        button.setEnabled(false);
    }
    
    public static void main(String[] args) {
        new Register().setVisible(true);
    }
    
}
