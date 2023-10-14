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
        ListNode cur = head;
        int len = 0;
        if(head.next==null){
            if( n==1){
            return null;
        }else{
            return head;
        }
        }

        while(cur!=null){
            len++;
            cur=cur.next;
        }
        int index = len-n;

        cur = head;
        ListNode prev = null;
        while(index!=0){
             prev = cur;
             cur = cur.next;
             index--;
        }
        if(head==cur){
            head = cur.next;
            return head;
        }
        prev.next = cur.next;
        return head;
    }
}