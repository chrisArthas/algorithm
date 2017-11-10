package sington;

/**
 * ��̬�ڲ���ʵ��
 * @author chris
 *
 * ����һ������getInstance()������ʱ��
 * ���ʾ�̬�ڲ����еľ�̬��Ա��������ʱ���ڲ�����Ҫ����static�����(��Ϊ�״η��ʸ���)��
 * �����ٴη���getInstance()������ֱ�ӷ���instance���á�
 * 
 * �̰߳�ȫ��jvm����
 */
public class SingtonTwo {
	
	private SingtonTwo instance;
	
	
	private SingtonTwo()
	{
		
	}
	
	public static SingtonTwo getInstance()
	{
		return Nest.instance;
	}
	
	
	private static class Nest
	{
		private static SingtonTwo instance;
		static
		{
			instance = new SingtonTwo();
		}
	}

}
