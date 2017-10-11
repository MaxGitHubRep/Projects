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
public class InputString extends ErrorOutput {
    
    
    
    public String inputString(String question) {
        Scanner in = new Scanner(System.in);
        System.out.println(question);
        
        String input = null;
        
        try {
            input = in.next();
        } catch (Exception ex) {
            error(ex);
            inputString(question);
        }
        
        return input;
    }    
    
}
