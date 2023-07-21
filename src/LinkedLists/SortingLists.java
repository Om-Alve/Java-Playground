//package LinkedLists;
//
//import java.util.List;
//
//public class SortingLists {
//    public static void main(String[] args) {
//        ListNode x = new ListNode();
//    }
//    public void BubbleSort(){
//        BubbleSort();
//    }
//    private void BubbleSort(int row,int col){
//        if (row == 0) {
//            return;
//        }
//        if(col<row){
//
//        }
//    }
//    public ListNode MergeSort(ListNode head){
//        if((head == null) || (head.next == null)){
//            return head;
//        }
//        ListNode m = mid(head);
//        ListNode left = MergeSort(head);
//        ListNode right = MergeSort(m);
//        return merge(left,right);
//    }
//    public ListNode merge(ListNode x,ListNode y){
//        ListNode i = x;
//        ListNode j = y;
//        ListNode result = new ListNode();
//        ListNode res = result;
//        while(i.next!=null && j.next!=null){
//            if(i.val<j.val){
//                res.next = new ListNode(i.val);
//                i=i.next;
//            }
//            else{
//                res.next = new ListNode(j.val);
//                j=j.next;
//            }
//        }
//        while(i.next!=null){
//            res.next = new ListNode(i.val);
//            i=i.next;
//        }
//        while(j.next!=null){
//            res.next = new ListNode(j.val);
//            j=j.next;
//        }
//        return result.next;
//    }
//    public ListNode mid(ListNode head){
//        ListNode s =head;
//        ListNode f =head;
//        while(f!=null && f.next!=null){
//            f=f.next.next;
//            s=s.next;
//        }
//        return s;
//    }
//
//}
//
//class ListNode {
//      int val;
//      ListNode next;
//      ListNode() {}
//      ListNode(int val) { this.val = val; }
//      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//    public ListNode get(int i){
//        ListNode temp = head;
//        for (int j = 0; j < i; j++) {
//            temp=temp.next;
//        }
//        return temp;
//    }
//  }
