/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.max.tester.projects.homework;

import java.util.ArrayList;
import me.max.tester.managers.lists.ArrayListStringBuilder;

/**
 *
 * @author mc170171
 */
public class Hangman {
    
    ArrayListStringBuilder list = new ArrayListStringBuilder();
    
    protected final ArrayList randomWordsEasy = list.buildArrayListStr("hello-cheese-world-smile-crime-fruit-mouse", "-");
    protected final ArrayList randomWordsHard = list.buildArrayListStr("chocolate-diabolical-oxymoron-critical-analysis", "-");

    
    
    
}
