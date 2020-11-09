/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class LLCycle {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null) return false;
        HashSet<ListNode> myHash = new HashSet<>();
        while(head!=null){
            if(myHash.contains(head))
                return true;
            else
                myHash.add(head);
            head=head.next;
        }
    return false;
    }
}