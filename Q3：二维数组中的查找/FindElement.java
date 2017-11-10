package twodimensionarray;

public class FindElement {

	/**
	 * ��Ŀ����һ����ά�����У�ÿһ�ж��ǰ��մ����ҵ�����ÿһ�ж��ǰ��մ��ϵ��µ�����˳��
	 * ���һ������������ö�ά�����һ������
	 * �жϸ����ڲ���������
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr1 = {{1,2,8,9}, {2,4,9,12}, {4,7,10,13},{6,8,11,15}};

		printArrau(arr1);
		
		System.out.println("result: "+find(arr1,18));;

	}
	
	
	public static Boolean find(int[][] a,int key)
	{
		Boolean found = false;
		if(a == null)
		{
			return false;
		}
		while(a[0].length > 1 && a.length > 1)
		{ 
			int temp = a[0][a[0].length-1];
			if(temp < key)
			{
				a = deleteArrayRow(a);
				printArrau(a);
			}else if(temp > key)
			{
				a = deleteArrayColumn(a);
				printArrau(a);
			}else
			{
				found = true;
				break;
			}
		}
		
			
		return found;
	}
	
	public static void printArrau(int[][] a)
	{
		if(a == null)
		{
			return;
		}
		
		for(int i = 0;i <a.length;i++)
		{
			for(int j = 0; j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println(" ");
		}
		System.out.println("=======");
	}

	/**
	 * ɾ���������ұ��� ����һ��������
	 * @param a
	 * @return
	 */
	public static int[][] deleteArrayColumn(int[][] a)
	{
		if(a == null || a[0].length < 2)
		{
			return a;
		}
		int [][] result = new int[a.length][a[0].length-1];
		
		
		for(int i = 0 ; i < a.length;i++)
		{
			for(int j=0;j<a[i].length-1;j++)
			{
				result[i][j] = a[i][j];
			}
		}
				
		return result;
	}
	
	/**
	 * ɾ������������һ�� ����һ��������
	 * @param a
	 * @return
	 */
	public static int[][] deleteArrayRow(int[][] a)
	{
		if(a == null || a.length < 2)
		{
			return a;
		}
		int [][] result = new int[a.length-1][a[0].length];
		
		
		for(int i = 1 ; i < a.length;i++)
		{
			for(int j=0;j< a[i].length;j++)
			{
				result[i-1][j] = a[i][j];
			}
		}
				
		return result;
	}
}
