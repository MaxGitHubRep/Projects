/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.max.tester.managers.file;

import java.io.FileWriter;
import java.io.PrintWriter;
import me.max.tester.managers.error.ErrorOutput;

/**
 *
 * @author mc170171
 */
public class LFileClear {
    
    private final ErrorOutput output = new ErrorOutput();
    
    public void clearFile(String filename) {
        FileWriter writeObject;
        PrintWriter printObject;
        String my_dir = System.getProperty("user.dir") + "\\build\\classes\\me\\max\\tester\\textfiles\\" + filename + ".txt";
        try {
            writeObject = new FileWriter(my_dir, false);
            printObject = new PrintWriter(writeObject);
            printObject.print("");
            printObject.close();
        } catch (Exception ex) {
            output.error(ex);
        }    
    }
}
