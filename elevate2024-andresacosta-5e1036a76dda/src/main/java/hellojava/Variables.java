package hellojava;

public class Variables {
    public static void main (String[] args){

       int number = 5;
       int result = number + 3;
       String toPrint = "Your result is ";
       double decResult = number + 5.32;
       System.out.println(toPrint+result);
       System.out.println(decResult);

        Double d = 5.2;
        int i = d.intValue();
        System.out.println(i);
    }
}