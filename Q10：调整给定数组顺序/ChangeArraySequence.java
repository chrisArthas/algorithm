package practise;

public class ChangeArraySequence {

	/**
	 * 调整数组顺序，使得奇数位于偶数前面
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		sort(nums);
	}
	
	
	public static void sort(int[] array)
	{
		int start = 0;
		int end = array.length-1;
		while(end > start)
		{
			while(array[start]%2 == 1 )
			{
				start++;
			}
			while(array[end]%2 == 0)
			{
				end--;
			}
			if(end > start)
			{
				int temp = array[end];
				array[end] = array[start];
				array[start] = temp;
			}
		}
		
		for(int i =0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		
	}

}
