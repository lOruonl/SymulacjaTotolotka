package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);
    public static int[] randomNumber = new int[6];
    public static int[] number = new int [6];
    public static void main(String[] args) {
        System.out.println("Prosze wpisac wybrane prszez was licbe od 1 - 49: ");
        for (int i = 0; i < number.length; i++) {
            number[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(number));
    TotolotoNumber();
        System.out.println(Match.matchingNumbers(number, randomNumber));

    }


    public static void TotolotoNumber(){
        for (int i = 0; i < randomNumber.length; i++) {
            randomNumber[i] = (int) Math.round(Math.random() * 50);
        }
        System.out.println(Arrays.toString(randomNumber));
    }
}
    class Match {
        public static int matches;

        public static int matchingNumbers(int[] a, int[] b) {
            if (a.length == b.length) {
                for (int i = 0; i < a.length; i++) {
                    if (a[i] == b[i])
                        matches += 1;
                }
            }
            return matches;
        }
    }