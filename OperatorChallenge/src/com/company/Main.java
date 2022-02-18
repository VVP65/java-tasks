package com.company;

public class Main {

    public static void main(String[] args) {
        double firstValue = 20.00d;
        double secondValue = 80.00d;

        double multiplyValuesResult = (firstValue + secondValue) * 100.00d;
        System.out.println("multiplyValuesResult result is " + multiplyValuesResult);

        double reminderFromMultiplyingValuesResultDivision = multiplyValuesResult % 40.00d;
        System.out.println("reminderFromMultiplyingValuesResultDivision result is " + reminderFromMultiplyingValuesResultDivision);

        boolean isNoReminderFromMultiplyingValuesResultDivision = reminderFromMultiplyingValuesResultDivision == 0 ? true : false;
        System.out.println("isNoReminderFromMultiplyingValuesResultDivision = " + isNoReminderFromMultiplyingValuesResultDivision);
        if (!isNoReminderFromMultiplyingValuesResultDivision) {
            System.out.println("Got some reminder");
        }
    }
}
