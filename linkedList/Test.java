package linkedList;

/**
 * @author Administrator 测试类
 */
public class Test {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		// 判断是否空链表，链表长度
		System.out.println(linkedList.isEmpty());
		System.out.println(linkedList.length());
		// 插入结点
		linkedList.insert(0, "徐凤年");
		linkedList.insert(1, "青鸟");
		linkedList.insert(2, "红麝");
		linkedList.insert(3, "绿蚁");
		linkedList.insert(4, "姜泥");
		linkedList.insert(2, "洛阳");
		// 判断是否插入成功
		System.out.println(linkedList.isEmpty());
		System.out.println(linkedList.length());
		// 按位置查找
		System.out.println(linkedList.get(3));
		// 按值查找

		// 删除结点
		linkedList.remove(1);
		// 判断是否删除成功
		System.out.println(linkedList.length());
		linkedList.display();
		
//		//头插法
//		linkedList.create1(2);
		

	}

}
