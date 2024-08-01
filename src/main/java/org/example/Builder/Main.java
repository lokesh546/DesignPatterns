package org.example.Builder;

public class Main {

    public static void main(String[] args) {
        Phone phone =new Phone.PhoneBuilder().ram(4).builder();
        System.out.println(phone.getRam());
    }
}
