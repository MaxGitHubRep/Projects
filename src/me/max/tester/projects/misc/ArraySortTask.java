/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.max.tester.projects.misc;

import me.max.tester.managers.input.InputInt;
import me.max.tester.managers.random.RandomInt;

/**
 *
 * @author mc170171
 */
public class ArraySortTask {
    
    public void test() {
        
        InputInt in = new InputInt();
        
        int[] array = new int[10];
        
        for (int i = 0; i < 10; i++) {
            array[i] = new RandomInt().randomInt(0, 100);
        }
        
        int lowest = 100;
        int highest = 0;
        
        for (int item : array) {
            if (item < lowest) {
                lowest = item;
            }
            
            if (item > highest) {
                highest = item;
            }
        }
        
        System.out.println("high " + highest);
        System.out.println("low " + lowest);
        
    }
    
}
