package lk.ijse;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    private static final Scanner scanner = new Scanner(System.in);

    static final String RESET = "\033[0m";
    static final String RED = "\033[0;31m";

    public static void main(String[] args) {
                //    0, 1, 2, 3, 4, 5, 6, 7, 8, 9
        int[] nums = {10, -3, 8, 2, 5, 35, 9, 45, 53};
        sortArray(nums);
    }
    //selection sort
    public static void sortArray(int[] temp) {
        for (int i = 0; i < temp.length; i++) {

            int minIndex = i;

            int min = temp[minIndex];

            for (int j = (i + 1); j < temp.length; j++) {

                if (min > temp[j]) {
                    min = temp[j];

                    minIndex = j;

                }

            }
            //                0, 1, 2, 3, 4, 5, 6, 7, 8, 9
            //int [] nums = {10,-3, 8, 2, 5, 35, 9, 45, 53};
            //-3         //0
            //                   0
            //10
            temp[minIndex] = temp[i];

            //                1       0
            //             0 = 10   ,     -3
            temp[i] = min;

        }
        System.out.println(Arrays.toString(temp));
        searchArray(temp);
    }


        public static void searchArray( int[] result){
        loop:
        do {
            System.out.println();
            System.out.println("Enter a number :");
              int search = scanner.nextInt();

              int start = 0;
              int end = result.length;

            for (int i = 0; i < result.length ; i++) {
                if (start >= end);
                int mid = (start + end) / 2;
                if (search ==  result[mid]){
                    System.out.println("Found index at " + mid);

                    continue loop;
                }else if (search > result[mid]){
                    start = mid +1;
                }else {
                    end = mid;
                }

            }
            System.out.println( RED +"Not found Number" + RESET);

        }while (true);

        }

    }


