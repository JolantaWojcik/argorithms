package firecode;

public class Test {
	public static void main(String[] args) {
		TreeNode five = new TreeNode(5, null);
		TreeNode four = new TreeNode(4, null);
		TreeNode three = new TreeNode(3, null);
		TreeNode two = new TreeNode(2, three);
		TreeNode head = new TreeNode(1, two);
		System.out.println(findMiddle(head).data);
	}
	
	static class TreeNode {
		public int data;
		public TreeNode right;
		public TreeNode(int data, TreeNode right) {
			this.data = data;
			this.right = right;
		}
	}
	
	public static TreeNode findMiddle(TreeNode head) {
		if (head == null) return null;
		
		TreeNode slow = head;
		TreeNode fast = head;
		
		while(fast.right != null && fast.right.right!=null) {
			fast = fast.right.right;
			slow = slow.right;
		}
		
		return slow;
	}
}
