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
        if(head==null || head.next==null || left==right){
            return head;
        }
        ListNode curNode = head;
        int len = 0;
        while(curNode!=null){
            len++;
            curNode = curNode.next;
        }
        int r  = right;
        int l = left;
        ListNode left1= head;
        ListNode leftPrev = head;
        ListNode right1 = head;
        ListNode rightNext = head; 

        int index = 1;
        while(left-->1){
            leftPrev = left1;
            left1 = left1.next;
        }
        while(right-->1){
            right1 = right1.next;
        }
        if(right1.next!=null){
            rightNext = right1.next;
        }else{
            rightNext = right1;
        }
        right1.next = null;
        ListNode prev = null;
        ListNode cur = left1;
        ListNode next = null; 

        while(cur!=null){
            next = cur.next;
            cur.next =prev;
            prev = cur;
            cur = next;
        }
        // System.out.println(head.next.val+" " +leftPrev.val+" "+left1.val+" "+right1.val+" "+rightNext.val);

        if(r==len && l==1){
            head = right1;
            left1.next = null;
            return head;
        }else if(r==len && l!=1){
            leftPrev.next =right1;
            left1.next=null;
            return head;
        }else if(r!=len && l==1){
            head = right1;
            left1.next = rightNext;
            return head;
        }else if(l!=1 && r!=len){
            leftPrev.next = right1;
            left1.next = rightNext;
            return head;
        }
        return null;
    }
}