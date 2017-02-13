package firecode;

public class InsertAtTail {
	
	public static void main(String[] args) {
//		LinkedList: 1->2
//		Node to be inserted: 3
		//ListNode l1 = new ListNode(1);
		//System.out.println(insertAtTail(new ListNode(1), 1));
	}
	
	public static ListNode insertAtTail(ListNode head, int data) {
		ListNode ls = null;// = new ListNode(data);
		if(head==null) return ls;
		while(true){
			if(head.next!=null){ 
			// false;
			}
			if(head.next==null){ 
				head.next = ls;
			//	return true;
			}
		}
	}

	private class ListNode {
		int data;
		ListNode next;        
		ListNode(int data) { this.data = data; }
	}  
}
