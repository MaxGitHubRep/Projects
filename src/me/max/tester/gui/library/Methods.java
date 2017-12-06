package me.max.tester.gui.library;

import java.util.ArrayList;
import me.max.tester.managers.error.ErrorOutput;
import me.max.tester.managers.file.LFileReader;

/**
 *
 * @author mc170171
 */
public class Methods {
    
    private LFileReader readFile = new LFileReader();
    
    public String getValue(String context, String item) {
        try {
            String[] items = context.split("!-!");
            switch (item) {
                case "title":
                    return items[0];

                case "author":
                    return items[1];

                case "isb":
                    return items[2];

                default:
                    return "null";
            }
            
        } catch (Exception ex) {
            new ErrorOutput().error(ex);
        }
        return "null";
    }
    
    public ArrayList getBookList() {
        ArrayList books = readFile.getFileContent("books");
        //Collections.sort(books);
        
        return books;
    }
}
