package genericsLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Generics {

    public static void main(String[] args) {
//        List<Integer> intsList = Arrays.asList(1, 5, 7, 2, 3);
//        List<String> strsList = Arrays.asList("Java", "World", "Hello");
//        System.out.println(reverse(intsList)); // Expected: [3, 2, 7, 5, 1]
//        System.out.println(reverse(strsList)); // Expected: ["Hello", "World", "Java"]
//
//        GenericStack<String> stack = new GenericStack<>();
//        stack.push("World");
//        stack.push("Hello");
//        System.out.println(stack.top()); // Expected: "Hello"
//        stack.pop();
//        System.out.println(stack.top()); // Expected: "World"
//        System.out.println(stack.size()); // Expected: 1

        GenericStack<Integer> intStack = new GenericStack<>();
        intStack.push(5);
        intStack.push(3);
        intStack.push(7);
        System.out.println(emptyAndGetGreatest(intStack)); // Expected: 7
        System.out.println(intStack.size()); // Expected: 0

    }

//    public static <T> List<T> reverse(List<T> list) {
//        List<T> reversedList = new ArrayList<>();
//        for (int i = list.size() - 1; i >= 0; i--) {
//            reversedList.add(list.get(i));
//        }
//
//        return reversedList;
//    }

    public static <T extends Comparable<T>> T emptyAndGetGreatest(GenericStack<T> stack) {

        T greatest = null;
        while (!stack.isEmpty()) {
            T current = stack.pop();
            if (greatest == null || current.compareTo(greatest) > 0) {
                greatest = current;
            }
        }
        return greatest;

    }

}
