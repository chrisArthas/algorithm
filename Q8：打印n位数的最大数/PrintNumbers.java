package practise;

public class PrintNumbers {

	/**
	 * 输入数字n,按顺序打印1到n位的最大数字
	 * 例： 输入3，打印1-999
	 * 
	 * 需要考虑大数问题，即int 和long的位数都不够的情况下
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNumbers(3);
	}
	
	public static void printNumbers(int number)
	{
		int[] result = new int[number];
		for(int i  = 0;i <number;i++)
		{
			result[i] = 0;
		}
		
		for(int i = 0;i <10;i++)
		{
			result[0] = i;
			print(result, number, 0);
		}

		
	}
	
	public static void print(int[] result,int lenth,int index)
	{
		if(index == lenth -1)
		{
			printNumber(result);
			return;
		}
		
		for(int i =0;i<10;i++)
		{
			result[index+1] = i;
			print(result,lenth,index+1);
		}
	}
	
	public static void printNumber(int[] result)
	{
		for(int i = 0;i<result.length;i++)
		{
			System.out.print(result[i]);
			if(i == result.length-1)
			{
				System.out.print("\n");
			}
		}
	}

}
