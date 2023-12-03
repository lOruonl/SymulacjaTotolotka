package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);
    public static ArrayList<Integer> randomNumber = new ArrayList<>();
    public static ArrayList<Integer> number = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Prosze wpisac wybrane prszez was licbe od 1 - 49: ");
            for (int i = 0; i <= number.size(); i++) {
                if (number.size() < 6) {
                    number.add(scan.nextInt());
                }
            }
            System.out.println(number);
             TotolotoNumber();
            System.out.println(Match.matchingNumbers(number, randomNumber));

    }


    public static void TotolotoNumber(){
        for (int i = 0; i < randomNumber.size(); i++) {
            if (randomNumber.size() < 6) {
                randomNumber.add((int) Math.round(Math.random() * 50));
            }
        }
        System.out.println(randomNumber);
    }
}
    class Match {
        public static int matches;
        public static int matchingNumbers(ArrayList<Integer> a, ArrayList<Integer> b) {
            if (a.size() == b.size()) {
                for (int i = 0; i <= a.size(); i++) {
                    if (a.get(i).equals(b.get(i)))
                        matches += 1;
                }
            }
            return matches;
        }
    }