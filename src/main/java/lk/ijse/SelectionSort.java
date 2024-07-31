package lk.ijse;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
                     // 0, 1, 2, 3 ,4 , 5, 6, 7, 8, 9,   10,  11
        int [] nums = {-5, 7, 2, -8, 4, 4, 0, 3, 50, 45, 25, -20};

        //unsorted array print
        System.out.println(Arrays.toString(nums));

        for (int k = 0; k <nums.length ; k++) {

            int minIndex = k;  // =0
                               //11
                               //1
            int min = nums[minIndex]; // -5;
                                     //-20
                                      // min =7


            //-5 wada adu agyaka thiyeda kiyala check karanna ona den

            for (int i = (k +1); i < nums.length; i++) {


                if (min > nums[i]) {
                    //-5  > 7
                    //-5 > 2
                    //-5 > -8
                    //-5 = -8
                    //-8 > 4
                    //-8 > -20
                    min = nums[i];
                   minIndex = i;


                }
            }
               // 0
            nums[minIndex]  =  nums[k];
//            // 0, 1, 2, 3 ,4 , 5, 6, 7, 8, 9,   10,  11
//            int [] nums = {-5, 7, 2, -8, 4, 4, 0, 3, 50, 45, 25, -5};
            nums[k] = min;


        }
        System.out.println(Arrays.toString(nums));
    }

}
