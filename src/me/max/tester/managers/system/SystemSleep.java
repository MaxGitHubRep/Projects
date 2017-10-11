/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.max.tester.managers.system;

import java.util.concurrent.TimeUnit;
import me.max.tester.managers.error.ErrorOutput;

/**
 *
 * @author Max
 */
public class SystemSleep extends ErrorOutput {
    
    public void sleep(int i) {
        try {
            TimeUnit.SECONDS.sleep(i);
        } catch (InterruptedException ex) {
            error(ex);
        }
    }
    
}
