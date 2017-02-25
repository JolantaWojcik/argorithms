//package firecode;
//
//public class TreeNode {
//	public TreeNode findNode(TreeNode root, int val) {                   
//        if(root == null) return null;
//        Queue<TreeNode> q = new LinkedList<TreeNode>();
//        q.add(root);
//        TreeNode curr = null;
//        while(!q.isEmpty()) {
//            curr = q.remove();
//            if(curr.data == val) {
//                break;
//            }        
//            if(curr.left != null)
//                q.add(curr.left);
//            if(curr.right != null)
//                q.add(curr.right);
//        }   
//        if(curr.data == val) 
//            return curr;
//        else
//            return null;
//    }
//}
