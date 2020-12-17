package queue;

/**
 * @author Administrator 顺序队列
 */
public class SqQueue {
	
	//存储空间
	private Object[] queue;
	//指向队首元素
	private int front;
	//指向队尾元素
	private int rear;
	//队列最大存储元素个数
	private int MAX;	
	
	//构造空队列
	public SqQueue(int max) {
		front = rear = 0;
		queue = new Object[max];
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

	// 3、返回队列的长度
	public int length() {
		return rear - front;
	}

	// 4、返回队首元素
	public Object head() {
		if(isEmpty())
			return null;
		return queue[front];
	}

	// 5、将元素x插入到队列，成为队尾元素
	public void insert(Object x) {
		if (rear == MAX) {
			System.out.println("队列已满！");
		}
		queue[rear] = x;
		rear++;
	}

	// 6、将队首元素删除，并返回该元素
	public Object delete() {
		if (front == rear) {
			return null;
		}
		Object p = queue[front];
		front++;
		return p;
		
	}

	// 7、显示队列所有元素
	public void display() {
		if (! isEmpty()) {
			for (int i = front; i < rear; i++) {
				System.out.print(queue[i]+"==>");
			}
		}
		else {
			System.out.println("队列为空！");
		}
	}

}
