package Algorithms;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {11, 32, 34, 43, 46, 56, 58, 63, 68, 75, 97, 104, 119};
        int target = 75;
        int start = 0;
        int end = arr.length - 1;
        boolean found = false;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                System.out.println("TARGET FOUND AT INDEX: " + mid);
                found = true;
                break; // exit loop once found
            }
            else if (arr[mid] < target) {
                start = mid + 1; // search right half
            }
            else {
                end = mid - 1;   // search left half
            }
        }

        if (!found) {
            System.out.println("ELEMENT NOT FOUND");
        }
    }
}
