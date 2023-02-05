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
        ListNode result = new ListNode(0);
        result = head;
        int size = 0;
        while (result!= null){
            result= result.next;
            size++;
        }
        int middle = size/2;
        for(int i = 0; i<middle; i++){
            head =head.next;
        }
        return head;
    }
}