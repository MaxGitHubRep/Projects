/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.max.tester.managers.time;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Max
 */
public class TimeBreakDown {
    
    public void breakDownTime(long diff) {
        LinkedHashMap<String, Long> n = new LinkedHashMap<>();
        long days = TimeUnit.MILLISECONDS.toDays(diff);
        diff -= TimeUnit.DAYS.toMillis(days);
        
        long years = days/365;
        days -= years*365;
        long months = days / 30;
        days -= months * 30;

        long hours = TimeUnit.MILLISECONDS
            .toHours(diff);
        diff -= TimeUnit.HOURS.toMillis(hours);

        long minutes = TimeUnit.MILLISECONDS
            .toMinutes(diff);
        diff -= TimeUnit.MINUTES.toMillis(minutes);

        long seconds = TimeUnit.MILLISECONDS
            .toSeconds(diff);
        n.put("Years", years);
        n.put("Months", months);
        n.put("Days", days);
        n.put("Hours", hours);
        n.put("Minutes", minutes);
        n.put("Seconds", seconds);
        
        for (Map.Entry<String, Long> e : n.entrySet()) {
            System.out.println(" - " + e.getKey() + ": " + Math.abs(e.getValue()));
        }
    }
    
}
