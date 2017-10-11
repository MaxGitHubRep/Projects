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
public class ErrorFormatter {
    
    public String formatError(Exception error) {
        return error.toString().substring(10,error.toString().length()).replaceAll("(\\p{Ll})(\\p{Lu})","$1 $2");
    }
    
}
