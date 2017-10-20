/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.max.tester.managers.lists;

import java.util.ArrayList;

/**
 *
 * @author Mc170171
 */
public class JoinChar {
    
    public String join(ArrayList<Character> list, String join) {
        boolean start = true;
        String str = null;
        for (Object item : list) {
            if (start == true) {
                start = false;
                str = item.toString();
            } else {
                str = str + join + item;
            }
        }
        return str;
    }
    
}
