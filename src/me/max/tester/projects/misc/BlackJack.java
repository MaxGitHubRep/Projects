/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.max.tester.projects.misc;

import me.max.tester.managers.input.InputInt;
import me.max.tester.managers.random.RandomInt;
import me.max.tester.managers.system.SystemExit;

/**
 *
 * @author MC170171
 */
public class BlackJack {
    
    final int max = 21;
    int[] scores = new int[2]; // 0 = User, 1 = PC
    
    RandomInt ri = new RandomInt();
    InputInt in = new InputInt();
    SystemExit exit = new SystemExit();
    
    private void endGame() {
        
        System.out.println("Computer Score: "+ scores[1]);
        System.out.println("Your score: " + scores[0]);
        
        exit.exitProgram();
        
    }
    
    public void playGame() {
        scores[1] = ri.randomInt(2, 22);
        scores[0] = ri.randomInt(2, 22);
        
        boolean check = true;
        
        while (check == true) {
            if (in.inputInt("The sum of your cards is: " + scores[0] + "\n - Do you want to get a new card? (1) \n - Or continue? (2)") == 1) {
                scores[0] = scores[0] + ri.randomInt(1, 11);
                System.out.println("Your new score is: " + scores[0]);
                
                if (scores[0] == 21) {
                    System.out.println("You win!");
                    endGame();
                    break;
                } else if (scores[0] > 21) {
                    System.out.println("You lose :(");
                    endGame();
                    break;
                }
                
            }  else {
                check = false;
                
            }
             
        }
        
        if (ri.randomInt(1, 11) + scores[1] > 21) {
            scores[1] = scores[1] + ri.randomInt(1, 11);
        }
        
        if (scores[1] == 21) {
            System.out.println("The computer wins!");
            endGame();
        } else if (scores[1] > 21) {
            System.out.println("You win! (Computer got over 21)");
            endGame();
        }
        
    }
    
}
