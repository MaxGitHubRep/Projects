/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.max.tester.projects.misc;

import java.util.ArrayList;
import me.max.tester.managers.lists.ArrayListSort;
import me.max.tester.managers.random.RandomInt;

/**
 *
 * @author MC170171
 */
public class StarterTask {
    
    public void starting() {
        ArrayList<Integer> list = new ArrayList<>();
        RandomInt ri = new RandomInt();
        for (int i = 0; i<11; i++) {
            list.add(ri.randomInt(1, 50));   
        }
        ArrayListSort sort = new ArrayListSort();
        sort.arrayListSortDes(list);
    }
}
