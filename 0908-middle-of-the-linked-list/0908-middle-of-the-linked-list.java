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
    public ListNode middleNode(ListNode head) {
        ListNode curNode = head;
        int len=0;
        while(curNode!=null){
            len++;
            curNode = curNode.next;
        }
        int index = len/2;
        curNode = head;
        while(index!=0){
            index--;
            curNode =curNode.next;
        }
        return curNode;
    }
}