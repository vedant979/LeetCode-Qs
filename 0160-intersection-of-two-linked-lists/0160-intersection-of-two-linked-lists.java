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
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curA= headA;
        ListNode curB= headB;

        while(curA!=curB){
            // if(curA==headB || curB==headA){
            //     return null;
            // }
            if(curA==null){
                curA = headB;
            }else{
            curA=curA.next;
            }
            if(curB==null){
                curB = headA;
            }else{

            curB=curB.next;
            }
            // System.out.println(curA.val+" "+curB.val);

        }
        // if(curA!=curB){
        //     return null;
        // }
        return curA;
    }
}