package firecode;

public class DeleteAtTail {

	public ListNode deleteAtTail(ListNode head) {   
	      if(head == null || head.next == null) return null;
	      ListNode curr = head;
	      ListNode prev = curr;
	      //goto last node of the list
	      while(curr.next != null) {
	          prev = curr;
	          curr = curr.next;
	      }
	      prev.next = null;
	      return head;
	  }
	
	 class ListNode {
		    int data;
		    ListNode next;        
		    ListNode(int data) { this.data = data; }
		 } 
}
