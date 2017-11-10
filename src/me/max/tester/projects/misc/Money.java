/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.max.tester.projects.misc;

import me.max.tester.managers.input.InputInt;

/**
 *
 * @author MC170171
 */
public class Money {
    
    InputInt in = new InputInt();
    protected boolean compoundInterest = true;
    
    public void Money() {
        
        int money = 0, months = 0;
        
        money = in.inputInt("How much money?");
        months = in.inputInt("How many months?");
        
        if (compoundInterest == true) {
            for (int i = 0; i < months; i++) {
                money = (int) (money + (money * 103));
                
            }
        } else {
            money = money * 103;
            
        }
        
        System.out.println("You saved £" + ((money/10000)) + " over " + months + " months.");

        
    }
    
}
