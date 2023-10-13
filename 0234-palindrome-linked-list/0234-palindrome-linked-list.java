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
    public boolean isPalindrome(ListNode head) {
        ListNode cur = head;
        int len =0;
        while(cur!=null){
            len++;
            cur = cur.next;
        }
        int[]arr = new int[len];
        int i =0;
        cur = head;
        while(cur!=null){
            arr[i++] = cur.val;
            cur = cur.next;
        }
        for(i=0;i<arr.length;i++){
            if(arr[i]!=arr[arr.length-i-1]){
                return false;
            }
        }
        return true;
    }
}