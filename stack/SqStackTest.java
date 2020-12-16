package stack;

public class SqStackTest {

	public static void main(String[] args) {

		SqStack sqStack = new SqStack(5);

		// 1、判断栈是否为空
		System.out.println(sqStack.isEmpty());
		// 2、返回栈的元素个数
		System.out.println(sqStack.length());
		// 3、将数据元素x入栈
		sqStack.push("徐凤年");
		sqStack.push("青鸟");
		sqStack.push("红麝");
		sqStack.push("姜泥");
		sqStack.push("洛阳");
		// 4、判断栈是否为空
		System.out.println(sqStack.isEmpty());
		// 5、返回栈的元素个数
		System.out.println(sqStack.length());
		//6、再次入栈
		//sqStack.push("陈芝豹");
		
		//7、将栈顶元素出栈，并返回
		System.out.println(sqStack.pop());
		
		//8、输出栈中的所有元素
		sqStack.display();

	}

}
