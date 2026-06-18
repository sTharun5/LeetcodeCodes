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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode td = dummy;
        ListNode th1 = list1;
        ListNode th2 = list2;

        while(th1 != null && th2 != null){
            if(th1.val < th2.val){
                td.next = th1;
                th1 = th1.next;
            }
            else{
                td.next = th2;
                th2 = th2.next;
            }
             td = td.next;
        }

        while(th1 != null) {
            td.next = th1;
            th1 = th1.next;
             td = td.next;
        }

        while(th2 != null){
            td.next = th2;
            th2 = th2.next;
             td = td.next;
        }
        return dummy.next;
    }
}