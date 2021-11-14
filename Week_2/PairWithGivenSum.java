package Week_2;

import java.util.HashMap;

public class PairWithGivenSum {
    public static void main(String[] args) {
        // Given an array of size n and a number x, determine the first two elements in the array, if any, whose sum is exactly x.
        // Examples:
        // Input: [3, 2, 6, 9, 5], 9
        // Output: (3, 6)
        int x[] = {3, 2, 6, 9, 5};
        int[] arr = hashMapSoln(x, 14);
        for (int i : arr) {
            System.out.println("Final i: " + i);
        }  
    }

    public static int[] naiveSoln(int [] arr, int goal) {
        if (arr.length == 0) 
            return new int[0];
        int res[] = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println("i: " + i + ", j: " + j);
                if(arr[i] + arr[j] == goal) {
                    System.out.println("\nFound Goal: " + arr[i] + ", " + arr[j]+ "\n");
                    res[0] = arr[i];
                    res[1] = arr[j];
                    return res;
                }
            }
        }
        return new int[0];
    }
    
    
    // static boolean hasArrayTwoCandidates(
    //     int A[],
    //     int arr_size, int sum)
    // {
    //     int l, r;
 
    //     /* Sort the elements */
    //     Arrays.sort(A);
 
    //     /* Now look for the two candidates
    //     in the sorted array*/
    //     l = 0;
    //     r = arr_size - 1;
    //     while (l < r) {
    //         if (A[l] + A[r] == sum)
    //             return true;
    //         else if (A[l] + A[r] < sum)
    //             l++;
    //         else // A[i] + A[j] > sum
    //             r--;
    //     }
    //     return false;
    // }
    
    
    public static int[] hashMapSoln(int [] arr, int goal) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(goal - arr[i])) {
                int [] res = {map.get(goal - arr[i]), i};
                return res;
            } else {
                map.put(arr[i], i);
            }
        }
        return new int[0];
    }








}
