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
import static java.util.concurrent.TimeUnit.MILLISECONDS;
import static me.max.tester.Main.sendLine;
import me.max.tester.managers.input.InputInt;
import me.max.tester.managers.time.DateTime;
import me.max.tester.managers.time.TimeBreakDown;
import me.max.tester.managers.time.TimeDifference;

/**
 *
 * @author MC170171
 */
public class LifeExpt {
    
    private int query = 0;
    private long diffDie = 0;
    private DateFormat dateFormat = new SimpleDateFormat("HH/mm/ss dd/MM/yyyy");
    private TimeBreakDown timeBD = new TimeBreakDown();
    
    private void lifeStyleQ() {
        
        HashMap<String, Integer> questions = new HashMap<>();
        InputInt in = new InputInt();
        
        questions.put("Do you smoke", -700000000);
        questions.put("Do you do daily exercise", 600000000);
        questions.put("Are you mentally happy", 200000000);
        questions.put("Are you disabled", -900000000);
        
        System.out.println("(1) - Yes");
        System.out.println("(2) - No");
        
        for (Map.Entry<String, Integer> entry : questions.entrySet()) {
            int result = in.inputInt(" - "+entry.getKey()+"? ");
            if (result == 1) {
                query += entry.getValue();
            }  
        }
        
        diffDie += query;
        sendLine();
        System.out.println(" You will now die in: ");
        timeBD.breakDownTime(diffDie);
        sendLine();
    }

    public void checkLifeExpt() throws ParseException {
        DateTime dateInstance = new DateTime();
        TimeDifference timeDiff = new TimeDifference();
        String dateTime = dateInstance.getDateTime();
        Date dateTimeFormat = dateFormat.parse(dateTime);
        
        Date birthDate = dateFormat.parse("00/00/00 04/06/2001");
        
        long diff = timeDiff.getDateDiff(dateTimeFormat, birthDate, MILLISECONDS);

        sendLine();
        System.out.println(" Time Now: \t\t" + dateTimeFormat);
        System.out.println(" Your Birthday: \t" + birthDate);
        sendLine();
        System.out.println(" Breakdown of your age:");
        timeBD.breakDownTime(diff);
        
        sendLine();
        Date dieDate = dateFormat.parse("00/00/00 04/06/2082");
        System.out.println(" You will die in:");
        diffDie = timeDiff.getDateDiff(dateTimeFormat, dieDate, MILLISECONDS);
        timeBD.breakDownTime(diffDie);
        sendLine();
        
        lifeStyleQ();
        
    }
    
}