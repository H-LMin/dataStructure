package queue;
/**
 * @author Administrator
 *			队列的基本实现方法
 */
public interface IQueue {

	//1、置空队列
	public void clear();
	//2、判断是否为空队列
	public boolean isEmpty();
	//3、返回队列的长度
	public int length();
	//4、返回队首元素
	public Object head();
	//5、将元素x插入到队列，成为队尾元素
	public void insert(Object x);
	//6、将队首元素删除，并返回该元素
	public Object delete();
	//7、显示队列所有元素
	public void display();
}
