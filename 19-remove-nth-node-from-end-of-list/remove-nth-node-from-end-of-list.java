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
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // ListNode temp = head;
        // int length = 0;
        // while(temp!=null){
        //     length++;
        //     temp = temp.next;
        // } 

        // if(length==n) return head.next;

        // int prevNode = length-n;
        // temp = head;
        // while(temp!=null){
        //     prevNode--;

        //     if(prevNode==0) break;
        //     temp = temp.next;
        // }
        
        // temp.next  = temp.next.next;
        // return head;

        // ListNode dummy = new ListNode(0);
        // dummy.next = head;
        // ListNode slow = dummy;
        // ListNode fast = dummy;

        // if(head.next==null) return null;

        // for(int i=1;i<=n+1;i++){
        //     fast = fast.next;
        // }

        // while(fast!=null){
        //     slow = slow.next;
        //     fast = fast.next;
        // }

        // slow.next = slow.next.next;
        // return head;

        ListNode slow=head;
        ListNode fast=head;

        for(int i=0;i<n;i++){
            fast=fast.next;
        }

        if(fast==null) return head.next;

        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;

        return head;
    }
}