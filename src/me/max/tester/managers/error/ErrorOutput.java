/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.max.tester.managers.error;

/**
 *
 * @author Max
 */
public class ErrorOutput extends me.max.tester.managers.error.ErrorFormatter {
    
    public void error(Exception error) {
        
        String e = formatError(error);
        System.out.println("[Error] "+e);  
    }
    
}
