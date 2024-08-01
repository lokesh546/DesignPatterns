package org.example.Factory;

public class Main {

    public static void main(String[] args) {

        OperatingSystem instance = Factory.getInstance("WINDOWS", "v1", "Win");

        if(instance instanceof Windows) {
            System.out.println("Hello");
        }
    }
}
