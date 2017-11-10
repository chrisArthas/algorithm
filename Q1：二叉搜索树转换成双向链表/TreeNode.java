package practise;

public class TreeNode {
	
	int value;
	
	TreeNode left;
	
	TreeNode right;
	
	TreeNode temp;
	
	public TreeNode(int value,TreeNode left,TreeNode right)
	{
		this.value = value;
		this.left = left;
		this.right = right;
	
	}
	
	public String toString()
	{
		return value+" ";
	}
	
}
