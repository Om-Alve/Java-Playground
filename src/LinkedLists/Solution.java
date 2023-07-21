package LinkedLists;


 // Definition for singly-linked list.
 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode temp =  head;

    }
     public void display(ListNode head){
         ListNode temp=head;
         while(temp!=null){
             System.out.print(temp.val + " --> ");
             temp=temp.next;
         }
         System.out.println("End");
     }
    public boolean isPalindrome(ListNode head) {
        ListNode og = head;
        ListNode rev = reverse(head);
        while(og!=null){
            if(og.val!=rev.val){
                return false;
            }
            og=og.next;
            rev = rev.next;
        }
        return true;
    }
    private ListNode reverse(ListNode head){
        if(head.next==null){
            return head;
        }
        ListNode prev = null;
        ListNode present = head;
        ListNode next = head.next;
        while(present!=null){
            present.next = prev;
            prev = present;
            present = next;
            if(next!=null){
                next = next.next;
            }
        }
        return prev;
    }
}