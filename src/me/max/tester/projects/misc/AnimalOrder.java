package me.max.tester.projects.misc;

import java.util.ArrayList;
import java.util.Collections;
import me.max.tester.managers.input.InputInt;
import me.max.tester.managers.input.InputString;

/**
 *
 * @author mc170171
 */
public class AnimalOrder {
    
    public void animalSort() {
        
        ArrayList names = new ArrayList();
        
        int times = new InputInt().inputInt("How many times do you want to enter a name?");
        
        for (int i = 0; i < times; i++) {
            names.add(new InputString().inputString(i + ") Enter a name!"));
        }
        
        Collections.sort(names);

        for (Object name : names) {
            System.out.print(name + ", ");
        }

        
    }
    
}
