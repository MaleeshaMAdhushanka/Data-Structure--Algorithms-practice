package lk.ijse;

import java.util.Arrays;

public class SelectionSortPractice {
    public static void main(String[] args) {


                         //0,  1, 2, 3, 4, ,5 , 6, 7, 8, 9, 10,  11
        int [] numbers = {-2, 6, 2, -8, 4, 4, 0, 3, 40, 45, 25, -30};

        System.out.println(Arrays.toString(numbers));


        for (int k = 0; k < numbers.length ; k++) {

            int minIndex = k; // = 0;
                              // = 3;
                             // = 11;
                             // k = 1;
            int min = numbers[minIndex];// =  -2;
             // -30;

            //6

/*           check karanwa -2 > 6
                -2 > 2
                -2 > -8
                -8 > 4
                -8 > -30

 */
            for (int i = (k+1); i < numbers.length ; i++) {

                if ( min > numbers[i] ) {
                    min = numbers[i];
                    minIndex = i;
                }


            }
            //arry eke thiyena minimun index eka mokadd kiyala balala eka maru karanna ona athanata

//                 numbers [minIndex]  = numbers[k];
//                  numbers[k] = min;
                   numbers[minIndex] = numbers[k];
                   numbers [k] = min;

        }
        System.out.println(Arrays.toString(numbers));
    }
}
