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
public class ArrayListSort {
    
    public void arrayListSortAsc(ArrayList<Integer> array) { // lowest -> higest
        int high = 0;
        for (int item : array) {
            if (item > high) {
                high = item;
            }
        }
        for (int i = 0; i<high+1; i++) {
            if (array.contains(i)) {
                System.out.println(i);
            }
        }
    }
    
    public void arrayListSortDes(ArrayList<Integer> array) { // highest -> lowest
        int low = 99999;
        for (int item : array) {
            if (item < low) {
                low = item;
            }
        }
        for (int i = 99999; i>low-1; i--) {
            if (array.contains(i)) {
                System.out.println(i);
            }
        }
    }
    

}
