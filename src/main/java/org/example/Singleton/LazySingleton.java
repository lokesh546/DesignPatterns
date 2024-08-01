package org.example.Singleton;

import java.io.Serializable;

public class LazySingleton implements Serializable {

    private static LazySingleton lazySingleton = null;

    private LazySingleton() {

    }

    // In multithreaded environment it will create two objects for us result failing singleton design patter
    // to overcome this there is eager single ton class created - refer their
    public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
