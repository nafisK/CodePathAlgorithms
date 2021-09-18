package Week_2;

public class FrequencyOfK {

    public static void main(String[] args) {

    // Find the element that appears k number of times in an array.
    // Examples:
    // Input: [8, 7, 9, 6, 7, 5, 1], k = 2
    // Output: 7
    int arr[] = {8, 7, 9, 6, 7, 5, 1};
    int arr2[] = new int[10];

    
    System.out.println(KFrequency(null, 7));

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

}

