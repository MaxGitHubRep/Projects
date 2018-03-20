package me.max.tester.projects.misc;

import me.max.tester.managers.input.InputString;

/**
 *
 * @author mc170171
 */
public class Postcode {
    
    public static void main(String[]args) {
        
        String[] formats = new String[]{ "AA9A 9AA", "A9A 9AA", "A9 9AA", "A99 9AA", "AA9 9AA", "AA99 9AA" };
        
        String code = new InputString().inputString("Input post code").toUpperCase();
        String builder = "";
        
        for (String item : code.split("")) {
            if (item.equals(" ")) {
                builder+=" ";
            } else if ((int) item.charAt(0) >= 65 && (int) item.charAt(0) <= 90) {
                builder+="A";
            } else if ((int) item.charAt(0) >= 48 && (int) item.charAt(0) <= 57) {
                builder+="9";
            } else {
                builder+="B";
            }
        }
        boolean yes = false;
        if (builder.contains("B")) {
            yes = false;
        } else {
            for (int i = 0; i < formats.length; i++) {
                if (formats[i].equals(builder)) {
                    yes = true;
                }
            }
        }
        System.out.println(yes ? "valid" : "invalid");
        
    }
    
}
