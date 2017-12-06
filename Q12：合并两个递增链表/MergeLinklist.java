package interview;

public class MergeLinklist {

	/**
	 * 输入两个两个递增的链表，要求合并，且，合并之后的链表也为递增
	 * @param args
	 */
	public static void main(String[] args) {
		
		LinkNode linkA = new LinkNode(1,new LinkNode(3,new LinkNode(5,new LinkNode(7,new LinkNode(9,null)))));

		LinkNode linkB = new LinkNode(2,new LinkNode(4,new LinkNode(6,new LinkNode(8,new LinkNode(10,null)))));

		
		LinkNode result = mergeLinkNode(linkA,linkB);
		
		while(result != null)
		{
			System.out.println(result.value);
			result = result.nextNode;
		}
	}
	
	/**
	 * 解法一
	 * @param linkA
	 * @param linkB
	 * @return
	 */
	public static LinkNode merge(LinkNode linkA,LinkNode linkB)
	{
		if(linkA == null)
		{
			return linkB;
		}
		if(linkB == null)
		{
			return linkA;
		}
		
		LinkNode result = new LinkNode(0,null);
		LinkNode A = linkA;
		LinkNode B = linkB;
		LinkNode currentNode = result;
		if(linkA.value > linkB.value)
		{
			currentNode.value = linkB.value;
			B = linkB.nextNode;
		}else
		{
			currentNode.value = linkA.value;
			A = linkA.nextNode;
		}
		
		while(A !=null || B!= null)
		{
			if(A ==null)
			{
				currentNode.nextNode = B;
				currentNode = B;
				B = B.nextNode;
			}else if(B == null)
			{
				currentNode.nextNode = A;
				currentNode = A;
				A = A.nextNode;
			}else
			{
				if(A.value > B.value)
				{
					currentNode.nextNode = B;
					currentNode = B;
					B = B.nextNode;
				}else
				{
					currentNode.nextNode = A;
					currentNode = A;
					A = A.nextNode;
				}
			}
			
		}	
		
		return result;
	}
	
	/**
	 * 解法二 递归
	 * @author win
	 *
	 */	
	public static LinkNode mergeLinkNode(LinkNode linkA,LinkNode linkB)
	{
		if(linkA == null)
		{
			return linkB;
		}
		
		if(linkB == null)
		{
			return linkA;
		}
		LinkNode resultNode = null;
		if(linkA.value < linkB.value)
		{
			resultNode = linkA;
			resultNode.nextNode = mergeLinkNode(linkA.nextNode,linkB);
		}else
		{
			resultNode = linkB;
			resultNode.nextNode = mergeLinkNode(linkA,linkB.nextNode);
		}
	
		return resultNode;
	}
	
	
	
	

	public static class LinkNode {
		int value;
		LinkNode nextNode;

		public LinkNode(int value,LinkNode nextNode) {
			this.value = value;
			this.nextNode = nextNode;
		}
	}

}
