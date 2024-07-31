package lk.ijse;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

                     // 0, 1, 2, 3 ,4 , 5, 6, 7, 8, 9,   10,  11
        int[] nums = {-20, 7, 2, -8, 4, 4, 0, 3, 50, 45, 25, -5};

        //unsorted Array printed
        System.out.println(Arrays.toString(nums));

        for (int j = 0; j < nums.length; j++) {
            for (int i = 0; i < nums.length-1; i++) {
                // 7 > 2
              if (nums[i] > nums[i+1]){
                  //7
                  int temp = nums[i];
                  //2
                 nums[i] = nums[i+1];
                   // 7
                 nums[i+1] = temp;

              }
            }
        }
        System.out.println(Arrays.toString(nums));
    }

}
