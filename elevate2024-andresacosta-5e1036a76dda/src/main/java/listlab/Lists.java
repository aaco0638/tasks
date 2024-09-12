//package listlab;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Random;
//
//public class Lists {
//private List<Integer> numList = new ArrayList<>();
//    public static void main(String[] args) {
////        Random random = new Random(); //part of previous lab
//        List<Integer> numList = new ArrayList<>();
////        for(int i = 0; i < 5; i++){
////            myList.add(random.nextInt(10) + 1);
////        }
//        numList.add(1);
//        numList.add(3);
//        numList.add(2);
//        numList.add(4);
//        numList.add(7);
//        int results = addingArrayContents(numList);
//        int results2 = multiplyNumberList(numList);
//        System.out.println(results);
//        System.out.println(results2);
//        System.out.println((double)results/results2);
//        List<Integer> linked= convertToList(numList);
//        System.out.println(linked);
//
//    }
//
//    public static int addingArrayContents(List<Integer> numList){
//        int sum = 0;
//        for(int d : numList)
//            sum += d;
//        return sum;
//    }
//
//    public static int multiplyNumberList(List<Integer> numList){
//
//        int multi = 1;
//        for(int a : numList)
//            multi *= a;
//        return multi;
//
//    }
//
//    public static List<Integer> convertToList(List<Integer> numList)
//    {
//
//        List<Integer> linked = new LinkedList<>();
//
//        for (Integer t : numList) {
//            linked.add(t);
//        }
//
//        return linked;
//    }
//
//
//
//}
