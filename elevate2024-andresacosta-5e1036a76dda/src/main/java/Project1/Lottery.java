package Project1;



import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

public class Lottery {
    static int[] numbers = new int[6];

    static int[] numbers2 = new int[6];





    static Scanner keyboard = new Scanner(System.in); // static variable used in pickNumber.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        lottoPlayer playerOne = createPlayer(); // calling lottoPlayer method
        int playerAge = getAge.calculateAge(playerOne.age());//calling getAge and specifically running playerOne through the calculateAge function in getAge.

        String command = " ";
        if (playerAge >= 18) {


            System.out.println(playerOne.name() + " is eligible to play. (Age: " + playerAge + ")");
            int[] playerPick; // variables for pickNumber method
            int [] compareLotto; // variable for winner method


            while (!command.equalsIgnoreCase("exit")) {// if input equals exit, it exits program.



                System.out.println("Choose an option:"); // menu option of games
                System.out.println("1. Your own numbers");
                System.out.println("2. Lucky dip.");

                int choice = scanner.nextInt(); // enter 1 or 2 to pick a choice
                scanner.nextLine(); // Consume newline afternextInt()

                if (choice == 1) {
                    playerPick = pickNumber(); // player picks their own number
                    System.out.println( "Player numbers: " + Arrays.toString(playerPick)); // shows user their ticket input
                    compareLotto = winner();
                    int results3 = getMatches(playerPick, compareLotto); //takes the numbers from playerPick and comparelotto and runs it through getMatches function which checks to see if any variables are share by both arrays

                    System.out.println( "Winning numbers are: " + Arrays.toString(compareLotto));

                    if(results3 <= 1){
                        System.out.println("1 or fewer matches, results is no prize.");
                    } else if (results3 ==2){
                        System.out.println("2 correct numbers should get a prize of £1.");
                    } else if(results3 == 3){
                        System.out.println("3 correct numbers should get a prize of £2.");
                    } else if(results3 == 4){
                        System.out.println("4 correct numbers should get a price of £4.");
                    } else if(results3 == 5){
                        System.out.println("5 correct numbers should get a price of £8.");
                    }else if(results3 == 6){
                        System.out.println("6 correct numbers should win the jackpot.");
                    }

                }else if (choice == 2) {
                    playerPick = luckyDip(); // random generated numbers
                    System.out.println(Arrays.toString(playerPick)); // prints the randomly generated numbers as string.
                    compareLotto = winner();
                    int results3 = getMatches(playerPick, compareLotto); //takes the numbers from playerPick and comparelotto and runs it through getMatches function which checks to see if any variables are share by both arrays

                    System.out.println("PlayerPick: " + Arrays.toString(playerPick));
                    System.out.println("CompareLotto: " + Arrays.toString(compareLotto));

                    if(results3 <= 1){
                        System.out.println("1 or fewer matches, results is no prize.");
                    } else if (results3 ==2){
                        System.out.println("2 correct numbers should get a prize of £1.");
                    } else if(results3 == 3){
                        System.out.println("3 correct numbers should get a prize of £2.");
                    } else if(results3 == 4){
                        System.out.println("4 correct numbers should get a price of £4.");
                    } else if(results3 == 5){
                        System.out.println("5 correct numbers should get a price of £8.");
                    }else if(results3 == 6){
                        System.out.println("6 correct numbers should win the jackpot.");
                    }


                } else {
                    System.out.println("Invalid choice. Try again.");
                    continue;
                }

            }



        } else {
            System.out.println(playerOne.name() + " is not eligible to play. (Age: " + playerAge + ")");
        }

    }







    public static int[] winner(){ //randomizes an array of length 6, same as luckyDip however this method is meant for the winning numbers only to avoid confusion.

        Random random = new Random(); // random initiated
        int rand = 0;
        boolean valid;

        for (int i = 0; i < 6; i++) {
            do { //runs loop as long as valid is false
                valid = true;
                rand = random.nextInt(49) + 1;
                if (rand < 1 || rand >= 49) { //keeps the numbers between 1-49 only
                    valid = false;
                }

                for (int j = 0; j < i; j++) { //this checks for duplicate numbers since they are not allowed
                    if (numbers2[j] == rand) {
                        valid = false;
                        break;
                    }
                }
            } while (!valid);

            numbers2[i] = rand; //if all of the previous requirements are met the randomized numbers are stored in numbers2 and returned.
        }
        return numbers2;

    }
    public static int getMatches(int[] arr1, int[] arr2 ){ //goes through the length of two arrays and compares, if whats inside both arrays are equal then matches is incremented and returns with how many matches both arrays share. .
        int matches =0;

        for(int i = 0; i<arr1.length;i++){
            for(int j = 0; j<arr2.length; j++){
                if(arr1[i] == arr2[j]){ //checks to see if elements of first array equals the second one
                    matches++; // increments matches by 1 if both arrays share any value.
                }
            }

        }return matches;

    }


    public static int[] luckyDip(){ // randomizes an array of 6 and stores randomized numbers into variable numbers to be used in main method when called.
        Random random = new Random();
        int rand = 0;
        boolean valid;

        for (int i = 0; i < 6; i++) {
            do {
                valid = true;
                rand = random.nextInt(49) + 1;//produces randomized numbers
                if (rand < 1 || rand >= 49) { //gets rid of all options not in scope of 1-49
                    valid = false;
                }

                for (int j = 0; j < i; j++) {
                    if (numbers[j] == rand) { //if numbers and rand are the same returns false as you are unable to have the same numbers repeat.
                        valid = false;
                        break;
                    }
                }
            } while (!valid); //if none of the previous scenarios are false

            numbers[i] = rand; // randomized numbers are placed into numbers
        }
        return numbers;



    }

    public static int[] pickNumber() {
        int temp;
        boolean valid; //keeps track of user input and sees if it is valid

        for (int i = 0; i < 6; i++) {
            do { //runs loop as long as valid is false
                valid = true;
                System.out.println("Please enter a value from 1-49: ");
                temp = keyboard.nextInt();
                if (temp < 1 || temp > 49) { //keeps the numbers between 1-49 only
                    System.out.println("Error, invalid input");
                    valid = false;
                }

                for (int j = 0; j < i; j++) { //this checks for duplicate numbers since they are not allowed
                    if (numbers[j] == temp) {
                        System.out.println("Please enter a different number.");
                        valid = false;
                        break;
                    }
                }
            } while (!valid);

            numbers[i] = temp;//if all of the previous requirements are met the numbers are stored in numbers and returned.
        }
        return numbers;



    }



    public static lottoPlayer createPlayer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter name: "); //asking player to enter name
        String playerName = scanner.nextLine(); // next line user input is string saved in playerName

        System.out.println("Please enter your date of birth (yyyy-mm-dd): "); //asking date of birth input for user
        String dobString;
        LocalDate dob; // using localdate import to use actual local date
        do {
            dobString = scanner.nextLine();
            try { //if dob is invalid it goes through this try/catch.
                dob = LocalDate.parse(dobString);
                break; // breaks out of loop
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date format. Please use yyyy-mm-dd:"); //should only return if an invalid date was input
            }
        } while (true);

        return new lottoPlayer(playerName, dob);
    }
}

 class getAge {
    private static final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd"); //this can only be accessed in getAge and value is final and can't be changed as well

    public static int calculateAge(LocalDate dob) {
        LocalDate today = LocalDate.now();// date is equal to todays date
        if (dob.isAfter(today)) {
            throw new IllegalArgumentException("Future date not allowed"); //if date is after today this throws it out as unusable.
        }
        return Period.between(dob, today).getYears();// calculates amount of time between dob and today and getYears extracts number of years from the calculated time as the age.
    }
}

record lottoPlayer(String name, LocalDate age) {}

