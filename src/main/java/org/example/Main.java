package org.example;

import org.example.Singleton.EnumSingleton;

public class Main {
    public static void main(String[] args) {
        EnumSingleton.INSTANCE.doSomething();
    }
}