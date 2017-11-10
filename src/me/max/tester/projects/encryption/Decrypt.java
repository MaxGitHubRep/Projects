package me.max.tester.projects.encryption;

/**
 *
 * @author MC170171
 */
public class Decrypt {
    
    public void decryptText(String text, int key) {
      
        int code = Integer.parseInt(key + "", 16);
        
        char t;
        for (int i = 71; i < 90; i++) {
            t = (char) i;
            text = text.replace(t + "", "A");
            
        }
        
        for (int i = 0; i < text.length(); i+= 2) {
            String translate = text.substring(i, (i + 2));
            System.out.print((char) (Integer.parseInt(translate, 16) - code));
            
        }
        
    }
    
}
