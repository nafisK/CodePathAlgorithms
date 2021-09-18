package Week_12;

import java.util.Arrays;

public class CodingProblem1 {
    public static void main(String [] args) {

        /*
        Given an array of integers A sorted in non-decreasing order, return a new array of the squares of each number, also in sorted non-decreasing order.

        Example 1:
        Input: [-4,-1,0,3,10]
        Output: [0,1,9,16,100]

        Example 2:
        Input: [-7,-3,2,3,11]
        Output: [4,9,9,49,121]

        Note:
        1 <= A. length <= 10000
        -10000 <= A[i] <= 10000
        A is sorted in non-decreasing order.

        Brute Force Method:
            method:
                for(from 0 to array.lenth):
                    square all the values 
                    store in a new array

                sort the new array

                return new array

            Time Comp: Best case: O(nlogn)
            Space Comp: Worst O(n)


        */

        int exm_1[] = {-4,-1,0,3,10};
        int exm_2[] = {-7,-3,2,3,11};

        int res_1[] = squaredArray(exm_1);
        int res_2[] = squaredArray(exm_2);

        for (int i = 0; i < res_1.length; i++)
            System.out.print(res_1[i] + ", ");

        System.out.print("\n\n");

        for (int i = 0; i < res_2.length; i++)
            System.out.print(res_2[i] + ", ");





    }

    public static int [] squaredArray(int []  arr) {
        if(arr == null || arr.length < 1) 
            return null;
        int res[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i] * arr[i];
        }
        Arrays.sort(res);
        return res;
    }








}
