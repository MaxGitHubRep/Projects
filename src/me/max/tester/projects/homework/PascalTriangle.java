/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.max.tester.projects.homework;

import me.max.tester.managers.input.InputInt;

/**
 *
 * @author Max
 */
public class PascalTriangle {
    
    public void drawTriangle() {
        int amt = new InputInt().inputInt("How many things do you want?");
        int use = amt;
        for (int i = 0; i < amt; i++) {
            for (int f = 0; f < use; f++) {
                System.out.print(" ");
            }
            int out = (int) Math.pow(11, i);
            for (String item : (out + "").split("")) {
                System.out.print(item + " ");
            }
            use--;
            System.out.println("");
        }
        
    }
    
}
