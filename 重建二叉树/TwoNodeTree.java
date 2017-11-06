package practise;

import java.util.ArrayList;
import java.util.List;

public class TwoNodeTree {

	/**
	 * ����ĳ����������������������������ԭ������,��������ڵ㡣
	 * �����룺 ���������{1,2,4,7,3,5,6,8} ���������{4,7,2,1,5,3,8,6}
	 * ��������ڵ�
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode root = new TreeNode();
		List<Integer> first = new ArrayList<Integer>();
		List<Integer> middle = new ArrayList<Integer>();
		first.add(1);
		first.add(2);
		first.add(4);
		first.add(7);
		first.add(3);
		first.add(5);
		first.add(6);
		first.add(8);
		middle.add(4);
		middle.add(7);
		middle.add(2);
		middle.add(1);
		middle.add(5);
		middle.add(3);
		middle.add(8);
		middle.add(6);
		
		getRoot(first,middle,root);
		
	}

	
	public static void getRoot(List<Integer> first,List<Integer> middle,TreeNode root)
	{
		if(first == null || first.size() == 0 || middle==null ||middle.size() == 0)
		{
			return;
		}
		/**
		 * ���ڵ� ��������� ��һ��
		 */
		root.setValue(first.get(0));
		if(first.size() == 1 && middle.size() == 1)
		{
			return;
		}
		TreeNode leftNode = new TreeNode();
		TreeNode rightNode = new TreeNode();
		root.setLeft(leftNode);
		root.setRight(rightNode);
		/**
		 * ��ȡ���ڵ�����������е�λ��
		 * ��߶�Ϊ�������ڵ㡢�ұ߶�Ϊ�������ڵ㣬Ȼ��ݹ�
		 */
		int position = middle.indexOf(first.get(0));
		if(middle != null && middle.size() > position && first != null)
		{
			if(first.size()>0)
			{
				List<Integer> leftTreeM = middle.subList(0, position);
				if(leftTreeM.size() > 0)
				{
					List<Integer> leftTreeF = first.subList(1, position+1);
					getRoot(leftTreeF,leftTreeM,leftNode);
				}

			}
			
			if(position < middle.size()-1)
			{
				List<Integer> rightTreeF = first.subList(position+1, first.size());
				List<Integer> rightTreeM = middle.subList(position+1, middle.size());
				getRoot(rightTreeF,rightTreeM,rightNode);
			}

		}
		
	}
	

}
