package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String nextString;
        int nextInt;

	    // input user data (int)
        Scanner scanner = new Scanner(System.in);
        nextInt = scanner.nextInt();

        // output user data (int)
        System.out.println("You entered " + nextInt);

        // string after int, needs to read the \n from hitting enter on int
        scanner.nextLine();

        // input user data (string)
        nextString = scanner.nextLine();

        // output user data (string)
        System.out.println("You entered " + nextString);
    }
}
