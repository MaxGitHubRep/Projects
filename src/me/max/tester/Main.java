/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.max.tester;

import java.text.ParseException;
import java.util.ArrayList;
import me.max.tester.managers.lists.ArrayListSort;
import me.max.tester.managers.system.SystemExit;
import me.max.tester.managers.lists.ArrayListStringBuilder;
import me.max.tester.projects.homework.LifeExpt;
import me.max.tester.projects.misc.ArrayTesting;

/**
 * @author Max
 */
public class Main {
    
    public static final String LINE = " » ----------------------------------------------- « ";
    
    public static void sendLine() {
        System.out.println(LINE);
    }
    
    public static void main(String[]args) throws ParseException {
        
        System.out.println(" ==== [Start] ==== ");
        
        // start of main class.
        
        
         //  LifeExpt life = new LifeExpt();
         //  life.checkLifeExpt();
       
         ArrayTesting n = new ArrayTesting();
         n.testingArrays();
         
     /*    ArrayListSort sort = new ArrayListSort();
         ArrayList<Integer> newArray = new ArrayList<>();
         newArray.add(6);
         newArray.add(8);
         newArray.add(2);
         newArray.add(56);
         sort.arrayListSortDes(newArray);
       */
       
        // end of main class.
        
        SystemExit exit = new SystemExit();
        exit.exitProgram();
        
    }
}