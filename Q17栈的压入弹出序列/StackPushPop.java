package practise;

import java.util.Stack;

public class StackPushPop {

	/** ջ��ѹ�� ��������
	 * ���������������У���һ�����б�ʾѹ��˳���жϵڶ��������Ƿ�Ϊ��������֮һ
	 * @param args
	 */
	public static void main(String[] args) {
		int push[] = {1,2,3,4,5,6};
		
		int pop1[] = {4,5,3,2,1};
		
		int pop2[] = {3,2,1,6,5,4};
		
		System.out.println(" "+judge(push,pop2));

	}
	
	/**
	 * 
	 * @param push
	 * @param pop
	 * @return
	 * 
	 * pushIndex ��� ʣ��û����ջ���������е���ʼλ��
	 * 
	 * 1.�����������һ��һ���ó�Ԫ�أ�����Ԫ�ش����ڴ����������У��򽫸�Ԫ��λ�ڴ���������֮ǰ������Ԫ����ջ
	 * 
	 * ������Ԫ��
	 * 
	 * ������������ó���һ��Ԫ�أ��ж��Ƿ������ ʣ������������У������ڣ��ظ� 1 ����
	 * 
	 * �������ڣ����жϵ�ǰջ���Ƿ��Ǹ�Ԫ�أ��� �򵯳��������ж���һ����������е�Ԫ�أ����ǣ���ǰ���в��������������֮һ������ѭ��
	 */
	public static Boolean judge(int push[],int pop[])
	{
		Boolean result = true;
		int pushIndex = 0;
		Stack stack = new Stack();
		
		for(int i = 0;i<pop.length;i++)
		{
			int popElement = pop[i];
			
			if(hasElement(push,popElement,pushIndex))
			{
				int position = getPosition(push,popElement,pushIndex);
				
				for(int j = pushIndex;j<position+1;j++)
				{
					stack.push(push[j]);
				}
				stack.pop();
				pushIndex = position+1;
			}else
			{
				if(stack.isEmpty())
				{
					result = false;
					break;
				}else
				{
					int temp =(Integer)stack.pop();
					if(temp != popElement)
					{
						result = false;
						break;
					}
				}
			}
		}
		
		
		return result;
	}
	
	
	public static Boolean hasElement(int a[],int number,int index)
	{
		boolean result = false;
		for(int i = index;i<a.length;i++)
		{
			if(number == a[i])
			{
				result = true;
				break;
			}
		}
		return result;
	}

	
	public static int getPosition(int a[],int number,int index)
	{
		int position = 0;
		for(int i = index;i<a.length;i++)
		{
			if(number == a[i])
			{
				position = i;
				break;
			}
		}
		return position;
	}
}
