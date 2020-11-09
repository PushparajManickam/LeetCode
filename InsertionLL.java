/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class InsertionLL {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeA = listSize(headA);
        int sizeB = listSize(headB);
        if(headA==null && headB==null) return null;
        int loop;
        if(sizeA>sizeB){
            for(loop=0; loop<sizeA - sizeB; loop++)
                headA = headA.next;
        }
        else if(sizeA<sizeB){
            for(loop=0; loop<sizeB - sizeA; loop++)
                headB = headB.next;
        }
        while(headA!=headB){
                headA = headA.next;
                headB = headB.next;
        }
    return headA;
    }
    public int listSize(ListNode root){
        int count=0;
        while(root!=null){
            count++;
            root = root.next;
        }
        return count;
    }
}
