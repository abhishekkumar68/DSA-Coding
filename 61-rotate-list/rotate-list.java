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
    public ListNode rotateRight(ListNode head, int k) {
        // ListNode temp = head;
        // ListNode prev = null;
        // ListNode curr = head;

        // if(head == null || head.next == null || k==0) return head;

        // for(int i=0;i<k;i++){
        //     while(curr.next!=null){
        //         prev = curr;
        //         curr = curr.next;
        //     }
        //     prev.next = null;
        //     curr.next = head;
        //     head = curr;
        // }
        // return head;


        if(head == null || head.next == null || k==0) return head;

        ListNode temp = head;
        int length = 1;
        while(temp.next!=null){
            temp = temp.next;
            length++;
        }

        temp.next = head;
        
        k = k%length;
        int tempNewTail = length-k;
        ListNode newTail = head;
        for(int i=1;i<tempNewTail;i++){
            newTail = newTail.next;
        }
        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
        
    }
}