package com.programandotv;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> randomIntegerNumberList = generateRandomIntegerNumbers();

        ArrayList<Integer> evenIntegerNumberList = getEvenNumbers(randomIntegerNumberList);
        ArrayList<Integer> oddIntegerNumberList = getOddNumber(randomIntegerNumberList);

        printEvenNumbers(evenIntegerNumberList);

        printOddNumbers(oddIntegerNumberList);

    }

    private static void printOddNumbers(ArrayList<Integer> oddIntegerNumberList) {
        System.out.println("Odd Numbers: ");
        for (int value: oddIntegerNumberList) {
            System.out.println(value);
        }
    }

    private static void printEvenNumbers(ArrayList<Integer> evenIntegerNumberList) {
        System.out.println("Even Numbers: ");
        for (int value: evenIntegerNumberList) {
            System.out.println(value);
        }
    }

    private static ArrayList<Integer> getOddNumber(ArrayList<Integer> randomIntegerNumberList) {
        ArrayList<Integer> oddIntegerNumberList = new ArrayList<Integer>();

        for (int value: randomIntegerNumberList) {
            if (value % 2 != 0) {
                oddIntegerNumberList.add(value);
            }
        }
        return oddIntegerNumberList;
    }

    private static ArrayList<Integer> getEvenNumbers(ArrayList<Integer> randomIntegerNumberList) {

        ArrayList<Integer> evenIntegerNumberList = new ArrayList<Integer>();

        for (int value: randomIntegerNumberList) {
            if (value % 2 == 0) {
                evenIntegerNumberList.add(value);
            }
        }
        return evenIntegerNumberList;
    }

    private static ArrayList<Integer> generateRandomIntegerNumbers() {
        ArrayList<Integer> randomIntegerNumberList = new ArrayList<Integer>();
        for (int i=0;i<10;i++) {
            randomIntegerNumberList.add((int)(Math.random()*50+1));
        }

        return  randomIntegerNumberList;
    }
}
