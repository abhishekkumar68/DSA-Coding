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
    public ListNode oddEvenList(ListNode head) {

        ListNode evenHead = null, evenTail = null;
        ListNode oddHead = null, oddTail = null;
        ListNode current = head;
        int pos = 1;
        while(current!=null){
            if(pos%2==0){
                if(evenHead==null){
                    evenHead = current;
                    evenTail = current;
                }
                else{
                    evenTail.next = current;
                    evenTail = current;
                }
            }
            else{
                if(oddHead==null){
                    oddHead = current;
                    oddTail = current;
                }
                else{
                    oddTail.next = current;
                    oddTail = current;
                }
            }
            current = current.next;
            pos++;
        }
        if(oddTail != null)
            oddTail.next = evenHead;

        if(evenTail != null)
            evenTail.next = null;

        return oddHead;
    
    }
}