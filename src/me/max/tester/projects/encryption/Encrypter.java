package me.max.tester.projects.encryption;

import me.max.tester.managers.random.RandomInt;

/**
 *
 * @author MC170171
 */
public class Encrypter {
    
    public void encryptText(String text) {
        
        String key;
        int shift = new RandomInt().randomInt(0, 128);
        System.out.println(shift);
        
        key = Integer.toHexString(shift);
        
        // text > shifted ascii (+1)
        
        int[] ascii = new int[text.length()];
        int index = 0;
        
        for(String item : text.split("")) {
            ascii[index] = (int) item.charAt(0) + shift;
            index++;
        }
        
        for(int num : ascii) {
            System.out.print((char) num);
        }
        System.out.println("");
        System.out.println(key);
    }
    
    public void decryptText(String text) {
        
        for (int i = 0; i < 128; i++) {
            System.out.println(i + " -> ");
            for(String item : text.split("")) {
                char ascii = (char) (item.charAt(0) - i);
                System.out.print(ascii);
                
            }
            
            System.out.println("");
        }
        
    }
    
}
