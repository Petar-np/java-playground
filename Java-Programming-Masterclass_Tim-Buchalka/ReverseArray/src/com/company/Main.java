package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] array = {1, 5, 3, 2, 5};
        System.out.println("Original: " + Arrays.toString(array));
        reverseArray(array);
        System.out.println("Reversed: " + Arrays.toString(array));
    }

    private static void reverseArray(int [] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int left = array[i];
            int right = array[array.length - i - 1];
            array[i] = right;
            array[array.length - i -1] = left;
        }
    }
}
