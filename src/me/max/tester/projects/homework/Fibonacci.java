/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.max.tester.projects.homework;

import me.max.tester.managers.input.InputInt;

/**
 *
 * @author Mc170171
 */
public class Fibonacci {
    
    public void runFibonacci() {
        
        int numOne = 0, numTwo = 1;
        int times = new InputInt().inputInt("Enter a number: ");
        
        for (int i = 0; i < times; i++) {
            numTwo = numOne + numTwo;
            System.out.print(numTwo + ", ");
            numOne = numTwo + numOne;
            System.out.print(numOne + ", ");
        }
        
    }
    
}
