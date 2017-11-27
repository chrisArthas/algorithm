package linklist;

public class DeleteLinkNode {

	/**����һ������ͷ����һ���ڵ㣬Ҫ��ɾ���ýڵ㣬��ʱ�临�Ӷ�ΪO(1)
	 * @param args
	 */
	public static void main(String[] args) {
		
		LinkNode node = new LinkNode(3,new LinkNode(4,new LinkNode(5,null)));
		
		LinkNode headNode = new LinkNode(0,new LinkNode(1,new LinkNode(2,node)));
		
		deletNode(headNode,node);
		
	}
	
	
	public static void deletNode(LinkNode headNode,LinkNode node)
	{
		//Ҫɾ���Ľڵ�Ϊ���һ�� ���Ӷ�ΪO(n)
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
			//Ҫɾ���Ľڵ㲻�����һ���ڵ㣬Ҳ���ǵ�һ���ڵ㣬
			//����ɾ���ڵ����һ���ڵ��ֵ��ָ��ȫ����ֵ����ɾ���ڵ�
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
