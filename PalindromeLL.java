/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class PalindromeLL {
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        boolean isPalin = true;
        Stack<Integer> stack = new Stack<>();
        while(temp!=null){
            stack.push(temp.val);           //Push all node value into stack
            temp=temp.next;
        }
        //System.out.println(stack);
        while(head!=null){
            int check = stack.pop();        //pop() value is equal to head of first....
            if(head.val == check)
                isPalin = true;
            else
                return false;
            head = head.next;
        }
        return isPalin;
    }
}