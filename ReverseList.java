
class ReverseList 
{
    public ListNode reverseList(ListNode head) {
        ListNode temp, current, prev;
            current = head;
            prev = null;
        while(current!=null){
            temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
            head = prev;
        
        return head;
    }
}