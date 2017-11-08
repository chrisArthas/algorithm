package practise;

public class Fibonacci {

	/**
	 * 쳲��������� 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start:"+System.currentTimeMillis());
		
		Long result = getFibonacci(20);
		System.out.println("end: "+result+" "+System.currentTimeMillis());
		
		System.out.println("start2: "+System.currentTimeMillis());
		
		Long result2 = getFibonacci2(20);
		System.out.println("end2: "+result2+" "+System.currentTimeMillis());

	}
	
	/**
	 * ���ñ�ʾ����
	 * @param n
	 * @return
	 */
	public static Long getFibonacci(int n)
	{
		if(n == 0)
			return 0L;
		
		if(n == 1)
			return 1L;
		
		return getFibonacci(n-1)+getFibonacci(n-2);
	}
	
	/**
	 * ���Ӷ�ΪO(n)���㷨
	 * ���������㣬��f(0) f(1) ���f(2),���� f(1) f(2) ���f(3)
	 */
	public static Long getFibonacci2(int n)
	{
		Long results[] = {0L,1L};
		
		if(n <2)
			return results[n];
		
		Long firstNum = 0L;
		Long secondNum = 1L;
		Long result = 0L;
		for(int i = 2;i<=n;++i)
		{
			result = firstNum +  secondNum;
			firstNum = secondNum;
			secondNum = result;
		}
		
		return result;
	}

}
