/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode curNode = node;
        ListNode prevNode = node;
        while(curNode.next!=null){
            int temp = curNode.val;
            curNode.val = curNode.next.val;
            curNode.next.val = temp;
            if(curNode.next.next==null){
                prevNode = curNode;
            }
            curNode = curNode.next;
        }
        prevNode.next = null;
    }
}