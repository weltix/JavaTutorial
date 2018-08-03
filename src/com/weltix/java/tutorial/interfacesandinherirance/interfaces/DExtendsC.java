package com.weltix.java.tutorial.interfacesandinherirance.interfaces;

interface C {

    int a(int a1);

    default int d(int d1) {
        return s(d1);
    }

    default int dd(int dd1) {
        return s(dd1);
    }

    // static is "helper". In interfaces it belongs only to current interface and cannot be inherited anyway.
    // It is absolutely unique method, and it must be referenced only as "C.s(x)"
    static int s(int s1) {
        return 555;
    }
}

public interface DExtendsC extends C {
    /**
     * 1. Not mention the abstract method at all, which lets "DExtendsC" interface inherit the abstract method from "C".
     * 2. Redeclare the method, leaving it "abstract". (non sense)
     * * @Override int a(int a1);
     * <p>
     * 3. Redefine the abstract method, using "default" keyword. (default implementation)
     */

    // @Override int a(int a1);
    @Override
    default int a(int a1) {
        return 222;
    }

    /**
     * 1. Not mention the default method at all, which lets "DExtendsC" interface inherit the default method from "C".
     * 2. Redeclare the method, which makes it "abstract".
     * * @Override int d(int d1);
     * <p>
     * 3. Redefine the default method, which overrides it.
     */

    // @Override int d(int d1);
    @Override
    default int d(int d1) {
        return 333;
    }

    // static is "helper". And this belongs only to this interface, it cannot inherit or @Override method from "C" interface.
    // It is absolutely new method, and it must be referenced only as "DExtendsC.s(x)".
    static int s(int s1) {
        return 444;
    }
}

class F implements C {
    static private int a, d, s;

    @Override
    public int a(int a1) {
        return 111;
    }

    static public void main(String... args) {
        C f = new F();
        a = f.a(1);
        d = f.d(2);
        // f.s(0); - not allowed
        s = C.s(3);
    }
}

// Implementation of parent and it's child interfaces will prefer to use child's overridden methods.
// "implements DExtendsC" is equal to "implements DExtendsC, C"
// Если реализуются полностью разные интерфейсы, и встречаются методы с одинаковой сигнатурой, см. AB.java
class E implements DExtendsC {
    static private int a, d, dd, s;

    static public void main(String... args) {
        C e = new E();
        DExtendsC e1 = new E();
        // No matter what type a variable has; overridden methods of child's interface are preferable to use.
        a = e.a(1); //222
        d = e.d(1); //333
        dd = e.dd(1); //555
        a = e1.a(2); //222
        d = e1.d(2); //333
        dd = e1.dd(2); //555
        // e.s(0); - not allowed
        // e1.s(0); - not allowed
        s = C.s(3);
        s = DExtendsC.s(4);
    }
}