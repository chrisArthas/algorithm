package practise;

public class BinarySearchTree {

	/**
	 * 输入一个数组，判断该数组是否是某个二叉搜索树的后序遍历结果
	 * 
	 * 假定该数组中没有重复的元素
	 * @param args
	 */
	public static void main(String[] args) {
	
		int nums[] = {5,7,6,9,11,10,8};
		
		System.out.println(" "+jugde(nums,nums.length));
	}
	
	/**
	 * 二叉搜索树 后续遍历的特性：根节点的值，一定比左子树的值大，一定比右子树的值小
	 * 
	 * 先判断当前数组中，除去根节点，哪些节点属于 左子树，哪些属于右子树
	 * 
	 * 在判断，所有的左子树中的数字 是否都小于根节点，右子树中所有的数字是否都大于根节点
	 * 
	 * 有一个不满足 则整个序列不可能是某一个二叉搜索树的后序遍历序列
	 * @param nums
	 * @return
	 */
	public static Boolean jugde(int nums[],int length)
	{		
		if(nums == null || nums.length == 0)
		{
			return false;
		}
		
		int root  = nums[length-1];
		
		int i = 0;
		for(;i<length-1;i++)
		{
			if(nums[i]>root)
			{
				break;
			}
		}
		
		int j = i;
		int rightNums[] = new int[length - i -1];
		for(;j<length-1;++j)
		{
			if(nums[j]<root)
			{
				return false;
			}
			rightNums[j - i] = nums[j];
		}
		
		Boolean left = true;
		if(i>0)
		{
			left = jugde(nums,i);
		}
		Boolean right = true;
		
		
		if(j < length -1)
		{
			right = jugde(rightNums,length - i -1);
		}
		
		return left&&right;
	}

}
