package 约瑟夫环问题;
/**
 * @author Administrator
 *			环形链表解决约瑟夫问题
 */
public class LinkedList {

	public static void main(String[] args) {
		
		out(8);
		out(20);

	}


	public static void out(int n) {
		//数到3出局，所以中间是隔着两个人
		int k = 3;
		//头结点不存储数据		
		Node head = new Node();
		Node current = head;
		//1、循环构造利链表
		for (int i = 1; i <= n; i++) {
			Node node = new Node(i);
			current.next = node;
			current = node;
		}
		//2、让链表有数据的部分首尾相连，形成环
		current.next = head.next;
		//3、从第一个有数据的结点开始报数
		Node p = head.next;
		//4、循环退出的条件是只剩一个结点，即该结点的下一个节点是他本身
		while (p.next != p) {
			//报数
			for (int i = 1; i < k-1; i++) {
				p = p.next;
			}
			//5、报数到3时，出局
			System.out.print("==>"+p.next.data+"   ");
			p.next = p.next.next;
			p = p.next;
		}
		System.out.println("最后的结点==>"+p.data);
	}
	
}

//声明结点类
	class Node{
		int data;
		Node next;
		
		public Node() {
			
		}
		
		public Node(int data) {
			super();
			this.data = data;
		}
		
	}
