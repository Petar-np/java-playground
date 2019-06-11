package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	    int[] array = getIntegers(10);
	    printArray(array);
        System.out.println("Sorted:");
	    int[] sorted = sortArray(array);
        printArray(sorted);
    }

    public static int[] getIntegers(int number) {
        int[] array = new int[number];
        System.out.println("Enter " + number + " integers:\r");
        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element #" + i + " = " + array[i]);
        }
    }

    public static int[] sortArray(int[] array) {
        int[] newArray = mergeSort(array, array.length);;

        return newArray;
    }

    public static int[] mergeSort(int[] array, int length) {
        if( length < 2) {
            return null;
        }

        int middle = length / 2;
        int[] left = new int[middle];
        int[] right = new int[length - middle];

        for (int i = 0; i < middle; i++) {
            left[i] = array[i];
        }

        for (int i = middle; i < length; i++) {
            right[i - middle] = array[i];
        }

        mergeSort(left, left.length);
        mergeSort(right, right.length);

        return merge(array, left, right);
    }

    public static int[] merge(int[] arr, int[] left, int[] right) {
        int leftIndex = 0;
        int rightIndex = 0;
        boolean leftEmpty = false;
        boolean rightEmpty = false;

        for(int i = 0; i < arr.length; i++) {
            if (leftEmpty) {
                arr[i] = right[rightIndex];
                rightIndex++;
            } else if (rightEmpty) {
                arr[i] = left[leftIndex];
                leftIndex++;
            } else if (left[leftIndex] < right[rightIndex]) {
                arr[i] = left[leftIndex];
                if(leftIndex + 1 != left.length) {
                    leftIndex++;
                } else {
                    leftEmpty = true;
                }
            } else {
                arr[i] = right[rightIndex];
                if(rightIndex + 1 != right.length) {
                    rightIndex++;
                } else {
                    rightEmpty = true;
                }
            }
        }

        return arr;
    }
}
