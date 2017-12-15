package practise;

public class BinarySearchTree {

	/**
	 * ����һ�����飬�жϸ������Ƿ���ĳ�������������ĺ���������
	 * 
	 * �ٶ���������û���ظ���Ԫ��
	 * @param args
	 */
	public static void main(String[] args) {
	
		int nums[] = {5,7,6,9,11,10,8};
		
		System.out.println(" "+jugde(nums,nums.length));
	}
	
	/**
	 * ���������� �������������ԣ����ڵ��ֵ��һ������������ֵ��һ������������ֵС
	 * 
	 * ���жϵ�ǰ�����У���ȥ���ڵ㣬��Щ�ڵ����� ����������Щ����������
	 * 
	 * ���жϣ����е��������е����� �Ƿ�С�ڸ��ڵ㣬�����������е������Ƿ񶼴��ڸ��ڵ�
	 * 
	 * ��һ�������� ���������в�������ĳһ�������������ĺ����������
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
