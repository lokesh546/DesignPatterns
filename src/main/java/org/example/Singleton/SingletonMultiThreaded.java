package org.example.Singleton;

public class SingletonMultiThreaded {


    public static volatile SingletonMultiThreaded instance = null;

    private SingletonMultiThreaded() {

    }

    public static SingletonMultiThreaded getInstance() {

        if (instance == null) {

            synchronized (SingletonMultiThreaded.class) {

                if (instance == null) {
                    instance = new SingletonMultiThreaded();
                }
            }
        }
        return instance;
    }
}
