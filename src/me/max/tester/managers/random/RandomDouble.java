/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.max.tester.managers.random;

import java.text.DecimalFormat;

/**
 *
 * @author Max
 */
public class RandomDouble {
    
    public double randomDouble(int min, int max, String format) {
        
        double num = Math.random();
        DecimalFormat df = new DecimalFormat(format);
        
        return Double.valueOf(df.format(num));
        
    }
    
}
