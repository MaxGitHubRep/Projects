/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.max.tester;

import java.text.ParseException;
import java.util.ArrayList;
import me.max.tester.managers.system.SystemExit;
import me.max.tester.managers.constructer.ArrayListString;
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
        
        System.out.println(" === [Start] === ");
        
        // start of main class.
        
        
        // array constructer tester for strings
      /*  ArrayListString als = new ArrayListString();
        ArrayList<String> arrayList = als.buildArrayListStr("hi!-there!-hello", "!-");
        arrayList.stream().forEach((item) -> {
            System.out.println(item);
        });
       */
        
           LifeExpt life = new LifeExpt();
           life.checkLifeExpt();
       
       
       
        // end of main class.
        
        SystemExit exit = new SystemExit();
        exit.exitProgram();
        
    }
}