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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp = head;
        int len = 0;
        while(temp != null) {
            len++;
            temp = temp.next;
        }
        
        ListNode startIndex = null;
        ListNode endIndex = null;
        ListNode newNode = head;
        int i = 1;
        while(newNode != null) {
            if(i == k) {
                startIndex = newNode;
            }
            if(i == len-k+1) {
                endIndex = newNode;
            }
            i++;
            newNode = newNode.next;
        }
        int value = startIndex.val;
        startIndex.val = endIndex.val;
        endIndex.val = value;
        
        return head;
    }
}