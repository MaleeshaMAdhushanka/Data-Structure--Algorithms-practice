package lk.ijse.prfPractice;

import java.util.Scanner;

public class searchArrayIndex {

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";

    public static void main(String[] args) {
                    //0, 1, 2, 3, 4
        int [] arr = {1, 3, 5, 7, 9};
        Scanner input = new Scanner(System.in);

        System.out.println("Input value: ");
        int value = input.nextInt();

        boolean found = false;

        for (int i = 0; i <  arr.length; i++) {
            if ( value == arr[i]){
                System.out.println(ANSI_BLUE + "Value Index is " + i + ANSI_RESET );
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println(ANSI_RED + " Value is not found " + ANSI_RESET);
        }
    }
}
