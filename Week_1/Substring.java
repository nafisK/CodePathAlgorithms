package Week_1;

public class Substring {

    public static void main(String [] args) {

        // Write a function that takes in two strings and returns true if the second string is substring of the first, and false otherwise.

        // Examples: 
        // Input: laboratory, rat
        // Output: true

        // Input: cat, meow
        // Output: false

        String firstString = "Independent";
        String secondString = "Inde";

        System.out.println(subString(firstString, secondString));


        
            

    }

    // O(n) Time complexity
    public static boolean subString(String F, String S) {

        if (F == null || F == "" || S == null || S == "" || S.length() > F.length())
            return false;

        int count = 0;  
        for(int i = 0; i < F.length(); i++){
            if(S.charAt(count) == F.charAt(i)) {
                count += 1;
                if (count == S.length() - 1 )
                    return true;
            }

        }

        return false;
    }

  
}
