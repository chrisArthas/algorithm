package practise;

public class MiddleRange {

	/**
	 * 中序遍历 转二叉搜索树 为双向链表
	 * @param args
	 */
	public static void main(String[] args) {
		
		//;)
		TreeNode treeNode = new TreeNode(10,new TreeNode(6,new TreeNode(4,null,null),new TreeNode(8,null,null)),new TreeNode(14,new TreeNode(12,null,null),new TreeNode(16,null,null)));
		
		
		TreeNode result = baseConver(treeNode);
		
		while(result != null)
		{
			System.out.println(result.value);
			result = result.right;
		}
		
		
	}
	
	
	public static TreeNode convert(TreeNode root, TreeNode lastNode)
	{
		if(root == null)
		{
			return lastNode;
		}
		TreeNode currentNode = root;
		
		if(currentNode.left != null)
		{
			lastNode = convert(currentNode.left,lastNode);
		}
		
		currentNode.left = lastNode;
		
		if(lastNode != null)
		{
			lastNode.right = currentNode;
		}
		lastNode = currentNode;
		if(currentNode.right != null)
		{
			lastNode = convert(currentNode.right,lastNode);
		}
			
		return lastNode;
	}
	
	public static TreeNode baseConver(TreeNode root)
	{
		TreeNode lastNode = null;

		lastNode=convert(root, lastNode);

		TreeNode headNode = lastNode;

		while (headNode.left != null)
		{
			headNode = headNode.left;
		}
			System.out.println("headNode: " + headNode.value);
			System.out.println("===========");
		return headNode;
	}
	
	

}
