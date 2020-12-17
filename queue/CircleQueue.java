package queue;
/**
 * @author Administrator
 *			循环队列
 */
public class CircleQueue {
	//队列存储空间
	private Object[] circle;
	//指向队首元素
	private int front;
	//指向队尾元素的下一个存储单元
	private int rear;
	//队列的最大存储数
	private int MAX;
	
	//构造空队列
		public CircleQueue(int max) {
			front = rear = 0;
			circle = new Object[max];
			this.MAX = max;
		}

		// 1、置空队列
		public void clear() {
			front = rear = 0;
		}

		// 2、判断是否为空队列
		public boolean isEmpty() {
			return front == rear;
		}

		// 3、返回队列的长度:   (rear - front+MAX)%MAX
		public int length() {
			return (rear - front+MAX)%MAX;
		}

		// 4、返回队首元素
		public Object head() {
			if(isEmpty())
				return null;
			return circle[front];
		}

		// 5、将元素x插入到队列，成为队尾元素
		public void insert(Object x) {
			if ((rear + 1) %MAX == front) {
				System.out.println("队列已满！");
			}
			circle[rear] = x;
			rear = (rear+1)%MAX;
		}

		// 6、将队首元素删除，并返回该元素
		public Object delete() {
			if (front == rear) {
				return null;
			}
			Object p = circle[front];
			front = (front+1)%MAX;
			return p;
			
		}

		// 7、显示队列所有元素
		public void display() {
			if (! isEmpty()) {
				for (int i = front; i < rear; i = (i+1)%MAX) {
					System.out.print(circle[i]+"==>");
				}
			}
			else {
				System.out.println("队列为空！");
			}
		}	
	
}
