package lk.ijse;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {

        // index       0, 1, 2, 3 ,4 , 5, 6, 7, 8, 9,   10,  11
        int[] nums = {-20, 7, 2, -8, 4, 4, 0, 3, 50, 45, 25, -5};

        //unsorted Array print
        System.out.println(Arrays.toString(nums));

         Arrays.sort(nums);
         //sorted Array print
        System.out.println(Arrays.toString(nums));
    }
}
