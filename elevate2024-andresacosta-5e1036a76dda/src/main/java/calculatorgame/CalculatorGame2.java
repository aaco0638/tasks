package calculatorgame;

import java.util.Scanner;

import java.util.Random;

public class CalculatorGame2 {

    public static void main(String[] args) {
        int score = 0;
        int length = 5;



        Player playerOne = createPlayer();


//        boolean result1 = addQuestion(2,2); //return true or return false is sent here to the boolean
        score = CalculatorGame2.addQuiz(length);
        //Player one = new Player("john", 18);
        HighScore win = new HighScore(playerOne.name(), score);
        System.out.println(win.name() + " " + win.score()); // win.name() is calling highscore and the name from one.
        //boolean result1 = addTrueFalse(true, false);
        score = addNewQuiz(5);

        //boolean result2 = addTrueFalse(true, false);
//        if(result1) { // if (result1) is true
//            System.out.println("2+2 is correct answer" + result1);
//        } else { //if return false
//            System.out.println("2+2 is incorrect answer" + result1);
//        }
    }


    public static Player createPlayer() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String playerName = scanner.nextLine(); // moves on to next line and saves user string input into playerName.

        System.out.println("Enter your age: ");
        int playerAge = scanner.nextInt(); // moves on after user int input and saves it into playerAge


        return new Player(playerName, playerAge); //saves playername and playerage and using return sends it to main body.

    }

    public static boolean addQuestion(int a, int b) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is " + a + "+" + b + " equal to?");
        int answer = scanner.nextInt(); //after user int input moves on to next line and saves input into answer

        if (answer == a + b) { // if user input equals int a + int b
            System.out.println("You are correct!");
            return true; // returns boolean true to main body
        } else {
            System.out.println("You are incorrect ");
            return false; // returns boolean false to main body
        }

    }

    public static int addQuiz(int length) {

        int score = 0;
        for (int i = 0; i < length; i++) {
//                score += addQuestion(i);
            boolean answer = addQuestion(2, 6);  //true

            if (answer == true) {
                score += 1;
            }


        }
        System.out.println("Your final score: " + score + " out of " + length);
        return score;
    }

    public static boolean addTrueFalse(boolean a, boolean b) {
        String var1 = "true";
        String var2 = "false";



        boolean temp = a && b;

        boolean usersChoice = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println(a + " AND " + b);
        String playeranswer = scanner.nextLine();

        if (playeranswer.equals(var1)) {
//            boolean1 = Boolean.parseBoolean(var1);
            usersChoice = true;
        } else {
            //boolean2 =Boolean.parseBoolean(var2);
            usersChoice = false;
        }


        return usersChoice == temp;
    }


   public static int addNewQuiz(int length) {

        int score = 0;
       Random random = new Random();
        for (int i = 0; i < length; i++) {
            boolean a = random.nextBoolean();
            boolean b = random.nextBoolean();
//                score += addTrueFalse(i);
            boolean answer = addTrueFalse(a, b);  //true

            if (answer == true) {
                System.out.println("correct.");
                score += 1;
            } else {
                System.out.println("incorrect");
                //return score;
            }



        } //System.out.println("Answer not recognized try again");
        return score;


        // compare user input -- is it a "true" string or "false" string
        //      if so convert it to boolean (you can use if/else) and capture in a variable
        // what is the answer of a AND b - capture this into a boolean variable
        //      e.g. a = true AND b = true THEN temp = true
        //      e.g. a = false AND b = true THEN temp = false
        // compare users boolean value with temp - are they the same?

    }
}







//record Player (String name, int age) {}
//record HighScore (String name, int score) {}

