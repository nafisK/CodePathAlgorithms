package Week_1;

public class NextPrime {
    // Given a number, return the next smallest prime number

    // Examples:
    // Input: 3
    // Output: 5
    public static void main(String[] args) {
        int x = nextPrime(19);
        System.out.println("Next Prime: " + x);
    }


    public static int nextPrime(int num) {
        num++;
        if(isPrime(num)) {
            return num;
        }
        else
            return nextPrime(num);
    }


    public static boolean isPrime(int num) {
        int i = 2;
        while(i < (num / 2)) {
            if(num % i == 0)
                return false;
            i++;
        }
        return true;
    }


    
}
