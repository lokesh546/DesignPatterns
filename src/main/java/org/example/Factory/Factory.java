package org.example.Factory;

public class Factory {

    private Factory() {

    }


    public static OperatingSystem getInstance(String type, String version, String architecture) {

        return switch (type) {
            case "WINDOWS" -> new Windows(version, architecture);
            case "LINUS" -> new Linus(version, architecture);
            default -> throw new IllegalArgumentException("OS Not supported");
        };
    }
}
