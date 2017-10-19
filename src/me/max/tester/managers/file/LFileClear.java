/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.max.tester.managers.file;

/**
 *
 * @author mc170171
 */
public class LFileClear {
    
    public void clearFile(String name) {
        LFileWriter fw = new LFileWriter();
        fw.writeToFile("", name, false);
        
    }
    
}
