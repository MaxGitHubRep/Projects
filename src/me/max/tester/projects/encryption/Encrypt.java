package me.max.tester.projects.encryption;

import java.util.ArrayList;
import me.max.tester.managers.lists.JoinString;
import me.max.tester.managers.random.RandomInt;

/**
 * This is some code that translates text into a sequence of random numbers and letters that can be translated with a key.
 *
 * @author MC170171
 */
public class Encrypt {
    
    public void printEncryptedText(String text) {
        
        System.out.println(getEncryptedText(text));
        
    }
    
    public String getEncryptedText(String text) {
        
        String key;
        int shift = new RandomInt().randomInt(1, 128);
        
        key = Integer.toHexString(shift);
        System.out.println(key);
        
        int[] ascii = new int[text.length()];
        int index = 0;
        
        for(String item : text.split("")) {
            ascii[index] = (int) item.charAt(0) + shift;
            index++;
        }
        
        ArrayList builder = new ArrayList();
        
        char c;
        for(int num : ascii) {
            c = (char) (new RandomInt().randomInt(71, 90));
            String ch = c + "";
            builder.add(Integer.toHexString(num).toUpperCase().replace("A", ch));
        }

        return new JoinString().join(builder, "");
        
    }
    
}
