/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.max.tester.managers.random;

import java.util.Random;

/**
 *
 * @author Max
 */
public class RandomInt {

    public int randomInt(int min, int max) {
        
        Random random = new Random();
        
        return random.nextInt((max-min)+1)+min;
    }
}
