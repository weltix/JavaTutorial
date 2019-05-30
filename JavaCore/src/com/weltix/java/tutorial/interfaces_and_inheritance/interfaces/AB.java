/*
 * Copyright (c) 30.05.2019, DMITRIY BLUDOV. All rights reserved.
 */

package com.weltix.java.tutorial.interfaces_and_inheritance.interfaces;

/**
 * Класс не разрешает использовать 2 метода с полностью одинаковыми сигнатурами,
 * даже если у них разные типы возвращаемых данных.
 * 1. Разные имена, разные типы параметров - OK.
 * 2. Одинаковые имена, а типы параметров разные - OK (перегрузка методов).
 * <p>
 * При реализации классом двух интерфейсов с двумя методами, у которых одинаковые сигнатуры:
 * 1. Одинаковые возращаемые типы - ОК (переопределяется один общий метод для обеих интерфейсов сразу).
 * 2. Разные возвращаемые типы - FAIL (документация не даёт решений по этому вопросу),
 * а реализовать сразу void a(int a1) и int a(int b1) в одном классе нельзя.
 */

interface A {
    int a(int a1);
}

interface B {
    default int a(int b1) {
        System.out.println(b1);
        return b1;
    }
}

class ABImplementation implements A, B {
    @Override
    public int a(int a1) {
        System.out.println(a1);
        return a1;
    }
}



abstract class Abstract {
    int first = 5;
    static int second = 10;

    abstract void a();
}
// класс наследник собирает в себя все методы и поля родительских классов
public class AB extends Abstract {
    int second = 7;  // not recommended, bad practice to hide fields (and change static to instance, or vice verse)

    public void a() {
        System.out.println(first);
        System.out.println(second);
    }

    public static void main(String[] args) {
        Abstract object = new AB();
        object.a();
    }
}