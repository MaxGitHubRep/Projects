/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.max.tester.managers.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import me.max.tester.managers.error.ErrorOutput;

/**
 *
 * @author mc170171
 */
public class LFileEdit {
    
    private final ErrorOutput output = new ErrorOutput();
    private int index = 0;
    FileWriter writeObject;
    PrintWriter printObject;
    
    public void editFileByLine(String filename, int lineNumber, String newContent) {
        String my_dir = System.getProperty("user.dir") + "\\build\\classes\\me\\max\\tester\\textfiles\\" + filename + ".txt";
        
        try {
            writeObject = new FileWriter(my_dir, true);
            printObject = new PrintWriter(writeObject);
            ArrayList list = new LFileReader().getFileContent(filename);
            new LFileClear().clearFile(filename);
            
            for (Object item : list) {
                index++;
                if (index == lineNumber) {
                    if (!newContent.equals("null")) {
                        printObject.print(newContent);
                    }
                } else {
                    printObject.print(item);
                }
                if (index-1 != list.size()) {
                    printObject.println();
                }
            }
            printObject.close();
            
        } catch (Exception ex) {
            output.error(ex);
        }    
    }
    
}
