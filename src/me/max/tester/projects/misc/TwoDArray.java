/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.max.tester.projects.misc;

import me.max.tester.managers.input.InputString;
import me.max.tester.managers.random.RandomInt;

/**
 *
 * @author mc170171
 */
public class TwoDArray {
    
    public void tester() {
        
        String[][] names = new String[2][5];
        
        for (int i = 0; i < 5 ;i++) {
        
        names[0][i] = new InputString().inputString("Enter a name");
        names[1][i] = new RandomInt().randomInt(1, 100) + "";
        
            System.out.println(names[0][i] + " + " + names[1][i]);
        }
        
        
        
    }
    
}
