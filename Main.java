package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a[] = new int[t];
        int positives = 0,
                negatives = 0,
                zeros = 0;
        for (int i = 0; i < t; i++) {
            a[i] = sc.nextInt();
        }
        // Calc //
        for (int i = 0; i < t; i++) {
            if (a[i] > 0) positives += 1;
            else if (a[i] < 0) negatives += 1;
            else zeros += 1;
        }
        // Output //
            System.out.println((float) positives / t);
            System.out.println((float) negatives / t);
            System.out.println((float) zeros / t);
    }
}
