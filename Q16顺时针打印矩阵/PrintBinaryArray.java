package practise;

public class PrintBinaryArray {

	/**
	 * À≥ ±’Î¥Ú”° æÿ’Û
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] num = new int[1][1];
		for(int i = 0;i<1;i++)
		{
			for(int j=0; j<1; j++)
			{
				num[i][j] = i+j;
				System.out.print(num[i][j]+" ");
			}
			System.out.println("");
		}
		System.out.println("============");
		print(num);
	}
	
	public static void print(int[][] num)
	{
		
		int colums = num[0].length;
		int rows = num.length;
		int min = 0;
		if(colums>rows)
		{
			min = rows;
		}else
		{
			min = colums;
		}
		int circelNum = min/2;
		if(min%2 != 0)
		{
			circelNum ++;
		}
		for(int i = 0;i <circelNum;i++)
		{
			for(int j = i;j<colums-i;j++)
			{
				if(i<rows && j<colums)
				{
					System.out.print(num[i][j]+" ");
				}

			}
			System.out.println(" ");
			for(int k =i+1;k<rows-i;k++)
			{
				if(k<rows && colums-i-1<colums)
				{
					System.out.print(num[k][colums-i-1]+" ");
				}

			}
			System.out.println(" ");
			for(int l = rows-i-2;l>i-1;l--)
			{
				if(l<rows&& colums-i-1<colums && colums-i-1 > i)
				{
					System.out.print(num[l][colums-i-1]+" ");
				}

			}
			System.out.println(" ");
			for(int m = rows-i-2;m>i;m--)
			{
				if(i<rows && m <colums)
				{
					System.out.print(num[i][m]+" ");
				}

			}
			System.out.println(" ");
		}
	}

}
