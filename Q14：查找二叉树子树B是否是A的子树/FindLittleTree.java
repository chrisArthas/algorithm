package practise;

public class FindLittleTree {

	/**
	 * ����������������A,B,�жϣ�B�Ƿ���A������
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
		 * ����A��B�����ڵ���п�˳�����Ҫ��B ������ǰ ��Ϊ B�϶���A �ȱ�����Ҷ�ӽڵ� 
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
		 * ����A��B�����ڵ���п�˳�����Ҫ��B ������ǰ ��Ϊ B�϶���A �ȱ�����Ҷ�ӽڵ� 
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
