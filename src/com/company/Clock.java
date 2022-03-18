
package com.company;

public class Clock {
    final int hoursLimit = 12;
    final int minutesLimit = 60;
    int hours = hoursLimit;
    int minutes = 0;

    void next() {
        if (minutes + 1 == minutesLimit) {
            minutes = 0;
            if (hours + 1 > hoursLimit) {
                hours = 1;
            } else {
                hours++;
            }
        } else {
            minutes++;
        }
    }
}