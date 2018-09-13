/*
 * Copyright (c) 13.09.2018, DMITRIY BLUDOV. All rights reserved.
 */

package com.weltix.java.tutorial.date_time;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class OffsetDateTimeExamples {
    public static void main(String[] args) {
        OffsetDateTimeExamples.testWinterDay();
    }

    public static void testWinterDay() {
        ZonedDateTime zdt1 = ZonedDateTime.of(2005, 10, 30, 0, 0, 0, 0, ZoneId.of("Europe/Moscow"));

        // case #1 - ok
        ZonedDateTime zdt2 = zdt1.plusDays(1);
//        Assert.assertEquals(25, Duration.between(zdt1, zdt2).toHours());
        System.out.println("zdt1 vs zdt2 = " + Duration.between(zdt1, zdt2).toHours());

        // case #2 - ok
        ZonedDateTime zdt3 = zdt1.plus(1, ChronoUnit.DAYS);
//        Assert.assertEquals(25, Duration.between(zdt1, zdt3).toHours());
        System.out.println("zdt1 vs zdt3 = " + Duration.between(zdt1, zdt3).toHours());

        // case #3 - ok
        OffsetDateTime odt1 = zdt1.toOffsetDateTime();
        OffsetDateTime odt2 = zdt2.toOffsetDateTime();
//        Assert.assertEquals(25, Duration.between(odt1, odt2).toHours());
        System.out.println("odt1 vs odt2 = " + Duration.between(odt1, odt2).toHours());

        // case #4 - ???
        OffsetDateTime odt3 = zdt1.toOffsetDateTime();
        OffsetDateTime odt4 = odt3.plus(1, ChronoUnit.DAYS);
//        Assert.assertEquals(24, Duration.between(odt3, odt4).toHours());
        System.out.println("odt3 vs odt4 = " + Duration.between(odt3, odt4).toHours());

        // case #5 - ok
        Instant instant1 = Instant.from(zdt1);
        Instant instant2 = Instant.from(zdt2);
//        Assert.assertEquals(25, Duration.between(instant1, instant2).toHours());
        System.out.println("instant1 vs instant2 = " + Duration.between(instant1, instant2).toHours());

        // case #6 - ???
        Instant instant3 = Instant.from(zdt1);
        Instant instant4 = instant3.plus(1, ChronoUnit.DAYS);
//        Assert.assertEquals(24, Duration.between(instant3, instant4).toHours());
        System.out.println("instant3 vs instant4 = " + Duration.between(instant3, instant4).toHours());

        // case #7 - ???
        LocalDateTime localDateTime1 = LocalDateTime.from(zdt1);
        LocalDateTime localDateTime2 = localDateTime1.plus(1, ChronoUnit.DAYS);
//        Assert.assertEquals(24, Duration.between(localDateTime1, localDateTime2).toHours());
        System.out.println("localDateTime1 vs localDateTime2 = " + Duration.between(localDateTime1, localDateTime2).toHours());

        // case #8 - ???
        LocalDateTime localDateTime3 = LocalDateTime.from(zdt1);
        LocalDateTime localDateTime4 = LocalDateTime.from(zdt2);
//        Assert.assertEquals(24, Duration.between(localDateTime3, localDateTime4).toHours());
        System.out.println("localDateTime3 vs localDateTime4 = " + Duration.between(localDateTime3, localDateTime4).toHours());
    }
}
