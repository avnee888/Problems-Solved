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
    public ListNode insertionSortList(ListNode head) {
        if(head==null || head.next==null){
                return head;
            }
        
        ListNode temp=head.next;
        ListNode curr;
        ListNode prev=head;
        
        while(temp!=null){
            if(temp.val>prev.val){
            prev=temp;
            temp=temp.next;
            }
            else{
                curr=temp;
                prev.next=temp.next;
                temp=temp.next;
                ListNode trav=head;
        ListNode back=head;
        while(trav!=null && curr.val>trav.val){
            back=trav;
            trav=trav.next;
        }
        if(trav==head){
            curr.next=head;
            head=curr;
        }else{
            curr.next=trav;
            back.next=curr;
        }
            }
                
            
        }
        return head;
    }
}