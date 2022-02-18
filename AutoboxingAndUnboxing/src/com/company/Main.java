package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        String[] stringArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Vova");

        //ArrayList<int> intArrayList = new ArrayList<int>(); // IMPOSSIBLE TO CREATE because int is a primitive type!
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));

        //AUTOBOXING and UNBOXING

        Integer integer = new Integer(54);
        Double doubleValue = new Double(12.25);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for (int i = 0; i <= 10; i++) {
            intArrayList.add(i);//AUTOBOXING
      //or  intArrayList.add(Integer.valueOf(i));
        }

        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " --> " + intArrayList.get(i)); //AUTOUNBOXING
        }                             // or  intArrayList.get(i).intValue());

        //EASY WAY OF THIS!!!
        Integer myIntValue = 56; //Integer.valueOf(56) - AUTOBOXING
        int myInt = myIntValue;// AUTOUNBOXING
    }
}