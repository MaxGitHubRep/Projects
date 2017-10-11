/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.max.tester.managers.input;

import java.util.Scanner;
import me.max.tester.managers.error.ErrorOutput;

/**
 *
 * @author Max
 */
public class InputInt extends ErrorOutput {
    
    
    
    public int inputInt(String question) {
        Scanner in = new Scanner(System.in);
        System.out.println(question);
        
        int input = 0;
        
        try {
            input = in.nextInt();
        } catch (Exception ex) {
            error(ex);
            inputInt(question);
        }
        
        return input;
    }    
    
}
