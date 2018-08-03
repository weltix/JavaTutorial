package com.weltix.java.tutorial.interfaces_and_inheritance.interfaces;

import java.time.*;
/**
 * Created by ASUS on 09.06.14.
 */
public interface TimeClient {
    void setTime(int hour, int minute, int second);
    void setDate(int day, int month, int year);
    void setDateAndTime(int day, int month, int year,
                        int hour, int minute, int second);
    LocalDateTime getLocalDateTime();
}