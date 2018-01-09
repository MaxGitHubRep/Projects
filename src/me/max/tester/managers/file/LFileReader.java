/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.max.tester.managers.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.filechooser.FileSystemView;
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
        String my_dir = FileSystemView.getFileSystemView().getDefaultDirectory().getPath() + "\\TextFilesManager\\" + filename + ".txt";
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
    
    public String getLineFromFile(String filename, int id) {
        int index = 1;
        for (Object line : getFileContent(filename)) {
            if (id == index) {
                return line.toString();
            }
            index++;
        }
        return "null";
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
