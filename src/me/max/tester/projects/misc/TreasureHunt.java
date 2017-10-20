/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.max.tester.projects.misc;

import me.max.tester.managers.input.InputInt;
import me.max.tester.managers.random.RandomInt;

/**
 *
 * @author MC170171
 */
public class TreasureHunt {
    
    private final int y = 10;
    private final int x = 10;
    private final int treasures = 5;
    private final boolean snake = true;
    private final int tries = 10;
    private int score = 0;
    private final String empty = "-";
    String[][] graph = new String[x][y];
    
    public int inputCoord(String q) {
        InputInt in = new InputInt();
        boolean check = true;
        int num = 0;
        while (check == true) {
            num = in.inputInt(q);
            if (num > 10 || num < 0) {
                System.out.println("[Error] Out or range (1 to 10)");
            } else {
                check = false;
            }
        }
        return num;
    }
    
    public void printGraph() {
        for (int i = 0; i< x; i++) {
            for (int f = 0; f< y; f++) {
                if (graph[i][f] == null) {
                    System.out.print(empty + " ");
                } else {
                    System.out.print(graph[i][f] + " ");
                }
            }
            System.out.println();
        }
    }
    
    public void hunt() {
        RandomInt ri = new RandomInt();
        for (int i = 0; i<treasures; i++) {
            graph[ri.randomInt(0, x-1)][ri.randomInt(0, y-1)] = "T";
        }
        if (snake == true) {
            graph[ri.randomInt(0, x-1)][ri.randomInt(0, y-1)] = "S"; 
        }
        printGraph();
        for (int i = 0; i<tries; i++) {
            int first = inputCoord((i+1)+") Enter first coordinate: ");
            int second = inputCoord((i+1)+") Enter second coordinate: ");
            if (graph[first][second] == "S") {
                System.out.println("You found a snake!");
                score = 0;
            } else if (graph[first][second] == "T") {
                System.out.println("You found treasure!");
                score++;
                graph[first][second] = empty;
            } else {
                System.out.println("You found nothing!");
            }
        }
        System.out.println("Your score: " + score + "/10");
    } 
}
