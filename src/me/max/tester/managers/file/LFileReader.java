/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.max.tester.managers.file;

import java.io.BufferedReader;
import java.io.FileReader;
import me.max.tester.managers.error.ErrorOutput;

/**
 *
 * @author Max
 */
public class LFileReader {
    private final ErrorOutput output = new ErrorOutput();
 
    public void printFile(String filename) {
        String input_line;
        String my_dir = "X:\\My Documents\\NetBeansProjects\\Projects\\build\\classes\\me\\max\\tester\\textfiles\\" + filename + ".txt";
        try {
            BufferedReader re = new BufferedReader(new FileReader(my_dir));
            while ((input_line = re.readLine()) != null) {
                System.out.println(input_line);
            }
        } catch (Exception ex) {
            output.error(ex);
        }
    }
    
}
