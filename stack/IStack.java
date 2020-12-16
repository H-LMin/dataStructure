package stack;
/**
 * @author Administrator
 *			栈的抽象数据类型描述
 */
public interface IStack {
	
	//1、将栈置空
	public void clear();
	//2、判断栈是否为空
	public boolean isEmpty();
	//3、返回栈的元素个数
	public int length();
	//4、返回栈顶元素
	public Object peek();
	//5、将数据元素x入栈
	public void push(Object x);
	//6、将栈顶元素出栈，并返回
	public Object pop();
	//7、输出栈中的所有元素
	public void display();
	
}
