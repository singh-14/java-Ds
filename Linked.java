public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        int flag = 0;
        while(fast!=null && slow !=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                flag = 1;
                break;
            }
        }
        if(flag == 1)   return true;
            return false;
    }
}
