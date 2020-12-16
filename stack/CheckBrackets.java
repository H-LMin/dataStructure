package stack;

/**
 * @author Administrator
 *			利用顺序栈实现括号匹配
 */
public class CheckBrackets {
	
	// 存储空间
		private Object[] stack;
		// 指示栈顶元素的位置，指向栈顶元素存储位置的下一个存储单元位置
		private int top;
		// 栈的最大存储单元个数
		private int max;

		// 构造空栈，存储单元个数为最大
		public CheckBrackets(int max) {
			super();
			this.max = max;
			// 构造栈
			stack = new Object[max];
		}

		// 2、判断栈是否为空
		public boolean isEmpty() {
			return top == 0;
		}

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
		
	//创建方法
	public void isMatched(String str) {
		
		//只要遍历出左括号，就入栈
		for (int i = 0; i < str.length(); i++) {
			//左括号入栈
			if (str.charAt(i) == '(') {
				push('(');
			}
			else if (str.charAt(i) == ')' && ! isEmpty()) {
				pop();
			}
			else if (str.charAt(i) == ')' &&  isEmpty()) {
				System.out.println("括号不匹配！");
				return ;
			}
		}
		if (isEmpty()) {
			System.out.println("配对完毕，括号匹配！");
		}
		else {
			System.out.println("括号不匹配！");
		}
	}


	
	public static void main(String[] args) {
		String string1 = "(a+b*(c+d))";
		String string2 = "(a+b*(c+d)))";
		
		CheckBrackets checkBrackets1 = new CheckBrackets(string1.length());
		checkBrackets1.isMatched(string1);
		
		CheckBrackets checkBrackets2 = new CheckBrackets(string2.length());
		checkBrackets2.isMatched(string2);
		
	}
		
}
