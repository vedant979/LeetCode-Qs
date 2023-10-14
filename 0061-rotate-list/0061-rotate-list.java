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
        if(head==null || head.next==null){
            return head;
        }
        ListNode cur= head;
        int len =0;
        while(cur.next!=null){
            len++;
            cur =cur.next;
        }
        
        len+=1; 
        while(k>=len){
            k-=len;
        }
        cur.next = head;
        // System.out.println(cur.next.val);
        int index= len-k-1;
        // System.out.print(index);
        ListNode curNode = head;
        while(index!=0){
            System.out.println(index);
            curNode = curNode.next;

            index--;
        }
        ListNode head2 = curNode.next;
        curNode.next=null;
        head = head2;
        return head;
    }
}