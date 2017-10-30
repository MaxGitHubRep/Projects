/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.max.tester.projects.homework;

/**
 *
 * @author Max
 */
public class PascalTriangle {
    
    int maxRows = 6;
    
    public void drawTriangle() {
        int r, num;
        
        for (int i = 0; i <= maxRows; i++) {
            num = 1;
            r = i + 1;
            
            for (int j = maxRows - i; j > 0; j--) {
                System.out.print(" ");
            }
            
            for (int col = 0; col <= i; col++) {
                if (col > 0) {
                    num = num * (r - col) / col;
                }
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    
}
