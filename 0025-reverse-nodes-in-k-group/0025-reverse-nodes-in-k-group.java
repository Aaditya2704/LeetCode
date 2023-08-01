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
    
    static ListNode th=null;
    static ListNode tt=null;
    
    public static int length(ListNode head){
        ListNode temp=head;
        int size=0;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        return size;
    }
    public static void addFirst(ListNode node){
        if(th==null){
            th=node;
            tt=node;
        }else{
            node.next=th;
            th=node;
        }
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || head.next==null||k<=0)return head;
        
        ListNode oh=null,ot=null;
        int len=length(head);
        ListNode curr=head;
        while(len>=k){
            int tempK=k;
            while(tempK-- >0){
                ListNode forw=curr.next;
                curr.next=null;
                addFirst(curr);
                curr=forw;
            }
            if(oh==null){
                oh=th;
                ot=tt;
            }else{
                ot.next=th;
                ot=tt;
            }
            th=null;
            tt=null;
            len-=k;
        }
        
            ot.next=curr;
            return oh;
    }
}