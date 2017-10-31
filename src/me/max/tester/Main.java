/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.max.tester;

import java.io.File;
import java.text.ParseException;
import java.util.ArrayList;
import me.max.tester.gui.hangman.FirstMenu;
import me.max.tester.gui.timetable.Fronter;
import me.max.tester.managers.file.LFileClear;
import me.max.tester.managers.file.LFileReader;
import me.max.tester.managers.file.LFileWriter;
import me.max.tester.managers.input.InputInt;
import me.max.tester.managers.system.SystemExit;
import me.max.tester.projects.homework.PascalTriangle;

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
       
       // PascalTriangle p = new PascalTriangle();
       // p.drawTriangle();
        
        new FirstMenu().setVisible(true);
        //new Fronter().setVisible(true);
       
       
       // LFileWriter f = new LFileWriter();
       // f.writeToFile("how are you doing", "name", true);

         //  LifeExpt life = new LifeExpt();
          // life.checkLifeExpt();
       
        // end of main class.
        
        SystemExit exit = new SystemExit();
        exit.exitProgram();
        
    }
}