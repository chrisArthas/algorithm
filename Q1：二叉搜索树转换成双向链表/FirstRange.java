package practise;

public class FirstRange {

	private static TreeNode lastNode = null;
	/**
	 * 先序遍历 转二叉搜索树 为双向链表
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode treeNode = new TreeNode(10,new TreeNode(6,new TreeNode(4,null,null),new TreeNode(8,new TreeNode(7,null,null),new TreeNode(9,new TreeNode(31,null,null),null))),new TreeNode(14,new TreeNode(12,null,null),new TreeNode(16,null,null)));
		convert(treeNode);
		convertDouble(treeNode);
		print(treeNode);
	
	}
	
	
	/**
	 * 先利用递归变成单向链表
	 * @param currentNode
	 * @return
	 */
	public static TreeNode convert(TreeNode currentNode)
	{
		TreeNode lastNode = null;
		if(currentNode == null)
		{
			return lastNode;
		}
		
		if(currentNode.left != null && currentNode.right != null)
		{
			lastNode = convert(currentNode.left);
						
			lastNode.left = currentNode.right;
			
			lastNode = convert(currentNode.right);

			
		}else if(currentNode.left != null && currentNode.right ==null)
		{
			lastNode = convert(currentNode.left);
			
		}else if(currentNode.left == null && currentNode.right !=null)
		{
		
			currentNode.left = currentNode.right;
					
		}else
		{
			lastNode = currentNode;
		}
		
		return lastNode;
	}
	
	/**
	 * 转换成双向链表
	 */
	public static void convertDouble(TreeNode root)
	{
		TreeNode node = root;
		while(node.left != null)
		{
			node.left.right = node;
			node = node.left;
		}
	}
	
	public static void print(TreeNode treeNode)
	{
		TreeNode result  = treeNode;
		if(result != null)
		{
			System.out.println(result.value);
			result = result.left;
			print(result);
		}
	}
	

}
