package lk.ijse;

import java.util.Scanner;

public class FindIndex {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        final String RESET = "\033[0m";
        final String RED = "\033[0;31m";
        //            0, 1, 2, 3, 4, 5, 6, 7, 8
        int[] nums = {10, 40, 85, 60, 55, 100, 70,};


        int len = nums.length;

        if (len == 0) {
            System.out.println(RED + "Array is empty" + RESET);
        } else {
          loop:

            do {
                System.out.println();
                System.out.println("Enter number : ");
                int search = scanner.nextInt();
                for (int i = 0; i < len; i++) {
                    //60 index eka 4
                  if (nums[i] == search){
                      System.out.println("Found index :" + i);
                      continue loop;
                  }
                }
                System.out.println("Not Found  index" + RESET);
            }while (true);

        }
    }
}
//     L1:
//        for (int i = 0; i <10 ; i++) {
//
//            for (int j = 0; j < 10 ; j++) {
//                if (i == 5) {
//                 break L1;
//                }
//                System.out.println(i);
//            }
//            System.out.println();
//        }
//    }



