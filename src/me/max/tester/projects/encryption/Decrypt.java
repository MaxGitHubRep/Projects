package me.max.tester.projects.encryption;

import java.util.ArrayList;
import me.max.tester.managers.error.ErrorOutput;
import me.max.tester.managers.lists.JoinString;

/**
 *
 * @author MC170171
 */
public class Decrypt {
    
    public void printDecryptedText(String text, String key) {
        
        System.out.println(getDecryptedText(text, key));
        
    }
    
    public String getDecryptedText(String text, String key) {
      
        ArrayList builder = new ArrayList();
        
        try {
            int code = Integer.parseInt(key + "", 16);

            char t;
            for (int i = 71; i < 91; i++) {
                t = (char) i;
                text = text.replaceAll(t + "", "A");

            }

            for (int i = 0; i < text.length(); i+= 2) {
                String translate = text.substring(i, (i + 2));
                builder.add((char) (Integer.parseInt(translate, 16) - code));

            }
        
        } catch (Exception e) {
            new ErrorOutput().error(e);
            
        }
        
        return new JoinString().join(builder, "");
        
    }
    
}
