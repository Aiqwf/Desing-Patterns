package Singleton;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main  {
    public static void main(String[] args) {

Thread thread = new Thread(() -> TestClass.ins("new"));
        Thread thread1 = new Thread(() -> TestClass.ins("new"));
        Thread thread2 = new Thread(() -> TestClass.ins("new"));
        Thread thread3 = new Thread(() -> TestClass.ins("new"));
    thread.start();
    thread1.start();

        thread2.start();
        thread3.start();

    }
}
