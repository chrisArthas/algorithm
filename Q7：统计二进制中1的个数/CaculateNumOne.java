package practise;

public class CaculateNumOne {

	/**
	 * 实现一个函数，输入一个整数，输出二进制中 1 的个数。
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("result: "+caculate(-5));
		
		System.out.println("result: "+caculate2(-5));
	}

	
	/**
	 * 负数的位运算为 取补码参与运算
	 * 补码：符号位不变 取反，然后+1
	 * @param num
	 * @return
	 */
	public  static int caculate(int num)
	{
		int count = 0;

		int flag = 1;
		while(flag != 0)
		{
			int temp = num & flag;
			if(temp != 0)
			{
				count++;
			}
//			num = num >> 1;
			flag = flag << 1;
		}
		
		return count;
	}
	
	/**
	 * 对一个二进制数，当减去1，之后再与自身进行与操作，能让该数的最后一位1变为0
	 * @param num
	 * @return
	 */
	public  static int caculate2(int num)
	{
		int count = 0;
		while(num != 0)
		{
			 num = (num-1) & num;
			
			count++;
		}
		
		return count;
	}
}
