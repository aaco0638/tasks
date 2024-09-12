package hellojava;

import java.util.Scanner;

public class AgeChecker {

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);

        System.out.println("Please enter your age: ");

        int age = myInput.nextInt();

        if (age >= 18) {
            System.out.println("You are old enough.");
        } else {
            int diff = 18 - age;

            if (diff == 1) {
                System.out.println("You must be " + diff + " year older to enter");

            } else {

                System.out.println("You must be " + diff + " years older to enter");

            }
        }
    }
}

