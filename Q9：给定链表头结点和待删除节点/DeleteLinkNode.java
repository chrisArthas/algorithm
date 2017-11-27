package linklist;

public class DeleteLinkNode {

	/**给定一个链表头结点和一个节点，要求删除该节点，且时间复杂度为O(1)
	 * @param args
	 */
	public static void main(String[] args) {
		
		LinkNode node = new LinkNode(3,new LinkNode(4,new LinkNode(5,null)));
		
		LinkNode headNode = new LinkNode(0,new LinkNode(1,new LinkNode(2,node)));
		
		deletNode(headNode,node);
		
	}
	
	
	public static void deletNode(LinkNode headNode,LinkNode node)
	{
		//要删除的节点为最后一个 复杂度为O(n)
		if(node.nextNode == null)
		{
			LinkNode temp = headNode;
			while(temp.nextNode != null)
			{
				if(temp.nextNode == node)
				{
					temp.nextNode = null;
				}
			}
		}else if(headNode == node)
		{
			headNode = null;
		}else{
			//要删除的节点不是最后一个节点，也不是第一个节点，
			//将待删除节点的下一个节点的值和指针全部赋值给待删除节点
			LinkNode nextNode = node.nextNode;
			node.value = nextNode.value;
			node.nextNode = nextNode.nextNode;
			nextNode.nextNode = null;
		}
		print(headNode);
	}
	
	public static void print(LinkNode headNode)
	{
		LinkNode node = headNode;
		while(node != null)
		{
			System.out.println(node.value);
			node = node.nextNode;
		}
	}
	
	
	
	
	
	public static class LinkNode
	{
		public int value;
		public LinkNode nextNode;
		public LinkNode(int value,LinkNode nextNode){
			this.value = value;
			this.nextNode = nextNode;
		}
	}

}
