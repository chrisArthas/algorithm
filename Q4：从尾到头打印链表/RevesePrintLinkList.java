package linklist;

import java.util.Stack;

public class RevesePrintLinkList {

	/**
	 * 输入一个链表头部，从尾部到头部打印出每一个节点的值
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkNode root = new LinkNode(5,new LinkNode(8,new LinkNode(16,new LinkNode(20,new LinkNode(30,new LinkNode(36,new LinkNode(46,null)))))));
		print(root);
	}
	
	
	public static void print(LinkNode root)
	{
		Stack stack = new Stack();
		LinkNode temp = root;
		while(temp != null)
		{
			stack.push(temp.getValue());
			temp = temp.getNextNode();
		}
		while(!stack.isEmpty())
		{
			System.out.println(" "+ stack.pop());
		}
	}
	
	
	public static class LinkNode
	{
		private int value;
		
		private LinkNode nextNode;
		
		public LinkNode(int value,LinkNode linkNode)
		{
			this.value = value;
			this.nextNode = linkNode;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

		public LinkNode getNextNode() {
			return nextNode;
		}

		public void setNextNode(LinkNode nextNode) {
			this.nextNode = nextNode;
		}
		
		public String toString()
		{
			return value+"";	
		}
	}

}
