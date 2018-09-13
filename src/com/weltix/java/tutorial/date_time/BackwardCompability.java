/*
 * Copyright (c) 13.09.2018, DMITRIY BLUDOV. All rights reserved.
 */

package com.weltix.java.tutorial.date_time;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;
import java.util.TimeZone;

public class BackwardCompability {
    public static void main(String[] args) {
        BackwardCompability.testTimeZoneCompat();
        BackwardCompability.testDateCompat();
    }

    public static void testTimeZoneCompat() {
        ZoneId zoneId1 = ZoneId.of("Europe/Moscow");
        TimeZone timeZone = TimeZone.getTimeZone(zoneId1);
        ZoneId zoneId2 = timeZone.toZoneId();
        System.out.println(zoneId1.equals(zoneId2));
//        Assert.assertEquals(zoneId1, zoneId2);
    }

    public static void testDateCompat() {
        Instant instant1 = Clock.systemUTC().instant();
        Date date = Date.from(instant1);
        Instant instant2 = date.toInstant();
        System.out.println(instant1.equals(instant2));
//        Assert.assertEquals(instant1, instant2);
    }
}
