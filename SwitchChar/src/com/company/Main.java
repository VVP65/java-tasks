package com.company;

public class Main {

    public static void main(String[] args) {
        char switchValue = 'E';

        switch (switchValue) {
            case 'A':
                System.out.println("A found");
                break;

            case 'B':
                System.out.println("B found");
                break;

            case 'C':
                System.out.println("C found");
                break;

            case 'D':
                System.out.println("D found");
                break;

            case 'E':
                System.out.println("E found");
                break;

            default:
                System.out.println("Not found");

        }

        String month = "JaNuArY";
        switch(month.toLowerCase()) {
            case "january": // should be in lower case
                System.out.println("Jan");
                break;
            case "june": // should be in lower case
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
        }
    }
}
