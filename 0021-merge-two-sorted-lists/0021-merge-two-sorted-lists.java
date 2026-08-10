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
        ListNode a = new ListNode();
        ListNode ans = a;
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        while(list1 != null && list2 != null){
            ans.next = new ListNode();
            ans = ans.next;
                if(list1.val <= list2.val){
                    ans.val = list1.val;
                    list1 = list1.next;
                } else {
                    ans.val = list2.val;
                    list2 = list2.next;
                } 

        }

        while(list1 != null){
            ans.next = new ListNode();
            ans = ans.next;
            ans.val = list1.val;
            list1 = list1.next;
           
        }
         while(list2 != null){
            ans.next = new ListNode();
            ans = ans.next;
            ans.val = list2.val;
            list2 = list2.next;
        }
        return a.next;
    }
}