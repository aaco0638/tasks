package hellojava;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Algorithms {

    public static void main(String[] args){

        boolean result1 = search(new int[]{1, 3, 5, 7, 9}, 4); // since boolean will return true or false depending on search method.
        System.out.println(result1);
        boolean result2 = search(new int[]{1, 3, 1, 5, 3}, 3);
        System.out.println(result2);
        boolean result3= search(new int[5], 0);
        System.out.println(result3);

        int[] result4 = sort(new int[]{1, 5, 3});
        System.out.println("int array: " + Arrays.toString(result4));// prints array as a string to console

        int[] result5 = sort(new int[]{1, 2, 3, 4, 5, 6});
        System.out.println("int array: " + Arrays.toString(result5)); // prints array as a string to console

        int[] result6 = sort(new int[]{1, 5, 1, 3, 7, 9, 1});
        System.out.println("int array: " + Arrays.toString(result6)); // prints array as a string to console.

    }
    public static boolean search(int[] toSearch, int target){

        for (int i : toSearch){ // stores size of array into int i
            if (i == target){ // compares int i which is holding size of array to target int
                return true; // if both the same return true.
            }
        }
        return false;

    }
    public static int[] sort(int [] toSort) { // need [] since we are returning to an array

        int x = toSort.length; // x is assigned length of toSort
        int temp = 0;

        for (int i = 0; i < x; i++) {
            for (int j = 1; j < (x - i); j++) {
                if (toSort[j - 1] > toSort[j]) {
                    temp = toSort[j - 1];
                    toSort[j - 1] = toSort[j];
                    toSort[j] = temp;
                }

            }


        } return toSort;

    }




}
