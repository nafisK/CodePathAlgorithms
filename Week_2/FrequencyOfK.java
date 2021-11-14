package Week_2;

import java.util.HashMap;

public class FrequencyOfK {

    public static void main(String[] args) {

    // Find the element that appears k number of times in an array.
    // Examples:
    // Input: [8, 7, 9, 6, 7, 5, 1], k = 2
    // Output: 7
    int arr[] = {8, 7, 9, 6, 7, 5, 1};
    int arr2[] = new int[10];

    
    System.out.println(freqK(arr, 2));

    }

    public static int KFrequency(int arr[], int k) {
        if(arr == null)
            return 0;
        int res = 0;
        for (int i : arr) {
            if(i == k)
                res++;
        }
        return res;
    }



    public static int freqK(int arr[], int k) {

        if (arr.length == 0 || k <= 1) 
            return -1;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i: arr) {
            if(map.containsKey(i)) {
                int val = map.get(i);
                val++;
                map.replace(i, val);
            } else {
                map.put(i, 1);
            }
        }

        int x = -1;
        for(int key: map.keySet()) {
            if (k == map.get(key))
                x = key;
        }
        return x;

    }





}

