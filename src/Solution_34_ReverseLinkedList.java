
class ListNode {
    public int value;
    public ListNode next;
    public ListNode(int value) {
    this.value = value;
    next = null;
    }
}


public class Solution_34_ReverseLinkedList{
    // iterative way
    // public ListNode reverse(ListNode head){
    //     if(head == null || head.next == null){
    //         return head;
    //     }
    
    //     ListNode prev = null;
    //     while(head != null){
    //         ListNode next = head.next;
    //         head.next = prev;
    //         prev = head;
    //         head = next;
    //     }
    //     return prev;
    // }


//recursive way
    public ListNode reverse(ListNode head){
        if(head == null || head.next == null)return head;
        ListNode sub = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return sub;
        
    }



}



