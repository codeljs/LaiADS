// class ListNode {
//     public int value;
//     public ListNode next;
//     public ListNode(int value) {
//     this.value = value;
//     next = null;
//     }
// }

public class Solution_36_MiddleNodeOfLinkedList{
    public ListNode middleNode(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;

        }
        return slow;


    }





}