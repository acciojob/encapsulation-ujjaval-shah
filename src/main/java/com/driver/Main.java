package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rw = new RWOnly();

        // The field RWOnly.v is not visible
        // System.out.println(rw.v);

        rw.setV(100);
        System.out.println(rw.getV());
    }
}