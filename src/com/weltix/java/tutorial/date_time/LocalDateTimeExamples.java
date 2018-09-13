/*
 * Copyright (c) 12.09.2018, DMITRIY BLUDOV. All rights reserved.
 */

package com.weltix.java.tutorial.date_time;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.time.chrono.IsoChronology;
import java.time.chrono.JapaneseChronology;
import java.time.chrono.ThaiBuddhistChronology;

/**
 * This class is not part of original Java Tutorial, but is presence here for convenience.
 * <p>
 * {@Источник https://habr.com/post/274905/}
 * Пройдемся по фабричным методам:
 * java.time.Clock#systemDefaultZone — метод создает системные часы во временной зоне по-умолчанию.
 * java.time.Clock#systemUTC — метод создает системные часы во временной зоне UTC.
 * java.time.Clock#system — метод создает системные часы в указанной временной зоне.
 * java.time.Clock#fixed — метод создает часы константного времени, то есть часы не идут, а стоят на месте.
 * java.time.Clock#offset — метод создает прокси над указанными часами, который смещает время на указанную величину.
 * java.time.Clock#tickSeconds — метод создает системные часы в указанной временной зоне, значение которых округлено до целых секунд.
 * java.time.Clock#tickMinutes — метод создает системные часы в указанной временной зоне, значение которых округлено до целых минут.
 * java.time.Clock#tick — метод создает прокси над указанными часами, который округляет значения времени до указанного периода.
 * java.time.Clock#withZone — метод создает копию текущих часов в другой временной зоне.
 * <p>
 * У объекта java.time.Clock всего три рабочих метода:
 * java.time.Clock#getZone — запросить временную зону в которой работают часы.
 * java.time.Clock#millis — запросить текущее время в миллисекундах по Unix-time
 * java.time.Clock#instant — запросить текущее время в самом общем смысле (по факту — в наносекундах по Unix-time)
 */
public class LocalDateTimeExamples {
    public static void main(String[] args) {
        LocalDateTimeExamples.testLocalDateTime();
        LocalDateTimeExamples.testLocalDateTimeCreate1();
        LocalDateTimeExamples.testLocalDateTimeCreate2();
        LocalDateTimeExamples.testChronology();
    }

    public static void testLocalDateTime() {
        ZonedDateTime zdt1 = ZonedDateTime.of(2015, 1, 10, 15, 0, 0, 0, ZoneId.of("Europe/Moscow"));
        ZonedDateTime zdt2 = ZonedDateTime.of(2015, 1, 10, 14, 0, 0, 0, ZoneId.of("Europe/London"));
//        Assert.assertEquals(-1, zdt1.compareTo(zdt2));
        System.out.println("zdt1 = " + zdt1);
        System.out.println("zdt2 = " + zdt2);
        System.out.println("zdt1.compareTo(zdt2) = " + zdt1.compareTo(zdt2));

        LocalDateTime ldt1 = zdt1.toLocalDateTime();
        LocalDateTime ldt2 = zdt2.toLocalDateTime();
//        Assert.assertEquals(+1, ldt1.compareTo(ldt2));
        System.out.println("ldt1 = " + ldt1);
        System.out.println("ldt2 = " + ldt2);
        System.out.println("ldt1.compareTo(ldt2) = " + ldt1.compareTo(ldt2) + "\n");
    }

    public static void testLocalDateTimeCreate1() {
        Clock clock = Clock.system(ZoneId.of("Europe/Moscow"));

        // java.time.DateTimeException: Unable to obtain LocalDateTime \
        //        from TemporalAccessor: 2016-01-11T15:15:03.180Z of type java.time.Instant
        // LocalDateTime ldt = LocalDateTime.from(clock.instant());
    }

    public static void testLocalDateTimeCreate2() {
        Clock clock = Clock.system(ZoneId.of("Europe/Moscow"));

        LocalDateTime ldt1 = LocalDateTime.ofInstant(clock.instant(), ZoneId.of("UTC"));
        System.out.println("ldt1 = " + ldt1);

        LocalDateTime ldt2 = LocalDateTime.now(clock);
        System.out.println("ldt2 = " + ldt2 + "\n");
    }

    public static void testChronology() {
        Clock clock = Clock.system(ZoneId.of("Europe/Moscow"));
        ZonedDateTime zdt = ZonedDateTime.now(clock);

        ChronoLocalDateTime dt1 = IsoChronology.INSTANCE.localDateTime(zdt);
        System.out.println("dt1 = " + dt1); // 2016-01-11T18:48:15.145

        ChronoLocalDateTime dt2 = JapaneseChronology.INSTANCE.localDateTime(zdt);
        System.out.println("dt2 = " + dt2); // Japanese Heisei 28-01-11T18:48:15.145

        ChronoLocalDateTime dt3 = ThaiBuddhistChronology.INSTANCE.localDateTime(zdt);
        System.out.println("dt3 = " + dt3); // ThaiBuddhist BE 2559-01-11T18:48:15.145
    }
}