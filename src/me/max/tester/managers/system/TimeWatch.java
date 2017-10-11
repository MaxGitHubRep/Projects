/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.max.tester.managers.system;

import java.util.concurrent.TimeUnit;

/** https://stackoverflow.com/questions/1770010/how-do-i-measure-time-elapsed-in-java
 *
 * @usage:
 * 
 *   TimeWatch watch = TimeWatch.start();
 *     // do something
 *   System.out.print(watch.time());
 * 
 */
public class TimeWatch {    
    long starts;

    public static TimeWatch start() {
        return new TimeWatch();
    }

    private TimeWatch() {
        reset();
    }

    public TimeWatch reset() {
        starts = System.currentTimeMillis();
        return this;
    }

    public long time() { // returns in seconds
        long ends = System.currentTimeMillis();
        return TimeUnit.MILLISECONDS.toSeconds(ends - starts);
    }

    public long time(TimeUnit unit) {
        return unit.convert(time(), TimeUnit.MILLISECONDS);
    }
    
}