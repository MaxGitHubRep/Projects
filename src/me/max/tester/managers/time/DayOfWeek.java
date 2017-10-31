/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.max.tester.managers.time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Max
 */
public class DayOfWeek {
    
    Date now = new Date();
    
    public int getDayNum() {
        
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);
        return calendar.get(Calendar.DAY_OF_WEEK);
        
    }
    
    public String getDayStr() {
        
        SimpleDateFormat simpleDateformat = new SimpleDateFormat("EEEE"); // the day of the week abbreviated
        return simpleDateformat.format(now);
    }
    
    public int dayStrToInt(String day) {
        
        switch (day) {
            case "Sunday":
                return 1;
            case "Monday":
                return 2;
            case "Tuesday":
                return 3;
            case "Wednesday":
                return 4;
            case "Thursday":
                return 5;
            case "Friday":
                return 6;
            case "Saturday":
                return 7;
            default:
                return 1;
        }
        
    }
    
    public String dayIntToStr(int day) {
        
        switch (day) {
            case 1:
                return "Sunday";
            case 2:
                return "Monday";
            case 3:
                return "Tuesday";
            case 4:
                return "Wednesday";
            case 5:
                return "Thursday";
            case 6:
                return "Friday";
            case 7:
                return "Saturday";
            default:
                return "null";
            }
        
        }
        
    }
    
