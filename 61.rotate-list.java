/*
 * @lc app=leetcode id=61 lang=java
 *
 * [61] Rotate List
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
    public ListNode rotateRight(ListNode head, int k) {
        
        if(k==0)return head;
        
        int length = countLength(head,0);
        
        if(length<2)return head;

        int modulo = k%length;
        if(modulo==0){
            return head;
        }

        int parseNodes = length - modulo;
        if(parseNodes==0)return head;

        ListNode currentNode = head;
        while(parseNodes>1){
            currentNode = currentNode.next;
            parseNodes--;
        }

        ListNode newHead = currentNode.next;
        ListNode nextNode = newHead;
        currentNode.next = null;
        while(nextNode.next!=null){
            nextNode = nextNode.next;
        }
        nextNode.next = head;
        return newHead;
    }

    int countLength(ListNode node,int counter){
        if(node==null){
            return counter;
        }
        return countLength(node.next,counter+1);
    }   
}
// @lc code=end

