/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.max.tester;

import me.max.tester.managers.input.InputInt;
import me.max.tester.managers.input.InputString;
import me.max.tester.managers.random.RandomDouble;
import me.max.tester.managers.random.RandomInt;
import me.max.tester.managers.system.SystemExit;
import me.max.tester.managers.system.SystemSleep;
import me.max.tester.managers.system.TimeWatch;
import java.util.concurrent.TimeUnit;
import me.max.tester.projects.homework.LifeExpt;

/**
 * @author Max
 */
public class Main {
    
    public static void main(String[]args) {
        
        System.out.println("A Java Project by Max Carter.");
        
        //
        
        LifeExpt life = new LifeExpt();
        life.checkLifeExpt();
        
        
        //
        
        SystemExit exit = new SystemExit();
        exit.exitProgram();
        
    }
}