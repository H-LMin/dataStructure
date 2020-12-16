package stack;

/**
 * @author Administrator 顺序栈：用数组实现
 */
public class SqStack {
	// 存储空间
	private Object[] stack;
	// 指示栈顶元素的位置，指向栈顶元素存储位置的下一个存储单元位置
	private int top;
	// 栈的最大存储单元个数
	private int max;

	// 构造空栈，存储单元个数为最大
	public SqStack(int max) {
		super();
		this.max = max;
		// 构造栈
		stack = new Object[max];
	}

	// 1、将栈置空: 栈顶为0即可
	public void clear() {
		top = 0;
	}

	// 2、判断栈是否为空
	public boolean isEmpty() {
		return top == 0;
	}

	// 3、返回栈的元素个数
	public int length() {
		return top;
	}

	// 4、返回栈顶元素
	public Object peek() {
		if(! isEmpty())
			return stack[top -1];
		else
			return null;
	}

	// 5、将数据元素x入栈
	public void push(Object x) {
		//判断栈是否已满
		if(top == max) {
			System.out.println("栈满，不能插入！");
		}
		//否则，进行插入至栈顶
		stack[top] = x;
		top++;
	}

	// 6、将栈顶元素出栈，并返回
	public Object pop() {
		//判断栈是否为空
		if(isEmpty()) {
			return "空栈！";
		}
		top--;
		//为啥先减再出栈？？
		return stack[top];
		
	}

	// 7、输出栈中的所有元素
	public void display() {
		for (int i = top - 1; i >= 0; i--) {
			System.out.print(stack[i]+"<===");
		}
	}

}
