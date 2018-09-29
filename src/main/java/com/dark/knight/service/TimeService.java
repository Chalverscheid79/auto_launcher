package com.dark.knight.service;

import javax.xml.stream.events.StartDocument;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class TimeService {

    private Long startTime = System.currentTimeMillis();

    private final int hour;
    private final Calendar calendar;

    public TimeService(Long startTime) {

        calendar = Calendar.getInstance();
        // here's how to get the Hour in 24 timestamp
        hour = calendar.get(Calendar.HOUR_OF_DAY);
        calendar.add(Calendar.MILLISECOND,5*60*1000);
    }

    public Long calculateLauncherTime() {

        long launcherTime;
        if (hour >= 13) {

            launcherTime = randomLauncherTime(150, 190) + randomLauncherTime(45, 15);
        } else {

            launcherTime = randomLauncherTime(145, 170) + (13 * 60) - (hour * 60) - calendar.get(Calendar.MINUTE);
        }
        return launcherTime;
    }

    private int randomLauncherTime(int from, int to) {
        Random rnd = new Random();
        return rnd.nextInt((to) + from);
    }
}
