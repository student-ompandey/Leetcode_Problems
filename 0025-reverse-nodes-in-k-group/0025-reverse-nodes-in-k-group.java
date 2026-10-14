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
    public void Reverse(ListNode st, ListNode end){
        ListNode curr = st, prev = end.next;
        while(prev != end){
            ListNode t = curr.next;
            curr.next = prev;
            prev = curr;
            curr = t;

        }
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || k==1){
            return head;
        }
        ListNode st = head, end = head;
        int i = k-1;
        while(i-- != 0){
            end = end.next;
            if(end==null){
                return head;
            }
        }

        ListNode ans = reverseKGroup(end.next, k);
        Reverse(st, end);
        st.next = ans;
        return end;
    }
}