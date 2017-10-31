package practise;

public class FirstRange {

	private static TreeNode lastNode = null;
	/**
	 * 先序遍历 转二叉搜索树 为双向链表
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode treeNode = new TreeNode(10,new TreeNode(6,new TreeNode(4,null,null),new TreeNode(8,null,null)),new TreeNode(14,new TreeNode(12,null,null),new TreeNode(16,null,null)));
		baseconvert(treeNode,null);
		lastNode = null;
		baseconvert(treeNode.right,null);
		getRight(treeNode);
		print(treeNode);
	}
	
	
	public static TreeNode baseconvert(TreeNode root,TreeNode rightNode)
	{
		TreeNode currentNode = root;

		if(currentNode.left != null)
		{
			lastNode = baseconvert(currentNode.left,currentNode.right);
		}
		if(lastNode == null)
		{
			lastNode = currentNode;
		}		
		if(rightNode != null)
		{
			lastNode.left = rightNode;
//			rightNode.right = lastNode;
			lastNode = rightNode;
		}
		
		return lastNode;
		
	}
	
	public static void getRight(TreeNode treeNode)
	{
		TreeNode result  = treeNode;
		if(result != null && result.left != null)
		{
			result.left.right = result;
			getRight(result.left);
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
