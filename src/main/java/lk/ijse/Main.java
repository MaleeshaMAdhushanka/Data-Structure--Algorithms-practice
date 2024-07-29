package lk.ijse;

import java.util.Scanner;

public class Main {
    //Liner Search

    public static void main(String[] args) {
        int [] arr = {10, 20, 30, 40, 50, 60};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a number : ");

        int number = scanner.nextInt();
        boolean isFound = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                System.out.println("Element is Found  at index :" + i);
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.out.println("Element is not isFound in the array");
        }
    }


//        public static void main(String[] args) {
//            int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
//            Scanner scanner = new Scanner(System.in);
//
//            System.out.print("Enter a number: ");
//            int number = scanner.nextInt();
//
//            int result = searchBinary(array, number);
//
//            if (result == -1) {
//                System.out.println("Number not found in the array.");
//            } else {
//                System.out.println("Number found at index: " + result);
//            }
//        }
//
//        public static int searchBinary(int[] array, int number) {
//            int left = 0;
//            int right = array.length - 1;
//
//            for (; left <= right; ) {
//                int mid = left + (right - left) / 2;
//
//                // Check if the number is present at mid
//                if (array[mid] == number) {
//                    return mid;
//                }
//
//                // If number greater, ignore left half
//                if (array[mid] < number) {
//                    left = mid + 1;
//                } else {
//                    // If number is smaller, ignore right half
//                    right = mid - 1;
//                }
//            }
//
//            // If we reach here, then the element was not present
//            return -1;
//        }
    }



