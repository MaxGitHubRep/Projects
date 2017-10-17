/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.max.tester.managers.random;

import java.util.ArrayList;

/**
 *
 * @author Max
 */
public class RandomElement {
    
    public String randomElement(ArrayList list) {
        RandomInt ri = new RandomInt();
        
        int randomIndex = ri.randomInt(0, list.size()-1);
        String randomWord = (String) list.get(randomIndex);
        
        return randomWord;
        
    }
    
}
