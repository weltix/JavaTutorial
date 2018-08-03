package com.weltix.java.tutorial.classes.lambdaexpressions;

/**
 * Created by ASUS on 22.05.14.
 */
import java.lang.Runnable;
import java.util.concurrent.Callable;

public class MyClass {

    String s = null;

    void invoke(Runnable r) {
        r.run();
    }

    <T> T invoke(Callable<T> c) throws Exception {
        return c.call();
    }

    String methodChoosing() throws Exception {
        return invoke(() -> "done");
        //or as it is in Anonymous Class
        /*
        return invoke (new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "done";
            }
        });
        */
    }

    public static void main(String[] args) throws Exception {
        MyClass myClass = new MyClass();
        myClass.s = myClass.methodChoosing();
        System.out.println(myClass.s);
    }
}
