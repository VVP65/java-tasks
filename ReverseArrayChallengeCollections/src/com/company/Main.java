package com.company;

import java.util.Arrays;
import java.util.Collections;

public class Main {

    // function reverses the elements of the array
    public static void reverse(Integer[] array) {
        Collections.reverse(Arrays.asList(array));


        // System.out.println(Arrays.asList(array));
    }

    public static void main(String[] args) {
        Integer[] array = {10, 20, 30, 40, 50};

        System.out.println("Array before sort " + Arrays.toString(array));
        System.out.println();

        reverse(array);

        System.out.println("Array after sort " + Arrays.toString(array));
    }
}