// class ListNode {
//     public int value;
//     public ListNode next;
//     public ListNode(int value) {
//     this.value = value;
//     next = null;
//     }
// }
public class Solution_39_InsertInSortedLinkedList {
    public ListNode insert(ListNode head, int value) {
        ListNode dummy = new ListNode(1);
        dummy.next = head;
        ListNode p = dummy;
        ListNode v = new ListNode(value);
        while(p.next != null){
            if(p.next.value >= value){
                v.next = p.next;
                p.next = v;
                return dummy.next;
            }
            p = p.next;
        }
        p.next = v;
        return dummy.next;
    }



}
