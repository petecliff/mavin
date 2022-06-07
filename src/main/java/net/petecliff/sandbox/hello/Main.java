package net.petecliff.sandbox.hello;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(final String[] args) {
        final LocalDateTime now = LocalDateTime.now();

        System.out.println("Maven build run on " + now);
    }
}