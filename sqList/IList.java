package sqList;
/**
 * 
 * @author Administrator
 *	线性表的抽象接口描述（常用方法）
 */
public interface IList {
	//1、将线性表置为空表
	public void clear();
	//2、判断线性表是否为空表
	public boolean isEmpty();
	//3、返回线性表的长度
	public int length();
	//4、读取并且返回第i个元素
	public Object get(int i);
	//5、插入x作为第i个元素
	public void insert(int i,Object x);
	//6、删除第i个元素
	public void remove(int i);
	//7、返回元素x首次出现的位置
	public int indexOf(Object x);
	//8、输出全表元素
	public void display();
}
