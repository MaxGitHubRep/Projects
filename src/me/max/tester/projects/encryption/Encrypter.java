package me.max.tester.projects.encryption;

import me.max.tester.managers.random.RandomInt;

/**
 * This is some code that translates text into a sequence of random numbers and letters that can be translated with a key.
 *
 * @author MC170171
 */
public class Encrypter {
    
    public void encryptText(String text) {
        
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
        char c;
        for(int num : ascii) {
            c = (char) (new RandomInt().randomInt(71, 90));
            String ch = c + "";
            System.out.print(Integer.toHexString(num).toUpperCase().replace("A", ch));
        }

        System.out.println("");
        
    }
    
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
