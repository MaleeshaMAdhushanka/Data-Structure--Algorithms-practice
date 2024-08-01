package lk.ijse;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) throws InterruptedException {
                   // 0,  1,   2,  3,   4,   5,   6,
        int [] arr = {50, 10, 48,  -3,  16, 32 , 65};
        InsertionSort(arr);
    }

    public static void InsertionSort(int[] temp) throws InterruptedException {
        int len = temp.length;

        for (int i = 0; i < len; i++) {

            //  i = 0
            // i = 1
              int val = temp[i]; //val = 50 // val 10
              int x = i - 1; // x = -1  // x = 0 // x = -1
                  // -1 // false  AND  -1 ArrayoutOfBoundError eka enna ona ehema enne neththe && dapu nisa array eka patan ganne 0 nem -1 nemei ne
             // 1st ekam false wenawa eka nisa while loop eka run wenne nh

            while ((x >= 0) && (temp[x] > val)){  //2 true wenawa && 0 = 50 > 10 = true
                   temp[x+1] = temp[x];   // 50 - value eka  wetenawa = {50, 50, 48,  -3,  16, 32 , 65};
                   x = x-1;
            }

            temp[x + 1] = val; // 0 = 50  // {10, 50, 48,  -3,  16, 32 , 65};
            System.out.println(Arrays.toString(temp));
            Thread.sleep(750);

        }

    }

}
