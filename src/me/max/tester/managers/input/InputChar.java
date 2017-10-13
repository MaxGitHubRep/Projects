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
 * @author MC170171
 */
public class InputChar extends ErrorOutput {
    
    public char inputChar(String question) {
        Scanner in = new Scanner(System.in);
        System.out.println(question);
        
        char input = 'a';
        
        try {
            input = in.next().charAt(0);
        } catch (Exception ex) {
            error(ex);
            inputChar(question);
        }
        
        return input;
    }    
    
}
