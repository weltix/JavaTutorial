/*
 * Copyright (c) 13.09.2018, DMITRIY BLUDOV. All rights reserved.
 */

package com.weltix.java.tutorial.date_time;

import java.time.Duration;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class PeriodDuration {
    public static void main(String[] args) {
        PeriodDuration.testDuration();
    }

    public static void testDuration() {
        Period period = Period.of(0, 0, 1);
        Duration duration = Duration.of(1, ChronoUnit.DAYS);

        ZonedDateTime zdt1 = ZonedDateTime.of(2005, 10, 30, 0, 0, 0, 0, ZoneId.of("Europe/Moscow"));

        ZonedDateTime ztd2 = zdt1.plus(period);
        System.out.printf("%21s %s\n", "zdt1.plus(period) =", ztd2);
//        Assert.assertEquals(ZonedDateTime.of(2005, 10, 31, 0, 0, 0, 0, ZoneId.of("Europe/Moscow")),
//                ztd2);

        ZonedDateTime ztd3 = zdt1.plus(duration);
        System.out.printf("%21s %s\n", "zdt1.plus(duration) =", ztd3);
//        Assert.assertEquals(ZonedDateTime.of(2005, 10, 30, 23, 0, 0, 0, ZoneId.of("Europe/Moscow")),
//                ztd3);
    }
}
