package hellojava;

import java.util.Scanner;

public class AgeChecker2 {

    public static void main(String[] args){

        Scanner myInput = new Scanner(System.in);
        //System.out.println("Enter your age");
        //int age = myInput.nextInt(); // case by case however for this case want to include all this inside of loop or else it will ask input before showing message.

       while(true) {
           System.out.println("Please enter your age: ");
           String input = myInput.nextLine();

           if (input.equalsIgnoreCase("exit")){
               System.out.println("Exiting program.");
               break;
           }
           int age = Integer.parseInt(input);
           if (age >= 18) {
               System.out.println("You are old enough.");

           }
           else{
               int diff = 18 - age;

               if (diff == 1){
                   System.out.println("You must be " + diff + " year older to enter");
               }
               else{
                   System.out.println("You must be "+ diff + " years older to enter.");
               }
           }

        }
    }
}
