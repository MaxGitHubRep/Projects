package me.max.tester.managers.file;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import me.max.tester.managers.error.ErrorOutput;

/**
 *
 * @author mc170171
 */
public class LFileRemove {
    
    private final ErrorOutput output = new ErrorOutput();
    private int index = 0;
    FileWriter writeObject;
    PrintWriter printObject;
    
    public void removeLineInFile(String filename, int lineNumber, String newContent) {
        String my_dir = System.getProperty("user.dir") + "\\build\\classes\\me\\max\\tester\\textfiles\\" + filename + ".txt";
        
        try {
            writeObject = new FileWriter(my_dir, true);
            printObject = new PrintWriter(writeObject);
            ArrayList list = new LFileReader().getFileContent(filename);
            new LFileClear().clearFile(filename);
            
            for (Object item : list) {
                if (index+1 == lineNumber) {
                    printObject.print(newContent);
                    
                } else {
                    printObject.print(item);
                }
                index++;
                printObject.println();
            }
            printObject.close();
            
        } catch (Exception ex) {
            output.error(ex);
        }    
    }
    
}
