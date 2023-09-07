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
        if (head == null || head.next == null || left >= right) {
            return head;
        }

        ListNode temp = new ListNode(0);
        temp.next = head;
        head = temp;        
        for (int i = 1; i < left; i++) {
            if (head == null) {
                return null;
            }
            head = head.next;
        }

        ListNode prev = head;
        ListNode tail = head.next;
        ListNode curr = head.next;
        prev.next = null;

        for (int i = left; i <= right; i++) {
            if (i == right) {
               tail.next = curr.next; 
            }
            ListNode next = curr.next;    
            curr.next = prev.next;
            prev.next = curr;
            curr = next;
        }
        return temp.next;
        

    }
}