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
    public ListNode reverseBetween(ListNode head, int left, int right) {
    ListNode dummy = new ListNode(0,head);
    ListNode leftl=dummy,cur=head;
    for(int i=0;i<left-1;i++){
        leftl=cur;
        cur=cur.next;
    }
    ListNode prev = null;
    for(int i=0;i<right-left+1;i++){
        ListNode temp = cur.next;
        cur.next = prev;
        prev = cur;
        cur= temp;
    }
    leftl.next.next=cur;
    leftl.next=prev;
    return dummy.next;
    }
}