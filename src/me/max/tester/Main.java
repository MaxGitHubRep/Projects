/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.max.tester;

import java.text.ParseException;
import java.util.ArrayList;
import me.max.tester.managers.input.InputInt;
import me.max.tester.managers.input.InputString;
import me.max.tester.managers.random.RandomDouble;
import me.max.tester.managers.random.RandomInt;
import me.max.tester.managers.system.SystemExit;
import me.max.tester.managers.system.SystemSleep;
import me.max.tester.managers.system.TimeWatch;
import java.util.concurrent.TimeUnit;
import me.max.tester.managers.constructer.ArrayListString;
import me.max.tester.projects.homework.LifeExpt;

/**
 * @author Max
 */
public class Main {
    
    public static final String LINE = " » ----------------------------------------------- « ";
    
    public static void sendLine() {
        System.out.println(LINE);
    }
    
    public static void main(String[]args) throws ParseException {
        
        System.out.println("A Java Project by Max Carter.");
        
        // start of main class.
        
        
        // array constructer tester for strings
        ArrayListString als = new ArrayListString();
        ArrayList<String> arrayList = als.buildArrayListStr("hi!-there!-hello", "!-");
        arrayList.stream().forEach((item) -> {
            System.out.println(item);
        });
        
       /*  LifeExpt life = new LifeExpt();
           life.checkLifeExpt();
           Homework ^ 
       */
       
       
        // end of main class.
        
        SystemExit exit = new SystemExit();
        exit.exitProgram();
        
    }
}