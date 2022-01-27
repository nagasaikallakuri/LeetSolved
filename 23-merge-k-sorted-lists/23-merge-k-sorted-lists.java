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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> q=new PriorityQueue<>((l1,l2)->l1.val-l2.val);
        ListNode dummy=new ListNode(-1);
        ListNode head=dummy;
        for(ListNode list:lists){
            while(list!=null){
                q.offer(list);
                list=list.next;
            }
        }
        while(!q.isEmpty()){
            dummy.next=q.poll();
            dummy=dummy.next;
        }
        dummy.next=null;
    return head.next;
    }
}