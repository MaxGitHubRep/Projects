/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.max.tester.managers.lists;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author MC170171
 */
public class ArrayListStringBuilder {
    
    public ArrayList<String> buildArrayListStr(String content, String splitter) {
        
        ArrayList tempArray = new ArrayList();
        tempArray.addAll(Arrays.asList(content.split(splitter)));

        return tempArray;
    }

}
