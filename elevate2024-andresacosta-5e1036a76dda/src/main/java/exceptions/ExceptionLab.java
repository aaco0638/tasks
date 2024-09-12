package exceptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExceptionLab {

    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(1, 5, 3, 2, 5,-3, -2, 1, -4 );
//        List<Integer> fibResults = fibList(numbers);
//        System.out.println(fibResults);
        System.out.println(fibList(Arrays.asList(1, 5, 3, 2, 5, -3, -2, 1, -4)));


    }


    public static int fib(int n) {

        if (n < 0) {
            throw new FibonacciException(n);
        } else if (n == 0 || n == 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }


    }

    public static List<Integer> fibList(List<Integer> n_list) {
        int error = 0;
        List<Integer> list = new ArrayList<>();
        for (int n : n_list) {
            try {
                list.add (fib(n));

            } catch (FibonacciException e) {
                error++;


            }
//            if (error > 0) {
//                System.out.println("Error count: " + error);
//
//            }


        }
        System.out.println("error: "+ error);

        return list;
    }


//
//    public static int fib(int n) {
//
//        if (n < 0) {
//                    throw new ArithmeticException("Negative numbers are not allowed");
//        }
//
//
//
//        if (n == 0 || n == 1) {
//            return 1;
//
//        } else {
//            return fib(n - 1) + fib(n - 2);
//        }
//
//
//    }

}