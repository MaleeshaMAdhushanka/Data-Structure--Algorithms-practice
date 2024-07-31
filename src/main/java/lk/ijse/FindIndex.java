package lk.ijse;

import java.util.Scanner;

public class FindIndex {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        final String RESET = "\033[0m";
        final String RED = "\033[0;31m";
        //            0, 1, 2, 3, 4, 5, 6, 7, 8
        int[] nums = {10, 40, 85, 60, 55, 100, 70,};

        //array eke length eka aragena me variable ekata assigin karala thiyenawa
        int len = nums.length;

        if (len == 0) {
            System.out.println(RED + "Array is empty ." + RESET);
            //0 nam meka print wenawa 0 nemeine

        } else {
            loop:
            do {
                System.out.println("Enter Number : ");
                int search = scanner.nextInt();
                //number eka aragena variable ekta asign karagannawa
                for (int i = 0; i < len; i++) {
                    //60 dunnoth 60 wenakan check karagena yanwa
                    if (nums[i] == search) {
                        //60 index eka 4 sout"Foud the index at 4
                        System.out.println("Found index at :" + i);
                        continue loop;
                        //continue thibbe nethnm aye 55 , 100, 70 print wenawa
                        // e tik acheck wenne nethuwa udata paninawa
                    }
                }
                System.out.println(RED + "Not Foud number " + RESET);
            } while (true);
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



