/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.max.tester.projects.homework;

import java.util.HashMap;
import java.util.Map;
import me.max.tester.managers.input.InputInt;

/**
 *
 * @author MC170171
 */
public class LifeExpt {
    
    protected final long lifeExpt = 81;
    
   // private final HashMap<String, Integer> map = Map<>();
    
    public int mAliveFor() {
        
        InputInt in = new InputInt();
        int ageYears = in.inputInt("How old are you?");

        return ageYears;
    }
    
    public void checkLifeExpt() {

        long left = lifeExpt - mAliveFor();

        System.out.println("Days left of your existance: "+left);

        
    }
    
}
