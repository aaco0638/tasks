package hellojava;

public class StaticmethodLoop {


    public static void main(String[] args) {
        int result = sumTo(20); //allows user to enter value of a into the sumTo method and whatever the result is, it is then captured and placed into int result.
        System.out.println(result); // prints out value of result.

    }

    public static int sumTo(int a) { // static method

        int i = 1; //starting at number 1

        int sum = 0;
        while (i <= a) { // while 1 is less than or equal to a

            sum = sum + i; // sum + i value
            i++; // i is iterated by 1
        }
        return sum; // allows value of sum to escape this method and to be used by main body.
    }
}
