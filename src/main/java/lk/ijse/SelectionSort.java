package lk.ijse;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
                     //0, 1, 2,  3, 4, 5, 6, 7, 8,  9,  10,  11
       int [] nums = {-5, 7, 2, -8, 4, 4, 0, 3, 50, 45, 25, -20};


       //-5 ewa check karala ita passe k = 1 wenawa


        System.out.println(Arrays.toString(nums));


        for (int k = 0; k < nums.length; k++) {
            //k = 0;
            //k = 1
            int minIndex = k; //minIndex = 0 , den 8 element eka nisa methanata 3 index eka dagannwa
            //11
            int min = nums[minIndex];  //min value eka dagannwa = -5, index ekai value ekai ganna,
            //den methana min -8
            //min -20

            //1 thiyena value eka 7 wenawa

            //dewani forloop ckeck kranwa -5 ta wada adu agayan thiyenawada kiyala
            for (int i = (k+1); i < nums.length; i++) {
                /*values deken  kuda eka mokadd kiyala check karanwa
                -5 , 7
                -5, 2
                -5, -8
                dem -5 ta wada adu agayak hambunu nisa
                -8, 4
                -8,20

                 */
                if (min > nums[i]) {
                    min = nums[i];
                    minIndex = i;

                }

            }
            //array eke miniumam index eka mokadd kiyala balanwa 11 kotuwata values deka maru karabwa

          nums[minIndex] = nums[k];
//                          //0, 1, 2,  3, 4, 5, 6, 7, 8,  9,  10,  11
//            int [] nums = {-5, 7, 2, -8, 4, 4, 0, 3, 50, 45, 25, -5};

            nums[k] =  min;
            // int [] nums = {-20, 7, 2, -8, 4, 4, 0, 3, 50, 45, 25, -5};


        }
        System.out.println(Arrays.toString(nums));
    }
    //select karala eka mathaka thiyagena ne pitipassata danne
}
