package me.max.tester.projects.encryption;

import me.max.tester.managers.random.RandomInt;

/**
 * This is some code that translates text into a sequence of random numbers and letters that can be translated with a key.
 *
 * @author MC170171
 */
public class Encrypt {
    
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
    
}
