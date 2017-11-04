/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.max.tester.managers.misc;

import me.max.tester.managers.random.RandomInt;

/**
 *
 * @author Max
 */
public class Chance {
    
    public boolean chance(int i) {
        
        if (new RandomInt().randomInt(1, 100) <= i) {
            return true;
        } else {
            return false;
        }
    }
    
}
