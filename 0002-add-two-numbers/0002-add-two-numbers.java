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
 import java.math.BigInteger;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = l1;
        ListNode temp1 = l2;
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
         ListNode dummy = new ListNode();
        ListNode result = dummy;
        while(temp != null) {
            a.append( temp.val);
            temp = temp.next;
        }
        while(temp1 != null) {
            b.append(temp1.val);
            temp1 = temp1.next;
        }
BigInteger num1 = new BigInteger(a.reverse().toString());
BigInteger num2 = new BigInteger(b.reverse().toString());

BigInteger res = num1.add(num2);
        
        if (res.equals(BigInteger.ZERO)) {
    return new ListNode(0);
}

        while(res.compareTo(BigInteger.ZERO)>0){
            BigInteger last = res.mod(BigInteger.TEN);

            result.next = new ListNode(last.intValue());
            result = result.next;

            res = res.divide(BigInteger.TEN);

        }
        

        return dummy.next;
    }
}