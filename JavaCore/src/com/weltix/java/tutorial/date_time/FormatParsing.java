/*
 * Copyright (c) 30.05.2019, DMITRIY BLUDOV. All rights reserved.
 */

package com.weltix.java.tutorial.date_time;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Locale;

public class FormatParsing {
    public static void main(String[] args) {
        FormatParsing.testFormat();
    }

    public static void testFormat() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss z", Locale.ENGLISH);

        ZonedDateTime zdt1 = ZonedDateTime.of(2005, 10, 30, 0, 0, 0, 0, ZoneId.of("Europe/Moscow"));

        String text = zdt1.format(formatter);
        System.out.println(text);

        TemporalAccessor ta = formatter.parse(text); // java.time.format.Parsed
        ZonedDateTime zdt2 = ZonedDateTime.from(ta);
        System.out.println(zdt2);
        System.out.println("zdt1.equals(zdt2) = " + zdt1.equals(zdt2));
//        Assert.assertEquals(zdt1, zdt2);
    }
}
