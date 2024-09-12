package hellojava;

public class Algorithms2 {

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {1, 3, 1, 5, 3};
        int[] arr3 = new int [5];
        //int n = arr1.length;
        //int o = arr2.length;
        //int p = arr3.length;

        int target = 3;

        boolean result = binarySearch(arr1, target );
        boolean result2 = binarySearch(arr2, target);
        boolean result3 = binarySearch(arr3, target);
        if (!result) {

            System.out.println(
                    "Element is not present in array");
        } else {

            System.out.println(
                    "Element is present at index " + result);
        }
        if(!result2){
            System.out.println("Element is not present in array");
        } else{
            System.out.println("Element is present in array " + result2);
        }
        if(!result3){
            System.out.println("Element is not present in array");
        } else{
            System.out.println("Element is present in array " + result3);
        }
    }

    public static boolean binarySearch(int[] toSearch, int target) {

        int low = 0, high = toSearch.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if x is present at mid
            if (toSearch[mid] == target)
                return true;

            // If x greater, ignore left half
            if (toSearch[mid] < target)
                low = mid + 1;

                // If x is smaller, ignore right half
            else
                high = mid - 1;
        }

        // If we reach here, then element was
        // not present
        return false;

    }
}
