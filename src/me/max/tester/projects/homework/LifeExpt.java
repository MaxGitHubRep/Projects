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
    
    int ageYears;
    int query = 0;
    
    private void lifeStyleQ(int current) {
        
        HashMap<String, Integer> questions = new HashMap<>();
        InputInt in = new InputInt();
        
        
        questions.put("Do you smoke", -20);
        questions.put("Do you do daily exercise", 15);
        questions.put("Are you mentally happy", 10);
        questions.put("Are you disabled", -30);
        
        System.out.println("(1) - Yes");
        System.out.println("(2) - No");
        
        for (Map.Entry<String, Integer> entry : questions.entrySet()) {
            boolean check = false;
            int result = in.inputInt(" - "+entry.getKey()+"? ");
            if (result == 1) {
                query = query + entry.getValue();
            }  
        }
        System.out.println("This will affect your life by: "+query+" years.");
        
    }
    
    
    public int mAliveFor() {
        
        InputInt in = new InputInt();
        ageYears = in.inputInt("How old are you?");
        lifeStyleQ(ageYears);
        
        return ageYears;
    }
    
    public void checkLifeExpt() {

        long left = lifeExpt - mAliveFor() + query;
        System.out.println("Days left of your existance: "+left);

        
    }
    
}
