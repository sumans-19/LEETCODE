// 10} Given an array nums of size n, return the majority element.
// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.


CODE=>
 class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0, count = 0;
        for (int num : nums) {
            if (count == 0) candidate = num;
            count += (num == candidate) ? 1 : -1;
        }
        return candidate; 
    }
}

// 11} Sort list
//  Given the head of a linked list, return the list after sorting it in ascending order.

CODE=>
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
    public ListNode sortList(ListNode head) {
        int len = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            len++;
        }
        int[] listarray = new int[len];
        int i = 0;
        ListNode newtemp = head;
        while(newtemp != null){
            listarray[i] = newtemp.val;
            i++;
            newtemp = newtemp.next;
        }
        Arrays.sort(listarray);
        ListNode temp2 = head;
        int j = 0;
        while(temp2 != null){
            temp2.val = listarray[j];
            j++;
            temp2 = temp2.next;
        }
        return head;
    }
}
