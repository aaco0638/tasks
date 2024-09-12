package hellojava;

public class Loop {
    public static void main(String[] args) {

        int i = 1;
        int a = 20;
        int sum = 0;
        while (i <= a) {

            sum = sum + i;
            //System.out.println(sum); if put here this will print out every addition of sum in a list up to 210
            i++;
        }

        System.out.println(sum); //if system.out is outside of while loop it will print the last result of the while loop, in this case 210.
    }
}




