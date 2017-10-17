/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.max.tester.projects.misc;

import java.util.ArrayList;
import me.max.tester.managers.input.InputInt;
import me.max.tester.managers.input.InputString;

/**
 *
 * @author MC170171
 */
public class CheckDigit {
    
   // final int digit = 9311960043718;
    final int length = 13;
    int last = 0;
    int firstTotal = 0;
    int secondTotal = 0;
    
    public void startCheckDigit() {
        
        InputString in = new InputString();
        
        ArrayList<Integer> firstNums = new ArrayList<>();
        ArrayList<Integer> secondNums = new ArrayList<>();
        
        String numCheck = in.inputString("enter barcode");
        String[] nums = new String[length];
        last = Integer.parseInt(numCheck.substring(numCheck.length()-1,numCheck.length()));
        nums = numCheck.split("");
        boolean tester = true;
        for (int i = 0; i<length-1; i++) {
            if (tester == true) {
                secondNums.add(Integer.parseInt(nums[i]));
                tester = false;
            } else {
                firstNums.add(Integer.parseInt(nums[i]));
                tester = true;
            }
        }
        firstNums.stream().forEach((item) -> {
            firstTotal = firstTotal + item;
        });
        
        firstTotal = firstTotal*3;
        
        secondNums.stream().forEach((item) -> {
            secondTotal = secondTotal + item;
        });

        System.out.println(firstTotal+secondTotal+last);
        
    }
    
    
    
}
