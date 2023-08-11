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
    public static ListNode startingNodeOfCycle(ListNode head){
        if(head==null||head.next==null)return null;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null &&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)break;
        }
        if(slow!=fast)return null;
        slow=head;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null||headB==null)return null;
        
        ListNode tail=headA;
        while(tail.next!=null)tail=tail.next;
        
        tail.next=headB;
        ListNode ans=startingNodeOfCycle(headA);
        tail.next=null;
        return ans;
    }
}