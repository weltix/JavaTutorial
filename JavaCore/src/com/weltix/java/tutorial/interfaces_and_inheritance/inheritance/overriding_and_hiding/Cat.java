/*
 * Copyright (c) 30.05.2019, DMITRIY BLUDOV. All rights reserved.
 */

package com.weltix.java.tutorial.interfaces_and_inheritance.inheritance.overriding_and_hiding;

public class Cat extends Animal {
    public static void testClassMethod() {
        System.out.println("The static method in Cat");
    }
    @Override
    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }
    public static void main(String[] args) {
        Cat myCat = new Cat();
        Animal myAnimal = myCat;
        Animal.testClassMethod();
        myAnimal.testInstanceMethod();    // реализуется полиморфизм - переменная суперкласса, а метод объекта субкласса
        myCat.testInstanceMethod();
        myAnimal.testClassMethod();
        myCat.testClassMethod();
        myCat.testStaticInheritance();
        // В отличие от правил наследования в интерфейсах, где static методы вообще не наследуются,
        // и могут быть вызваны только с указанием имени конкретного интерфейса,
        // в классах subclass как-бы наследует статический метод от superclass,
        // но вызывать любой статический метод всё же правильнее используя имя класса или интерфейса,
        // а не через объект класса (ну или же субкласса)
    }
}