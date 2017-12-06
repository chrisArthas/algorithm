package practise;

public class FindLittleTree {

	/**
	 * 给定两个二叉树，A,B,判断，B是否是A的子树
	 * 
	 *       8                   8
     *   8       7            3     2 
	* 3    2  4    5         
	*1  4 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		
		TreeNode rootA = new TreeNode(8,new TreeNode(8,new TreeNode(3,new TreeNode(1,null,null),new TreeNode(4,null,null)),new TreeNode(2,null,null)),new TreeNode(7,new TreeNode(4,null,null),new TreeNode(5,null,null)));

		TreeNode rootB = new TreeNode(8,new TreeNode(3,null,null),new TreeNode(2,null,null));
	
		System.out.println(canFindLittleTree(rootA,rootB));
	
	}
	
	
	static Boolean canFindLittleTree(TreeNode rootA,TreeNode rootB)
	{
		Boolean canFind = false;

		/**
		 * 对于A、B树根节点的判空顺序很重要，B 必须在前 因为 B肯定比A 先遍历到叶子节点 
		 */
		if(rootB == null)
		{
			return true;
		}
		
		if(rootA ==null)
		{
			return false;
		}
		
		if(rootA.value == rootB.value)
		{
			canFind = findLittleTree(rootA,rootB);
		}
		if(!canFind)
			canFind = canFindLittleTree(rootA.leftNode,rootB);
		
		if(!canFind)
			canFindLittleTree(rootA.rightNode,rootB);
		
		
		return canFind;
	}
	
	static Boolean findLittleTree(TreeNode rootA,TreeNode rootB)
	{
		
		/**
		 * 对于A、B树根节点的判空顺序很重要，B 必须在前 因为 B肯定比A 先遍历到叶子节点 
		 */
		if(rootB == null)
			return true;
		
		
		if(rootA == null)
			return false;
		

		
		if(rootA.value != rootB.value)
		{
			return false;
		}
		
		return (findLittleTree(rootA.leftNode,rootB.leftNode)&& findLittleTree(rootA.rightNode,rootB.rightNode));
		
	
	}
	
	
	
	
	public static class TreeNode
	{
		int value;
		TreeNode leftNode;
		TreeNode rightNode;
		
		public TreeNode(int value,TreeNode leftNode,TreeNode rightNode)
		{
			this.value = value;
			this.leftNode = leftNode;
			this.rightNode = rightNode;
		}
	}

}
