
// class ListNode {
//     public int value;
//     public ListNode next;
//     public ListNode(int value) {
//     this.value = value;
//     next = null;
//     }
// }
public class Solution_40_MergeTwoSortedLinkedLists {
    public ListNode merge(ListNode one, ListNode two){
        ListNode dummy = new ListNode(0);
        ListNode l1 = one;
        ListNode l2 = two;
        ListNode pre  = dummy;
        while(l1!=null && l2!= null){
            if(l1.value <= l2.value){
                pre.next = l1;
                pre = pre.next;
                l1 = l1.next;
            }
            else{
                pre.next = l2;
                pre = pre.next;
                l2 = l2.next;
            }
        }
        if(l1 != null)pre.next = l1;
        if(l2 != null)pre.next = l2;
        return dummy.next;
    }
}
