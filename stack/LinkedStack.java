package stack;

import linkedList.*;

/**
 * @author Administrator
 *			链栈
 */
public class LinkedStack {
	
	//创建栈顶元素top
	private Node top; 
	
	
	// 1、将栈置空: 栈顶为0即可
		public void clear() {
			top = null;
		}

		// 2、判断栈是否为空
		public boolean isEmpty() {
			return top == null;
		}

		// 3、返回栈的元素个数
		public int length() {
			Node p = top;
			int length = 0;
			while (p != null) {
				p = p.next;
				length++;
			}
			return length;
		}

		// 4、返回栈顶元素
		public Object peek() {
			if(! isEmpty())
				return top.data;
			else
				return null;
		}

		// 5、将数据元素x入栈
		public void push(Object x) {
			Node s = new Node(x);
			s.next = top;
			top = s;
			
		}

		// 6、将栈顶元素出栈，并返回
		public Object pop() {
			if (isEmpty()) {
				return null;
			}
			Node p = top;
			top = top.next;
			return p.data;
		}

		// 7、输出栈中的所有元素
		public void display() {
			Node p = top;
			while (p != null) {
				System.out.println(p.data+"===>");
				p = p.next;
			}
		}
	
}
