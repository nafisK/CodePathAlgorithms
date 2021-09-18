package Week_1.Optionals;

public class MultipleOf3Or5 {
    public static void main(String[] args) {
        
        // If we list all the natural numbers below 10 that are multiples of 3 or 5, we get
        // 3, 5, 6 and 9. The sum of these multiples is 23.
        // Find the sum of all the multiples of 3 or 5 below 1000.

        System.out.println(sumOfMultiplesOf3And5(1000));

    }

    // Time Complexity O(n) && Space Complexity Worst O(n)
    public static int sumOfMultiplesOf3And5(int num) {
        int sum = 0;
        for(int i = 0; i < num; i++) {
            if (num % 3 == 0 || num % 5 == 0) {
                sum += num;
            }
        }
        return sum;
    }



}
