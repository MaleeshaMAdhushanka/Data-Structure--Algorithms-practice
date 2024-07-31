package lk.ijse;

import java.util.Scanner;

public class FindIndex {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        final  String RESET = "\033[0m";
        final  String RED = "\033[0;31m";

        int [] nums = {10, 40, 85, 60, 55, 100, 70,};
        int len = nums.length;

        if (len == 0) {
            System.out.println(RED + "Array is empty ." + RESET);
        }else {
            loop: do {
                System.out.println("Enter Number : ");
                int search = scanner.nextInt();
                for (int i = 0; i < len; i++) {
                    if (nums[i] == search) {
                        System.out.println("Found index at :" + i);
                        continue  loop;
                    }
                }
                System.out.println(RED + "Not Foud number " + RESET);
            }while (true);
        }
    }

}

