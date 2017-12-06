/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.max.tester.managers.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import me.max.tester.managers.error.ErrorOutput;

/**
 *
 * @author Max
 */
public class LFileReader {
    private final ErrorOutput output = new ErrorOutput();
 
    public ArrayList getFileContent(String filename) {
        ArrayList list = new ArrayList();
        String input_line;
        String my_dir = System.getProperty("user.dir") + "\\src\\me\\max\\tester\\textfiles\\" + filename + ".txt";
        try {
            BufferedReader re = new BufferedReader(new FileReader(my_dir));
            while ((input_line = re.readLine()) != null) {
                list.add(input_line);
            }
        } catch (Exception ex) {
            output.error(ex);
        }
        
        return list;
    }
    
    public void printFile(String filename) {
        try {
            getFileContent(filename).forEach((item) -> {
                System.out.println(item);
            });
        
        } catch (Exception ex) {
            output.error(ex);
            
        }
    }
    
}
