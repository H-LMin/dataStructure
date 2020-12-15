package linkedList;
/**
 * @author Administrator
 *		结点类
 */
public class Node {
	//1、定义数据域，存放结点数据值
	public Object data;
	//2、定义指针域，存放后继结点
	public Node next;
	
	//无参构造函数
	public Node() {
		
	}

	//有参构造函数
	public Node(Object data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}
	
	
}
