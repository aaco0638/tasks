package hellojava;

public class Factorial {

    public static void main(String[] args) {
        int toFind = 5;
        int result = 1;
        while (toFind != 0) {
            result *= toFind; //takes value of toFind and multiplies with result than it is stored in result. this is done repeatedly until it hit 0.
            toFind--; //every time toFind goes through the while 1 is subtracted from the value until 0 is hit.

            if(toFind < 0){ //if value of toFind is a negative error message is printed.

                System.out.println("Error!");
                break; // makes sure message does not print forever.
            }






        }
        System.out.println(result);
    }
}

