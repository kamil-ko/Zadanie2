package com.company;

import java.util.Scanner;

public class ScannerUtils {
    public static final Scanner scanner = new Scanner(System.in);

    public static float getFromScannerFloat (String message) {
        System.out.println(message);
        return scanner.nextInt();
    }

    public static int getFromScannerInt (String message) {
        System.out.println(message);
        return scanner.nextInt();

}
    }
