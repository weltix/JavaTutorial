/*
 * Copyright (c) 12.09.2018, DMITRIY BLUDOV. All rights reserved.
 */

package com.weltix.java.tutorial.date_time;

import java.time.Clock;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.*;

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
public class BaseInterfaces {
    public static void main(String[] args) {
        BaseInterfaces.testTemporalAccessor3();
        BaseInterfaces.testTemporalAccessor4();
        BaseInterfaces.testTemporal1();
        BaseInterfaces.testTemporalAdjuster();
    }

    public static void testTemporalAccessor3() {
        TemporalAccessor ta = Clock.systemUTC().instant();
        // java.time.DateTimeException: Invalid value for InstantSeconds \
        //               (valid values -9223372036854775808 - 9223372036854775807): 1451983908
        System.out.println("TemporalAccessor getLong() = " + ta.getLong(ChronoField.INSTANT_SECONDS));

        ValueRange vr = ta.range(ChronoField.INSTANT_SECONDS);
        System.out.println("ValueRange range() = " + vr.getMinimum());
        System.out.println("ValueRange range() = " + vr.getMaximum());

        System.out.println("TemporalAccessor isSupported() = " + ta.isSupported(ChronoField.INSTANT_SECONDS));
        System.out.println("TemporalAccessor isSupported() = " + ta.isSupported(ChronoField.CLOCK_HOUR_OF_DAY) + "\n");
    }

    public static void testTemporalAccessor4() {
        TemporalAccessor ta = Clock.systemUTC().instant();

        ZoneId zoneId1 = ta.query(TemporalQueries.zone());
        ZoneId zoneId2 = TemporalQueries.zone().queryFrom(ta);
//        System.out.println("zoneId1.equals(zoneId2) = " + zoneId1.equals(zoneId2));

        TemporalUnit unit1 = ta.query(TemporalQueries.precision());
        TemporalUnit unit2 = TemporalQueries.precision().queryFrom(ta);
        System.out.println("unit1.equals(unit2) = " + unit1.equals(unit2));
    }

    public static void testTemporal1() {
        Temporal t1 = Clock.systemUTC().instant();
        Temporal t2 = t1.plus(1, ChronoUnit.DAYS);

//        Assert.assertEquals(Duration.ofDays(1).getSeconds(),
//                t2.getLong(ChronoField.INSTANT_SECONDS) - t1.getLong(ChronoField.INSTANT_SECONDS));
//
//        Assert.assertEquals(24, t1.until(t2, ChronoUnit.HOURS));
//        Assert.assertEquals(24, Duration.between(t1, t2).get(ChronoUnit.HOURS));
    }

    public static void testTemporalAdjuster() {
        ZonedDateTime zdt = ZonedDateTime.of(2005, 10, 30, 0, 0, 0, 0, ZoneId.of("Europe/Moscow"));

        ZonedDateTime zdt1 = zdt.with(TemporalAdjusters.firstDayOfYear());
        ZonedDateTime zdt2 = (ZonedDateTime) TemporalAdjusters.firstDayOfYear().adjustInto(zdt);
//        Assert.assertEquals(zdt1, zdt2);
//
//        Assert.assertEquals(2005, zdt1.get(ChronoField.YEAR));
//        Assert.assertEquals(1, zdt1.get(ChronoField.MONTH_OF_YEAR));
//        Assert.assertEquals(1, zdt1.get(ChronoField.DAY_OF_MONTH));
    }
}
