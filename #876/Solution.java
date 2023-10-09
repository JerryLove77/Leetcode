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
        ListNode low = head;
        ListNode fast = head;
        while(fast != null ){
            if(fast.next != null){
                low = low.next;
                fast = fast.next;
            }
            fast = fast.next;
        }
        return low;
    }
}
