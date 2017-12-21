package practise;

import java.util.Stack;

import practise.BinaryTreeMirror.TreeNode;

public class BinaryNodeSum {

	/**
	 * 输入一颗二叉树和一个整数，打印出所有和为这个整数的路径，根节点到叶子节点为一个路径
	 * @param args
	 */
	
	private static  Stack<TreeNode> stack;
	
	private static int nodeSum;
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(10,new TreeNode(5,new TreeNode(4,null,null),new TreeNode(7,null,null)),new TreeNode(12,null,null));
		int sum = 18;
		TreeNode root2 = new TreeNode(8,new TreeNode(8,new TreeNode(3,null,null),new TreeNode(2,null,null)),new TreeNode(7,new TreeNode(4,null,null),new TreeNode(5,null,null)));
		stack = new Stack<TreeNode>();
		firstRange(root2,sum);
	}
	
	
	public static void firstRange(TreeNode root,int num)
	{
		if(root == null)
		{
			return;
		}
		stack.push(root);
		nodeSum = nodeSum + root.value;

		if(root.leftNode == null && root.rightNode == null)			
		{
			if(nodeSum == num)
			{
				for(TreeNode node: stack)
				{
					System.out.println(node.value);
				}
			}			
			stack.pop();
			nodeSum = nodeSum - root.value;
			return;
		}
		
		if(root.leftNode != null)
		{
			firstRange(root.leftNode,num);
		}
		
		if(root.rightNode != null)
		{
			firstRange(root.rightNode,num);
		}
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
