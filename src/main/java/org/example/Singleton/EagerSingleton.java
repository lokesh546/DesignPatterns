package org.example.Singleton;

import java.io.Serial;
import java.io.Serializable;

public class EagerSingleton implements Serializable {

    // When the class loaded in JVM Object will be created but here is also there is problem what if there is no
    // use case of this object then also we are creating object and wasting heap memory.
    public static EagerSingleton singleton = new EagerSingleton();


    private EagerSingleton() {

    }

    public static EagerSingleton getInstance() {return singleton;}

    /*
        when deserialization happens we will get the same object.
     */
    protected Object readResolve() {return singleton;}
 }
