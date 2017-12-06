package practise;

import practise.FindKNode.LinkNode;

public class ReverseLinkList {

	/**
	 * 输入一个链表的根节点，反转改链表，并输出反转后的根节点
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkNode headNode = new LinkNode(0, new LinkNode(1, new LinkNode(2, new LinkNode(3, new LinkNode(4, new LinkNode(5, new LinkNode(6, new LinkNode(7, new LinkNode(8, null)))))))));

		LinkNode reverseNode = reverse(headNode);
		
		LinkNode linkNode = reverseNode;
		while(linkNode != null)
		{
			System.out.println(linkNode.value);
			
			linkNode = linkNode.nextNode;
		}
	}
	
	public static LinkNode reverse(LinkNode headNode)
	{
		LinkNode reverHeadNode = null;
		LinkNode linkNode = headNode;
		LinkNode preNode = null;
		while(linkNode !=null)
		{
			LinkNode nextNode = linkNode.nextNode;

			linkNode.nextNode = preNode;
			if(nextNode == null)
			{
				reverHeadNode = linkNode;
				break;
			}
			preNode = linkNode;
			linkNode = nextNode;
		}
		return reverHeadNode;
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
