package practise;

import java.util.Stack;

public class StackPushPop {

	/** 栈的压入 弹出序列
	 * 输入两个整数序列，第一个序列表示压入顺序，判断第二个序列是否为弹出序列之一
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
	 * pushIndex 标记 剩余没有入栈的输入序列的起始位置
	 * 
	 * 1.从输出序列中一个一个拿出元素，若该元素存在于待输入序列中，则将该元素位于待输入序列之前的所有元素入栈
	 * 
	 * 弹出该元素
	 * 
	 * 从输出序列中拿出下一个元素，判断是否存在于 剩余带输入序列中，若存在，重复 1 操作
	 * 
	 * 若不存在，则判断当前栈顶是否是该元素，是 则弹出，继续判断下一个输出序列中的元素，不是，则当前序列不可能是输出序列之一，跳出循环
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
