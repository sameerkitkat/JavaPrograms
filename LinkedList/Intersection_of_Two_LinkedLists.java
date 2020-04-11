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
    
    public int getSize(ListNode head){
        ListNode current = head;
        int count=0;
        while(current!=null){
            current=current.next;
            count++;
        }
       return count;
    }       
        
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        int s1 = getSize(headA);
        int s2 = getSize(headB);
        
        int d = Math.abs(s1-s2);
        int count = 0;
        
        if (s1>s2){
            while(count!=d){
                headA = headA.next;
                count++;
            }
            ListNode newHeadA = headA;
            while(newHeadA != headB){
                newHeadA = newHeadA.next;
                headB = headB.next;
            }
            return headB;
        }
        else{
            while(count!=d){
                headB = headB.next;
                count++;
            }
            ListNode newHeadB = headB;            
             while(newHeadB != headA){
                newHeadB = newHeadB.next;
                headA = headA.next;
            }
            return headA;
        }
    }
}
