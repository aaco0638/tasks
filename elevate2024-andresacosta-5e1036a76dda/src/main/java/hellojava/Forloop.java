package hellojava;

public class Forloop {
    public static void main(String[] args) {
        int n, i;
        int SumofNumbers = 0;
        int formula = 0;


        for (n = 2; n <= 100; n++) { // starting from 2 increases by 1 number until it is equal to 100
            SumofNumbers = 0; // value of n currently for this loop is stored here
            for (i = 1; i <= n; i++) { //starting from 1 is compared to the value of n.
                SumofNumbers += i;  //1+2=3
            }
            formula = n * (n + 1) / 2;  //3


            System.out.println("sum = " + SumofNumbers);
            System.out.println("Formula = " + formula);

            if (SumofNumbers == formula) {

                System.out.println("Formulas are equal\n");
            } else {
                System.out.println("Formulas are NOT equal\n");

            }
        }

    }
}
