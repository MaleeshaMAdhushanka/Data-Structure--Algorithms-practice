package lk.ijse;

import java.util.Scanner;

public class twosomeIncrementValue {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //           0,  1, 2, 3, 4, 5, 6, 7, 8, 9, 10,  11, 12, 13, 14, 15, 16, 17, 18, 19
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        System.out.println("Input Value : " );
        int value = input.nextInt();

        int n = 0;


        for (int i = 0; i <  arr.length; i++) {
            for (int j = (i+1); j < arr.length; j++) {
                if (arr[i] + arr[j] == value){
                    System.out.println("Addition values : " + value + " = " + arr[i] + " + " + arr[j]);
                    n++;
                }
            }
        }
        if (n == 0){
            System.out.println("No addition values :" + value);
        }

     }

}


