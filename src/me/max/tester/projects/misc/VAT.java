/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.max.tester.projects.misc;

import me.max.tester.managers.input.InputInt;

/**
 *
 * @author Mc170171
 */
public class VAT {
    
    final int vat = 20;
    
    public void runVAT() {
        int value;
        InputInt in = new InputInt();
        value = in.inputInt("Input cash amount in pounds.");
        
        System.out.println("total price: " + (value + (value/(100/vat))));
        
    }
    
}
