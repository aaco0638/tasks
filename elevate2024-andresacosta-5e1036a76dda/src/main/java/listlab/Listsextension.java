package listlab;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Listsextension {
    public static Random rand = new Random();

    public static ArrayList<Integer> numList(int number, int upperBound) {
        ArrayList<Integer> numList = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            numList.add(rand.nextInt(upperBound) + 1);
        }
        return numList;
    }

    public static void main(String[] args) {
        ArrayList<Integer>[] tempList = new ArrayList[999999]; // Array of 5 ArrayLists

        for (int j = 0; j < tempList.length; j++) {
            tempList[j] = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                List<Integer> numList = new ArrayList<>();
                numList.add(i);
                System.out.println(numList(5, 10));

            }
        }




    }
}





