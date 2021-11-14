package Week_4.Optionals;

public class GetLengthOfLinkedList {
    public static void main(String[] args) {
        


        // Get Length of LinkedList 
        /*
        Given a singly linked list, return its length

        Example:

        Input:  1->2->3->4
        Output: 4

        // Edge cases:
            List can be singular or circular
            list can have an empty value


        // Plan:
        
            iterate thorugh the entire list and return the length
                


        */


    }


    public static int getLengthOfLLIterative(ListNode head) {

        if (head == null)
            return 0;

        ListNode temp = head;

        int count = 0;
        while (temp.next != null) {
            count++;
            temp = temp.next;
        }
        return count;


    }

    public static int getLengthOfLLrecursive(ListNode head) {

        if (head == null)
            return 0;
        return 1 + getLengthOfLLrecursive(head.next);

    }




    
}
