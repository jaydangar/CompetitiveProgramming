/*
 * @lc app=leetcode id=19 lang=java
 *
 * [19] Remove Nth Node From End of List
 */

// @lc code=start
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return null;
        }

        int length = 0;
        ListNode currentNode = head;
        while(currentNode!=null){
            length++;
            currentNode = currentNode.next;
        }

        n = length - n;
        if(n==0){
            return head.next;
        }

        int counter = 0;
        ListNode tempNode = head;        
        while(counter<(n-1)){
            tempNode = tempNode.next;
            counter++;
        }

        tempNode.next = tempNode.next.next;

        return head;
    }
}
// @lc code=end

