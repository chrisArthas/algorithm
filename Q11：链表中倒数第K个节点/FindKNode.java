package practise;

public class FindKNode {

	/**
	 * 给定一个链表，找出倒数第K个节点，K从1开始
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkNode headNode = new LinkNode(0, new LinkNode(1, new LinkNode(2, new LinkNode(3, new LinkNode(4, new LinkNode(5, new LinkNode(6, new LinkNode(7, new LinkNode(8, null)))))))));

		System.out.println(findK(headNode,3)+"");
	}
	
	
	public static int findK(LinkNode headNode,int k)
	{
		if(headNode == null || k == 0)
		{
			return -1;
		}
		int index = 0;
		LinkNode linkNode = headNode;
		LinkNode tailNode = headNode;
		while(linkNode.nextNode != null)
		{
			linkNode = linkNode.nextNode;
			if(index >= k-1)
			{
				tailNode = tailNode.nextNode;
			}
			index++;
		}
		
		return tailNode.value;
	}
	
	
	public static class LinkNode
	{
		int value;
		LinkNode nextNode;
		
		public LinkNode(int value,LinkNode nextNode)
		{
			this.value = value;
			this.nextNode = nextNode;
		}
	}

}
