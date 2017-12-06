package practise;

import java.util.Stack;

import practise.FindLittleTree.TreeNode;

public class BinaryTreeMirror {

	/**
	 * 给定一个二叉树，输出该二叉树的镜像二叉树
	 * 
	 * 
	 * 
	 *       8                     8
     *   8       7     ->      7       8
	* 3    2  4    5        5    4    2   3   
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(8,new TreeNode(8,new TreeNode(3,null,null),new TreeNode(2,null,null)),new TreeNode(7,new TreeNode(4,null,null),new TreeNode(5,null,null)));
		
		TreeNode result = getMirror2(root);
		System.out.println(result.value);
	}
	
	/**
	 * 递归实现
	 * @param root
	 * @return
	 */
	public static TreeNode getMirror(TreeNode root)
	{
		if(root != null)
		{
			TreeNode temp  = root.leftNode;			
			root.leftNode = root.rightNode;
			root.rightNode = temp;
			
			getMirror(root.leftNode);
			getMirror(root.rightNode);
		}
		return root;
	}
	
	/**
	 * 非递归实现
	 * 先序遍历
	 * @param root
	 * @return
	 */
	public static TreeNode getMirror2(TreeNode root)
	{
		Stack<TreeNode> stack = new Stack();
		
		if(root != null)
		{
			stack.push(root);
			while(!stack.isEmpty())
			{
				 TreeNode currentNode  = stack.pop();			
					TreeNode temp  = currentNode.leftNode;			
					currentNode.leftNode = currentNode.rightNode;
					currentNode.rightNode = temp;
					
				if(currentNode.rightNode != null)
					stack.push(currentNode.rightNode);
				if(currentNode.leftNode != null)
					stack.push(currentNode.leftNode);
			}
		}
			
		return root;
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
