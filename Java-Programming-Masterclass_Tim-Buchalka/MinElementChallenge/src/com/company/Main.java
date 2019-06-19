package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter count:");
        int count = scanner.nextInt();
        int[] numbersArray = readIntegers(count);
        int minElement = findMin(numbersArray);
        System.out.println("Minimum element is: " + minElement);
    }

    private static int[] readIntegers(int count) {
        int[] numbers = new int[count];

        System.out.println("Please enter " + count + " numbers:");
        for (int i = 0; i < count; i ++) {
            numbers[i] = scanner.nextInt();
        }

        return numbers;
    }

    private static int findMin(int[] array) {
        int minValue = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) minValue = array[i];
        }

        return minValue;
    }
}
