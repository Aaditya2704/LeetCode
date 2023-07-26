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
    public ListNode deleteMiddle(ListNode head) {
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        if(size==1||size==0)return null;
        int mid=(size/2);
        ListNode t=head;
        for(int i=0;i<mid-1;i++){
            t=t.next;
        }
        t.next=t.next.next;
        return head;
    }
}