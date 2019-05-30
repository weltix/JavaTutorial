/*
 * Copyright (c) 30.05.2019, DMITRIY BLUDOV. All rights reserved.
 */

package com.weltix.java.tutorial.date_time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;

public class ZonedDateTimeExamples {
    public static void main(String[] args) {
        ZonedDateTimeExamples.testZoned1();
        ZonedDateTimeExamples.testZoned2();
        ZonedDateTimeExamples.testLenient2();
        ZonedDateTimeExamples.testLenient3();
        ZonedDateTimeExamples.testLenient1();
    }

    public static void testZoned1() {
        LocalDateTime ldt = LocalDateTime.of(2015, 1, 10, 0, 0, 0, 0);
        // java.time.DateTimeException: Unable to obtain ZonedDateTime from TemporalAccessor: 2015-01-10T00:00 of type java.time.LocalDateTime
//        ZonedDateTime zdt = ZonedDateTime.from(ldt);
    }

    public static void testZoned2() {
        LocalDateTime ldt = LocalDateTime.of(2015, 1, 10, 0, 0, 0, 0);
        ZonedDateTime zdt = ZonedDateTime.of(ldt, ZoneId.of("Europe/Moscow"));
        System.out.println("zdt = " + zdt);
    }

    public static void testLenient2() {
        // java.time.DateTimeException: Invalid date 'February 29' as '2005' is not a leap year
//        ZonedDateTime.of(2005, 2, 29, 2, 30, 0, 0, ZoneId.of("Europe/Moscow"));
    }

    public static void testLenient3() {
        // java.time.DateTimeException: Invalid value for SecondOfMinute (valid values 0 - 59): 60
//        ZonedDateTime.of(2005, 2, 20, 2, 30, 60, 0, ZoneId.of("Europe/Moscow"));
    }

    public static void testLenient1() {
        ZonedDateTime zdt = ZonedDateTime.of(2005, 3, 27, 2, 30, 0, 0, ZoneId.of("Europe/Moscow"));
//        Assert.assertEquals(3, zdt.getLong(ChronoField.HOUR_OF_DAY));
//        Assert.assertEquals(30, zdt.getLong(ChronoField.MINUTE_OF_HOUR));
        System.out.println(zdt.getLong(ChronoField.HOUR_OF_DAY));
        System.out.println(zdt.getLong(ChronoField.MINUTE_OF_HOUR));
    }
}
