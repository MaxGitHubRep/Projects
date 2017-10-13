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
import static java.util.concurrent.TimeUnit.MILLISECONDS;
import static me.max.tester.Main.sendLine;
import me.max.tester.managers.error.ErrorOutput;
import me.max.tester.managers.input.InputInt;
import me.max.tester.managers.input.InputString;
import me.max.tester.managers.time.DateTime;
import me.max.tester.managers.time.TimeBreakDown;
import me.max.tester.managers.time.TimeDifference;

/**
 *
 * @author MC170171
 */
public class LifeExpt {
    
    private final int lifeExptAge = 81;
    private int query = 100;    //percentage
    private long diffDie = 0;
    private final DateFormat dateFormat = new SimpleDateFormat("HH/mm/ss dd/MM/yyyy");
    private final TimeBreakDown timeBD = new TimeBreakDown();
    
    private void lifeStyleQ() {
        
        HashMap<String, Integer> questions = new HashMap<>();
        InputInt in = new InputInt();
        
        questions.put("Do you smoke", -25);
        questions.put("Do you do daily exercise", 15);
        questions.put("Are you mentally happy", 10);
        questions.put("Are you disabled", -35);
        
        System.out.println("(1) - Yes \n (2) - No");
        questions.entrySet().forEach((entry) -> {
            int result = in.inputInt(" - "+entry.getKey()+"? ");
            if (result == 1) {
                query = query + entry.getValue();
            }
        });
        sendLine();
        System.out.println(" Your life expectancy will be affected by "+query+"%");
        System.out.println(" You will now die in: ");
        timeBD.breakDownTime((query*diffDie)/100);
        sendLine();
    }

    public void checkLifeExpt() throws ParseException {
        DateTime dateInstance = new DateTime();
        TimeDifference timeDiff = new TimeDifference();
        InputString inStr = new InputString();
        ErrorOutput e = new ErrorOutput();
        
        String dateTime = dateInstance.getDateTime();
        Date dateTimeFormat = dateFormat.parse(dateTime);
        String date = inStr.inputString("Enter your birth date as: dd/MM/yyyy (Example: 04/06/2001)");
        Date birthDate = null;
        
        try {
            birthDate = dateFormat.parse("00/00/00 "+date);
        } catch (ParseException ex) {
            e.error(ex);
        }

        long diff = timeDiff.getDateDiff(dateTimeFormat, birthDate, MILLISECONDS);

        sendLine();
        System.out.println(" Time Now: \t\t" + dateTimeFormat);
        System.out.println(" Your Birthday: \t" + birthDate);
        sendLine();
        System.out.println(" Breakdown of your age:");
        timeBD.breakDownTime(diff);
        sendLine();
        int deathYear = Integer.parseInt(date.substring(date.length()-4,date.length()));
        deathYear += lifeExptAge;
        Date dieDate = dateFormat.parse("00/00/00 04/06/"+deathYear);
        System.out.println(" You will die in:");
        diffDie = timeDiff.getDateDiff(dateTimeFormat, dieDate, MILLISECONDS);
        timeBD.breakDownTime(diffDie);
        sendLine();
        
        lifeStyleQ();
        
    }
    
}