package practise;

public class CaculateNumOne {

	/**
	 * ʵ��һ������������һ������������������� 1 �ĸ�����
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("result: "+caculate(-5));
		
		System.out.println("result: "+caculate2(-5));
	}

	
	/**
	 * ������λ����Ϊ ȡ�����������
	 * ���룺����λ���� ȡ����Ȼ��+1
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
	 * ��һ����������������ȥ1��֮�����������������������ø��������һλ1��Ϊ0
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
