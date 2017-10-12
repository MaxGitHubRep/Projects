/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.max.tester.projects.homework;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import static java.util.concurrent.TimeUnit.HOURS;
import me.max.tester.managers.input.InputInt;

/**
 *
 * @author MC170171
 */
public class LifeExpt {
    
    protected final long lifeExpt = 81;
    
    private int ageYears;
    private int query = 0;
    
    private Date dateOne = new Date(04,06,2001);
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    
    private String getDate() { // "dd/MM/yyyy"
        Date date = new Date();
        return dateFormat.format(date);
    }
    
    public long getDateDiff(Date date1, Date date2, TimeUnit timeUnit) {
        long diffInMillies = date2.getTime() - date1.getTime();
        return timeUnit.convert(diffInMillies,TimeUnit.MILLISECONDS);
    }
    
    private void lifeStyleQ() {
        
        HashMap<String, Integer> questions = new HashMap<>();
        InputInt in = new InputInt();
        
        questions.put("Do you smoke", -20);
        questions.put("Do you do daily exercise", 15);
        questions.put("Are you mentally happy", 10);
        questions.put("Are you disabled", -30);
        
        System.out.println("(1) - Yes");
        System.out.println("(2) - No");
        
        for (Map.Entry<String, Integer> entry : questions.entrySet()) {
            int result = in.inputInt(" - "+entry.getKey()+"? ");
            if (result == 1) {
                query = query + entry.getValue();
            }  
        }
        System.out.println("This will affect your life by: "+query+" years.");
        
    }
    
    
    public int mAliveFor() {
        
        InputInt in = new InputInt();
        ageYears = in.inputInt("How old are you?");
        lifeStyleQ();
        
        return ageYears;
    }
    
    public void checkLifeExpt() throws ParseException {

        String test = getDate();
        Date test1 = dateFormat.parse(test);
        
        Date test2 = dateFormat.parse("04/06/2001");
        
        long diff = getDateDiff(test1, test2, HOURS);
        long left = lifeExpt - mAliveFor() + query;
        System.out.println("Days left of your existance: "+left);
        System.out.println("hours left: "+diff);

        
    }
    
}
