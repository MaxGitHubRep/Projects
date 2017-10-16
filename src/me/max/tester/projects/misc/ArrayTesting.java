/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.max.tester.projects.misc;

import me.max.tester.managers.input.InputInt;
import me.max.tester.managers.lists.ArrayListSort;
import me.max.tester.managers.lists.PrimArraySort;
import me.max.tester.managers.random.RandomInt;

/**
 *
 * @author MC170171
 */
public class ArrayTesting {
 
    public void testingArrays() {
        InputInt in = new InputInt();
        RandomInt rin = new RandomInt();
        /*
        int[] intArray = new int[5];
        
        for (int i = 0; i<5; i++) {
            intArray[i] = in.inputInt(" Input number " + (i+1));
        }
     
        int total = 0;
        for (int i = 0; i<5; i++) {
            total += intArray[i];
        }
        System.out.println("Total: " + total);
      */  
        
        // s & c
        int[] rNums = new int[5];
        for (int i = 0; i<5; i++) {
            rNums[i] = rin.randomInt(1, 54);
        }
//
        
      //  PrimArraySort sort = new PrimArraySort();
       // sort.primArraySortAsc(rNums);
        
    }
    
                        
}
