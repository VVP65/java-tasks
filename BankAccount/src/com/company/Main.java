package com.company;

public class Main {

    public static void main(String[] args) {

        Account myAccount = new Account("Volod", 1000, 123654789);
        System.out.println();

        myAccount.deposit(100);
        myAccount.withdrawal(50);
        System.out.println();

        VipPerson firstPerson = new VipPerson();
        System.out.println(firstPerson.getName());

        VipPerson secondPerson = new VipPerson("Bob", 25000.00);
        System.out.println(secondPerson.getName());

        VipPerson thirdPerson = new VipPerson("Tom", 1000.00, "tom@email.com");
        System.out.println(thirdPerson.getName());
        System.out.println(thirdPerson.getEmailAddress());
    }
}