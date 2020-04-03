/*
 * Copyright (c) 30.05.2019, DMITRIY BLUDOV. All rights reserved.
 */
package com.weltix.java.tutorial.date_time;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;

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
public class InstantExample {
    public static void main(String[] args) {

        System.out.println("System.currentTimeMillis() = " + System.currentTimeMillis());

        InstantExample.testInstantFields();
        InstantExample.testInstantString();
    }

    public static void testInstantFields() {
        Instant instant = Clock.systemDefaultZone().instant();

        System.out.format("%28s %s%n", "instant.getEpochSecond() =", instant.getEpochSecond());
        System.out.format("%28s %s%n", "instant.getNano() =", instant.getNano());

        System.out.format("%28s %s%n%n", "instant.toEpochMilli() =", instant.toEpochMilli());
    }

    public static void testInstantString() {
        Instant instant1 = Clock.system(ZoneId.of("Europe/Paris")).instant();
        System.out.println(instant1.toString());

        Instant instant2 = Clock.systemUTC().instant();
        System.out.println(instant2.toString());

        Instant instant3 = Clock.systemDefaultZone().instant();
        System.out.println(instant3.toString() + "\n");
    }


}